import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import javax.annotation.Nullable;

public class ddq extends dcq implements bgk, eio {
   private static final int c = 20;
   private final hp<cja> d = hp.a(this.b(), cja.b);
   private int e;
   private long f;
   private long g;
   private boolean h;

   public ddq(gw $$0, dfe $$1) {
      super(dcs.e, $$0, $$1);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("RecordItem", 10)) {
         this.d.set(0, cja.a($$0.p("RecordItem")));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      if (!this.aq_().b()) {
         $$0.a("RecordItem", this.aq_().b(new qu()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean f() {
      return !this.aq_().b() && this.h;
   }

   private void a(@Nullable bil $$0, boolean $$1) {
      if (this.o.a_(this.p()) == this.q()) {
         this.o.a(this.p(), this.q().a(cwq.a, Boolean.valueOf($$1)), 2);
         this.o.a(djo.c, this.p(), djo.a.a($$0, this.q()));
      }
   }

   @VisibleForTesting
   public void g() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.p(), this.q().b());
      this.o.a(null, 1010, this.p(), civ.a(this.aq_().d()));
      this.e();
   }

   private void v() {
      this.h = false;
      this.o.a(djo.F, this.p(), djo.a.a(this.q()));
      this.o.a(this.p(), this.q().b());
      this.o.c(1011, this.p(), 0);
      this.e();
   }

   private void b(cpq $$0, gw $$1, dfe $$2) {
      this.e++;
      if (this.f() && this.aq_().d() instanceof cjs $$3) {
         if (this.a($$3)) {
            this.v();
         } else if (this.w()) {
            this.e = 0;
            $$0.a(djo.E, $$1, djo.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cjs $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean w() {
      return this.e >= 20;
   }

   @Override
   public cja a(int $$0) {
      return this.d.get($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      cja $$2 = Objects.requireNonNullElse(this.d.get($$0), cja.b);
      this.d.set($$0, cja.b);
      if (!$$2.b()) {
         this.a(null, false);
         this.v();
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cja $$1) {
      if ($$1.a(apw.aq) && this.o != null) {
         this.d.set($$0, $$1);
         this.a(null, true);
         this.g();
      } else if ($$1.b()) {
         this.a($$0, 1);
      }
   }

   @Override
   public int ab_() {
      return 1;
   }

   @Override
   public boolean a(cbp $$0) {
      return bgm.a(this, $$0);
   }

   @Override
   public boolean b(int $$0, cja $$1) {
      return $$1.a(apw.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bgm $$0, int $$1, cja $$2) {
      return $$0.a_(cja::b);
   }

   private void a(cpq $$0, gw $$1) {
      if ($$0 instanceof akn $$2) {
         ehi $$3 = ehi.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.y_().a(4) / 24.0F;
         $$2.a(ix.V, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void i() {
      if (this.o != null && !this.o.B) {
         gw $$0 = this.p();
         cja $$1 = this.aq_();
         if (!$$1.b()) {
            this.j();
            ehi $$2 = ehi.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cja $$3 = $$1.p();
            byi $$4 = new byi(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.o();
            this.o.b($$4);
         }
      }
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddq $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void a(cja $$0) {
      this.d.set(0, $$0);
      this.o.a(this.p(), this.q().b());
      this.e();
   }
}
