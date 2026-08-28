import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfo extends cfe implements buo<cfo.v> {
   private static final akj<Integer> cc = akn.a(cfo.class, akl.b);
   private static final akj<Byte> cd = akn.a(cfo.class, akl.a);
   private static final int ce = 1;
   public static final int bY = 4;
   public static final int bZ = 8;
   public static final int cb = 16;
   private static final int cf = 32;
   private static final int cg = 64;
   private static final int ch = 128;
   private static final akj<Optional<UUID>> ci = akn.a(cfo.class, akl.r);
   private static final akj<Optional<UUID>> cj = akn.a(cfo.class, akl.r);
   static final Predicate<cjg> ck = $$0 -> !$$0.y() && $$0.bD();
   private static final Predicate<bst> cl = $$0 -> !($$0 instanceof bto $$1) ? false : $$1.eo() != null && $$1.ep() < $$1.ai + 600;
   static final Predicate<bst> cm = $$0 -> $$0 instanceof cfj || $$0 instanceof cfy;
   private static final Predicate<bst> cn = $$0 -> !$$0.bY() && bsy.e.test($$0);
   private static final int co = 600;
   private static final bsw cp = bsz.Q.n().a(0.5F).b(0.2975F);
   private cam cq;
   private cam cr;
   private cam cs;
   private float ct;
   private float cu;
   float cv;
   float cw;
   private int cx;

   public cfo(bsz<? extends cfo> $$0, dbx $$1) {
      super($$0, $$1);
      this.bO = new cfo.k();
      this.bP = new cfo.m();
      this.a(eol.p, 0.0F);
      this.a(eol.q, 0.0F);
      this.a_(true);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ci, Optional.empty());
      $$0.a(cj, Optional.empty());
      $$0.a(cc, 0);
      $$0.a(cd, (byte)0);
   }

   @Override
   protected void z() {
      this.cq = new ccf<>(this, cfe.class, 10, false, false, $$0 -> $$0 instanceof cfj || $$0 instanceof cfy);
      this.cr = new ccf<>(this, cgf.class, 10, false, false, cgf.bY);
      this.cs = new ccf<>(this, cfb.class, 20, false, false, $$0 -> $$0 instanceof cfd);
      this.bS.a(0, new cfo.g());
      this.bS.a(0, new cab(this, this.dP()));
      this.bS.a(1, new cfo.b());
      this.bS.a(2, new cfo.n(2.2));
      this.bS.a(3, new cfo.e(1.0));
      this.bS.a(4, new bzt<>(this, cmw.class, 16.0F, 1.6, 1.4, $$0 -> cn.test($$0) && !this.c($$0.cz()) && !this.gC()));
      this.bS.a(4, new bzt<>(this, cgh.class, 8.0F, 1.6, 1.4, $$0 -> !((cgh)$$0).s() && !this.gC()));
      this.bS.a(4, new bzt<>(this, cfw.class, 8.0F, 1.6, 1.4, $$0 -> !this.gC()));
      this.bS.a(5, new cfo.u());
      this.bS.a(6, new cfo.o());
      this.bS.a(6, new cfo.s(1.25));
      this.bS.a(7, new cfo.l(1.2F, true));
      this.bS.a(7, new cfo.t());
      this.bS.a(8, new cfo.h(this, 1.25));
      this.bS.a(9, new cfo.q(32, 200));
      this.bS.a(10, new cfo.f(1.2F, 12, 1));
      this.bS.a(10, new cas(this, 0.4F));
      this.bS.a(11, new cbz(this, 1.0));
      this.bS.a(11, new cfo.p());
      this.bS.a(12, new cfo.j(this, cmw.class, 24.0F));
      this.bS.a(13, new cfo.r());
      this.bT.a(3, new cfo.a(bto.class, false, false, $$0 -> cl.test($$0) && !this.c($$0.cz())));
   }

   @Override
   public avy d(cuo $$0) {
      return avz.jj;
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD() && this.db()) {
         this.cx++;
         cuo $$0 = this.a(bta.a);
         if (this.n($$0)) {
            if (this.cx > 600) {
               cuo $$1 = $$0.a(this.dP(), this);
               if (!$$1.e()) {
                  this.a(bta.a, $$1);
               }

               this.cx = 0;
            } else if (this.cx > 560 && this.ah.i() < 0.1F) {
               this.a(this.d($$0), 1.0F, 1.0F);
               this.dP().a(this, (byte)45);
            }
         }

         bto $$2 = this.p();
         if ($$2 == null || !$$2.bD()) {
            this.y(false);
            this.z(false);
         }
      }

      if (this.fL() || this.fg()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.n_();
      if (this.gC() && this.ah.i() < 0.05F) {
         this.a(avz.jf, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fg() {
      return this.eB();
   }

   private boolean n(cuo $$0) {
      return $$0.b(km.v) && this.p() == null && this.aE() && !this.fL();
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cuo $$3;
         if ($$2 < 0.05F) {
            $$3 = new cuo(cur.oz);
         } else if ($$2 < 0.2F) {
            $$3 = new cuo(cur.qR);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cuo(cur.uD) : new cuo(cur.uE);
         } else if ($$2 < 0.6F) {
            $$3 = new cuo(cur.pw);
         } else if ($$2 < 0.8F) {
            $$3 = new cuo(cur.qD);
         } else {
            $$3 = new cuo(cur.pt);
         }

         this.a(bta.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         cuo $$1 = this.a(bta.a);
         if (!$$1.e()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               evq $$3 = new evq(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dH() * (float) (Math.PI / 180.0))
                  .b(-this.dF() * (float) (Math.PI / 180.0));
               this.dP().a(new le(li.S, $$1), this.du() + this.bL().c / 2.0, this.dw(), this.dA() + this.bL().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static buv.a s() {
      return btq.A().a(buw.r, 0.3F).a(buw.q, 10.0).a(buw.k, 32.0).a(buw.c, 2.0).a(buw.s, 5.0);
   }

   @Nullable
   public cfo b(are $$0, bsn $$1) {
      cfo $$2 = bsz.Q.a((dbx)$$0);
      if ($$2 != null) {
         $$2.a(this.ah.h() ? this.u() : ((cfo)$$1).u());
      }

      return $$2;
   }

   public static boolean c(bsz<cfo> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.ce) && a($$1, $$3);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      ji<dcw> $$4 = $$0.t(this.dp());
      cfo.v $$5 = cfo.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cfo.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cfo.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof are) {
         this.gA();
      }

      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gA() {
      if (this.u() == cfo.v.a) {
         this.bT.a(4, this.cq);
         this.bT.a(4, this.cr);
         this.bT.a(6, this.cs);
      } else {
         this.bT.a(4, this.cs);
         this.bT.a(6, this.cq);
         this.bT.a(6, this.cr);
      }
   }

   @Override
   protected void a(cmw $$0, bqs $$1, cuo $$2) {
      if (this.o($$2)) {
         this.a(this.d($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   public bsw e(bua $$0) {
      return this.p_() ? cp : super.e($$0);
   }

   public cfo.v u() {
      return cfo.v.a(this.ao.a(cc));
   }

   public void a(cfo.v $$0) {
      this.ao.a(cc, $$0.a());
   }

   List<UUID> gB() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add(this.ao.a(ci).orElse(null));
      $$0.add(this.ao.a(cj).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (this.ao.a(ci).isPresent()) {
         this.ao.a(cj, Optional.ofNullable($$0));
      } else {
         this.ao.a(ci, Optional.ofNullable($$0));
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      List<UUID> $$1 = this.gB();
      ux $$2 = new ux();

      for (UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(vg.a($$3));
         }
      }

      $$0.a("Trusted", $$2);
      $$0.a("Sleeping", this.fL());
      $$0.a("Type", this.u().c());
      $$0.a("Sitting", this.y());
      $$0.a("Crouching", this.ca());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);

      for (vo $$2 : $$0.c("Trusted", 11)) {
         this.b(vg.a($$2));
      }

      this.C($$0.q("Sleeping"));
      this.a(cfo.v.a($$0.l("Type")));
      this.w($$0.q("Sitting"));
      this.y($$0.q("Crouching"));
      if (this.dP() instanceof are) {
         this.gA();
      }
   }

   public boolean y() {
      return this.u(1);
   }

   public void w(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gq() {
      return this.u(64);
   }

   void A(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gC() {
      return this.u(128);
   }

   void B(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fL() {
      return this.u(32);
   }

   void C(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(cd, (byte)(this.ao.a(cd) | $$0));
      } else {
         this.ao.a(cd, (byte)(this.ao.a(cd) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(cd) & $$0) != 0;
   }

   @Override
   public boolean f(cuo $$0) {
      bta $$1 = btq.h($$0);
      return !this.a($$1).e() ? false : $$1 == bta.a && super.f($$0);
   }

   @Override
   public boolean j(cuo $$0) {
      cuo $$1 = this.a(bta.a);
      return $$1.e() || this.cx > 0 && $$0.b(km.v) && !$$1.b(km.v);
   }

   private void p(cuo $$0) {
      if (!$$0.e() && !this.dP().B) {
         cjg $$1 = new cjg(this.dP(), this.du() + this.bL().c, this.dw() + 1.0, this.dA() + this.bL().e, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(avz.jo, 1.0F, 1.0F);
         this.dP().b($$1);
      }
   }

   private void q(cuo $$0) {
      cjg $$1 = new cjg(this.dP(), this.du(), this.dw(), this.dA(), $$0);
      this.dP().b($$1);
   }

   @Override
   protected void b(cjg $$0) {
      cuo $$1 = $$0.p();
      if (this.j($$1)) {
         int $$2 = $$1.I();
         if ($$2 > 1) {
            this.q($$1.a($$2 - 1));
         }

         this.p(this.a(bta.a));
         this.a($$0);
         this.a(bta.a, $$1.a(1));
         this.f(bta.a);
         this.a($$0, $$1.I());
         $$0.ao();
         this.cx = 0;
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.db()) {
         boolean $$0 = this.be();
         if ($$0 || this.p() != null || this.dP().ac()) {
            this.gD();
         }

         if ($$0 || this.fL()) {
            this.w(false);
         }

         if (this.gq() && this.dP().z.i() < 0.2F) {
            iz $$1 = this.dp();
            dsb $$2 = this.dP().a_($$1);
            this.dP().c(2001, $$1, dey.i($$2));
         }
      }

      this.cu = this.ct;
      if (this.gz()) {
         this.ct = this.ct + (1.0F - this.ct) * 0.4F;
      } else {
         this.ct = this.ct + (0.0F - this.ct) * 0.4F;
      }

      this.cw = this.cv;
      if (this.ca()) {
         this.cv += 0.2F;
         if (this.cv > 3.0F) {
            this.cv = 3.0F;
         }
      } else {
         this.cv = 0.0F;
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.Z);
   }

   @Override
   protected void a(cmw $$0, btq $$1) {
      ((cfo)$$1).b($$0.cz());
   }

   public boolean gw() {
      return this.u(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gx() {
      return this.bn;
   }

   public boolean gy() {
      return this.cv == 3.0F;
   }

   public void y(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean ca() {
      return this.u(4);
   }

   public void z(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gz() {
      return this.u(8);
   }

   public float G(float $$0) {
      return ayy.i($$0, this.cu, this.ct) * 0.11F * (float) Math.PI;
   }

   public float H(float $$0) {
      return ayy.i($$0, this.cw, this.cv);
   }

   @Override
   public void h(@Nullable bto $$0) {
      if (this.gC() && $$0 == null) {
         this.B(false);
      }

      super.h($$0);
   }

   void gD() {
      this.C(false);
   }

   void gE() {
      this.z(false);
      this.y(false);
      this.w(false);
      this.C(false);
      this.B(false);
      this.A(false);
   }

   boolean gF() {
      return !this.fL() && !this.y() && !this.gq();
   }

   @Override
   public void Q() {
      avy $$0 = this.v();
      if ($$0 == avz.jl) {
         this.a($$0, 2.0F, this.ff());
      } else {
         super.Q();
      }
   }

   @Nullable
   @Override
   protected avy v() {
      if (this.fL()) {
         return avz.jm;
      } else {
         if (!this.dP().R() && this.ah.i() < 0.1F) {
            List<cmw> $$0 = this.dP().a(cmw.class, this.cK().c(16.0, 16.0, 16.0), bsy.f);
            if ($$0.isEmpty()) {
               return avz.jl;
            }
         }

         return avz.jg;
      }
   }

   @Nullable
   @Override
   protected avy d(brm $$0) {
      return avz.jk;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.ji;
   }

   boolean c(UUID $$0) {
      return this.gB().contains($$0);
   }

   @Override
   protected void g(brm $$0) {
      cuo $$1 = this.a(bta.a);
      if (!$$1.e()) {
         this.b($$1);
         this.a(bta.a, cuo.l);
      }

      super.g($$0);
   }

   public static boolean a(cfo $$0, bto $$1) {
      double $$2 = $$1.dA() - $$0.dA();
      double $$3 = $$1.du() - $$0.du();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.dP().a_(iz.a($$0.du() + $$8, $$0.dw() + (double)$$9, $$0.dA() + $$7)).r()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.55F * this.cL()), (double)(this.dj() * 0.4F));
   }

   class a extends ccf<bto> {
      @Nullable
      private bto j;
      @Nullable
      private bto k;
      private int l;

      public a(final Class<bto> $$0, final boolean $$1, final boolean $$2, @Nullable final Predicate<bto> $$3) {
         super(cfo.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.el().a(this.b) != 0) {
            return false;
         } else {
            for (UUID $$0 : cfo.this.gB()) {
               if ($$0 != null && cfo.this.dP() instanceof are && ((are)cfo.this.dP()).a($$0) instanceof bto $$2) {
                  this.k = $$2;
                  this.j = $$2.em();
                  int $$3 = $$2.en();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void c() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.en();
         }

         cfo.this.a(avz.jf, 1.0F, 1.0F);
         cfo.this.B(true);
         cfo.this.gD();
         super.c();
      }
   }

   class b extends cam {
      int a;

      public b() {
         this.a(EnumSet.of(cam.a.b, cam.a.c, cam.a.a));
      }

      @Override
      public boolean a() {
         return cfo.this.gq();
      }

      @Override
      public boolean b() {
         return this.a() && this.a > 0;
      }

      @Override
      public void c() {
         this.a = this.a(40);
      }

      @Override
      public void d() {
         cfo.this.A(false);
      }

      @Override
      public void e() {
         this.a--;
      }
   }

   public class c implements Predicate<bto> {
      public boolean a(bto $$0) {
         if ($$0 instanceof cfo) {
            return false;
         } else if ($$0 instanceof cfj || $$0 instanceof cfy || $$0 instanceof ckc) {
            return true;
         } else if ($$0 instanceof bul) {
            return !((bul)$$0).s();
         } else if (!($$0 instanceof cmw) || !$$0.N_() && !((cmw)$$0).f()) {
            return cfo.this.c($$0.cz()) ? false : !$$0.fL() && !$$0.bY();
         } else {
            return false;
         }
      }
   }

   abstract class d extends cam {
      private final cef b = cef.a().a(12.0).d().a(cfo.this.new c());

      protected boolean h() {
         iz $$0 = iz.a(cfo.this.du(), cfo.this.cK().e, cfo.this.dA());
         return !cfo.this.dP().h($$0) && cfo.this.d($$0) >= 0.0F;
      }

      protected boolean i() {
         return !cfo.this.dP().a(bto.class, this.b, cfo.this, cfo.this.cK().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bzy {
      public e(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public void c() {
         ((cfo)this.a).gE();
         ((cfo)this.c).gE();
         super.c();
      }

      @Override
      protected void g() {
         are $$0 = (are)this.b;
         cfo $$1 = (cfo)this.a.a($$0, (bsn)this.c);
         if ($$1 != null) {
            arf $$2 = this.a.gt();
            arf $$3 = this.c.gt();
            arf $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.cz());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.cz());
            }

            if ($$4 != null) {
               $$4.a(awj.P);
               am.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gv();
            this.c.gv();
            $$1.c_(-24000);
            $$1.b(this.a.du(), this.a.dw(), this.a.dA(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.ab().b(dbt.f)) {
               this.b.b(new bte(this.b, this.a.du(), this.a.dw(), this.a.dA(), this.a.el().a(7) + 1));
            }
         }
      }
   }

   public class f extends caz {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cfo.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(dca $$0, iz $$1) {
         dsb $$2 = $$0.a_($$1);
         return $$2.a(dfa.oi) && $$2.c(dnb.c) >= 2 || dfu.h_($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cfo.this.ah.i() < 0.05F) {
            cfo.this.a(avz.jn, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (cfo.this.dP().ab().b(dbt.c)) {
            dsb $$0 = cfo.this.dP().a_(this.e);
            if ($$0.a(dfa.oi)) {
               this.b($$0);
            } else if (dfu.h_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(dsb $$0) {
         dfu.a(cfo.this, $$0, cfo.this.dP(), this.e);
      }

      private void b(dsb $$0) {
         int $$1 = $$0.c(dnb.c);
         $$0.a(dnb.c, Integer.valueOf(1));
         int $$2 = 1 + cfo.this.dP().z.a(2) + ($$1 == 3 ? 1 : 0);
         cuo $$3 = cfo.this.a(bta.a);
         if ($$3.e()) {
            cfo.this.a(bta.a, new cuo(cur.wr));
            $$2--;
         }

         if ($$2 > 0) {
            dey.a(cfo.this.dP(), this.e, new cuo(cur.wr, $$2));
         }

         cfo.this.a(avz.zp, 1.0F, 1.0F);
         cfo.this.dP().a(this.e, $$0.a(dnb.c, Integer.valueOf(1)), 2);
         cfo.this.dP().a(dwu.c, this.e, dwu.a.a(cfo.this));
      }

      @Override
      public boolean a() {
         return !cfo.this.fL() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         cfo.this.w(false);
         super.c();
      }
   }

   class g extends cag {
      public g() {
         super(cfo.this);
      }

      @Override
      public void c() {
         super.c();
         cfo.this.gE();
      }

      @Override
      public boolean a() {
         return cfo.this.be() && cfo.this.b(awu.a) > 0.25 || cfo.this.bs();
      }
   }

   class h extends cal {
      private final cfo d;

      public h(final cfo $$0, final double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return !this.d.gC() && super.a();
      }

      @Override
      public boolean b() {
         return !this.d.gC() && super.b();
      }

      @Override
      public void c() {
         this.d.gE();
         super.c();
      }
   }

   public static class i extends bsn.a {
      public final cfo.v a;

      public i(cfo.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends cau {
      public j(final btq $$0, final Class<? extends bto> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !cfo.this.gq() && !cfo.this.gz();
      }

      @Override
      public boolean b() {
         return super.b() && !cfo.this.gq() && !cfo.this.gz();
      }
   }

   public class k extends bzo {
      public k() {
         super(cfo.this);
      }

      @Override
      public void a() {
         if (!cfo.this.fL()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfo.this.gw() && !cfo.this.ca() && !cfo.this.gz() && !cfo.this.gq();
      }
   }

   class l extends caw {
      public l(final double $$0, final boolean $$1) {
         super(cfo.this, $$0, $$1);
      }

      @Override
      protected void a(bto $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cfo.this.a(avz.jh, 1.0F, 1.0F);
         }
      }

      @Override
      public void c() {
         cfo.this.z(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !cfo.this.y() && !cfo.this.fL() && !cfo.this.ca() && !cfo.this.gq() && super.a();
      }
   }

   class m extends bzp {
      public m() {
         super(cfo.this);
      }

      @Override
      public void a() {
         if (cfo.this.gF()) {
            super.a();
         }
      }
   }

   class n extends cbf {
      public n(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public boolean h() {
         return !cfo.this.gC() && super.h();
      }
   }

   public class o extends caq {
      @Override
      public boolean a() {
         if (!cfo.this.gy()) {
            return false;
         } else {
            bto $$0 = cfo.this.p();
            if ($$0 != null && $$0.bD()) {
               if ($$0.cI() != $$0.cH()) {
                  return false;
               } else {
                  boolean $$1 = cfo.a(cfo.this, $$0);
                  if (!$$1) {
                     cfo.this.K().a($$0, 0);
                     cfo.this.y(false);
                     cfo.this.z(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean b() {
         bto $$0 = cfo.this.p();
         if ($$0 != null && $$0.bD()) {
            double $$1 = cfo.this.ds().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cfo.this.dH()) < 15.0F) || !cfo.this.aE()) && !cfo.this.gq();
         } else {
            return false;
         }
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public void c() {
         cfo.this.s(true);
         cfo.this.x(true);
         cfo.this.z(false);
         bto $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.G().a($$0, 60.0F, 30.0F);
            evq $$1 = new evq($$0.du() - cfo.this.du(), $$0.dw() - cfo.this.dw(), $$0.dA() - cfo.this.dA()).d();
            cfo.this.h(cfo.this.ds().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         cfo.this.K().n();
      }

      @Override
      public void d() {
         cfo.this.y(false);
         cfo.this.cv = 0.0F;
         cfo.this.cw = 0.0F;
         cfo.this.z(false);
         cfo.this.x(false);
      }

      @Override
      public void e() {
         bto $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.G().a($$0, 60.0F, 30.0F);
         }

         if (!cfo.this.gq()) {
            evq $$1 = cfo.this.ds();
            if ($$1.d * $$1.d < 0.03F && cfo.this.dH() != 0.0F) {
               cfo.this.s(ayy.j(0.2F, cfo.this.dH(), 0.0F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               cfo.this.s((float)$$3);
            }
         }

         if ($$0 != null && cfo.this.f($$0) <= 2.0F) {
            cfo.this.C($$0);
         } else if (cfo.this.dH() > 0.0F && cfo.this.aE() && (float)cfo.this.ds().d != 0.0F && cfo.this.dP().a_(cfo.this.dp()).a(dfa.dN)) {
            cfo.this.s(60.0F);
            cfo.this.h(null);
            cfo.this.A(true);
         }
      }
   }

   class p extends cam {
      public p() {
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         if (!cfo.this.a(bta.a).e()) {
            return false;
         } else if (cfo.this.p() != null || cfo.this.em() != null) {
            return false;
         } else if (!cfo.this.gF()) {
            return false;
         } else if (cfo.this.el().a(b(10)) != 0) {
            return false;
         } else {
            List<cjg> $$0 = cfo.this.dP().a(cjg.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.ck);
            return !$$0.isEmpty() && cfo.this.a(bta.a).e();
         }
      }

      @Override
      public void e() {
         List<cjg> $$0 = cfo.this.dP().a(cjg.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.ck);
         cuo $$1 = cfo.this.a(bta.a);
         if ($$1.e() && !$$0.isEmpty()) {
            cfo.this.K().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void c() {
         List<cjg> $$0 = cfo.this.dP().a(cjg.class, cfo.this.cK().c(8.0, 8.0, 8.0), cfo.ck);
         if (!$$0.isEmpty()) {
            cfo.this.K().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cbs {
      public q(final int $$0, final int $$1) {
         super(cfo.this, $$1);
      }

      @Override
      public void c() {
         cfo.this.gE();
         super.c();
      }

      @Override
      public boolean a() {
         return super.a() && this.h();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      private boolean h() {
         return !cfo.this.fL() && !cfo.this.y() && !cfo.this.gC() && cfo.this.p() == null;
      }
   }

   class r extends cfo.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean a() {
         return cfo.this.em() == null
            && cfo.this.el().i() < 0.02F
            && !cfo.this.fL()
            && cfo.this.p() == null
            && cfo.this.K().l()
            && !this.i()
            && !cfo.this.gw()
            && !cfo.this.ca();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + cfo.this.el().a(3);
         cfo.this.w(true);
         cfo.this.K().n();
      }

      @Override
      public void d() {
         cfo.this.w(false);
      }

      @Override
      public void e() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cfo.this.G().a(cfo.this.du() + this.c, cfo.this.dy(), cfo.this.dA() + this.d, (float)cfo.this.ab(), (float)cfo.this.aa());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cfo.this.el().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cfo.this.el().a(20));
      }
   }

   class s extends caf {
      private int c = b(100);

      public s(final double $$0) {
         super(cfo.this, $$0);
      }

      @Override
      public boolean a() {
         if (!cfo.this.fL() && this.a.p() == null) {
            if (cfo.this.dP().ac() && cfo.this.dP().h(this.a.dp())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               iz $$0 = this.a.dp();
               return cfo.this.dP().R() && cfo.this.dP().h($$0) && !((are)cfo.this.dP()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         cfo.this.gE();
         super.c();
      }
   }

   class t extends cfo.d {
      private static final int c = b(140);
      private int d = cfo.this.ah.a(c);

      public t() {
         this.a(EnumSet.of(cam.a.a, cam.a.b, cam.a.c));
      }

      @Override
      public boolean a() {
         return cfo.this.bo == 0.0F && cfo.this.bp == 0.0F && cfo.this.bq == 0.0F ? this.k() || cfo.this.fL() : false;
      }

      @Override
      public boolean b() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return cfo.this.dP().R() && this.h() && !this.i() && !cfo.this.aB;
         }
      }

      @Override
      public void d() {
         this.d = cfo.this.ah.a(c);
         cfo.this.gE();
      }

      @Override
      public void c() {
         cfo.this.w(false);
         cfo.this.y(false);
         cfo.this.z(false);
         cfo.this.s(false);
         cfo.this.C(true);
         cfo.this.K().n();
         cfo.this.H().a(cfo.this.du(), cfo.this.dw(), cfo.this.dA(), 0.0);
      }
   }

   class u extends cam {
      public u() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean a() {
         if (cfo.this.fL()) {
            return false;
         } else {
            bto $$0 = cfo.this.p();
            return $$0 != null && $$0.bD() && cfo.cm.test($$0) && cfo.this.g($$0) > 36.0 && !cfo.this.ca() && !cfo.this.gz() && !cfo.this.bn;
         }
      }

      @Override
      public void c() {
         cfo.this.w(false);
         cfo.this.A(false);
      }

      @Override
      public void d() {
         bto $$0 = cfo.this.p();
         if ($$0 != null && cfo.a(cfo.this, $$0)) {
            cfo.this.z(true);
            cfo.this.y(true);
            cfo.this.K().n();
            cfo.this.G().a($$0, (float)cfo.this.ab(), (float)cfo.this.aa());
         } else {
            cfo.this.z(false);
            cfo.this.y(false);
         }
      }

      @Override
      public void e() {
         bto $$0 = cfo.this.p();
         if ($$0 != null) {
            cfo.this.G().a($$0, (float)cfo.this.ab(), (float)cfo.this.aa());
            if (cfo.this.g($$0) <= 36.0) {
               cfo.this.z(true);
               cfo.this.y(true);
               cfo.this.K().n();
            } else {
               cfo.this.K().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements azt {
      a(0, "red"),
      b(1, "snow");

      public static final azt.a<cfo.v> c = azt.a(cfo.v::values);
      private static final IntFunction<cfo.v> d = axo.a(cfo.v::a, values(), axo.a.a);
      private final int e;
      private final String f;

      private v(final int $$0, final String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }

      public int a() {
         return this.e;
      }

      public static cfo.v a(String $$0) {
         return c.a($$0, a);
      }

      public static cfo.v a(int $$0) {
         return d.apply($$0);
      }

      public static cfo.v a(ji<dcw> $$0) {
         return $$0.a(awn.ar) ? b : a;
      }
   }
}
