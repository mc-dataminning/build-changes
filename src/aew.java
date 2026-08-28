import javax.annotation.Nullable;

public class aew implements yw<abl> {
   public static final yn<vl, aew> a = yw.a(aew::a, aew::new);
   private final int b;
   private final int c;

   public aew(bum $$0, @Nullable bum $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private aew(vl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vl $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public yy<aew> a() {
      return age.aG;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
