import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import javax.annotation.Nullable;

public class ddx extends dcx implements bgr, eiv {
   private static final int c = 20;
   private final hp<cjh> d = hp.a(this.b(), cjh.b);
   private int e;
   private long f;
   private long g;
   private boolean h;

   public ddx(gw $$0, dfl $$1) {
      super(dcz.e, $$0, $$1);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d.set(0, cjh.a($$0.p("RecordItem")));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      if (!this.av_().b()) {
         $$0.a("RecordItem", this.av_().b(new qy()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.av_().b() && this.h;
   }

   private void a(@Nullable bis $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cwx.a, Boolean.valueOf($$1)), 2);
         this.o.a(djv.c, this.p(), djv.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cjc.a(this.av_().d()));
      this.e();
   }

   private void v() {
      this.h = false;
      this.o.a(djv.F, this.p(), djv.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cpx $$0, gw $$1, dfl $$2) {
      this.e++;
      if (this.f() && this.av_().d() instanceof cjz $$3) {
         if (this.a($$3)) {
            this.v();
         } else if (this.w()) {
            this.e = 0;
            $$0.a(djv.E, $$1, djv.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cjz $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean w() {
      return this.e >= 20;
   }

   @Override
   public cjh a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cjh a(int $$0, int $$1) {
      cjh $$2 = Objects.requireNonNullElse(this.d.get($$0), cjh.b);
      this.d.set($$0, cjh.b);
      if (!$$2.b()) {
         this.a(null, false);
         this.v();
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cjh $$1) {
      if ($$1.a(aqc.aq) && this.o != null) {
         this.d.set($$0, $$1);
         this.a(null, true);
         this.g();
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public int ag_() {
      return 1;
   }

   @Override
   public boolean a(cbw $$0) {
      return bgt.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cjh $$1) {
      return $$1.a(aqc.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bgt $$0, int $$1, cjh $$2) {
      return $$0.a_(cjh::b);
   }

   private void a(cpx $$0, gw $$1) {
      if ($$0 instanceof aks $$2) {
         ehp $$3 = ehp.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.D_().a(4) / 24.0F;
         $$2.a(ix.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         gw $$0 = this.p();
         cjh $$1 = this.av_();
         if (!$$1.b()) {
            this.j();
            ehp $$2 = ehp.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cjh $$3 = $$1.p();
            byp $$4 = new byp(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.t();
            this.o.b($$4);
         }
      }
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, ddx $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cjh $$0) {
      this.d.set(0, $$0);
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
