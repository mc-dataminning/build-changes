import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<ir<dch>> c, Optional<dc> d, Optional<co> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(jc.a(ku.f), "blocks").forGetter(av::b), awu.a(dc.a, "state").forGetter(av::c), awu.a(co.a, "nbt").forGetter(av::d))
            .apply($$0, av::new)
   );
   public static final yg<vt, av> b = yg.a(ye.a(ye.c(ku.f)), av::b, ye.a(dc.b), av::c, ye.a(co.b), av::d, av::new);

   public boolean a(apu $$0, id $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dpm $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dpi $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(czj $$0, @Nullable dmo $$1, co $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<ir<dch>> b() {
      return this.c;
   }

   public Optional<dc> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<ir<dch>> a = Optional.empty();
      private Optional<dc> b = Optional.empty();
      private Optional<co> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dch... $$0) {
         this.a = Optional.of(ir.a(dch::r, $$0));
         return this;
      }

      public av.a a(Collection<dch> $$0) {
         this.a = Optional.of(ir.a(dch::r, $$0));
         return this;
      }

      public av.a a(avt<dch> $$0) {
         this.a = Optional.of(kt.e.a($$0));
         return this;
      }

      public av.a a(to $$0) {
         this.c = Optional.of(new co($$0));
         return this;
      }

      public av.a a(dc.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
