import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record av(Optional<aut<czf>> b, Optional<ip<czf>> c, Optional<db> d, Optional<co> e) {
   private static final Codec<ip<czf>> f = kh.e.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<av> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avu.a(aut.a(ki.f), "tag").forGetter(av::a),
               avu.a(f, "blocks").forGetter(av::b),
               avu.a(db.a, "state").forGetter(av::c),
               avu.a(co.a, "nbt").forGetter(av::d)
            )
            .apply($$0, av::new)
   );

   public boolean a(apa $$0, ib $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         dme $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               djl $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.b($$0.I_()))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<aut<czf>> a() {
      return this.b;
   }

   public Optional<ip<czf>> b() {
      return this.c;
   }

   public Optional<db> c() {
      return this.d;
   }

   public Optional<co> d() {
      return this.e;
   }

   public static class a {
      private Optional<ip<czf>> a = Optional.empty();
      private Optional<aut<czf>> b = Optional.empty();
      private Optional<db> c = Optional.empty();
      private Optional<co> d = Optional.empty();

      private a() {
      }

      public static av.a a() {
         return new av.a();
      }

      public av.a a(czf... $$0) {
         this.a = Optional.of(ip.a(czf::r, $$0));
         return this;
      }

      public av.a a(Collection<czf> $$0) {
         this.a = Optional.of(ip.a(czf::r, $$0));
         return this;
      }

      public av.a a(aut<czf> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public av.a a(sy $$0) {
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
