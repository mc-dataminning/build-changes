import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dou extends dke implements dri {
   public static final MapCodec<dou> a = b(dou::new);
   public static final int b = 15;
   public static final dym c = dyd.aQ;
   public static final dye d = dyd.D;
   public static final ToIntFunction<dxn> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$3.gE()) {
         $$1.a($$2, $$0.a(c), 2);
         return bte.b;
      } else {
         return bte.c;
      }
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$3.a(cxo.hQ) ? fcj.b() : fcj.a();
   }

   @Override
   protected boolean e_(dxn $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.a;
   }

   @Override
   protected float c(dxn $$0, dgf $$1, jh $$2) {
      return 1.0F;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(d) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cxk a(cxk $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ku.am, czm.a.a(c, $$1));
      }

      return $$0;
   }
}
