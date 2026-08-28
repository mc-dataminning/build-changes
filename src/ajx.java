import io.netty.buffer.ByteBuf;

public class ajx implements zl<ajw> {
   public static final zc<ByteBuf, ajx> a = zl.a(ajx::a, ajx::new);
   private final long b;

   public ajx(long $$0) {
      this.b = $$0;
   }

   private ajx(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zn<ajx> a() {
      return ajv.b;
   }

   public void a(ajw $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
