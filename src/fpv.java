import java.util.OptionalInt;

public class fpv<T extends bva> extends fox<T> {
   private static final fwy g = fwy.c("item_frame", "map=false");
   private static final fwy h = fwy.c("item_frame", "map=true");
   private static final fwy i = fwy.c("glow_item_frame", "map=false");
   private static final fwy j = fwy.c("glow_item_frame", "map=true");
   public static final int a = 5;
   public static final int f = 30;
   private final fpw k;
   private final fko l;

   public fpv(foy.a $$0) {
      super($$0);
      this.k = $$0.b();
      this.l = $$0.c();
   }

   protected int a(T $$0, gu $$1) {
      return $$0.ae() == bfn.S ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$3.a();
      ha $$6 = $$0.cB();
      eei $$7 = this.a($$0, $$2);
      $$3.a(-$$7.a(), -$$7.b(), -$$7.c());
      double $$8 = 0.46875;
      $$3.a((double)$$6.j() * 0.46875, (double)$$6.k() * 0.46875, (double)$$6.l() * 0.46875);
      $$3.a(a.b.rotationDegrees($$0.dA()));
      $$3.a(a.d.rotationDegrees(180.0F - $$0.dy()));
      boolean $$9 = $$0.cb();
      cfz $$10 = $$0.z();
      if (!$$9) {
         fwx $$11 = this.l.a().a();
         fwy $$12 = this.a($$0, $$10);
         $$3.a();
         $$3.a(-0.5F, -0.5F, -0.5F);
         this.l.b().a($$3.c(), $$4.getBuffer(fkj.i()), null, $$11.a($$12), 1.0F, 1.0F, 1.0F, $$5, fum.d);
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
            dyo $$16 = cgg.a($$13.getAsInt(), $$0.dI());
            $$3.a(0.0F, 0.0F, -1.0F);
            if ($$16 != null) {
               int $$17 = this.a($$0, 15728850, $$5);
               enn.N().j.j().a($$3, $$4, $$13.getAsInt(), $$16, true, $$17);
            }
         } else {
            int $$18 = this.a($$0, 15728880, $$5);
            $$3.b(0.5F, 0.5F, 0.5F);
            this.k.a($$10, cfw.i, $$18, fum.d, $$3, $$4, $$0.dI(), $$0.af());
         }
      }

      $$3.b();
   }

   private int a(T $$0, int $$1, int $$2) {
      return $$0.ae() == bfn.S ? $$1 : $$2;
   }

   private fwy a(T $$0, cfz $$1) {
      boolean $$2 = $$0.ae() == bfn.S;
      if ($$1.a(cgc.rf)) {
         return $$2 ? j : h;
      } else {
         return $$2 ? i : g;
      }
   }

   public eei a(T $$0, float $$1) {
      return new eei((double)((float)$$0.cB().j() * 0.3F), -0.25, (double)((float)$$0.cB().l() * 0.3F));
   }

   public acq a(T $$0) {
      return fuu.e;
   }

   protected boolean b(T $$0) {
      if (enn.J() && !$$0.z().b() && $$0.z().A() && this.c.c == $$0) {
         double $$1 = this.c.b($$0);
         float $$2 = $$0.bS() ? 32.0F : 64.0F;
         return $$1 < (double)($$2 * $$2);
      } else {
         return false;
      }
   }

   protected void a(T $$0, sw $$1, eij $$2, fjx $$3, int $$4) {
      super.a($$0, $$0.z().y(), $$2, $$3, $$4);
   }
}
