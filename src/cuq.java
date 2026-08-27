import javax.annotation.Nullable;

public class cuq {
   @Nullable
   private final cjt a;
   private final bnz b;
   private final erw c;
   private final cyx d;
   private final crj e;

   public cuq(cjt $$0, bnz $$1, erw $$2) {
      this($$0.dM(), $$0, $$1, $$0.b($$1), $$2);
   }

   protected cuq(cyx $$0, @Nullable cjt $$1, bnz $$2, crj $$3, erw $$4) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$4;
      this.e = $$3;
      this.d = $$0;
   }

   protected final erw j() {
      return this.c;
   }

   public ib a() {
      return this.c.a();
   }

   public ih k() {
      return this.c.b();
   }

   public esa l() {
      return this.c.e();
   }

   public boolean m() {
      return this.c.d();
   }

   public crj n() {
      return this.e;
   }

   @Nullable
   public cjt o() {
      return this.a;
   }

   public bnz p() {
      return this.b;
   }

   public cyx q() {
      return this.d;
   }

   public ih g() {
      return this.a == null ? ih.c : this.a.cE();
   }

   public boolean h() {
      return this.a != null && this.a.fO();
   }

   public float i() {
      return this.a == null ? 0.0F : this.a.dC();
   }
}
