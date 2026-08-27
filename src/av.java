import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<arr<cut>> b, Optional<ig<cut>> c, Optional<da> d, Optional<cn> e) {
   private static final Codec<ig<cut>> f = jy.f.r().listOf().xmap(ig::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.a(arr.a(jz.e), "tag").forGetter(av::a),
               asq.a(f, "blocks").forGetter(av::b),
               asq.a(da.a, "state").forGetter(av::c),
               asq.a(cn.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(ama $$0, ht $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dgw $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               der $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<arr<cut>> a() {
      return this.b;
   }

   public Optional<ig<cut>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public static class a {
      private Optional<ig<cut>> a = Optional.empty();
      private Optional<arr<cut>> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private Optional<cn> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(cut... $$0) {
         this.a = Optional.of(ig.a(cut::r, $$0));
         return this;
      }

      public av.a a(Collection<cut> $$0) {
         this.a = Optional.of(ig.a(cut::r, $$0));
         return this;
      }

      public av.a a(arr<cut> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(rz $$0) {
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
