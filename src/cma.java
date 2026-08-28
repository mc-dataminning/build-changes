import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cma extends clp {
   private static final int cc = 5;
   @Nullable
   private ja cd;
   private int ce;

   public cma(bsj<? extends cma> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(0, new cbh<>(this, cwb.a(cud.sk, cwc.g), avf.Bx, $$0 -> this.dP().S() && !$$0.ch()));
      this.bU.a(0, new cbh<>(this, new cua(cud.qE), avf.BC, $$0 -> this.dP().R() && $$0.ch()));
      this.bU.a(1, new cbf(this));
      this.bU.a(1, new bzd<>(this, ckg.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, cjg.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, ckc.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, ckb.class, 8.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, cjq.class, 15.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, cjl.class, 12.0F, 0.5, 0.5));
      this.bU.a(1, new bzd<>(this, ckf.class, 10.0F, 0.5, 0.5));
      this.bU.a(1, new cap(this, 0.5));
      this.bU.a(1, new caf(this));
      this.bU.a(2, new cma.a(this, 2.0, 0.35));
      this.bU.a(4, new cak(this, 0.35));
      this.bU.a(8, new cbj(this, 0.35));
      this.bU.a(9, new bzz(this, cmh.class, 3.0F, 1.0F));
      this.bU.a(10, new cae(this, bta.class, 8.0F));
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (!$$2.a(cud.tJ) && this.bD() && !this.go() && !this.p_()) {
         if ($$1 == bqc.a) {
            $$0.a(avp.S);
         }

         if (this.gp().isEmpty()) {
            return bqd.a(this.dP().B);
         } else {
            if (!this.dP().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bqd.a(this.dP().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dP().J().b(cox.c)) {
         this.gx();
      } else {
         cly.g[] $$0 = (cly.g[])cly.b.get(1);
         cly.g[] $$1 = (cly.g[])cly.b.get(2);
         if ($$0 != null && $$1 != null) {
            dbc $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ah.a($$1.length);
            cly.g $$4 = $$1[$$3];
            dbb $$5 = $$4.a(this, this.ah);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      dbc $$0 = this.gp();

      for (Pair<cly.g[], Integer> $$1 : cly.d) {
         cly.g[] $$2 = (cly.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.ce);
      if (this.cd != null) {
         $$0.a("wander_target", um.a(this.cd));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.ce = $$0.h("DespawnDelay");
      }

      um.a($$0, "wander_target").ifPresent($$0x -> this.cd = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dbb $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ah.a(4);
         this.dP().b(new bso(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   @Override
   protected ave v() {
      return this.go() ? avf.BD : avf.Bv;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.BA;
   }

   @Override
   protected ave o_() {
      return avf.Bw;
   }

   @Override
   protected ave c(cua $$0) {
      return $$0.a(cud.qE) ? avf.By : avf.Bz;
   }

   @Override
   protected ave w(boolean $$0) {
      return $$0 ? avf.BE : avf.BB;
   }

   @Override
   public ave gr() {
      return avf.BE;
   }

   public void u(int $$0) {
      this.ce = $$0;
   }

   public int gw() {
      return this.ce;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         this.gy();
      }
   }

   private void gy() {
      if (this.ce > 0 && !this.go() && --this.ce == 0) {
         this.ao();
      }
   }

   public void h(@Nullable ja $$0) {
      this.cd = $$0;
   }

   @Nullable
   ja gA() {
      return this.cd;
   }

   class a extends bzw {
      final cma a;
      final double b;
      final double c;

      a(final cma $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public void d() {
         this.a.h(null);
         cma.this.bT.n();
      }

      @Override
      public boolean a() {
         ja $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ja $$0 = this.a.gA();
         if ($$0 != null && cma.this.bT.l()) {
            if (this.a($$0, 10.0)) {
               evz $$1 = new evz((double)$$0.u() - this.a.du(), (double)$$0.v() - this.a.dw(), (double)$$0.w() - this.a.dA()).d();
               evz $$2 = $$1.a(10.0).b(this.a.du(), this.a.dw(), this.a.dA());
               cma.this.bT.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cma.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ja $$0, double $$1) {
         return !$$0.a(this.a.dn(), $$1);
      }
   }
}
