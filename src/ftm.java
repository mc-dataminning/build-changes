import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ftm extends fsn<ctc> {
   private float G;
   private float H;
   private boolean I;
   private final fte J;

   public ftm(cou $$0) {
      super($$0.cb, new fvp($$0.cb), $$0.gg(), xj.c("container.crafting"));
      this.v = 97;
      this.J = new fte(this);
   }

   @Override
   public void F() {
      super.F();
      if (this.m.r.f()) {
         this.m.a(new ftb(this.m.t, this.m.t.i.y(), this.m.n.K().c()));
      }
   }

   @Override
   protected void aR_() {
      if (this.m.r.f()) {
         this.m.a(new ftb(this.m.t, this.m.t.i.y(), this.m.n.K().c()));
      } else {
         super.aR_();
      }
   }

   @Override
   protected fqk J() {
      return new fqk(this.C + 104, this.o / 2 - 22);
   }

   @Override
   protected void K() {
      this.I = true;
   }

   @Override
   protected void b(flq $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.J.a($$0, $$1, $$2, $$3);
      this.G = (float)$$1;
      this.H = (float)$$2;
   }

   @Override
   public boolean D() {
      return this.J.a();
   }

   @Override
   protected boolean L() {
      return false;
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gjq::B, a, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.G, this.H, this.m.t);
   }

   public static void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, bvh $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aW;
      float $$17 = $$9.dL();
      float $$18 = $$9.dN();
      float $$19 = $$9.aZ;
      float $$20 = $$9.aY;
      $$9.aW = 180.0F + $$12 * 20.0F;
      $$9.v(180.0F + $$12 * 40.0F);
      $$9.w(-$$13 * 20.0F);
      $$9.aY = $$9.dL();
      $$9.aZ = $$9.dL();
      float $$21 = $$9.ej();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dr() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aW = $$16;
      $$9.v($$17);
      $$9.w($$18);
      $$9.aZ = $$19;
      $$9.aY = $$20;
      $$0.e();
   }

   public static void a(flq $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, bvh $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      $$0.d();
      fdn.e();
      gpi $$8 = fke.Q().aq();
      if ($$6 != null) {
         $$8.a($$6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      $$8.a(false);
      $$0.a($$3x -> $$8.a($$7, 0.0, 0.0, 0.0, 1.0F, $$0.c(), $$3x, 15728880));
      $$0.d();
      $$8.a(true);
      $$0.c().b();
      fdn.d();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.I) {
         this.I = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }
}
