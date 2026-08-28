import javax.annotation.Nullable;

public class aia implements zd<agn> {
   public static final yu<vs, aia> a = zd.a(aia::a, aia::new);
   private final aia.a b;
   @Nullable
   private final ale c;

   public aia(aia.a $$0, @Nullable ale $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aia a(ai $$0) {
      return new aia(aia.a.a, $$0.a());
   }

   public static aia b() {
      return new aia(aia.a.b, null);
   }

   private aia(vs $$0) {
      this.b = $$0.b(aia.a.class);
      if (this.b == aia.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      if (this.b == aia.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zf<aia> a() {
      return agl.bZ;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public aia.a e() {
      return this.b;
   }

   @Nullable
   public ale f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
