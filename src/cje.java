import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cje extends cjd {
   @Nullable
   private ir b;
   private boolean c;
   private boolean d;

   protected cje(bsb<? extends cje> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(4, new cje.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uz.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      uz.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gz() {
      return true;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$2 != bss.p && $$2 != bss.h && $$2 != bss.d && $$0.F_().i() < 0.06F && this.gz()) {
         this.c = true;
      }

      if (this.gC()) {
         this.a(bsc.f, cnm.a(this.dY().b(li.d)));
         this.a(bsc.f, 2.0F);
      }

      if ($$2 == bss.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsb<? extends cje> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a(dcj.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void e(ir $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ir gA() {
      return this.b;
   }

   public boolean gB() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gC() {
      return this.c;
   }

   public boolean gD() {
      return true;
   }

   public void gE() {
      this.b = this.du().b(-500 + this.al.a(1000), 0, -500 + this.al.a(1000));
      this.d = true;
   }

   protected boolean gH() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cje> extends bzl {
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
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dU().Z() < this.e;
         return this.b.gH() && this.b.p() == null && !this.b.cW() && this.b.gB() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gC();
         cbz $$1 = this.b.J();
         if ($$1.l()) {
            List<cje> $$2 = this.h();
            if (this.b.gH() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gA().a(this.b.ds(), 10.0)) {
               this.b.gE();
            } else {
               ewu $$3 = ewu.c(this.b.gA());
               ewu $$4 = this.b.ds();
               ewu $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ewu $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ir $$7 = ir.a($$6);
               $$7 = this.b.dU().a(dyu.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dU().Z() + 200L;
               } else if ($$0) {
                  for (cje $$8 : $$2) {
                     $$8.e($$7);
                  }
               }
            }
         }
      }

      private List<cje> h() {
         return this.b.dU().a(cje.class, this.b.cP().g(16.0), $$0 -> $$0.gD() && !$$0.t(this.b));
      }

      private boolean i() {
         ayt $$0 = this.b.et();
         ir $$1 = this.b.dU().a(dyu.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
