import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public record au(Optional<asg<cvz>> b, Optional<ij<cvz>> c, Optional<cz> d, Optional<cm> e) {
   private static final Codec<ij<cvz>> f = kb.e.r().listOf().xmap(ij::a, $$0 -> $$0.a().toList());
   public static final Codec<au> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(asg.a(kc.f), "tag").forGetter(au::a),
               atg.a(f, "blocks").forGetter(au::b),
               atg.a(cz.a, "state").forGetter(au::c),
               atg.a(cm.a, "nbt").forGetter(au::d)
            )
            .apply($$0, au::new)
   );

   public boolean a(amp $$0, hv $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         dip $$2 = $$0.a_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else if (this.c.isPresent() && !$$2.a(this.c.get())) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$2)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               dgd $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.get().a($$3.o())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Optional<asg<cvz>> a() {
      return this.b;
   }

   public Optional<ij<cvz>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public Optional<cm> d() {
      return this.e;
   }

   public static class a {
      private Optional<ij<cvz>> a = Optional.empty();
      private Optional<asg<cvz>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();
      private Optional<cm> d = Optional.empty();

      private a() {
      }

      public static au.a a() {
         return new au.a();
      }

      public au.a a(cvz... $$0) {
         this.a = Optional.of(ij.a(cvz::r, $$0));
         return this;
      }

      public au.a a(Collection<cvz> $$0) {
         this.a = Optional.of(ij.a(cvz::r, $$0));
         return this;
      }

      public au.a a(asg<cvz> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public au.a a(sj $$0) {
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
