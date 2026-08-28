import javax.annotation.Nullable;

public class def {
   @Nullable
   private final csi a;
   private final bvb b;
   private final ffy c;
   private final dkj d;
   private final dak e;

   public def(csi $$0, bvb $$1, ffy $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected def(dkj $$0, @Nullable csi $$1, bvb $$2, dak $$3, ffy $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final ffy j() {
      return this.c;
   }

   public iw a() {
      return this.c.b();
   }

   public jc k() {
      return this.c.c();
   }

   public fgc l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public dak n() {
      return this.e;
   }

   @Nullable
   public csi o() {
      return this.a;
   }

   public bvb p() {
      return this.b;
   }

   public dkj q() {
      return this.d;
   }

   public jc g() {
      return this.a == null ? jc.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
