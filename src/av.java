import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<iz<dcv>> c, Optional<dj> d, Optional<cu> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(jk.a(ld.f), "blocks").forGetter(av::b), axe.a(dj.a, "state").forGetter(av::c), axe.a(cu.a, "nbt").forGetter(av::d))
            .apply($$0, av::new)
   );
   public static final yq<wd, av> b = yq.a(yo.a(yo.c(ld.f)), av::b, yo.a(dj.b), av::c, yo.a(cu.b), av::d, av::new);

   public boolean a(aqe $$0, im $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dqc $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dpy $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(czx $$0, @Nullable dnd $$1, cu $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<iz<dcv>> b() {
      return this.c;
   }

   public Optional<dj> c() {
      return this.d;
   }

   public Optional<cu> d() {
      return this.e;
   }

   public static class a {
      private Optional<iz<dcv>> a = Optional.empty();
      private Optional<dj> b = Optional.empty();
      private Optional<cu> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dcv... $$0) {
         this.a = Optional.of(iz.a(dcv::r, $$0));
         return this;
      }

      public av.a a(Collection<dcv> $$0) {
         this.a = Optional.of(iz.a(dcv::r, $$0));
         return this;
      }

      public av.a a(awd<dcv> $$0) {
         this.a = Optional.of(lc.e.a($$0));
         return this;
      }

      public av.a a(ty $$0) {
         this.c = Optional.of(new cu($$0));
         return this;
      }

      public av.a a(dj.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
