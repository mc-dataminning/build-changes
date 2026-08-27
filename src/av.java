import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<avd<daa>> b, Optional<ip<daa>> c, Optional<db> d, Optional<co> e) {
   private static final Codec<ip<daa>> f = ki.e.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(avd.a(kj.f), "tag").forGetter(av::a),
               awe.a(f, "blocks").forGetter(av::b),
               awe.a(db.a, "state").forGetter(av::c),
               awe.a(co.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(apf $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         dmz $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dkg $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.b($$0.H_()))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<avd<daa>> a() {
      return this.b;
   }

   public Optional<ip<daa>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<ip<daa>> a = Optional.empty();
      private Optional<avd<daa>> b = Optional.empty();
      private Optional<db> c = Optional.empty();
      private Optional<co> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(daa... $$0) {
         this.a = Optional.of(ip.a(daa::r, $$0));
         return this;
      }

      public av.a a(Collection<daa> $$0) {
         this.a = Optional.of(ip.a(daa::r, $$0));
         return this;
      }

      public av.a a(avd<daa> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(ta $$0) {
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
