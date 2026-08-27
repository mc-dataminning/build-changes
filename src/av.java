import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<jb<dea>> c, Optional<dl> d, Optional<cv> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jm.a(lf.f).optionalFieldOf("blocks").forGetter(av::b),
               dl.a.optionalFieldOf("state").forGetter(av::c),
               cv.c.optionalFieldOf("nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );
   public static final yv<wi, av> b = yv.a(yt.a(yt.c(lf.f)), av::b, yt.a(dl.b), av::c, yt.a(cv.d), av::d, av::new);

   public boolean a(aqn $$0, io $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(drh $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(drd $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dbc $$0, @Nullable doi $$1, cv $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jb<dea>> b() {
      return this.c;
   }

   public Optional<dl> c() {
      return this.d;
   }

   public Optional<cv> d() {
      return this.e;
   }

   public static class a {
      private Optional<jb<dea>> a = Optional.empty();
      private Optional<dl> b = Optional.empty();
      private Optional<cv> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dea... $$0) {
         this.a = Optional.of(jb.a(dea::q, $$0));
         return this;
      }

      public av.a a(Collection<dea> $$0) {
         this.a = Optional.of(jb.a(dea::q, $$0));
         return this;
      }

      public av.a a(awm<dea> $$0) {
         this.a = Optional.of(le.e.a($$0));
         return this;
      }

      public av.a a(ud $$0) {
         this.c = Optional.of(new cv($$0));
         return this;
      }

      public av.a a(dl.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
