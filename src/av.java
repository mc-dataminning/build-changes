import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<aup<cys>> b, Optional<in<cys>> c, Optional<db> d, Optional<co> e) {
   private static final Codec<in<cys>> f = kf.e.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.a(aup.a(kg.f), "tag").forGetter(av::a),
               avq.a(f, "blocks").forGetter(av::b),
               avq.a(db.a, "state").forGetter(av::c),
               avq.a(co.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(aow $$0, hz $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         dlj $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dix $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aup<cys>> a() {
      return this.b;
   }

   public Optional<in<cys>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<in<cys>> a = Optional.empty();
      private Optional<aup<cys>> b = Optional.empty();
      private Optional<db> c = Optional.empty();
      private Optional<co> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(cys... $$0) {
         this.a = Optional.of(in.a(cys::r, $$0));
         return this;
      }

      public av.a a(Collection<cys> $$0) {
         this.a = Optional.of(in.a(cys::r, $$0));
         return this;
      }

      public av.a a(aup<cys> $$0) {
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
