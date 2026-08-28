import javax.annotation.Nullable;

public class aip implements zs<agy> {
   public static final zj<wi, aip> a = zs.a(aip::a, aip::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aip(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aip(wi $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<aip> a() {
      return agw.bY;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   @Nullable
   public def a(dff $$0) {
      bui $$1 = $$0.a(this.b);
      return $$1 instanceof cqx ? ((cqx)$$1).F() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
