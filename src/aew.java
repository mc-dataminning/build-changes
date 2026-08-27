import javax.annotation.Nullable;

public class aew implements ze<abq> {
   public static final yv<vx, aew> a = ze.a(aew::a, aew::new);
   private final int b;
   private final int c;

   public aew(brw $$0, @Nullable brw $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private aew(vx $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vx $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zg<aew> a() {
      return agc.aD;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
