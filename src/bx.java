import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bx(Optional<aqk<eaf>> b, Optional<he<eaf>> c, Optional<da> d) {
   public static final Codec<bx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.a(aqk.a(jc.x), "tag").forGetter(bx::a), arj.a(jb.d.r(), "fluid").forGetter(bx::b), arj.a(da.a, "state").forGetter(bx::c))
            .apply($$0, bx::new)
   );

   public boolean a(akt $$0, gw $$1) {
      if (!$$0.o($$1)) {
         return false;
      } else {
         eag $$2 = $$0.b_($$1);
         if (this.b.isPresent() && !$$2.a(this.b.get())) {
            return false;
         } else {
            return this.c.isPresent() && !$$2.b(this.c.get().a()) ? false : !this.d.isPresent() || this.d.get().a($$2);
         }
      }
   }

   public Optional<aqk<eaf>> a() {
      return this.b;
   }

   public Optional<he<eaf>> b() {
      return this.c;
   }

   public Optional<da> c() {
      return this.d;
   }

   public static class a {
      private Optional<he<eaf>> a = Optional.empty();
      private Optional<aqk<eaf>> b = Optional.empty();
      private Optional<da> c = Optional.empty();

      private a() {
      }

      public static bx.a a() {
         return new bx.a();
      }

      public bx.a a(eaf $$0) {
         this.a = Optional.of($$0.k());
         return this;
      }

      public bx.a a(aqk<eaf> $$0) {
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
