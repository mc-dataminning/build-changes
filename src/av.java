import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public record av(Optional<jn<dff>> c, Optional<dy> d, Optional<dh> e) {
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.a(lr.f).optionalFieldOf("blocks").forGetter(av::b),
               dy.a.optionalFieldOf("state").forGetter(av::c),
               dh.a.optionalFieldOf("nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );
   public static final ys<wf, av> b = ys.a(yq.a(yq.c(lr.f)), av::b, yq.a(dy.b), av::c, yq.a(dh.b), av::d, av::new);

   public boolean a(aqk $$0, ja $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         return !this.a($$0.a_($$1)) ? false : !this.e.isPresent() || a($$0, $$0.c_($$1), this.e.get());
      }
   }

   public boolean a(dsl $$0) {
      return !this.a($$0.a()) ? false : !this.e.isPresent() || a($$0.c(), $$0.b(), this.e.get());
   }

   private boolean a(dsh $$0) {
      return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
   }

   private static boolean a(dcg $$0, @Nullable dpn $$1, dh $$2) {
      return $$1 != null && $$2.a($$1.b($$0.H_()));
   }

   public boolean a() {
      return this.e.isPresent();
   }

   public Optional<jn<dff>> b() {
      return this.c;
   }

   public Optional<dy> c() {
      return this.d;
   }

   public Optional<dh> d() {
      return this.e;
   }

   public static class a {
      private Optional<jn<dff>> a = Optional.empty();
      private Optional<dy> b = Optional.empty();
      private Optional<dh> c = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(dff... $$0) {
         this.a = Optional.of(jn.a(dff::s, $$0));
         return this;
      }

      public av.a a(Collection<dff> $$0) {
         this.a = Optional.of(jn.a(dff::s, $$0));
         return this;
      }

      public av.a a(awk<dff> $$0) {
         this.a = Optional.of(lq.e.a($$0));
         return this;
      }

      public av.a a(tx $$0) {
         this.c = Optional.of(new dh($$0));
         return this;
      }

      public av.a a(dy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.a, this.b, this.c);
      }
   }
}
