import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crg extends cmt {
   protected static final alc<Boolean> c = alg.a(crg.class, ale.k);
   static final Predicate<clw> a = $$0 -> !$$0.v() && $$0.bL() && cxk.a($$0.l(), crf.a($$0.dX().e(mb.d)));
   @Nullable
   protected crf d;
   private int b;
   private boolean bZ;
   private int ca;

   protected crg(bvm<? extends crg> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new crg.b<>(this));
      this.bT.a(3, new cdt<>(this));
      this.bT.a(4, new crg.d(this, 1.05F, 1));
      this.bT.a(5, new crg.c(this));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(ash var1, int var2, boolean var3);

   public boolean gy() {
      return this.bZ;
   }

   public void A(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public void d_() {
      if (this.dV() instanceof ash && this.bL()) {
         crf $$0 = this.gz();
         if (this.gy()) {
            if ($$0 == null) {
               if (this.dV().ac() % 20L == 0L) {
                  crf $$1 = ((ash)this.dV()).d(this.dv());
                  if ($$1 != null && crh.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bwb $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == bvm.bS || $$2.aq() == bvm.aq)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gq() {
      this.bf += 2;
   }

   @Override
   public void a(btv $$0) {
      if (this.dV() instanceof ash) {
         bvf $$1 = $$0.d();
         crf $$2 = this.gz();
         if ($$2 != null) {
            if (this.gp()) {
               $$2.c(this.gD());
            }

            if ($$1 != null && $$1.aq() == bvm.bS) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gs() {
      return !this.gC();
   }

   public void a(@Nullable crf $$0) {
      this.d = $$0;
   }

   @Nullable
   public crf gz() {
      return this.d;
   }

   public boolean gA() {
      cxk $$0 = this.a(bvn.f);
      boolean $$1 = !$$0.f() && cxk.a($$0, crf.a(this.dX().e(mb.d)));
      boolean $$2 = this.gp();
      return $$1 && $$2;
   }

   public boolean gB() {
      return !(this.dV() instanceof ash $$0) ? false : this.gz() != null || $$0.d(this.dv()) != null;
   }

   public boolean gC() {
      return this.gz() != null && this.gz().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gD() {
      return this.b;
   }

   public boolean gE() {
      return this.al.a(c);
   }

   public void B(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bZ);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bZ = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dV() instanceof ash) {
            this.d = ((ash)this.dV()).A().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gp()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      cxk $$2 = $$1.l();
      boolean $$3 = this.gC() && this.gz().b(this.gD()) != null;
      if (this.gC() && !$$3 && cxk.a($$2, crf.a(this.dX().e(mb.d)))) {
         bvn $$4 = bvn.f;
         cxk $$5 = this.a($$4);
         double $$6 = (double)this.h($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.L());
         $$1.at();
         this.gz().a(this.gD(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gz() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gz() != null;
   }

   public int gF() {
      return this.ca;
   }

   public void c(int $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.gC()) {
         this.gz().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.A(this.aq() != bvm.bI || $$2 != bvl.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract axe ak_();

   protected class a extends ccz {
      private final crg b;
      private final float c;
      public final cgs a = cgs.b().a(8.0).d().e();

      public a(final clz $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      }

      @Override
      public boolean b() {
         bwb $$0 = this.b.ep();
         return this.b.gz() == null && this.b.gu() && this.b.O_() != null && !this.b.gb() && ($$0 == null || $$0.aq() != bvm.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.L().o();

         for (crg $$1 : a(this.b).a(crg.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bwb $$0 = this.b.O_();
         if ($$0 != null) {
            for (crg $$2 : a(this.b).a(crg.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bwb $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((bvf)$$0) > (double)this.c) {
               this.b.H().a($$0, 30.0F, 30.0F);
               if (this.b.ae.a(50) == 0) {
                  this.b.R();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends crg> extends ccz {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private eud d;
      @Nullable
      private clw e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = crg.this.h(bxj.m);

            for (clw $$3 : this.b.dV().a(clw.class, this.b.cR().c($$1, 8.0, $$1), crg.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (crg.this.dV().ac() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  eud $$5 = this.b.L().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), crg.this.dV().ac() + 600L);
               }
            }

            this.c = $$0;
            return false;
         }
      }

      @Override
      public boolean c() {
         if (this.e == null || this.d == null) {
            return false;
         } else if (this.e.dQ()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gC()) {
            return true;
         } else if (this.b.gz().a()) {
            return true;
         } else if (!this.b.gm()) {
            return true;
         } else if (cxk.a(this.b.a(bvn.f), crf.a(this.b.dX().e(mb.d)))) {
            return true;
         } else {
            crg $$0 = crg.this.d.b(this.b.gD());
            return $$0 != null && $$0.bL();
         }
      }

      @Override
      public void d() {
         this.b.L().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(crg.this.dV()), this.e);
         }
      }
   }

   public class c extends ccz {
      private final crg b;

      c(final crg $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         crf $$0 = this.b.gz();
         return this.b.bL() && this.b.O_() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.B(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.B(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.bb() && this.b.ae.a(this.a(100)) == 0) {
            crg.this.b(crg.this.ak_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.J().a();
         }

         super.a();
      }
   }

   static class d extends ccz {
      private final crg a;
      private final double b;
      private jh c;
      private final List<jh> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(crg $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.O_() == null;
      }

      private boolean h() {
         return this.a.gC() && !this.a.gz().a();
      }

      private boolean i() {
         ash $$0 = (ash)this.a.dV();
         jh $$1 = this.a.dv();
         Optional<jh> $$2 = $$0.z().a($$0x -> $$0x.a(chj.n), this::a, chf.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.L().m() ? false : this.a.O_() == null && !this.c.a(this.a.dt(), (double)(this.a.dq() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dt(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.n(0);
         this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.L().m()) {
            fbs $$0 = fbs.c(this.c);
            fbs $$1 = cgw.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgw.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.L().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(jh $$0) {
         for (jh $$1 : this.d) {
            if (Objects.equals($$0, $$1)) {
               return false;
            }
         }

         return true;
      }

      private void k() {
         if (this.d.size() > 2) {
            this.d.remove(0);
         }
      }
   }
}
