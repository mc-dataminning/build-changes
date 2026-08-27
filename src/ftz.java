import java.util.OptionalInt;

public class ftz<T extends byb> extends ftb<T> {
   private static final gbh g = gbh.c("item_frame", "map=false");
   private static final gbh h = gbh.c("item_frame", "map=true");
   private static final gbh i = gbh.c("glow_item_frame", "map=false");
   private static final gbh j = gbh.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final fua k;
   private final fot l;

   public ftz(ftc.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, gw $$1) {
      return $$0.ag() == bip.S ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      hc $$6 = $$0.cD();
      ehi $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dC()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dA()));
      boolean $$9 = $$0.cd();
      cja $$10 = $$0.z();
      if (!$$9) {
         gbg $$11 = this.l.a().a();
         gbh $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fon.h()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, fyq.d);
         $$3.b();
      }

      if (!$$10.b()) {
         OptionalInt $$13 = $$0.A();
         if ($$9) {
            $$3.a(0.0F, 0.0F, 0.5F);
         } else {
            $$3.a(0.0F, 0.0F, 0.4375F);
         }

         int $$14 = $$13.isPresent() ? $$0.D() % 4 * 2 : $$0.D();
         $$3.a(a.f.rotationDegrees((float)$$14 * 360.0F / 8.0F));
         if ($$13.isPresent()) {
            $$3.a(a.f.rotationDegrees(180.0F));
            float $$15 = 0.0078125F;
            $$3.b(0.0078125F, 0.0078125F, 0.0078125F);
            $$3.a(-64.0F, -64.0F, 0.0F);
            ebr $$16 = cjh.a($$13.getAsInt(), $$0.dK());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               eqq.O().j.j().a($$3, $$4, $$13.getAsInt(), $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cix.i, $$18, fyq.d, $$3, $$4, $$0.dK(), $$0.ah());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ag() == bip.S ? $$1 : $$2;
   }

   private gbh a(T $$0, cja $$1) {
      boolean $$2 = $$0.ag() == bip.S;
      if ($$1.a(cjd.rf)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public ehi a(T $$0, float $$1) {
      return new ehi((double)((float)$$0.cD().j() * 0.3F), -0.25, (double)((float)$$0.cD().l() * 0.3F));
   }

   public aeu a(T $$0) {
      return fyy.e;
   }

   protected boolean b(T $$0) {
      if (eqq.K() && !$$0.z().b() && $$0.z().A() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bU() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, ti $$1, elk $$2, fnz $$3, int $$4) {
      super.a($$0, $$0.z().y(), $$2, $$3, $$4);
   }
}
