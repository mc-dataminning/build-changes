import javax.annotation.Nullable;

public class dcy {
   @Nullable
   private final crc a;
   private final buc b;
   private final fem c;
   private final dja d;
   private final czd e;

   public dcy(crc $$0, buc $$1, fem $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dcy(dja $$0, @Nullable crc $$1, buc $$2, czd $$3, fem $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fem j() {
      return this.c;
   }

   public iu a() {
      return this.c.b();
   }

   public ja k() {
      return this.c.c();
   }

   public feq l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public czd n() {
      return this.e;
   }

   @Nullable
   public crc o() {
      return this.a;
   }

   public buc p() {
      return this.b;
   }

   public dja q() {
      return this.d;
   }

   public ja g() {
      return this.a == null ? ja.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fY();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
