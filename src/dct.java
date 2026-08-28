import javax.annotation.Nullable;

public class dct {
   @Nullable
   private final cqy a;
   private final bua b;
   private final fee c;
   private final div d;
   private final cyy e;

   public dct(cqy $$0, bua $$1, fee $$2) {
      this($$0.dV(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected dct(div $$0, @Nullable cqy $$1, bua $$2, cyy $$3, fee $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final fee j() {
      return this.c;
   }

   public iu a() {
      return this.c.b();
   }

   public ja k() {
      return this.c.c();
   }

   public fei l() {
      return this.c.g();
   }

   public boolean m() {
      return this.c.e();
   }

   public cyy n() {
      return this.e;
   }

   @Nullable
   public cqy o() {
      return this.a;
   }

   public bua p() {
      return this.b;
   }

   public div q() {
      return this.d;
   }

   public ja g() {
      return this.a == null ? ja.c : this.a.cO();
   }

   public boolean h() {
      return this.a != null && this.a.fX();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dL();
   }
}
