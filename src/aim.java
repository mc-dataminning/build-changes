import javax.annotation.Nullable;

public class aim implements zj<agt> {
   public static final za<vy, aim> a = zj.a(aim::a, aim::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aim(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aim(vy $$0) {
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
   public zl<aim> a() {
      return agr.ce;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   @Nullable
   public diy a(djz $$0) {
      bwv $$1 = $$0.a(this.b);
      return $$1 instanceof cuw ? ((cuw)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
