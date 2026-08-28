import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crw extends cnk {
   protected static final akg<Boolean> c = akk.a(crw.class, aki.k);
   static final Predicate<cmn> a = $$0 -> !$$0.o() && $$0.bK() && cxy.a($$0.f(), crv.a($$0.dX().f(me.d)));
   @Nullable
   protected crv d;
   private int b;
   private boolean bE;
   private int bF;

   protected crw(bwb<? extends crw> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(1, new crw.b<>(this));
      this.bB.a(3, new ceh<>(this));
      this.bB.a(4, new crw.d(this, 1.05F, 1));
      this.bB.a(5, new crw.c(this));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arn var1, int var2, boolean var3);

   public boolean gA() {
      return this.bE;
   }

   public void z(boolean $$0) {
      this.bE = $$0;
   }

   @Override
   public void k_() {
      if (this.dV() instanceof arn && this.bK()) {
         crv $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dV().ae() % 20L == 0L) {
                  crv $$1 = ((arn)this.dV()).d(this.dv());
                  if ($$1 != null && crx.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bwr $$2 = this.f();
               if ($$2 != null && ($$2.aq() == bwb.bR || $$2.aq() == bwb.ap)) {
                  this.bc = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gs() {
      this.bc += 2;
   }

   @Override
   public void a(buh $$0) {
      if (this.dV() instanceof arn) {
         bvs $$1 = $$0.d();
         crv $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.aq() == bwb.bR) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return !this.gE();
   }

   public void a(@Nullable crv $$0) {
      this.d = $$0;
   }

   @Nullable
   public crv gB() {
      return this.d;
   }

   public boolean gC() {
      cxy $$0 = this.a(bwc.f);
      boolean $$1 = !$$0.f() && cxy.a($$0, crv.a(this.dX().f(me.d)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dV() instanceof arn $$0) ? false : this.gB() != null || $$0.d(this.dv()) != null;
   }

   public boolean gE() {
      return this.gB() != null && this.gB().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gF() {
      return this.b;
   }

   public boolean gG() {
      return this.al.a(c);
   }

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bE);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bE = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dV() instanceof arn) {
            this.d = ((arn)this.dV()).B().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gr()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      cxy $$2 = $$1.f();
      boolean $$3 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$3 && cxy.a($$2, crv.a(this.dX().f(me.d)))) {
         bwc $$4 = bwc.f;
         cxy $$5 = this.a($$4);
         double $$6 = (double)this.fX().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gB().a(this.gF(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gB() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gB() != null;
   }

   public int gH() {
      return this.bF;
   }

   public void c(int $$0) {
      this.bF = $$0;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.gE()) {
         this.gB().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.z(this.aq() != bwb.bH || $$2 != bwa.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awj ad_();

   protected static class a extends cdn {
      private final crw b;
      private final float c;
      public final chg a = chg.b().a(8.0).d().e();

      public a(cmq $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         bwr $$0 = this.b.eq();
         return this.b.gB() == null && this.b.gw() && this.b.f() != null && !this.b.gh() && ($$0 == null || $$0.aq() != bwb.bR);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (crw $$1 : a(this.b).a(crw.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bwr $$0 = this.b.f();
         if ($$0 != null) {
            for (crw $$2 : a(this.b).a(crw.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
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
         bwr $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bvs)$$0) > (double)this.c) {
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

   public class b<T extends crw> extends cdn {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private evh d;
      @Nullable
      private cmn e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = crw.this.h(bxx.m);

            for (cmn $$3 : this.b.dV().a(cmn.class, this.b.cR().c($$1, 8.0, $$1), crw.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (crw.this.dV().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  evh $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), crw.this.dV().ae() + 600L);
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
         if (!this.b.gE()) {
            return true;
         } else if (this.b.gB().a()) {
            return true;
         } else if (!this.b.t()) {
            return true;
         } else if (cxy.a(this.b.a(bwc.f), crv.a(this.b.dX().f(me.d)))) {
            return true;
         } else {
            crw $$0 = crw.this.d.b(this.b.gF());
            return $$0 != null && $$0.bK();
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
            this.b.a(a(crw.this.dV()), this.e);
         }
      }
   }

   public class c extends cdn {
      private final crw b;

      c(final crw $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         crv $$0 = this.b.gB();
         return this.b.bK() && this.b.f() == null && $$0 != null && $$0.f();
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
            crw.this.b(crw.this.ad_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cdn {
      private final crw a;
      private final double b;
      private jj c;
      private final List<jj> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(crw $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gB().a();
      }

      private boolean i() {
         arn $$0 = (arn)this.a.dV();
         jj $$1 = this.a.dv();
         Optional<jj> $$2 = $$0.A().a($$0x -> $$0x.a(chx.n), this::a, cht.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.O().k() ? false : this.a.f() == null && !this.c.a(this.a.dt(), (double)(this.a.dq() + (float)this.e)) && !this.f;
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
         this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fcu $$0 = fcu.c(this.c);
            fcu $$1 = chk.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chk.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(jj $$0) {
         for (jj $$1 : this.d) {
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
