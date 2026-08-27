import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dgl extends dby implements diy {
   public static final MapCodec<dgl> a = b(dgl::new);
   public static final int b = 15;
   public static final dpz c = dpp.aP;
   public static final dpq d = dpp.C;
   public static final ToIntFunction<doz> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!$$1.B && $$3.gw()) {
         $$1.a($$2, $$0.a(c), 2);
         return boa.a;
      } else {
         return boa.b;
      }
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return $$3.a(crm.hB) ? esq.b() : esq.a();
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return true;
   }

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected float d(doz $$0, cyd $$1, ib $$2) {
      return 1.0F;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(d) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static crj a(crj $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(jp.R, ctq.a.a(c, $$1));
      }

      return $$0;
   }
}
