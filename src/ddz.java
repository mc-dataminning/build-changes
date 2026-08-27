import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class ddz extends dcz implements bgv, ein {
   private static final int c = 20;
   private cjl d = cjl.b;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public ddz(gw $$0, dfd $$1) {
      super(ddb.e, $$0, $$1);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = cjl.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (!this.i().b()) {
         $$0.a("RecordItem", this.i().b(new qw()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.i().b() && this.h;
   }

   private void a(@Nullable biw $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cxd.b, Boolean.valueOf($$1)), 2);
         this.o.a(djn.c, this.p(), djn.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cjg.a(this.i().d()));
      this.e();
   }

   private void w() {
      this.h = false;
      this.o.a(djn.F, this.p(), djn.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cqb $$0, gw $$1, dfd $$2) {
      this.e++;
      if (this.f() && this.i().d() instanceof ckd $$3) {
         if (this.a($$3)) {
            this.w();
         } else if (this.x()) {
            this.e = 0;
            $$0.a(djn.E, $$1, djn.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(ckd $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean x() {
      return this.e >= 20;
   }

   @Override
   public cjl i() {
      return this.d;
   }

   @Override
   public cjl c(int $$0) {
      cjl $$1 = this.d;
      this.d = cjl.b;
      if (!$$1.b()) {
         this.a(null, false);
         this.w();
      }

      return $$1;
   }

   @Override
   public void a(cjl $$0) {
      if ($$0.a(aqd.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.g();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int ag_() {
      return 1;
   }

   @Override
   public dcz j() {
      return this;
   }

   @Override
   public boolean b(int $$0, cjl $$1) {
      return $$1.a(aqd.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bgx $$0, int $$1, cjl $$2) {
      return $$0.a_(cjl::b);
   }

   private void a(cqb $$0, gw $$1) {
      if ($$0 instanceof akt $$2) {
         ehh $$3 = ehh.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.D_().a(4) / 24.0F;
         $$2.a(iv.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void v() {
      if (this.o != null && !this.o.B) {
         gw $$0 = this.p();
         cjl $$1 = this.i();
         if (!$$1.b()) {
            this.av_();
            ehh $$2 = ehh.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cjl $$3 = $$1.p();
            byt $$4 = new byt(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.t();
            this.o.b($$4);
         }
      }
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ddz $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(cjl $$0) {
      this.d = $$0;
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
