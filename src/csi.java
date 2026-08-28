import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class csi extends cnu {
   protected static final akh<Boolean> c = akl.a(csi.class, akj.k);
   static final Predicate<cmx> a = $$0 -> !$$0.o() && $$0.bK() && cys.a($$0.f(), csh.a($$0.dX().f(mg.aF)));
   @Nullable
   protected csh d;
   private int b;
   private boolean bF;
   private int bG;

   protected csi(bwj<? extends csi> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new csi.b<>(this));
      this.bC.a(3, new cep<>(this));
      this.bC.a(4, new csi.d(this, 1.05F, 1));
      this.bC.a(5, new csi.c(this));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(aro var1, int var2, boolean var3);

   public boolean gA() {
      return this.bF;
   }

   public void z(boolean $$0) {
      this.bF = $$0;
   }

   @Override
   public void k_() {
      if (this.dV() instanceof aro && this.bK()) {
         csh $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dV().ae() % 20L == 0L) {
                  csh $$1 = ((aro)this.dV()).d(this.dv());
                  if ($$1 != null && csj.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bwz $$2 = this.f();
               if ($$2 != null && ($$2.aq() == bwj.bS || $$2.aq() == bwj.ap)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gs() {
      this.bd += 2;
   }

   @Override
   public void a(bup $$0) {
      if (this.dV() instanceof aro) {
         bwa $$1 = $$0.d();
         csh $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.aq() == bwj.bS) {
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

   public void a(@Nullable csh $$0) {
      this.d = $$0;
   }

   @Nullable
   public csh gB() {
      return this.d;
   }

   public boolean gC() {
      cys $$0 = this.a(bwk.f);
      boolean $$1 = !$$0.f() && cys.a($$0, csh.a(this.dX().f(mg.aF)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dV() instanceof aro $$0) ? false : this.gB() != null || $$0.d(this.dv()) != null;
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bF);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bF = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dV() instanceof aro) {
            this.d = ((aro)this.dV()).B().a($$0.h("RaidId"));
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
   protected void a(aro $$0, cmx $$1) {
      cys $$2 = $$1.f();
      boolean $$3 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$3 && cys.a($$2, csh.a(this.dX().f(mg.aF)))) {
         bwk $$4 = bwk.f;
         cys $$5 = this.a($$4);
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
      return this.bG;
   }

   public void c(int $$0) {
      this.bG = $$0;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.gE()) {
         this.gB().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.z(this.aq() != bwj.bI || $$2 != bwi.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awk ad_();

   protected static class a extends cdv {
      private final csi b;
      private final float c;
      public final cho a = cho.b().a(8.0).d().e();

      public a(cna $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         bwz $$0 = this.b.eq();
         return this.b.gB() == null && this.b.gw() && this.b.f() != null && !this.b.gh() && ($$0 == null || $$0.aq() != bwj.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (csi $$1 : a(this.b).a(csi.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bwz $$0 = this.b.f();
         if ($$0 != null) {
            for (csi $$2 : a(this.b).a(csi.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
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
         bwz $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bwa)$$0) > (double)this.c) {
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

   public class b<T extends csi> extends cdv {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private ewj d;
      @Nullable
      private cmx e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = csi.this.h(byf.m);

            for (cmx $$3 : this.b.dV().a(cmx.class, this.b.cR().c($$1, 8.0, $$1), csi.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (csi.this.dV().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  ewj $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), csi.this.dV().ae() + 600L);
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
         } else if (cys.a(this.b.a(bwk.f), csh.a(this.b.dX().f(mg.aF)))) {
            return true;
         } else {
            csi $$0 = csi.this.d.b(this.b.gF());
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
            this.b.a(a(csi.this.dV()), this.e);
         }
      }
   }

   public class c extends cdv {
      private final csi b;

      c(final csi $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         csh $$0 = this.b.gB();
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
            csi.this.b(csi.this.ad_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cdv {
      private final csi a;
      private final double b;
      private iu c;
      private final List<iu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(csi $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cdv.a.a));
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
         aro $$0 = (aro)this.a.dV();
         iu $$1 = this.a.dv();
         Optional<iu> $$2 = $$0.A().a($$0x -> $$0x.a(cif.n), this::a, cib.b.c, $$1, 48, this.a.ae);
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
            fdw $$0 = fdw.c(this.c);
            fdw $$1 = chs.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chs.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(iu $$0) {
         for (iu $$1 : this.d) {
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
