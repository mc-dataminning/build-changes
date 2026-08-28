import java.util.EnumSet;

public abstract class ces {
   private final EnumSet<ces.a> a = EnumSet.noneOf(ces.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean U_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean V_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<ces.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<ces.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.V_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azq.e($$0, 2);
   }

   protected static aru a(bwv $$0) {
      return (aru)$$0.dV();
   }

   protected static aru a(djz $$0) {
      return (aru)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
