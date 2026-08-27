import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bw(Optional<asg<edy>> b, Optional<ie<edy>> c, Optional<cz> d) {
   public static final Codec<bw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.a(asg.a(kc.y), "tag").forGetter(bw::a), atg.a(kb.c.r(), "fluid").forGetter(bw::b), atg.a(cz.a, "state").forGetter(bw::c))
            .apply($$0, bw::new)
   );

   public boolean a(amp $$0, hv $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         edz $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<asg<edy>> a() {
      return this.b;
   }

   public Optional<ie<edy>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public static class a {
      private Optional<ie<edy>> a = Optional.empty();
      private Optional<asg<edy>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();

      private a() {
      }

      public static bw.a a() {
         return new bw.a();
      }

      public bw.a a(edy $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public bw.a a(asg<edy> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bw.a a(cz $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bw b() {
         return new bw(this.b, this.a, this.c);
      }
   }
}
