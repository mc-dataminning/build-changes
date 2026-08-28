import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crc extends cmp {
   protected static final aks<Boolean> c = akw.a(crc.class, aku.k);
   static final Predicate<cls> a = $$0 -> !$$0.v() && $$0.bL() && cxg.a($$0.l(), crb.a($$0.dY().e(mb.d)));
   @Nullable
   protected crb d;
   private int b;
   private boolean bZ;
   private int ca;

   protected crc(bvi<? extends crc> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(1, new crc.b<>(this));
      this.bT.a(3, new cdp<>(this));
      this.bT.a(4, new crc.d(this, 1.05F, 1));
      this.bT.a(5, new crc.c(this));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arx var1, int var2, boolean var3);

   public boolean gA() {
      return this.bZ;
   }

   public void A(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public void d_() {
      if (this.dW() instanceof arx && this.bL()) {
         crb $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dW().ad() % 20L == 0L) {
                  crb $$1 = ((arx)this.dW()).d(this.dw());
                  if ($$1 != null && crd.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvx $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == bvi.bS || $$2.aq() == bvi.aq)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gs() {
      this.bf += 2;
   }

   @Override
   public void a(btr $$0) {
      if (this.dW() instanceof arx) {
         bvb $$1 = $$0.d();
         crb $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.aq() == bvi.bS) {
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

   public void a(@Nullable crb $$0) {
      this.d = $$0;
   }

   @Nullable
   public crb gB() {
      return this.d;
   }

   public boolean gC() {
      cxg $$0 = this.a(bvj.f);
      boolean $$1 = !$$0.f() && cxg.a($$0, crb.a(this.dY().e(mb.d)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dW() instanceof arx $$0) ? false : this.gB() != null || $$0.d(this.dw()) != null;
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

   public void B(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bZ);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bZ = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dW() instanceof arx) {
            this.d = ((arx)this.dW()).B().a($$0.h("RaidId"));
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
   protected void a(arx $$0, cls $$1) {
      cxg $$2 = $$1.l();
      boolean $$3 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$3 && cxg.a($$2, crb.a(this.dY().e(mb.d)))) {
         bvj $$4 = bvj.f;
         cxg $$5 = this.a($$4);
         double $$6 = (double)this.h($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gB().a(this.gF(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gB() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gB() != null;
   }

   public int gH() {
      return this.ca;
   }

   public void c(int $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.gE()) {
         this.gB().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.A(this.aq() != bvi.bI || $$2 != bvh.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awu ak_();

   protected class a extends ccv {
      private final crc b;
      private final float c;
      public final cgo a = cgo.b().a(8.0).d().e();

      public a(final clv $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         bvx $$0 = this.b.eq();
         return this.b.gB() == null && this.b.gw() && this.b.O_() != null && !this.b.gd() && ($$0 == null || $$0.aq() != bvi.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.L().o();

         for (crc $$1 : a(this.b).a(crc.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvx $$0 = this.b.O_();
         if ($$0 != null) {
            for (crc $$2 : a(this.b).a(crc.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
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
         bvx $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((bvb)$$0) > (double)this.c) {
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

   public class b<T extends crc> extends ccv {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private eue d;
      @Nullable
      private cls e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = crc.this.h(bxf.m);

            for (cls $$3 : this.b.dW().a(cls.class, this.b.cR().c($$1, 8.0, $$1), crc.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (crc.this.dW().ad() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  eue $$5 = this.b.L().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), crc.this.dW().ad() + 600L);
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
         } else if (this.e.dR()) {
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
         } else if (!this.b.go()) {
            return true;
         } else if (cxg.a(this.b.a(bvj.f), crb.a(this.b.dY().e(mb.d)))) {
            return true;
         } else {
            crc $$0 = crc.this.d.b(this.b.gF());
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
            this.b.a(a(crc.this.dW()), this.e);
         }
      }
   }

   public class c extends ccv {
      private final crc b;

      c(final crc $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         crb $$0 = this.b.gB();
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
            crc.this.b(crc.this.ak_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.J().a();
         }

         super.a();
      }
   }

   static class d extends ccv {
      private final crc a;
      private final double b;
      private jh c;
      private final List<jh> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(crc $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.O_() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gB().a();
      }

      private boolean i() {
         arx $$0 = (arx)this.a.dW();
         jh $$1 = this.a.dw();
         Optional<jh> $$2 = $$0.A().a($$0x -> $$0x.a(chf.n), this::a, chb.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.L().m() ? false : this.a.O_() == null && !this.c.a(this.a.du(), (double)(this.a.dr() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.du(), (double)this.e)) {
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
            fbr $$0 = fbr.c(this.c);
            fbr $$1 = cgs.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgs.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
