import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record au(Optional<asw<cwq>> b, Optional<il<cwq>> c, Optional<cz> d, Optional<cm> e) {
   private static final Codec<il<cwq>> f = kd.e.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atw.a(asw.a(ke.f), "tag").forGetter(au::a),
               atw.a(f, "blocks").forGetter(au::b),
               atw.a(cz.a, "state").forGetter(au::c),
               atw.a(cm.a, "nbt").forGetter(au::d)
            )
            .apply($$0, au::new)
   );

   public boolean a(and $$0, hx $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         djh $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dgv $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<asw<cwq>> a() {
      return this.b;
   }

   public Optional<il<cwq>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public Optional<cm> d() {
      return this.e;
   }

   public static class a {
      private Optional<il<cwq>> a = Optional.empty();
      private Optional<asw<cwq>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();
      private Optional<cm> d = Optional.empty();

      private a() {
      }

      public static au.a a() {
         return new au.a();
      }

      public au.a a(cwq... $$0) {
         this.a = Optional.of(il.a(cwq::r, $$0));
         return this;
      }

      public au.a a(Collection<cwq> $$0) {
         this.a = Optional.of(il.a(cwq::r, $$0));
         return this;
      }

      public au.a a(asw<cwq> $$0) {
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
