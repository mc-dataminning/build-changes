import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<ja<dde>> c, Optional<dk> d, Optional<cv> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(jl.a(le.f), "blocks").forGetter(av::b), axh.a(dk.a, "state").forGetter(av::c), axh.a(cv.c, "nbt").forGetter(av::d))
            .apply($$0, av::new)
   );
   public static final ys<wf, av> b = ys.a(yq.a(yq.c(le.f)), av::b, yq.a(dk.b), av::c, yq.a(cv.d), av::d, av::new);

   public boolean a(aqh $$0, in $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dql $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dqh $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dag $$0, @Nullable dnm $$1, cv $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<ja<dde>> b() {
      return this.c;
   }

   public Optional<dk> c() {
      return this.d;
   }

   public Optional<cv> d() {
      return this.e;
   }

   public static class a {
      private Optional<ja<dde>> a = Optional.empty();
      private Optional<dk> b = Optional.empty();
      private Optional<cv> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dde... $$0) {
         this.a = Optional.of(ja.a(dde::r, $$0));
         return this;
      }

      public av.a a(Collection<dde> $$0) {
         this.a = Optional.of(ja.a(dde::r, $$0));
         return this;
      }

      public av.a a(awg<dde> $$0) {
         this.a = Optional.of(ld.e.a($$0));
         return this;
      }

      public av.a a(ua $$0) {
         this.c = Optional.of(new cv($$0));
         return this;
      }

      public av.a a(dk.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
