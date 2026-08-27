import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import javax.annotation.Nullable;

public class dan extends czn implements bdo, efn {
   private static final int c = 20;
   private final hn<cfz> d = hn.a(this.b(), cfz.b);
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dan(gu $$0, dcb $$1) {
      super(czp.e, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d.set(0, cfz.a($$0.p("RecordItem")));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (!this.ar_().b()) {
         $$0.a("RecordItem", this.ar_().b(new qr()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.ar_().b() && this.h;
   }

   private void a(@Nullable bfj $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(ctn.a, Boolean.valueOf($$1)), 2);
         this.o.a(dgl.c, this.p(), dgl.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cfu.a(this.ar_().d()));
      this.e();
   }

   private void v() {
      this.h = false;
      this.o.a(dgl.G, this.p(), dgl.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cmm $$0, gu $$1, dcb $$2) {
      this.e++;
      if (this.f() && this.ar_().d() instanceof cgr $$3) {
         if (this.a($$3)) {
            this.v();
         } else if (this.w()) {
            this.e = 0;
            $$0.a(dgl.F, $$1, dgl.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cgr $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean w() {
      return this.e >= 20;
   }

   @Override
   public cfz a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cfz a(int $$0, int $$1) {
      cfz $$2 = Objects.requireNonNullElse(this.d.get($$0), cfz.b);
      this.d.set($$0, cfz.b);
      if (!$$2.b()) {
         this.a(null, false);
         this.v();
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cfz $$1) {
      if ($$1.a(ane.aq) && this.o != null) {
         this.d.set($$0, $$1);
         this.a(null, true);
         this.g();
      }
   }

   @Override
   public int ac_() {
      return 1;
   }

   @Override
   public boolean a(byo $$0) {
      return bdq.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cfz $$1) {
      return $$1.a(ane.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bdq $$0, int $$1, cfz $$2) {
      return $$0.a_(cfz::b);
   }

   private void a(cmm $$0, gu $$1) {
      if ($$0 instanceof aif $$2) {
         eei $$3 = eei.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.y_().a(4) / 24.0F;
         $$2.a(iv.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         gu $$0 = this.p();
         cfz $$1 = this.ar_();
         if (!$$1.b()) {
            this.j();
            eei $$2 = eei.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cfz $$3 = $$1.p();
            bvh $$4 = new bvh(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.o();
            this.o.b($$4);
         }
      }
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dan $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cfz $$0) {
      this.d.set(0, $$0);
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
