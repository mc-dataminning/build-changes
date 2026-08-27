import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record au(Optional<asq<cwj>> b, Optional<il<cwj>> c, Optional<cz> d, Optional<cm> e) {
   private static final Codec<il<cwj>> f = kd.e.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.a(asq.a(ke.f), "tag").forGetter(au::a),
               atq.a(f, "blocks").forGetter(au::b),
               atq.a(cz.a, "state").forGetter(au::c),
               atq.a(cm.a, "nbt").forGetter(au::d)
            )
            .apply($$0, au::new)
   );

   public boolean a(amz $$0, hx $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         dja $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dgo $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<asq<cwj>> a() {
      return this.b;
   }

   public Optional<il<cwj>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public Optional<cm> d() {
      return this.e;
   }

   public static class a {
      private Optional<il<cwj>> a = Optional.empty();
      private Optional<asq<cwj>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();
      private Optional<cm> d = Optional.empty();

      private a() {
      }

      public static au.a a() {
         return new au.a();
      }

      public au.a a(cwj... $$0) {
         this.a = Optional.of(il.a(cwj::r, $$0));
         return this;
      }

      public au.a a(Collection<cwj> $$0) {
         this.a = Optional.of(il.a(cwj::r, $$0));
         return this;
      }

      public au.a a(asq<cwj> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public au.a a(sl $$0) {
         this.d = Optional.of(new cm($$0));
         return this;
      }

      public au.a a(cz.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public au b() {
         return new au(this.b, this.a, this.c, this.d);
      }
   }
}
