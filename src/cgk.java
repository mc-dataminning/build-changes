import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgk extends cck {
   protected static final agj<Boolean> c = agm.a(cgk.class, agl.k);
   static final Predicate<cbo> b = $$0 -> !$$0.z() && $$0.bx() && cmr.a($$0.q(), cgj.s());
   @Nullable
   protected cgj d;
   private int e;
   private boolean bT;
   private int bU;

   protected cgk(blt<? extends cgk> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new cgk.b<>(this));
      this.bO.a(3, new btv<>(this));
      this.bO.a(4, new cgk.d(this, 1.05F, 1));
      this.bO.a(5, new cgk.c(this));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gr() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void d_() {
      if (this.dM() instanceof amz && this.bx()) {
         cgj $$0 = this.gs();
         if (this.gr()) {
            if ($$0 == null) {
               if (this.dM().X() % 20L == 0L) {
                  cgj $$1 = ((amz)this.dM()).d(this.dm());
                  if ($$1 != null && cgl.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bmf $$2 = this.q();
               if ($$2 != null && ($$2.ai() == blt.bv || $$2.ai() == blt.ad)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gj() {
      this.bb += 2;
   }

   @Override
   public void a(bkn $$0) {
      if (this.dM() instanceof amz) {
         blp $$1 = $$0.d();
         cgj $$2 = this.gs();
         if ($$2 != null) {
            if (this.gi()) {
               $$2.c(this.gu());
            }

            if ($$1 != null && $$1.ai() == blt.bv) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gi() && $$2 == null && ((amz)this.dM()).d(this.dm()) == null) {
            cmr $$3 = this.c(blu.f);
            cfb $$4 = null;
            if ($$1 instanceof cfb) {
               $$4 = (cfb)$$1;
            } else if ($$1 instanceof byv $$6) {
               bmf $$7 = $$6.R_();
               if ($$6.u() && $$7 instanceof cfb) {
                  $$4 = (cfb)$$7;
               }
            }

            if (!$$3.b() && cmr.a($$3, cgj.s()) && $$4 != null) {
               blc $$8 = $$4.b(ble.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(ble.E);
               } else {
                  $$9--;
               }

               $$9 = aui.a($$9, 0, 4);
               blc $$10 = new blc(ble.E, 120000, $$9, false, false, true);
               if (!this.dM().Z().b(cte.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gl() {
      return !this.gt();
   }

   public void a(@Nullable cgj $$0) {
      this.d = $$0;
   }

   @Nullable
   public cgj gs() {
      return this.d;
   }

   public boolean gt() {
      return this.gs() != null && this.gs().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gu() {
      return this.e;
   }

   public boolean gv() {
      return this.an.b(c);
   }

   public void A(boolean $$0) {
      this.an.b(c, $$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dM() instanceof amz) {
            this.d = ((amz)this.dM()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gi()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cbo $$0) {
      cmr $$1 = $$0.q();
      boolean $$2 = this.gt() && this.gs().b(this.gu()) != null;
      if (this.gt() && !$$2 && cmr.a($$1, cgj.s())) {
         blu $$3 = blu.f;
         cmr $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.am();
         this.gs().a(this.gu(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gs() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gs() != null;
   }

   public int gw() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.gt()) {
         this.gs().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.z(this.ai() != blt.bl || $$2 != bmj.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract arl af_();

   protected class a extends btb {
      private final cgk c;
      private final float d;
      public final bwt a = bwt.b().a(8.0).d().e();

      public a(cbr $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(btb.a.a, btb.a.b));
      }

      @Override
      public boolean a() {
         bmf $$0 = this.c.eh();
         return this.c.gs() == null && this.c.gn() && this.c.q() != null && !this.c.fW() && ($$0 == null || $$0.ai() != blt.bv);
      }

      @Override
      public void c() {
         super.c();
         this.c.N().n();

         for (cgk $$1 : this.c.dM().a(cgk.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bmf $$0 = this.c.q();
         if ($$0 != null) {
            for (cgk $$2 : this.c.dM().a(cgk.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmf $$0 = this.c.q();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.I().a($$0, 30.0F, 30.0F);
               if (this.c.ag.a(50) == 0) {
                  this.c.R();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cgk> extends btb {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         cgj $$0 = this.b.gs();
         if (this.b.gt() && !this.b.gs().a() && this.b.gf() && !cmr.a(this.b.c(blu.f), cgj.s())) {
            cgk $$1 = $$0.b(this.b.gu());
            if ($$1 == null || !$$1.bx()) {
               List<cbo> $$2 = this.b.dM().a(cbo.class, this.b.cH().c(16.0, 8.0, 16.0), cgk.b);
               if (!$$2.isEmpty()) {
                  return this.b.N().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.N().h().a(this.b.dk(), 1.414)) {
            List<cbo> $$0 = this.b.dM().a(cbo.class, this.b.cH().c(4.0, 4.0, 4.0), cgk.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends btb {
      private final cgk b;

      c(cgk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         cgj $$0 = this.b.gs();
         return this.b.bx() && this.b.q() == null && $$0 != null && $$0.f();
      }

      @Override
      public void c() {
         this.b.A(true);
         super.c();
      }

      @Override
      public void d() {
         this.b.A(false);
         super.d();
      }

      @Override
      public void e() {
         if (!this.b.aU() && this.b.ag.a(this.a(100)) == 0) {
            cgk.this.a(cgk.this.af_(), cgk.this.eW(), cgk.this.eX());
         }

         if (!this.b.bO() && this.b.ag.a(this.a(50)) == 0) {
            this.b.M().a();
         }

         super.e();
      }
   }

   static class d extends btb {
      private final cgk a;
      private final double b;
      private hx c;
      private final List<hx> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cgk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gt() && !this.a.gs().a();
      }

      private boolean i() {
         amz $$0 = (amz)this.a.dM();
         hx $$1 = this.a.dm();
         Optional<hx> $$2 = $$0.y().a($$0x -> $$0x.a(bxk.n), this::a, bxg.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.N().l() ? false : this.a.q() == null && !this.c.a(this.a.dk(), (double)(this.a.dg() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dk(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            elm $$0 = elm.c(this.c);
            elm $$1 = bwx.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bwx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(hx $$0) {
         for (hx $$1 : this.d) {
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
