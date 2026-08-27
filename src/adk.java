import javax.annotation.Nullable;

public class adk implements xx<aag> {
   public static final xo<uq, adk> a = xx.a(adk::a, adk::new);
   private final int b;
   private final int c;

   public adk(bnq $$0, @Nullable bnq $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private adk(uq $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(uq $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public xz<adk> a() {
      return aeq.aC;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
