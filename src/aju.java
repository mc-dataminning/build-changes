import java.util.UUID;

public record aju(String b, UUID c) implements zr<ajs> {
   public static final zi<wh, aju> a = zr.a(aju::a, aju::new);

   private aju(wh $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wh $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zt<aju> a() {
      return ajq.g;
   }

   public void a(ajs $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
