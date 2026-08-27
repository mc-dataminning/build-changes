import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<aqh<csv>> b, Optional<hi<csv>> c, Optional<da> d, Optional<cn> e) {
   private static final Codec<hi<csv>> f = jb.f.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arf.a(aqh.a(jc.e), "tag").forGetter(av::a),
               arf.a(f, "blocks").forGetter(av::b),
               arf.a(da.a, "state").forGetter(av::c),
               arf.a(cn.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(akq $$0, gw $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dfj $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dcv $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aqh<csv>> a() {
      return this.b;
   }

   public Optional<hi<csv>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public Optional<cn> d() {
      return this.e;
   }

   public static class a {
      private Optional<hi<csv>> a = Optional.empty();
      private Optional<aqh<csv>> b = Optional.empty();
      private Optional<da> c = Optional.empty();
      private Optional<cn> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(csv... $$0) {
         this.a = Optional.of(hi.a(csv::q, $$0));
         return this;
      }

      public av.a a(Collection<csv> $$0) {
         this.a = Optional.of(hi.a(csv::q, $$0));
         return this;
      }

      public av.a a(aqh<csv> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(qw $$0) {
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
