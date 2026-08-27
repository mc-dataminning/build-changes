import javax.annotation.Nullable;

public class ahi implements zb<afz> {
   public static final ys<vu, ahi> a = zb.a(ahi::a, ahi::new);
   private final ahi.a b;
   @Nullable
   private final akh c;

   public ahi(ahi.a $$0, @Nullable akh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahi a(af $$0) {
      return new ahi(ahi.a.a, $$0.a());
   }

   public static ahi b() {
      return new ahi(ahi.a.b, null);
   }

   private ahi(vu $$0) {
      this.b = $$0.b(ahi.a.class);
      if (this.b == ahi.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      if (this.b == ahi.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zd<ahi> a() {
      return afx.bO;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public ahi.a e() {
      return this.b;
   }

   @Nullable
   public akh f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
