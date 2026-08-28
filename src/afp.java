import javax.annotation.Nullable;

public class afp implements zo<acf> {
   public static final ze<vy, afp> a = zo.a(afp::a, afp::new);
   private final int b;
   private final int c;

   public afp(bxe $$0, @Nullable bxe $$1) {
      this.b = $$0.ao();
      this.c = $$1 != null ? $$1.ao() : 0;
   }

   private afp(vy $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vy $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zq<afp> a() {
      return agy.aG;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
