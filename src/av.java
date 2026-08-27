import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<auo<cyo>> b, Optional<in<cyo>> c, Optional<db> d, Optional<co> e) {
   private static final Codec<in<cyo>> f = kf.e.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.a(auo.a(kg.f), "tag").forGetter(av::a),
               avp.a(f, "blocks").forGetter(av::b),
               avp.a(db.a, "state").forGetter(av::c),
               avp.a(co.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(aov $$0, hz $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         dlf $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dit $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<auo<cyo>> a() {
      return this.b;
   }

   public Optional<in<cyo>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<in<cyo>> a = Optional.empty();
      private Optional<auo<cyo>> b = Optional.empty();
      private Optional<db> c = Optional.empty();
      private Optional<co> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(cyo... $$0) {
         this.a = Optional.of(in.a(cyo::r, $$0));
         return this;
      }

      public av.a a(Collection<cyo> $$0) {
         this.a = Optional.of(in.a(cyo::r, $$0));
         return this;
      }

      public av.a a(auo<cyo> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(sw $$0) {
         this.d = Optional.of(new co($$0));
         return this;
      }

      public av.a a(db.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public av b() {
         return new av(this.b, this.a, this.c, this.d);
      }
   }
}
