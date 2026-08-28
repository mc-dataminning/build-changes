import java.util.EnumSet;

public abstract class cdn {
   private final EnumSet<cdn.a> a = EnumSet.noneOf(cdn.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean P_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean Q_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cdn.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cdn.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.Q_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azk.e($$0, 2);
   }

   protected static arn a(bvs $$0) {
      return (arn)$$0.dV();
   }

   protected static arn a(dhp $$0) {
      return (arn)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
