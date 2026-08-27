import com.mojang.serialization.MapCodec;

public class dgy extends dgc {
   public static final MapCodec<dgy> a = b(dgy::new);
   private static final wi b = wi.c("container.loom");

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   protected dgy(dph.d $$0) {
      super($$0);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.ax);
         return bof.b;
      }
   }

   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new cob($$2x, $$3, cnh.a($$1, $$2)), b);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE);
   }
}
