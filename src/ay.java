import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record ay(Optional<jv<dke>> c, Optional<ef> d, Optional<dn> e) {
   public static final Codec<ay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kg.a(mc.f).optionalFieldOf("blocks").forGetter(ay::b),
               ef.a.optionalFieldOf("state").forGetter(ay::c),
               dn.a.optionalFieldOf("nbt").forGetter(ay::d)
            )
            .apply($$0, ay::new)
   );
   public static final yn<wa, ay> b = yn.a(yl.a(yl.c(mc.f)), ay::b, yl.a(ef.b), ay::c, yl.a(dn.b), ay::d, ay::new);

   public boolean a(ard $$0, ji $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dxu $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dxq $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dhc $$0, @Nullable dus $$1, dn $$2) {
      return $$1 != null && $$2.a($$1.b($$0.F_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jv<dke>> b() {
      return this.c;
   }

   public Optional<ef> c() {
      return this.d;
   }

   public Optional<dn> d() {
      return this.e;
   }

   public static class a {
      private Optional<jv<dke>> a = Optional.empty();
      private Optional<ef> b = Optional.empty();
      private Optional<dn> c = Optional.empty();

      private a() {
      }

      public static ay.a a() {
         return new ay.a();
      }

      public ay.a a(js<dke> $$0, dke... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public ay.a a(js<dke> $$0, Collection<dke> $$1) {
         this.a = Optional.of(jv.a(dke::p, $$1));
         return this;
      }

      public ay.a a(js<dke> $$0, axf<dke> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public ay.a a(tq $$0) {
         this.c = Optional.of(new dn($$0));
         return this;
      }

      public ay.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public ay b() {
         return new ay(this.a, this.b, this.c);
      }
   }
}
