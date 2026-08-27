import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<arz<cvf>> b, Optional<ik<cvf>> c, Optional<da> d, Optional<cn> e) {
   private static final Codec<ik<cvf>> f = kc.f.r().listOf().xmap(ik::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.a(arz.a(kd.e), "tag").forGetter(av::a),
               asy.a(f, "blocks").forGetter(av::b),
               asy.a(da.a, "state").forGetter(av::c),
               asy.a(cn.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(ami $$0, hx $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dhn $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dfi $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<arz<cvf>> a() {
      return this.b;
   }

   public Optional<ik<cvf>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public static class a {
      private Optional<ik<cvf>> a = Optional.empty();
      private Optional<arz<cvf>> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private Optional<cn> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(cvf... $$0) {
         this.a = Optional.of(ik.a(cvf::r, $$0));
         return this;
      }

      public av.a a(Collection<cvf> $$0) {
         this.a = Optional.of(ik.a(cvf::r, $$0));
         return this;
      }

      public av.a a(arz<cvf> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(sd $$0) {
         this.d = Optional.of(new cn($$0));
         return this;
      }

      public av.a a(da.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.b, this.a, this.c, this.d);
      }
   }
}
