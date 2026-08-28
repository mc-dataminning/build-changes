import java.util.EnumSet;

public abstract class cea {
   private final EnumSet<cea.a> a = EnumSet.noneOf(cea.a.class);

   public abstract boolean b();

   public boolean c() {
      return this.b();
   }

   public boolean Q_() {
      return true;
   }

   public void d() {
   }

   public void e() {
   }

   public boolean R_() {
      return false;
   }

   public void a() {
   }

   public void a(EnumSet<cea.a> $$0) {
      this.a.clear();
      this.a.addAll($$0);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   public EnumSet<cea.a> j() {
      return this.a;
   }

   protected int a(int $$0) {
      return this.R_() ? $$0 : b($$0);
   }

   protected static int b(int $$0) {
      return azm.e($$0, 2);
   }

   protected static arq a(bwf $$0) {
      return (arq)$$0.dV();
   }

   protected static arq a(dja $$0) {
      return (arq)$$0;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
