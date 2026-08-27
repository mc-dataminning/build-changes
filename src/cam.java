import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cam extends cal {
   @Nullable
   private ht b;
   private boolean c;
   private boolean d;

   protected cam(bjx<? extends cam> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(4, new cam.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", sg.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = sg.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gf() {
      return true;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$2 != bkn.p && $$2 != bkn.h && $$2 != bkn.d && $$0.E_().i() < 0.06F && this.gf()) {
         this.c = true;
      }

      if (this.gi()) {
         this.a(bjy.f, cee.s());
         this.a(bjy.f, 2.0F);
      }

      if ($$2 == bkn.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bjx<? extends cam> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a(cri.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(ht $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ht gg() {
      return this.b;
   }

   public boolean gh() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gi() {
      return this.c;
   }

   public boolean gl() {
      return true;
   }

   public void gm() {
      this.b = this.dl().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gn() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cam> extends bre {
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
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dL().V() < this.e;
         return this.b.gn() && this.b.q() == null && !this.b.cO() && this.b.gh() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gi();
         bts $$1 = this.b.L();
         if ($$1.l()) {
            List<cam> $$2 = this.h();
            if (this.b.gn() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gg().a(this.b.dj(), 10.0)) {
               this.b.gm();
            } else {
               eif $$3 = eif.c(this.b.gg());
               eif $$4 = this.b.dj();
               eif $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               eif $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ht $$7 = ht.a($$6);
               $$7 = this.b.dL().a(dlk.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dL().V() + 200L;
               } else if ($$0) {
                  for (cam $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cam> h() {
         return this.b.dL().a(cam.class, this.b.cG().g(16.0), $$0 -> $$0.gl() && !$$0.t(this.b));
      }

      private boolean i() {
         ate $$0 = this.b.ef();
         ht $$1 = this.b.dL().a(dlk.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
