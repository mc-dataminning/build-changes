import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crf extends cmt {
   protected static final ajx<Boolean> c = akb.a(crf.class, ajz.k);
   static final Predicate<clw> a = $$0 -> !$$0.o() && $$0.bJ() && cxh.a($$0.f(), cre.a($$0.dW().e(mc.d)));
   @Nullable
   protected cre d;
   private int b;
   private boolean bF;
   private int bG;

   protected crf(bvi<? extends crf> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new crf.b<>(this));
      this.bC.a(3, new cdq<>(this));
      this.bC.a(4, new crf.d(this, 1.05F, 1));
      this.bC.a(5, new crf.c(this));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(ard var1, int var2, boolean var3);

   public boolean gC() {
      return this.bF;
   }

   public void z(boolean $$0) {
      this.bF = $$0;
   }

   @Override
   public void k_() {
      if (this.dU() instanceof ard && this.bJ()) {
         cre $$0 = this.gD();
         if (this.gC()) {
            if ($$0 == null) {
               if (this.dU().ae() % 20L == 0L) {
                  cre $$1 = ((ard)this.dU()).d(this.du());
                  if ($$1 != null && crg.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvy $$2 = this.f();
               if ($$2 != null && ($$2.aq() == bvi.bR || $$2.aq() == bvi.ap)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gu() {
      this.bd += 2;
   }

   @Override
   public void a(btp $$0) {
      if (this.dU() instanceof ard) {
         bva $$1 = $$0.d();
         cre $$2 = this.gD();
         if ($$2 != null) {
            if (this.gt()) {
               $$2.c(this.gH());
            }

            if ($$1 != null && $$1.aq() == bvi.bR) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gw() {
      return !this.gG();
   }

   public void a(@Nullable cre $$0) {
      this.d = $$0;
   }

   @Nullable
   public cre gD() {
      return this.d;
   }

   public boolean gE() {
      cxh $$0 = this.a(bvj.f);
      boolean $$1 = !$$0.f() && cxh.a($$0, cre.a(this.dW().e(mc.d)));
      boolean $$2 = this.gt();
      return $$1 && $$2;
   }

   public boolean gF() {
      return !(this.dU() instanceof ard $$0) ? false : this.gD() != null || $$0.d(this.du()) != null;
   }

   public boolean gG() {
      return this.gD() != null && this.gD().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gH() {
      return this.b;
   }

   public boolean gI() {
      return this.al.a(c);
   }

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bF);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bF = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dU() instanceof ard) {
            this.d = ((ard)this.dU()).B().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gt()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      cxh $$2 = $$1.f();
      boolean $$3 = this.gG() && this.gD().b(this.gH()) != null;
      if (this.gG() && !$$3 && cxh.a($$2, cre.a(this.dW().e(mc.d)))) {
         bvj $$4 = bvj.f;
         cxh $$5 = this.a($$4);
         double $$6 = (double)this.fZ().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gD().a(this.gH(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gD() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gD() != null;
   }

   public int gJ() {
      return this.bG;
   }

   public void c(int $$0) {
      this.bG = $$0;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.gG()) {
         this.gD().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.z(this.aq() != bvi.bH || $$2 != bvh.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz ah_();

   protected static class a extends ccw {
      private final crf b;
      private final float c;
      public final cgp a = cgp.b().a(8.0).d().e();

      public a(clz $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         bvy $$0 = this.b.ep();
         return this.b.gD() == null && this.b.gy() && this.b.f() != null && !this.b.gj() && ($$0 == null || $$0.aq() != bvi.bR);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (crf $$1 : a(this.b).a(crf.class, this.a, this.b, this.b.cQ().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bvy $$0 = this.b.f();
         if ($$0 != null) {
            for (crf $$2 : a(this.b).a(crf.class, this.a, this.b, this.b.cQ().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bvy $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bva)$$0) > (double)this.c) {
               this.b.J().a($$0, 30.0F, 30.0F);
               if (this.b.ae.a(50) == 0) {
                  this.b.T();
               }
            } else {
               this.b.v(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends crf> extends ccw {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private euk d;
      @Nullable
      private clw e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = crf.this.h(bxg.m);

            for (clw $$3 : this.b.dU().a(clw.class, this.b.cQ().c($$1, 8.0, $$1), crf.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (crf.this.dU().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  euk $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), crf.this.dU().ae() + 600L);
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
         } else if (this.e.dP()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gG()) {
            return true;
         } else if (this.b.gD().a()) {
            return true;
         } else if (!this.b.t()) {
            return true;
         } else if (cxh.a(this.b.a(bvj.f), cre.a(this.b.dW().e(mc.d)))) {
            return true;
         } else {
            crf $$0 = crf.this.d.b(this.b.gH());
            return $$0 != null && $$0.bJ();
         }
      }

      @Override
      public void d() {
         this.b.O().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(crf.this.dU()), this.e);
         }
      }
   }

   public class c extends ccw {
      private final crf b;

      c(final crf $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         cre $$0 = this.b.gD();
         return this.b.bJ() && this.b.f() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.A(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.A(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.bb() && this.b.ae.a(this.a(100)) == 0) {
            crf.this.b(crf.this.ah_());
         }

         if (!this.b.bY() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends ccw {
      private final crf a;
      private final double b;
      private ji c;
      private final List<ji> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(crf $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gG() && !this.a.gD().a();
      }

      private boolean i() {
         ard $$0 = (ard)this.a.dU();
         ji $$1 = this.a.du();
         Optional<ji> $$2 = $$0.A().a($$0x -> $$0x.a(chg.n), this::a, chc.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.O().k() ? false : this.a.f() == null && !this.c.a(this.a.ds(), (double)(this.a.dp() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.ds(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.n(0);
         this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fbx $$0 = fbx.c(this.c);
            fbx $$1 = cgt.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgt.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(ji $$0) {
         for (ji $$1 : this.d) {
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
