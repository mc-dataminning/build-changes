import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bw(Optional<asq<eej>> b, Optional<ih<eej>> c, Optional<cz> d) {
   public static final Codec<bw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(asq.a(ke.y), "tag").forGetter(bw::a), atq.a(kd.c.r(), "fluid").forGetter(bw::b), atq.a(cz.a, "state").forGetter(bw::c))
            .apply($$0, bw::new)
   );

   public boolean a(amz $$0, hx $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         eek $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<asq<eej>> a() {
      return this.b;
   }

   public Optional<ih<eej>> b() {
      return this.c;
   }

   public Optional<cz> c() {
      return this.d;
   }

   public static class a {
      private Optional<ih<eej>> a = Optional.empty();
      private Optional<asq<eej>> b = Optional.empty();
      private Optional<cz> c = Optional.empty();

      private a() {
      }

      public static bw.a a() {
         return new bw.a();
      }

      public bw.a a(eej $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public bw.a a(asq<eej> $$0) {
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
