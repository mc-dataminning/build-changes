import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ctd extends cop {
   protected static final akj<Boolean> c = akn.a(ctd.class, akl.k);
   static final Predicate<cnr> a = $$0 -> !$$0.o() && $$0.bI() && czn.a($$0.f(), ctc.a($$0.dW().f(mh.aF)));
   @Nullable
   protected ctc d;
   private int b;
   private boolean bG;
   private int bH;

   protected ctd(bwr<? extends ctd> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(1, new ctd.b<>(this));
      this.bD.a(3, new cez<>(this));
      this.bD.a(4, new ctd.d(this, 1.05F, 1));
      this.bD.a(5, new ctd.c(this));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arq var1, int var2, boolean var3);

   public boolean gD() {
      return this.bG;
   }

   public void z(boolean $$0) {
      this.bG = $$0;
   }

   @Override
   public void k_() {
      if (this.dU() instanceof arq $$0 && this.bI()) {
         ctc $$1 = this.gE();
         if (this.gD()) {
            if ($$1 == null) {
               if (this.dU().ae() % 20L == 0L) {
                  ctc $$2 = $$0.d(this.du());
                  if ($$2 != null && cte.a(this)) {
                     $$2.a($$0, $$2.j(), this, null, true);
                  }
               }
            } else {
               bxj $$3 = this.f();
               if ($$3 != null && ($$3.an() == bwr.bS || $$3.an() == bwr.ap)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gv() {
      this.bd += 2;
   }

   @Override
   public void a(bux $$0) {
      if (this.dU() instanceof arq $$1) {
         bwi $$2 = $$0.d();
         ctc $$3 = this.gE();
         if ($$3 != null) {
            if (this.gu()) {
               $$3.c(this.gI());
            }

            if ($$2 != null && $$2.an() == bwr.bS) {
               $$3.a($$2);
            }

            $$3.a($$1, this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gx() {
      return !this.gH();
   }

   public void a(@Nullable ctc $$0) {
      this.d = $$0;
   }

   @Nullable
   public ctc gE() {
      return this.d;
   }

   public boolean gF() {
      czn $$0 = this.a(bws.f);
      boolean $$1 = !$$0.f() && czn.a($$0, ctc.a(this.dW().f(mh.aF)));
      boolean $$2 = this.gu();
      return $$1 && $$2;
   }

   public boolean gG() {
      return !(this.dU() instanceof arq $$0) ? false : this.gE() != null || $$0.d(this.du()) != null;
   }

   public boolean gH() {
      return this.gE() != null && this.gE().r();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gI() {
      return this.b;
   }

   public boolean gJ() {
      return this.al.a(c);
   }

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bG);
      if (this.d != null && this.dU() instanceof arq $$1) {
         $$1.B().a(this.d).ifPresent($$1x -> $$0.a("RaidId", $$1x));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.f("Wave");
      this.bG = $$0.o("CanJoinRaid");
      if ($$0.b("RaidId", 3) && this.dU() instanceof arq $$1) {
         this.d = $$1.B().a($$0.f("RaidId"));
         if (this.d != null) {
            this.d.a($$1, this.b, this, false);
            if (this.gu()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arq $$0, cnr $$1) {
      czn $$2 = $$1.f();
      boolean $$3 = this.gH() && this.gE().b(this.gI()) != null;
      if (this.gH() && !$$3 && czn.a($$2, ctc.a(this.dW().f(mh.aF)))) {
         bws $$4 = bws.f;
         czn $$5 = this.a($$4);
         double $$6 = (double)this.ga().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.aq();
         this.gE().a(this.gI(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gE() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gE() != null;
   }

   public int gK() {
      return this.bH;
   }

   public void c(int $$0) {
      this.bH = $$0;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.gH()) {
         this.gE().n();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.z(this.an() != bwr.bI || $$2 != bwq.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awm ae_();

   protected static class a extends cef {
      private final ctd b;
      private final float c;
      public final chy a = chy.b().a(8.0).d().e();

      public a(cnu $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         bxj $$0 = this.b.eq();
         return this.b.gE() == null && this.b.gz() && this.b.f() != null && !this.b.gk() && ($$0 == null || $$0.an() != bwr.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (ctd $$1 : a(this.b).a(ctd.class, this.a, this.b, this.b.cQ().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bxj $$0 = this.b.f();
         if ($$0 != null) {
            for (ctd $$2 : a(this.b).a(ctd.class, this.a, this.b, this.b.cQ().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxj $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bwi)$$0) > (double)this.c) {
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

   public class b<T extends ctd> extends cef {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private exo d;
      @Nullable
      private cnr e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = ctd.this.h(byp.m);

            for (cnr $$3 : this.b.dU().a(cnr.class, this.b.cQ().c($$1, 8.0, $$1), ctd.a)) {
               long $$4 = this.c.getOrDefault($$3.ao(), Long.MIN_VALUE);
               if (ctd.this.dU().ae() < $$4) {
                  $$0.put($$3.ao(), $$4);
               } else {
                  exo $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ao(), ctd.this.dU().ae() + 600L);
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
         if (!this.b.gH()) {
            return true;
         } else if (this.b.gE().a()) {
            return true;
         } else if (!this.b.t()) {
            return true;
         } else if (czn.a(this.b.a(bws.f), ctc.a(this.b.dW().f(mh.aF)))) {
            return true;
         } else {
            ctd $$0 = ctd.this.d.b(this.b.gI());
            return $$0 != null && $$0.bI();
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
            this.b.a(a(ctd.this.dU()), this.e);
         }
      }
   }

   public class c extends cef {
      private final ctd b;

      c(final ctd $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         ctc $$0 = this.b.gE();
         return this.b.bI() && this.b.f() == null && $$0 != null && $$0.f();
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
         if (!this.b.aZ() && this.b.ae.a(this.a(100)) == 0) {
            ctd.this.b(ctd.this.ae_());
         }

         if (!this.b.bX() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cef {
      private final ctd a;
      private final double b;
      private iv c;
      private final List<iv> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ctd $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gH() && !this.a.gE().a();
      }

      private boolean i() {
         arq $$0 = (arq)this.a.dU();
         iv $$1 = this.a.du();
         Optional<iv> $$2 = $$0.A().a($$0x -> $$0x.a(cip.n), this::a, cil.b.c, $$1, 48, this.a.ae);
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
            ffc $$0 = ffc.c(this.c);
            ffc $$1 = cic.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cic.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(iv $$0) {
         for (iv $$1 : this.d) {
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
