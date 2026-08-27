import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record au(Optional<asv<cwp>> b, Optional<il<cwp>> c, Optional<cz> d, Optional<cm> e) {
   private static final Codec<il<cwp>> f = kd.e.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atv.a(asv.a(ke.f), "tag").forGetter(au::a),
               atv.a(f, "blocks").forGetter(au::b),
               atv.a(cz.a, "state").forGetter(au::c),
               atv.a(cm.a, "nbt").forGetter(au::d)
            )
            .apply($$0, au::new)
   );

   public boolean a(and $$0, hx $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         djg $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dgu $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<asv<cwp>> a() {
      return this.b;
   }

   public Optional<il<cwp>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public Optional<cm> d() {
      return this.e;
   }

   public static class a {
      private Optional<il<cwp>> a = Optional.empty();
      private Optional<asv<cwp>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();
      private Optional<cm> d = Optional.empty();

      private a() {
      }

      public static au.a a() {
         return new au.a();
      }

      public au.a a(cwp... $$0) {
         this.a = Optional.of(il.a(cwp::r, $$0));
         return this;
      }

      public au.a a(Collection<cwp> $$0) {
         this.a = Optional.of(il.a(cwp::r, $$0));
         return this;
      }

      public au.a a(asv<cwp> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public au.a a(sn $$0) {
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
