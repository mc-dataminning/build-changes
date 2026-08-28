import java.util.UUID;

public record aix(String b, UUID c) implements zf<aiv> {
   public static final yw<vv, aix> a = zf.a(aix::a, aix::new);

   private aix(vv $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vv $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zh<aix> a() {
      return ait.g;
   }

   public void a(aiv $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
