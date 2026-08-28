import javax.annotation.Nullable;

public class aix implements aac<ahm> {
   public static final zt<ws, aix> a = aac.a(aix::a, aix::new);
   private final aix.a b;
   @Nullable
   private final alz c;

   public aix(aix.a $$0, @Nullable alz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aix a(ah $$0) {
      return new aix(aix.a.a, $$0.a());
   }

   public static aix b() {
      return new aix(aix.a.b, null);
   }

   private aix(ws $$0) {
      this.b = $$0.b(aix.a.class);
      if (this.b == aix.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      if (this.b == aix.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public aae<aix> a() {
      return ahk.bX;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public aix.a e() {
      return this.b;
   }

   @Nullable
   public alz f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
