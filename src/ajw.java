import io.netty.buffer.ByteBuf;

public class ajw implements zc<ajv> {
   public static final yt<ByteBuf, ajw> a = zc.a(ajw::a, ajw::new);
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
   public ze<ajw> a() {
      return aju.b;
   }

   public void a(ajv $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
