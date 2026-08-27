import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccu extends bxv implements bni<Optional<cll>>, ccg {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bno bT = new bno(e, "Covered armor bonus", 20.0, bno.a.a);
   protected static final agm<ic> b = agp.a(ccu.class, ago.p);
   protected static final agm<Byte> c = agp.a(ccu.class, ago.a);
   protected static final agm<Byte> d = agp.a(ccu.class, ago.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      jb $$0 = ic.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private hx ce;
   private int cf;
   private static final float cg = 1.0F;

   public ccu(bly<? extends ccu> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new ccu.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bto(this, cfh.class, 8.0F, 0.02F, true));
      this.bO.a(4, new ccu.a());
      this.bO.a(7, new ccu.f());
      this.bO.a(8, new bub(this));
      this.bP.a(1, new buy(this, this.getClass()).a());
      this.bP.a(2, new ccu.e(this));
      this.bP.a(3, new ccu.c(this));
   }

   @Override
   protected blu.b aW() {
      return blu.b.a;
   }

   @Override
   public ars db() {
      return ars.f;
   }

   @Override
   protected arq y() {
      return arr.vO;
   }

   @Override
   public void R() {
      if (!this.gj()) {
         super.R();
      }
   }

   @Override
   protected arq n_() {
      return arr.vU;
   }

   @Override
   protected arq d(bks $$0) {
      return this.gj() ? arr.vW : arr.vV;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, ic.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 30.0);
   }

   @Override
   protected bse H() {
      return new ccu.b(this);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(ic.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.A().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && !this.bO() && !this.a(this.dm(), this.A())) {
         this.gg();
      }

      if (this.gh()) {
         this.gi();
      }

      if (this.dM().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gg() {
      ic $$0 = this.i(this.dm());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.w();
      }
   }

   @Override
   protected eln aq() {
      float $$0 = G(this.cd);
      ic $$1 = this.A().g();
      float $$2 = this.ai().k() / 2.0F;
      return a($$1, $$0).d(this.dr() - (double)$$2, this.dt(), this.dx() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - aun.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gh() {
      this.cc = this.cd;
      float $$0 = (float)this.gl() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = aun.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = aun.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gi() {
      this.ar();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      ic $$2 = this.A().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (blu $$5 : this.dM().a(this, a($$2, $$1, $$0).d(this.dr() - 0.5, this.dt(), this.dx() - 0.5), blx.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ccu) && !$$5.af) {
               $$5.a(bmq.e, new els((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eln a(ic $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static eln a(ic $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new eln(hx.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(blu $$0, boolean $$1) {
      if (this.dM().y_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(ic.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ac() {
      super.ac();
      if (this.dM().B) {
         this.ce = this.dm();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.r(0.0F);
      this.aW = this.dC();
      this.bp();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bmq $$0, els $$1) {
      if ($$0 == bmq.d) {
         this.w();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public els dp() {
      return els.b;
   }

   @Override
   public void g(els $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      hx $$3 = this.dm();
      if (this.bO()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aun.a($$0) + 0.5, (double)aun.a($$1 + 0.5), (double)aun.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         hx $$4 = this.dm();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dM().B && !this.bO() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.dr();
               this.ad = this.dt();
               this.ae = this.dx();
            }
         }
      }
   }

   @Nullable
   protected ic i(hx $$0) {
      for (ic $$1 : ic.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(hx $$0, ic $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         ic $$2 = $$1.g();
         if (!this.dM().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eln $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dM().a(this, $$3);
         }
      }
   }

   private boolean j(hx $$0) {
      djg $$1 = this.dM().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cwr.bQ) && $$0.equals(this.dm());
         return !$$2;
      }
   }

   protected boolean w() {
      if (!this.fU() && this.bx()) {
         hx $$0 = this.dm();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            hx $$2 = $$0.b(aun.b(this.ag, -8, 8), aun.b(this.ag, -8, 8), aun.b(this.ag, -8, 8));
            if ($$2.v() > this.dM().J_() && this.dM().u($$2) && this.dM().D_().a($$2) && this.dM().a(this, new eln($$2).h(1.0E-6))) {
               ic $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ag();
                  this.a($$3);
                  this.a(arr.vZ, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dM().a(dnq.R, $$0, dnq.a.a(this));
                  this.an.b(c, (byte)0);
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
      this.bn = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.gj()) {
         blu $$2 = $$0.c();
         if ($$2 instanceof cfn) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ev() < (double)this.eM() * 0.5 && this.ag.a(4) == 0) {
            this.w();
         } else if ($$0.a(asi.k)) {
            blu $$3 = $$0.c();
            if ($$3 != null && $$3.ai() == bly.aI) {
               this.gk();
            }
         }

         return true;
      }
   }

   private boolean gj() {
      return this.gl() == 0;
   }

   private void gk() {
      els $$0 = this.dk();
      eln $$1 = this.cH();
      if (!this.gj() && this.w()) {
         int $$2 = this.dM().a(bly.aH, $$1.g(8.0), blu::bx).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dM().z.i() < $$3)) {
            ccu $$4 = bly.aH.a(this.dM());
            if ($$4 != null) {
               $$4.a(this.ge());
               $$4.e($$0);
               this.dM().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bz() {
      return this.bx();
   }

   public ic A() {
      return this.an.b(b);
   }

   private void a(ic $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(agm<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aq());
      }

      super.a($$0);
   }

   private int gl() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dM().B) {
         this.a(bnq.a).b(bT.a());
         if ($$0 == 0) {
            this.a(bnq.a).c(bT);
            this.a(arr.vT, 1.0F, 1.0F);
            this.a(dnq.j);
         } else {
            this.a(arr.vX, 1.0F, 1.0F);
            this.a(dnq.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return aun.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.5F;
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void g(blu $$0) {
   }

   public Optional<els> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         hx $$2 = this.dm();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new els(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<cll> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cll> ge() {
      return Optional.ofNullable(this.gf());
   }

   @Nullable
   public cll gf() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? cll.a($$0) : null;
   }

   class a extends btg {
      private int b;

      public a() {
         this.a(EnumSet.of(btg.a.a, btg.a.b));
      }

      @Override
      public boolean a() {
         bmk $$0 = ccu.this.q();
         return $$0 != null && $$0.bx() ? ccu.this.dM().ak() != bjx.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         ccu.this.b(100);
      }

      @Override
      public void d() {
         ccu.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (ccu.this.dM().ak() != bjx.a) {
            this.b--;
            bmk $$0 = ccu.this.q();
            if ($$0 != null) {
               ccu.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = ccu.this.f((blu)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ccu.this.ag.a(10) * 20 / 2;
                     ccu.this.dM().b(new cgb(ccu.this.dM(), ccu.this, $$0, ccu.this.A().o()));
                     ccu.this.a(arr.vY, 2.0F, (ccu.this.ag.i() - ccu.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ccu.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bse {
      public b(bmm $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends buz<bmk> {
      public c(ccu $$0) {
         super($$0, bmk.class, 10, true, false, $$0x -> $$0x instanceof ccg);
      }

      @Override
      public boolean a() {
         return this.e.cg() == null ? false : super.a();
      }

      @Override
      protected eln a(double $$0) {
         ic $$1 = ((ccu)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bsi {
      public d(bmm $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ic $$0 = ccu.this.A().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ccu.cb));
         jb $$2 = $$0.q();
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
            : Optional.of((float)(aun.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends buz<cfh> {
      public e(ccu $$0) {
         super($$0, cfh.class, true);
      }

      @Override
      public boolean a() {
         return ccu.this.dM().ak() == bjx.a ? false : super.a();
      }

      @Override
      protected eln a(double $$0) {
         ic $$1 = ((ccu)this.e).A();
         if ($$1.o() == ic.a.a) {
            return this.e.cH().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ic.a.c ? this.e.cH().c($$0, $$0, 4.0) : this.e.cH().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends btg {
      private int b;

      @Override
      public boolean a() {
         return ccu.this.q() == null && ccu.this.ag.a(b(40)) == 0 && ccu.this.a(ccu.this.dm(), ccu.this.A());
      }

      @Override
      public boolean b() {
         return ccu.this.q() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + ccu.this.ag.a(3)));
         ccu.this.b(30);
      }

      @Override
      public void d() {
         if (ccu.this.q() == null) {
            ccu.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
