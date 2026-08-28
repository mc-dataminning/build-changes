import javax.annotation.Nullable;

public record acp(alz b, @Nullable byte[] c) implements aac<aco> {
   public static final zt<ws, acp> a = aac.a(acp::a, acp::new);

   private acp(ws $$0) {
      this($$0.q(), $$0.c(aar.b));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c, aar.b);
   }

   @Override
   public aae<acp> a() {
      return acn.b;
   }

   public void a(aco $$0) {
      $$0.a(this);
   }

   @Nullable
   public byte[] e() {
      return this.c;
   }
}
