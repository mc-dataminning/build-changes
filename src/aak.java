import javax.annotation.Nullable;

public record aak(ajh b, @Nullable byte[] c) implements yb<aaj> {
   public static final xs<uu, aak> a = yb.a(aak::a, aak::new);

   private aak(uu $$0) {
      this($$0.q(), $$0.c(yo.b));
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, yo.b);
   }

   @Override
   public yd<aak> a() {
      return aai.b;
   }

   public void a(aaj $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
