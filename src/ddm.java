import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import javax.annotation.Nullable;

public class ddm extends dcm implements bgh, eik {
   private static final int c = 20;
   private final hn<ciy> d = hn.a(this.b(), ciy.b);
   private int e;
   private long f;
   private long g;
   private boolean h;

   public ddm(gu $$0, dfa $$1) {
      super(dco.e, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d.set(0, ciy.a($$0.p("RecordItem")));
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

   private void a(@Nullable bii $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cwm.a, Boolean.valueOf($$1)), 2);
         this.o.a(djk.c, this.p(), djk.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), cit.a(this.ar_().d()));
      this.e();
   }

   private void v() {
      this.h = false;
      this.o.a(djk.F, this.p(), djk.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cpm $$0, gu $$1, dfa $$2) {
      this.e++;
      if (this.f() && this.ar_().d() instanceof cjq $$3) {
         if (this.a($$3)) {
            this.v();
         } else if (this.w()) {
            this.e = 0;
            $$0.a(djk.E, $$1, djk.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cjq $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean w() {
      return this.e >= 20;
   }

   @Override
   public ciy a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public ciy a(int $$0, int $$1) {
      ciy $$2 = Objects.requireNonNullElse(this.d.get($$0), ciy.b);
      this.d.set($$0, ciy.b);
      if (!$$2.b()) {
         this.a(null, false);
         this.v();
      }

      return $$2;
   }

   @Override
   public void a(int $$0, ciy $$1) {
      if ($$1.a(apt.aq) && this.o != null) {
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
   public boolean a(cbn $$0) {
      return bgj.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, ciy $$1) {
      return $$1.a(apt.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bgj $$0, int $$1, ciy $$2) {
      return $$0.a_(ciy::b);
   }

   private void a(cpm $$0, gu $$1) {
      if ($$0 instanceof akk $$2) {
         ehe $$3 = ehe.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.y_().a(4) / 24.0F;
         $$2.a(iv.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         gu $$0 = this.p();
         ciy $$1 = this.ar_();
         if (!$$1.b()) {
            this.j();
            ehe $$2 = ehe.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            ciy $$3 = $$1.p();
            byg $$4 = new byg(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.o();
            this.o.b($$4);
         }
      }
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, ddm $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(ciy $$0) {
      this.d.set(0, $$0);
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
