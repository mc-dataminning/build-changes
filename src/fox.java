import org.joml.Matrix4f;

public abstract class fox<T extends bfj> {
   protected static final float b = 0.025F;
   protected final fow c;
   private final eov a;
   protected float d;
   protected float e = 1.0F;

   protected fox(foy.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      gu $$2 = gu.a($$0.k($$1));
      return fjw.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, gu $$1) {
      return $$0.dI().a(cmv.a, $$1);
   }

   protected int a(T $$0, gu $$1) {
      return $$0.bL() ? 15 : $$0.dI().a(cmv.b, $$1);
   }

   public boolean a(T $$0, fmw $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.as) {
         return true;
      } else {
         eed $$5 = $$0.j_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new eed($$0.dn() - 2.0, $$0.dp() - 2.0, $$0.dt() - 2.0, $$0.dn() + 2.0, $$0.dp() + 2.0, $$0.dt() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public eei a(T $$0, float $$1) {
      return eei.b;
   }

   public void a(T $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.H_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cz() && $$0.aa();
   }

   public abstract acq a(T var1);

   public eov b() {
      return this.a;
   }

   protected void a(T $$0, sw $$1, eij $$2, fjx $$3, int $$4) {
      double $$5 = this.c.b($$0);
      if (!($$5 > 4096.0)) {
         boolean $$6 = !$$0.bS();
         float $$7 = $$0.df();
         int $$8 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a(0.0F, $$7, 0.0F);
         $$2.a(this.c.b());
         $$2.b(-0.025F, -0.025F, 0.025F);
         Matrix4f $$9 = $$2.c().a();
         float $$10 = enn.N().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         eov $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? eov.a.b : eov.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, eov.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
