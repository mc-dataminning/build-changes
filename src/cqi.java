import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cqi extends clz {
   protected static final akm<Boolean> c = akq.a(cqi.class, ako.k);
   static final Predicate<clc> a = $$0 -> !$$0.t() && $$0.bL() && cwm.a($$0.j(), cqh.a($$0.dX().e(ma.d)));
   @Nullable
   protected cqh d;
   private int b;
   private boolean bY;
   private int bZ;

   protected cqi(bus<? extends cqi> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new cqi.b<>(this));
      this.bS.a(3, new ccz<>(this));
      this.bS.a(4, new cqi.d(this, 1.05F, 1));
      this.bS.a(5, new cqi.c(this));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arp var1, int var2, boolean var3);

   public boolean gz() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void d_() {
      if (this.dV() instanceof arp && this.bL()) {
         cqh $$0 = this.gA();
         if (this.gz()) {
            if ($$0 == null) {
               if (this.dV().ab() % 20L == 0L) {
                  cqh $$1 = ((arp)this.dV()).d(this.dv());
                  if ($$1 != null && cqj.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvh $$2 = this.aa_();
               if ($$2 != null && ($$2.aq() == bus.bO || $$2.aq() == bus.ao)) {
                  this.be = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gr() {
      this.be += 2;
   }

   @Override
   public void a(btb $$0) {
      if (this.dV() instanceof arp) {
         bul $$1 = $$0.d();
         cqh $$2 = this.gA();
         if ($$2 != null) {
            if (this.gq()) {
               $$2.c(this.gE());
            }

            if ($$1 != null && $$1.aq() == bus.bO) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gt() {
      return !this.gD();
   }

   public void a(@Nullable cqh $$0) {
      this.d = $$0;
   }

   @Nullable
   public cqh gA() {
      return this.d;
   }

   public boolean gB() {
      cwm $$0 = this.a(but.f);
      boolean $$1 = !$$0.f() && cwm.a($$0, cqh.a(this.dX().e(ma.d)));
      boolean $$2 = this.gq();
      return $$1 && $$2;
   }

   public boolean gC() {
      return !(this.dV() instanceof arp $$0) ? false : this.gA() != null || $$0.d(this.dv()) != null;
   }

   public boolean gD() {
      return this.gA() != null && this.gA().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gE() {
      return this.b;
   }

   public boolean gF() {
      return this.al.a(c);
   }

   public void B(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dV() instanceof arp) {
            this.d = ((arp)this.dV()).A().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gq()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      cwm $$2 = $$1.j();
      boolean $$3 = this.gD() && this.gA().b(this.gE()) != null;
      if (this.gD() && !$$3 && cwm.a($$2, cqh.a(this.dX().e(ma.d)))) {
         but $$4 = but.f;
         cwm $$5 = this.a($$4);
         double $$6 = (double)this.h($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.L());
         $$1.at();
         this.gA().a(this.gE(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gA() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gA() != null;
   }

   public int gG() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.gD()) {
         this.gA().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.A(this.aq() != bus.bE || $$2 != bur.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awm aj_();

   protected class a extends ccf {
      private final cqi b;
      private final float c;
      public final cfy a = cfy.b().a(8.0).d().e();

      public a(final clf $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = this.b.ep();
         return this.b.gA() == null && this.b.gv() && this.b.aa_() != null && !this.b.gb() && ($$0 == null || $$0.aq() != bus.bO);
      }

      @Override
      public void d() {
         super.d();
         this.b.L().o();

         for (cqi $$1 : a(this.b).a(cqi.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.aa_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvh $$0 = this.b.aa_();
         if ($$0 != null) {
            for (cqi $$2 : a(this.b).a(cqi.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         bvh $$0 = this.b.aa_();
         if ($$0 != null) {
            if (this.b.g((bul)$$0) > (double)this.c) {
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

   public class b<T extends cqi> extends ccf {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private esj d;
      @Nullable
      private clc e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cqi.this.h(bwp.m);

            for (clc $$3 : this.b.dV().a(clc.class, this.b.cR().c($$1, 8.0, $$1), cqi.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cqi.this.dV().ab() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  esj $$5 = this.b.L().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cqi.this.dV().ab() + 600L);
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
         if (!this.b.gD()) {
            return true;
         } else if (this.b.gA().a()) {
            return true;
         } else if (!this.b.gn()) {
            return true;
         } else if (cwm.a(this.b.a(but.f), cqh.a(this.b.dX().e(ma.d)))) {
            return true;
         } else {
            cqi $$0 = cqi.this.d.b(this.b.gE());
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
            this.b.a(a(cqi.this.dV()), this.e);
         }
      }
   }

   public class c extends ccf {
      private final cqi b;

      c(final cqi $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         cqh $$0 = this.b.gA();
         return this.b.bL() && this.b.aa_() == null && $$0 != null && $$0.f();
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
            cqi.this.b(cqi.this.aj_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.J().a();
         }

         super.a();
      }
   }

   static class d extends ccf {
      private final cqi a;
      private final double b;
      private jh c;
      private final List<jh> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cqi $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.aa_() == null;
      }

      private boolean h() {
         return this.a.gD() && !this.a.gA().a();
      }

      private boolean i() {
         arp $$0 = (arp)this.a.dV();
         jh $$1 = this.a.dv();
         Optional<jh> $$2 = $$0.z().a($$0x -> $$0x.a(cgp.n), this::a, cgl.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.L().m() ? false : this.a.aa_() == null && !this.c.a(this.a.dt(), (double)(this.a.dq() + (float)this.e)) && !this.f;
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
            ezy $$0 = ezy.c(this.c);
            ezy $$1 = cgc.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgc.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
