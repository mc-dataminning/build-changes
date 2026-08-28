import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dow extends dke implements drl {
   public static final MapCodec<dow> a = b(dow::new);
   public static final int b = 15;
   public static final dyq c = dyg.aS;
   public static final dyh d = dyg.I;
   public static final ToIntFunction<dxq> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$3.gI()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsy.b;
      } else {
         return bsy.c;
      }
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$3.a(cxl.ib) ? fco.b() : fco.a();
   }

   @Override
   protected boolean e_(dxq $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cxh a(cxh $$0, int $$1) {
      $$0.b(kv.ao, czh.a.a(c, $$1));
      return $$0;
   }
}
