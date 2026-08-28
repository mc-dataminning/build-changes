import javax.annotation.Nullable;

public class ain implements zr<ahb> {
   public static final zi<wh, ain> a = zr.a(ain::a, ain::new);
   private final ain.a b;
   @Nullable
   private final alp c;

   public ain(ain.a $$0, @Nullable alp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ain a(ah $$0) {
      return new ain(ain.a.a, $$0.a());
   }

   public static ain b() {
      return new ain(ain.a.b, null);
   }

   private ain(wh $$0) {
      this.b = $$0.b(ain.a.class);
      if (this.b == ain.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      if (this.b == ain.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zt<ain> a() {
      return agz.bY;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public ain.a e() {
      return this.b;
   }

   @Nullable
   public alp f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
