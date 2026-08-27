import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<aqj<csx>> b, Optional<hk<csx>> c, Optional<da> d, Optional<cn> e) {
   private static final Codec<hk<csx>> f = jd.f.r().listOf().xmap(hk::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arh.a(aqj.a(je.e), "tag").forGetter(av::a),
               arh.a(f, "blocks").forGetter(av::b),
               arh.a(da.a, "state").forGetter(av::c),
               arh.a(cn.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(aks $$0, gw $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dfl $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dcx $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aqj<csx>> a() {
      return this.b;
   }

   public Optional<hk<csx>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public static class a {
      private Optional<hk<csx>> a = Optional.empty();
      private Optional<aqj<csx>> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private Optional<cn> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(csx... $$0) {
         this.a = Optional.of(hk.a(csx::q, $$0));
         return this;
      }

      public av.a a(Collection<csx> $$0) {
         this.a = Optional.of(hk.a(csx::q, $$0));
         return this;
      }

      public av.a a(aqj<csx> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(qy $$0) {
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
