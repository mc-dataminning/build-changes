import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import javax.annotation.Nullable;

public class ddk extends dck implements bgf, eil {
   private static final int c = 20;
   private final ho<ciw> d = ho.a(this.b(), ciw.b);
   private int e;
   private long f;
   private long g;
   private boolean h;

   public ddk(gv $$0, dey $$1) {
      super(dcm.e, $$0, $$1);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d.set(0, ciw.a($$0.p("RecordItem")));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      if (!this.ar_().b()) {
         $$0.a("RecordItem", this.ar_().b(new qs()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.ar_().b() && this.h;
   }

   private void a(@Nullable big $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cwk.a, Boolean.valueOf($$1)), 2);
         this.o.a(dji.c, this.p(), dji.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cir.a(this.ar_().d()));
      this.e();
   }

   private void v() {
      this.h = false;
      this.o.a(dji.F, this.p(), dji.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cpk $$0, gv $$1, dey $$2) {
      this.e++;
      if (this.f() && this.ar_().d() instanceof cjo $$3) {
         if (this.a($$3)) {
            this.v();
         } else if (this.w()) {
            this.e = 0;
            $$0.a(dji.E, $$1, dji.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cjo $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean w() {
      return this.e >= 20;
   }

   @Override
   public ciw a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public ciw a(int $$0, int $$1) {
      ciw $$2 = Objects.requireNonNullElse(this.d.get($$0), ciw.b);
      this.d.set($$0, ciw.b);
      if (!$$2.b()) {
         this.a(null, false);
         this.v();
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ciw $$1) {
      if ($$1.a(apr.aq) && this.o != null) {
         this.d.set($$0, $$1);
         this.a(null, true);
         this.g();
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public int ac_() {
      return 1;
   }

   @Override
   public boolean a(cbl $$0) {
      return bgh.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciw $$1) {
      return $$1.a(apr.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bgh $$0, int $$1, ciw $$2) {
      return $$0.a_(ciw::b);
   }

   private void a(cpk $$0, gv $$1) {
      if ($$0 instanceof aki $$2) {
         ehf $$3 = ehf.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.y_().a(4) / 24.0F;
         $$2.a(iw.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         gv $$0 = this.p();
         ciw $$1 = this.ar_();
         if (!$$1.b()) {
            this.j();
            ehf $$2 = ehf.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            ciw $$3 = $$1.p();
            bye $$4 = new bye(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.o();
            this.o.b($$4);
         }
      }
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddk $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(ciw $$0) {
      this.d.set(0, $$0);
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
