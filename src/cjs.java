import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cjs extends cjr {
   @Nullable
   private ja b;
   private boolean c;
   private boolean d;

   protected cjs(bsn<? extends cjs> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(4, new cjs.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", um.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      um.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$2 != btg.p && $$2 != btg.h && $$2 != btg.d && $$0.E_().i() < 0.06F && this.go()) {
         this.c = true;
      }

      if (this.gr()) {
         this.a(bso.f, cnw.a(this.dT().b(lr.d)));
         this.a(bso.f, 2.0F);
      }

      if ($$2 == btg.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsn<? extends cjs> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a(dcp.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(ja $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ja gp() {
      return this.b;
   }

   public boolean gq() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gr() {
      return this.c;
   }

   public boolean gu() {
      return true;
   }

   public void gv() {
      this.b = this.dr().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gw() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cjs> extends caa {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dR().Z() < this.e;
         return this.b.gw() && this.b.p() == null && !this.b.cT() && this.b.gq() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gr();
         cco $$1 = this.b.J();
         if ($$1.l()) {
            List<cjs> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gp().a(this.b.dp(), 10.0)) {
               this.b.gv();
            } else {
               ewh $$3 = ewh.c(this.b.gp());
               ewh $$4 = this.b.dp();
               ewh $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ewh $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ja $$7 = ja.a($$6);
               $$7 = this.b.dR().a(dyg.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dR().Z() + 200L;
               } else if ($$0) {
                  for (cjs $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cjs> h() {
         return this.b.dR().a(cjs.class, this.b.cM().g(16.0), $$0 -> $$0.gu() && !$$0.t(this.b));
      }

      private boolean i() {
         ayo $$0 = this.b.dU();
         ja $$1 = this.b.dR().a(dyg.a.f, this.b.dr().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
