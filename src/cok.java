import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cok extends ckf {
   protected static final akk<Boolean> c = ako.a(cok.class, akm.k);
   static final Predicate<cji> b = $$0 -> !$$0.y() && $$0.bD() && cuq.a($$0.p(), coj.a($$0.dR().b(lq.d)));
   @Nullable
   protected coj d;
   private int e;
   private boolean bY;
   private int bZ;

   protected cok(btb<? extends cok> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cok.b<>(this));
      this.bS.a(3, new cbi<>(this));
      this.bS.a(4, new cok.d(this, 1.05F, 1));
      this.bS.a(5, new cok.c(this));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gD() {
      return this.bY;
   }

   public void z(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dP() instanceof arf && this.bD()) {
         coj $$0 = this.gE();
         if (this.gD()) {
            if ($$0 == null) {
               if (this.dP().Z() % 20L == 0L) {
                  coj $$1 = ((arf)this.dP()).d(this.dp());
                  if ($$1 != null && col.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               btq $$2 = this.p();
               if ($$2 != null && ($$2.ak() == btb.by || $$2.ak() == btb.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gv() {
      this.bf += 2;
   }

   @Override
   public void a(bro $$0) {
      if (this.dP() instanceof arf) {
         bsv $$1 = $$0.d();
         coj $$2 = this.gE();
         if ($$2 != null) {
            if (this.gu()) {
               $$2.c(this.gI());
            }

            if ($$1 != null && $$1.ak() == btb.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (!this.dP().J().b(cpo.c) && this.gu() && $$2 == null && ((arf)this.dP()).d(this.dp()) == null) {
            cuq $$3 = this.a(btc.f);
            cmy $$4 = null;
            if ($$1 instanceof cmy) {
               $$4 = (cmy)$$1;
            } else if ($$1 instanceof cgj $$6) {
               btq $$7 = $$6.P_();
               if ($$6.s() && $$7 instanceof cmy) {
                  $$4 = (cmy)$$7;
               }
            }

            if (!$$3.e() && cuq.a($$3, coj.a(this.dR().b(lq.d))) && $$4 != null) {
               bsd $$8 = $$4.c(bsf.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(bsf.E);
               } else {
                  $$9--;
               }

               $$9 = ayz.a($$9, 0, 4);
               bsd $$10 = new bsd(bsf.E, 120000, $$9, false, false, true);
               if (!this.dP().ab().b(dbv.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gx() {
      return !this.gH();
   }

   public void a(@Nullable coj $$0) {
      this.d = $$0;
   }

   @Nullable
   public coj gE() {
      return this.d;
   }

   public boolean gF() {
      cuq $$0 = this.a(btc.f);
      boolean $$1 = !$$0.e() && cuq.a($$0, coj.a(this.dR().b(lq.d)));
      boolean $$2 = this.gu();
      return $$1 && $$2;
   }

   public boolean gG() {
      return !(this.dP() instanceof arf $$0) ? false : this.gE() != null || $$0.d(this.dp()) != null;
   }

   public boolean gH() {
      return this.gE() != null && this.gE().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gI() {
      return this.e;
   }

   public boolean gJ() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dP() instanceof arf) {
            this.d = ((arf)this.dP()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gu()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cji $$0) {
      cuq $$1 = $$0.p();
      boolean $$2 = this.gH() && this.gE().b(this.gI()) != null;
      if (this.gH() && !$$2 && cuq.a($$1, coj.a(this.dR().b(lq.d)))) {
         btc $$3 = btc.f;
         cuq $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.I());
         $$0.ao();
         this.gE().a(this.gI(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gE() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gE() != null;
   }

   public int gK() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (this.gH()) {
         this.gE().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      this.z(this.ak() != btb.bo || $$2 != btu.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz ae_();

   protected class a extends cao {
      private final cok b;
      private final float c;
      public final ceh a = ceh.b().a(8.0).d().e();

      public a(final cjl $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cao.a.a, cao.a.b));
      }

      @Override
      public boolean a() {
         btq $$0 = this.b.em();
         return this.b.gE() == null && this.b.gz() && this.b.p() != null && !this.b.gi() && ($$0 == null || $$0.ak() != btb.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.K().n();

         for (cok $$1 : this.b.dP().a(cok.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         btq $$0 = this.b.p();
         if ($$0 != null) {
            for (cok $$2 : this.b.dP().a(cok.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
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
      public void e() {
         btq $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsv)$$0) > (double)this.c) {
               this.b.G().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.Q();
               }
            } else {
               this.b.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cok> extends cao {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         coj $$0 = this.a.gE();
         if (this.a.gH() && !this.a.gE().a() && this.a.gr() && !cuq.a(this.a.a(btc.f), coj.a(this.a.dR().b(lq.d)))) {
            cok $$1 = $$0.b(this.a.gI());
            if ($$1 == null || !$$1.bD()) {
               List<cji> $$2 = this.a.dP().a(cji.class, this.a.cK().c(16.0, 8.0, 16.0), cok.b);
               if (!$$2.isEmpty()) {
                  return this.a.K().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.a.K().h().a(this.a.dn(), 1.414)) {
            List<cji> $$0 = this.a.dP().a(cji.class, this.a.cK().c(4.0, 4.0, 4.0), cok.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends cao {
      private final cok b;

      c(final cok $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         coj $$0 = this.b.gE();
         return this.b.bD() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aW() && this.b.ah.a(this.a(100)) == 0) {
            cok.this.b(cok.this.ae_());
         }

         if (!this.b.bR() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends cao {
      private final cok a;
      private final double b;
      private iz c;
      private final List<iz> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cok $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gH() && !this.a.gE().a();
      }

      private boolean i() {
         arf $$0 = (arf)this.a.dP();
         iz $$1 = this.a.dp();
         Optional<iz> $$2 = $$0.y().a($$0x -> $$0x.a(cey.n), this::a, ceu.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.dn(), (double)(this.a.dj() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dn(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.p(0);
         this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            evs $$0 = evs.c(this.c);
            evs $$1 = cel.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cel.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(iz $$0) {
         for (iz $$1 : this.d) {
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
