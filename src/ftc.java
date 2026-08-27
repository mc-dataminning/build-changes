import org.joml.Matrix4f;

public abstract class ftc<T extends biw> {
   protected static final float b = 0.025F;
   protected final ftb c;
   private final erx a;
   protected float d;
   protected float e = 1.0F;

   protected ftc(ftd.a $$0) {
      this.c = $$0.a();
      this.a = $$0.h();
   }

   public final int b(T $$0, float $$1) {
      gw $$2 = gw.a($$0.k($$1));
      return fnz.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, gw $$1) {
      return $$0.dL().a(cqk.a, $$1);
   }

   protected int a(T $$0, gw $$1) {
      return $$0.bM() ? 15 : $$0.dL().a(cqk.b, $$1);
   }

   public boolean a(T $$0, frc $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if ($$0.at) {
         return true;
      } else {
         ehc $$5 = $$0.g_().g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ehc($$0.dq() - 2.0, $$0.ds() - 2.0, $$0.dw() - 2.0, $$0.dq() + 2.0, $$0.ds() + 2.0, $$0.dw() + 2.0);
         }

         return $$1.a($$5);
      }
   }

   public ehh a(T $$0, float $$1) {
      return ehh.b;
   }

   public void a(T $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      if (this.b($$0)) {
         this.a($$0, $$0.N_(), $$3, $$4, $$5);
      }
   }

   protected boolean b(T $$0) {
      return $$0.cB() && $$0.ac();
   }

   public abstract aez a(T var1);

   public erx b() {
      return this.a;
   }

   protected void a(T $$0, tl $$1, elj $$2, foa $$3, int $$4) {
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
         float $$10 = eqp.O().m.a(0.25F);
         int $$11 = (int)($$10 * 255.0F) << 24;
         erx $$12 = this.b();
         float $$13 = (float)(-$$12.a($$1) / 2);
         $$12.a($$1, $$13, (float)$$8, 553648127, false, $$9, $$3, $$6 ? erx.a.b : erx.a.a, $$11, $$4);
         if ($$6) {
            $$12.a($$1, $$13, (float)$$8, -1, false, $$9, $$3, erx.a.a, 0, $$4);
         }

         $$2.b();
      }
   }
}
