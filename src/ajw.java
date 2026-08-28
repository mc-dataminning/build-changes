import io.netty.buffer.ByteBuf;

public class ajw implements zk<ajv> {
   public static final zb<ByteBuf, ajw> a = zk.a(ajw::a, ajw::new);
   private final long b;

   public ajw(long $$0) {
      this.b = $$0;
   }

   private ajw(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zm<ajw> a() {
      return aju.b;
   }

   public void a(ajv $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
