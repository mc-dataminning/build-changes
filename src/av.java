import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<aqd<csq>> b, Optional<hk<csq>> c, Optional<da> d, Optional<cn> e) {
   private static final Codec<hk<csq>> f = jd.f.r().listOf().xmap(hk::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.a(aqd.a(je.e), "tag").forGetter(av::a),
               arb.a(f, "blocks").forGetter(av::b),
               arb.a(da.a, "state").forGetter(av::c),
               arb.a(cn.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(akn $$0, gw $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dfe $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dcq $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aqd<csq>> a() {
      return this.b;
   }

   public Optional<hk<csq>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public static class a {
      private Optional<hk<csq>> a = Optional.empty();
      private Optional<aqd<csq>> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private Optional<cn> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(csq... $$0) {
         this.a = Optional.of(hk.a(csq::q, $$0));
         return this;
      }

      public av.a a(Collection<csq> $$0) {
         this.a = Optional.of(hk.a(csq::q, $$0));
         return this;
      }

      public av.a a(aqd<csq> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(qu $$0) {
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
