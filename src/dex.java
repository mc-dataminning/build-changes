import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dex extends ddx implements bhs, ejl {
   private static final int c = 20;
   private ckj d = ckj.b;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dex(ht $$0, dgb $$1) {
      super(ddz.e, $$0, $$1);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = ckj.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.v().b()) {
         $$0.a("RecordItem", this.v().b(new rt()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.v().b() && this.h;
   }

   private void a(@Nullable bjt $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cyb.b, Boolean.valueOf($$1)), 2);
         this.o.a(dkl.c, this.p(), dkl.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cke.a(this.v().d()));
      this.e();
   }

   private void j() {
      this.h = false;
      this.o.a(dkl.F, this.p(), dkl.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cqz $$0, ht $$1, dgb $$2) {
      this.e++;
      if (this.f() && this.v().d() instanceof clb $$3) {
         if (this.a($$3)) {
            this.j();
         } else if (this.x()) {
            this.e = 0;
            $$0.a(dkl.E, $$1, dkl.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(clb $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean x() {
      return this.e >= 20;
   }

   @Override
   public ckj v() {
      return this.d;
   }

   @Override
   public ckj c(int $$0) {
      ckj $$1 = this.d;
      this.d = ckj.b;
      if (!$$1.b()) {
         this.a(null, false);
         this.j();
      }

      return $$1;
   }

   @Override
   public void b(ckj $$0) {
      if ($$0.a(ara.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.g();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public ddx w() {
      return this;
   }

   @Override
   public boolean b(int $$0, ckj $$1) {
      return $$1.a(ara.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bhu $$0, int $$1, ckj $$2) {
      return $$0.a_(ckj::b);
   }

   private void a(cqz $$0, ht $$1) {
      if ($$0 instanceof alq $$2) {
         eif $$3 = eif.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(js.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         ht $$0 = this.p();
         ckj $$1 = this.v();
         if (!$$1.b()) {
            this.ax_();
            eif $$2 = eif.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            ckj $$3 = $$1.p();
            bzq $$4 = new bzq(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.t();
            this.o.b($$4);
         }
      }
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dex $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(ckj $$0) {
      this.d = $$0;
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
