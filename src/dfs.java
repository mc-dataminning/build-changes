import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dfs extends der implements bih, eko {
   private static final int c = 20;
   private clb d = clb.b;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dfs(ht $$0, dgw $$1) {
      super(det.e, $$0, $$1);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d = clb.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.v().b()) {
         $$0.a("RecordItem", this.v().b(new rz()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.v().b() && this.h;
   }

   private void a(@Nullable bki $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cyv.b, Boolean.valueOf($$1)), 2);
         this.o.a(dlg.c, this.p(), dlg.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), ckw.a(this.v().d()));
      this.e();
   }

   private void j() {
      this.h = false;
      this.o.a(dlg.F, this.p(), dlg.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(crs $$0, ht $$1, dgw $$2) {
      this.e++;
      if (this.f() && this.v().d() instanceof clt $$3) {
         if (this.a($$3)) {
            this.j();
         } else if (this.x()) {
            this.e = 0;
            $$0.a(dlg.E, $$1, dlg.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(clt $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean x() {
      return this.e >= 20;
   }

   @Override
   public clb v() {
      return this.d;
   }

   @Override
   public clb c(int $$0) {
      clb $$1 = this.d;
      this.d = clb.b;
      if (!$$1.b()) {
         this.a(null, false);
         this.j();
      }

      return $$1;
   }

   @Override
   public void b(clb $$0) {
      if ($$0.a(ark.aq) && this.o != null) {
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
   public der w() {
      return this;
   }

   @Override
   public boolean b(int $$0, clb $$1) {
      return $$1.a(ark.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bij $$0, int $$1, clb $$2) {
      return $$0.a_(clb::b);
   }

   private void a(crs $$0, ht $$1) {
      if ($$0 instanceof ama $$2) {
         eji $$3 = eji.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(js.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         ht $$0 = this.p();
         clb $$1 = this.v();
         if (!$$1.b()) {
            this.aA_();
            eji $$2 = eji.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            clb $$3 = $$1.p();
            caf $$4 = new caf(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.t();
            this.o.b($$4);
         }
      }
   }

   public static void a(crs $$0, ht $$1, dgw $$2, dfs $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(clb $$0) {
      this.d = $$0;
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
