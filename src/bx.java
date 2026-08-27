import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bx(Optional<arh<ebd>> b, Optional<ib<ebd>> c, Optional<da> d) {
   public static final Codec<bx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(arh.a(jz.x), "tag").forGetter(bx::a), asg.a(jy.d.r(), "fluid").forGetter(bx::b), asg.a(da.a, "state").forGetter(bx::c))
            .apply($$0, bx::new)
   );

   public boolean a(alq $$0, ht $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         ebe $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<arh<ebd>> a() {
      return this.b;
   }

   public Optional<ib<ebd>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public static class a {
      private Optional<ib<ebd>> a = Optional.empty();
      private Optional<arh<ebd>> b = Optional.empty();
      private Optional<da> c = Optional.empty();

      private a() {
      }

      public static bx.a a() {
         return new bx.a();
      }

      public bx.a a(ebd $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public bx.a a(arh<ebd> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bx.a a(da $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bx b() {
         return new bx(this.b, this.a, this.c);
      }
   }
}
