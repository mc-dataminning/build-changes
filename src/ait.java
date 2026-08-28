import javax.annotation.Nullable;

public class ait implements zo<aha> {
   public static final ze<vy, ait> a = zo.a(ait::a, ait::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ait(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ait(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<ait> a() {
      return agy.ce;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   @Nullable
   public dji a(dkj $$0) {
      bxe $$1 = $$0.a(this.b);
      return $$1 instanceof cvf ? ((cvf)$$1).e() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
