import javax.annotation.Nullable;

public class cxd {
   @Nullable
   private final cly a;
   private final bpv b;
   private final eui c;
   private final daz d;
   private final ctq e;

   public cxd(cly $$0, bpv $$1, eui $$2) {
      this($$0.dP(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cxd(daz $$0, @Nullable cly $$1, bpv $$2, ctq $$3, eui $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final eui j() {
      return this.c;
   }

   public io a() {
      return this.c.a();
   }

   public it k() {
      return this.c.b();
   }

   public eum l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public ctq n() {
      return this.e;
   }

   @Nullable
   public cly o() {
      return this.a;
   }

   public bpv p() {
      return this.b;
   }

   public daz q() {
      return this.d;
   }

   public it g() {
      return this.a == null ? it.c : this.a.cH();
   }

   public boolean h() {
      return this.a != null && this.a.fR();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dF();
   }
}
