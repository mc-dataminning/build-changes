import javax.annotation.Nullable;

public class dbd {
   @Nullable
   private final cps a;
   private final btd b;
   private final fbo c;
   private final dha d;
   private final cxk e;

   public dbd(cps $$0, btd $$1, fbo $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dbd(dha $$0, @Nullable cps $$1, btd $$2, cxk $$3, fbo $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fbo j() {
      return this.c;
   }

   public jh a() {
      return this.c.b();
   }

   public jm k() {
      return this.c.c();
   }

   public fbs l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cxk n() {
      return this.e;
   }

   @Nullable
   public cps o() {
      return this.a;
   }

   public btd p() {
      return this.b;
   }

   public dha q() {
      return this.d;
   }

   public jm g() {
      return this.a == null ? jm.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fW();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
