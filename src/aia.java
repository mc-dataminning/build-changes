import java.util.UUID;

public record aia(String b, UUID c) implements yn<ahy> {
   public static final ye<vg, aia> a = yn.a(aia::a, aia::new);

   private aia(vg $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vg $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yp<aia> a() {
      return ahw.g;
   }

   public void a(ahy $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
