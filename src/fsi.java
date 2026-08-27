import org.joml.Matrix4f;

public abstract class fsi<T extends big> {
   protected static final float b = 0.025F;
   protected final fsh c;
   private final erv a;
   protected float d;
   protected float e = 1.0F;

   protected fsi(fsj.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      gv $$2 = gv.a($$0.k($$1));
      return fnf.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, gv $$1) {
      return $$0.dK().a(cpt.a, $$1);
   }

   protected int a(T $$0, gv $$1) {
      return $$0.bM() ? 15 : $$0.dK().a(cpt.b, $$1);
   }

   public boolean a(T $$0, fqi $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         eha $$5 = $$0.k_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new eha($$0.dp() - 2.0, $$0.dr() - 2.0, $$0.dv() - 2.0, $$0.dp() + 2.0, $$0.dr() + 2.0, $$0.dv() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public ehf a(T $$0, float $$1) {
      return ehf.b;
   }

   public void a(T $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.H_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cB() && $$0.ac();
   }

   public abstract aep a(T var1);

   public erv b() {
      return this.a;
   }

   protected void a(T $$0, te $$1, elh $$2, fng $$3, int $$4) {
      double $$5 = this.c.b($$0);
      if (!($$5 > 4096.0)) {
         boolean $$6 = !$$0.bU();
         float $$7 = $$0.dh();
         int $$8 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a(0.0F, $$7, 0.0F);
         $$2.a(this.c.b());
         $$2.b(-0.025F, -0.025F, 0.025F);
         Matrix4f $$9 = $$2.c().a();
         float $$10 = eqn.N().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         erv $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? erv.a.b : erv.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, erv.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
