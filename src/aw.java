import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record aw(Optional<jr<dgv>> c, Optional<eb> d, Optional<dk> e) {
   public static final Codec<aw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kc.a(lv.f).optionalFieldOf("blocks").forGetter(aw::b),
               eb.a.optionalFieldOf("state").forGetter(aw::c),
               dk.a.optionalFieldOf("nbt").forGetter(aw::d)
            )
            .apply($$0, aw::new)
   );
   public static final zb<wo, aw> b = zb.a(yz.a(yz.c(lv.f)), aw::b, yz.a(eb.b), aw::c, yz.a(dk.b), aw::d, aw::new);

   public boolean a(arg $$0, je $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(due $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dua $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(ddv $$0, @Nullable dre $$1, dk $$2) {
      return $$1 != null && $$2.a($$1.b($$0.F_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jr<dgv>> b() {
      return this.c;
   }

   public Optional<eb> c() {
      return this.d;
   }

   public Optional<dk> d() {
      return this.e;
   }

   public static class a {
      private Optional<jr<dgv>> a = Optional.empty();
      private Optional<eb> b = Optional.empty();
      private Optional<dk> c = Optional.empty();

      private a() {
      }

      public static aw.a a() {
         return new aw.a();
      }

      public aw.a a(jo<dgv> $$0, dgv... $$1) {
         return this.a($$0, Arrays.asList($$1));
      }

      public aw.a a(jo<dgv> $$0, Collection<dgv> $$1) {
         this.a = Optional.of(jr.a(dgv::s, $$1));
         return this;
      }

      public aw.a a(jo<dgv> $$0, axi<dgv> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public aw.a a(uf $$0) {
         this.c = Optional.of(new dk($$0));
         return this;
      }

      public aw.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public aw b() {
         return new aw(this.a, this.b, this.c);
      }
   }
}
