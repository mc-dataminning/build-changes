import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbz extends ccj implements bmm {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bnj d = new bnj(c, "Attacking speed boost", 0.15F, bnj.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final agj<Optional<dja>> bU = agm.a(cbz.class, agl.j);
   private static final agj<Boolean> bV = agm.a(cbz.class, agl.k);
   private static final agj<Boolean> bW = agm.a(cbz.class, agl.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bjg bZ = avj.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cbz(blt<? extends cbz> $$0, cti $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(eev.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new cbz.a(this));
      this.bO.a(2, new btl(this, 1.0, false));
      this.bO.a(7, new buo(this, 1.0, 0.0F));
      this.bO.a(8, new btj(this, cfb.class, 8.0F));
      this.bO.a(8, new btw(this));
      this.bO.a(10, new cbz.b(this));
      this.bO.a(11, new cbz.d(this));
      this.bP.a(1, new cbz.c(this, this::a_));
      this.bP.a(2, new but(this));
      this.bP.a(3, new buu<>(this, cca.class, true, false));
      this.bP.a(4, new bva<>(this, false));
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 40.0).a(bnl.m, 0.3F).a(bnl.c, 7.0).a(bnl.g, 64.0);
   }

   @Override
   public void h(@Nullable bmf $$0) {
      super.h($$0);
      bnh $$1 = this.a(bnl.m);
      if ($$0 == null) {
         this.bY = 0;
         this.an.b(bV, false);
         this.an.b(bW, false);
         $$1.b(d.a());
      } else {
         this.bY = this.ah;
         this.an.b(bV, true);
         if (!$$1.a(d)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, Optional.empty());
      this.an.a(bV, false);
      this.an.a(bW, false);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   public void w() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), arm.hJ, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(agj<?> $$0) {
      if (bV.equals($$0) && this.gg() && this.dM().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      dja $$1 = this.ge();
      if ($$1 != null) {
         $$0.a("carriedBlockState", ta.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      dja $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = ta.a(this.dM().a(ke.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cfb $$0) {
      cmr $$1 = $$0.fS().j.get(3);
      if ($$1.a(cwl.ee.k())) {
         return false;
      } else {
         elm $$2 = $$0.f(1.0F).d();
         elm $$3 = new elm(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jx.Z, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dM().B) {
         this.a((amz)this.dM(), true);
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dM().P() && this.ah >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dM().h(this.dm()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.Z();
   }

   protected boolean A() {
      if (!this.dM().y_() && this.bx()) {
         double $$0 = this.dr() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.dt() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dx() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(blp $$0) {
      elm $$1 = new elm(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hx.a $$3 = new hx.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().J_() && !this.dM().a_($$3).d()) {
         $$3.c(ic.a);
      }

      dja $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(asg.a);
      if ($$5 && !$$6) {
         elm $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dnk.R, $$7, dnk.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, arm.hK, this.db(), 1.0F, 1.0F);
               this.a(arm.hK, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected arl y() {
      return this.gf() ? arm.hI : arm.hF;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.hH;
   }

   @Override
   protected arl n_() {
      return arm.hG;
   }

   @Override
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dja $$3 = this.ge();
      if ($$3 != null) {
         cmr $$4 = new cmr(cmu.pf);
         $$4.a(crg.v, 1);
         egv.a $$5 = new egv.a((amz)this.dM()).a(eja.f, this.dk()).a(eja.i, $$4).b(eja.a, this);

         for (cmr $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dja $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dja ge() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cge;
         if (!$$0.a(asd.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().y_() && !($$0.d() instanceof bmf) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cge)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bkn $$0, cge $$1, float $$2) {
      cmr $$3 = $$1.q();
      cop $$4 = cor.d($$3);
      List<blc> $$5 = cor.a($$3);
      boolean $$6 = $$4 == cos.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gf() {
      return this.an.b(bV);
   }

   public boolean gg() {
      return this.an.b(bW);
   }

   public void gh() {
      this.an.b(bW, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.ge() != null;
   }

   static class a extends btb {
      private final cbz a;
      @Nullable
      private bmf b;

      public a(cbz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btb.a.c, btb.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cfb)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cfb)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.dr(), this.b.dv(), this.b.dx());
      }
   }

   static class b extends btb {
      private final cbz a;

      public b(cbz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() == null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cte.c) ? false : this.a.eg().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         aup $$0 = this.a.eg();
         cti $$1 = this.a.dM();
         int $$2 = aui.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = aui.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = aui.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         hx $$5 = new hx($$2, $$3, $$4);
         dja $$6 = $$1.a_($$5);
         hx $$7 = $$5.d();
         dja $$8 = $$1.a_($$7);
         dja $$9 = this.a.ge();
         if ($$9 != null) {
            $$9 = cwj.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dnk.i, $$5, dnk.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cti $$0, hx $$1, dja $$2, dja $$3, dja $$4, hx $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cwl.F) && $$4.r($$0, $$5) && $$2.a((ctl)$$0, $$1) && $$0.a_(this.a, elh.a(elm.a($$1))).isEmpty();
      }
   }

   static class c extends buu<cfb> {
      private final cbz i;
      @Nullable
      private cfb j;
      private int k;
      private int l;
      private final bwt m;
      private final bwt n = bwt.a().d();
      private final Predicate<bmf> o;

      public c(cbz $$0, @Nullable Predicate<bmf> $$1) {
         super($$0, cfb.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cfb)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bwt.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dM().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gh();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.z(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.q() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cfb)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.A();
                  }

                  this.l = 0;
               } else if (this.c.f(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends btb {
      private final cbz a;

      public d(cbz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() != null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cte.c) ? false : this.a.eg().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         aup $$0 = this.a.eg();
         cti $$1 = this.a.dM();
         int $$2 = aui.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = aui.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = aui.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         hx $$5 = new hx($$2, $$3, $$4);
         dja $$6 = $$1.a_($$5);
         elm $$7 = new elm((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         elm $$8 = new elm((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eli $$9 = $$1.a(new csr($$7, $$8, csr.a.b, csr.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(asb.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dnk.f, $$5, dnk.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
