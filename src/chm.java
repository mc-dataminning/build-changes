import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class chm extends ccg implements brs<Optional<cql>>, cgy {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bry bX = new bry(e, "Covered armor bonus", 20.0, bry.a.a);
   protected static final aja<ij> b = aje.a(chm.class, ajc.p);
   protected static final aja<Byte> c = aje.a(chm.class, ajc.a);
   protected static final aja<Byte> d = aje.a(chm.class, ajc.a);
   private static final int bY = 6;
   private static final byte bZ = 16;
   private static final byte ca = 16;
   private static final int cb = 8;
   private static final int cc = 8;
   private static final int cd = 5;
   private static final float ce = 0.05F;
   static final Vector3f cf = ac.a(() -> {
      ji $$0 = ij.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cg = 3.0F;
   private float ch;
   private float ci;
   @Nullable
   private id cj;
   private int ck;
   private static final float cl = 1.0F;

   public chm(bqg<? extends chm> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bN = new chm.d(this);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxy(this, cka.class, 8.0F, 0.02F, true));
      this.bR.a(4, new chm.a());
      this.bR.a(7, new chm.f());
      this.bR.a(8, new byl(this));
      this.bS.a(1, new bzi(this, this.getClass()).a());
      this.bS.a(2, new chm.e(this));
      this.bS.a(3, new chm.c(this));
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.a;
   }

   @Override
   public aup db() {
      return aup.f;
   }

   @Override
   protected aun v() {
      return auo.wp;
   }

   @Override
   public void P() {
      if (!this.gs()) {
         super.P();
      }
   }

   @Override
   protected aun o_() {
      return auo.wv;
   }

   @Override
   protected aun d(boy $$0) {
      return this.gs() ? auo.wx : auo.ww;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, ij.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 30.0);
   }

   @Override
   protected bwo E() {
      return new chm.b(this);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(ij.a($$0.f("AttachFace")));
      this.an.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.an.a(c));
      $$0.a("Color", this.an.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && !this.bO() && !this.a(this.dm(), this.y())) {
         this.gp();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dM().B) {
         if (this.ck > 0) {
            this.ck--;
         } else {
            this.cj = null;
         }
      }
   }

   private void gp() {
      ij $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.u();
      }
   }

   @Override
   protected ese aq() {
      float $$0 = I(this.ci);
      ij $$1 = this.y().g();
      float $$2 = this.dg() / 2.0F;
      return a(this.eb(), $$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - axm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.ch = this.ci;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.ci == $$0) {
         return false;
      } else {
         if (this.ci > $$0) {
            this.ci = axm.a(this.ci - 0.05F, $$0, 1.0F);
         } else {
            this.ci = axm.a(this.ci + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.ar();
      float $$0 = I(this.ci);
      float $$1 = I(this.ch);
      ij $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.eb();
      if (!($$3 <= 0.0F)) {
         for (bqa $$5 : this.dM().a(this, a(this.eb(), $$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), bqf.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof chm) && !$$5.af) {
               $$5.a(bqy.e, new esj((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ese a(float $$0, ij $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ese a(float $$0, ij $$1, float $$2, float $$3) {
      ese $$4 = new ese(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bqa $$0, boolean $$1) {
      if (this.dM().x_()) {
         this.cj = null;
         this.ck = 0;
      }

      this.a(ij.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dM().B) {
         this.cj = this.dm();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.r(0.0F);
      this.aZ = this.dC();
      this.bs();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bqy $$0, esj $$1) {
      if ($$0 == bqy.d) {
         this.u();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public esj dp() {
      return esj.b;
   }

   @Override
   public void g(esj $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      id $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)axm.a($$0) + 0.5, (double)axm.a($$1 + 0.5), (double)axm.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         id $$4 = this.dm();
         if (!$$4.equals($$3)) {
            this.an.a(c, (byte)0);
            this.au = true;
            if (this.dM().B && !this.bO() && !$$4.equals(this.cj)) {
               this.cj = $$3;
               this.ck = 6;
               this.ac = this.dr();
               this.ad = this.dt();
               this.ae = this.dx();
            }
         }
      }
   }

   @Nullable
   protected ij i(id $$0) {
      for (ij $$1 : ij.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(id $$0, ij $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ij $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ese $$3 = a(this.eb(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(id $$0) {
      dpi $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dcj.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean u() {
      if (!this.gd() && this.bA()) {
         id $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            id $$2 = $$0.b(axm.b(this.ag, -8, 8), axm.b(this.ag, -8, 8), axm.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().I_() && this.dM().u($$2) && this.dM().C_().a($$2) && this.dM().a(this, new ese($$2).h(1.0E-6))) {
               ij $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(auo.wA, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dub.R, $$0, dub.a.a(this));
                  this.an.a(c, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bq = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      if (this.gs()) {
         bqa $$2 = $$0.c();
         if ($$2 instanceof ckg) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ex() < (double)this.eO() * 0.5 && this.ag.a(4) == 0) {
            this.u();
         } else if ($$0.a(avg.k)) {
            bqa $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bqg.aK) {
               this.gt();
            }
         }

         return true;
      }
   }

   private boolean gs() {
      return this.gu() == 0;
   }

   private void gt() {
      esj $$0 = this.dk();
      ese $$1 = this.cH();
      if (!this.gs() && this.u()) {
         int $$2 = this.dM().a(bqg.aJ, $$1.g(8.0), bqa::bA).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            chm $$4 = bqg.aJ.a(this.dM());
            if ($$4 != null) {
               $$4.a(this.gn());
               $$4.e($$0);
               this.dM().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bC() {
      return this.bA();
   }

   public ij y() {
      return this.an.a(b);
   }

   private void a(ij $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a(aja<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gu() {
      return this.an.a(c);
   }

   void b(int $$0) {
      if (!this.dM().B) {
         this.f(bsa.a).b(bX.b());
         if ($$0 == 0) {
            this.f(bsa.a).d(bX);
            this.a(auo.wu, 1.0F, 1.0F);
            this.a(dub.j);
         } else {
            this.a(auo.wy, 1.0F, 1.0F);
            this.a(dub.k);
         }
      }

      this.an.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return axm.i($$0, this.ch, this.ci);
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void h(bqa $$0) {
   }

   public Optional<esj> H(float $$0) {
      if (this.cj != null && this.ck > 0) {
         double $$1 = (double)((float)this.ck - $$0) / 6.0;
         $$1 *= $$1;
         id $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.cj.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cj.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cj.w()) * $$1;
         return Optional.of(new esj(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cql> $$0) {
      this.an.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cql> gn() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public cql go() {
      byte $$0 = this.an.a(d);
      return $$0 != 16 && $$0 <= 15 ? cql.a($$0) : null;
   }

   class a extends bxq {
      private int b;

      public a() {
         this.a(EnumSet.of(bxq.a.a, bxq.a.b));
      }

      @Override
      public boolean a() {
         bqt $$0 = chm.this.p();
         return $$0 != null && $$0.bA() ? chm.this.dM().ak() != boc.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         chm.this.b(100);
      }

      @Override
      public void d() {
         chm.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (chm.this.dM().ak() != boc.a) {
            this.b--;
            bqt $$0 = chm.this.p();
            if ($$0 != null) {
               chm.this.G().a($$0, 180.0F, 180.0F);
               double $$1 = chm.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + chm.this.ag.a(10) * 20 / 2;
                     chm.this.dM().b(new ckv(chm.this.dM(), chm.this, $$0, chm.this.y().o()));
                     chm.this.a(auo.wz, 2.0F, (chm.this.ag.i() - chm.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  chm.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bwo {
      public b(bqv $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bzj<bqt> {
      public c(chm $$0) {
         super($$0, bqt.class, 10, true, false, $$0x -> $$0x instanceof cgy);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected ese a(double $$0) {
         ij $$1 = ((chm)this.e).y();
         if ($$1.o() == ij.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ij.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bws {
      public d(bqv $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ij $$0 = chm.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(chm.cf));
         ji $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dr();
         double $$5 = this.f - this.a.dv();
         double $$6 = this.g - this.a.dx();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(axm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bzj<cka> {
      public e(chm $$0) {
         super($$0, cka.class, true);
      }

      @Override
      public boolean a() {
         return chm.this.dM().ak() == boc.a ? false : super.a();
      }

      @Override
      protected ese a(double $$0) {
         ij $$1 = ((chm)this.e).y();
         if ($$1.o() == ij.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ij.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bxq {
      private int b;

      @Override
      public boolean a() {
         return chm.this.p() == null && chm.this.ag.a(b(40)) == 0 && chm.this.a(chm.this.dm(), chm.this.y());
      }

      @Override
      public boolean b() {
         return chm.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + chm.this.ag.a(3)));
         chm.this.b(30);
      }

      @Override
      public void d() {
         if (chm.this.p() == null) {
            chm.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
