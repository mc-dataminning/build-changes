import io.netty.buffer.ByteBuf;

public class ajz implements zf<ajy> {
   public static final yw<ByteBuf, ajz> a = zf.a(ajz::a, ajz::new);
   private final long b;

   public ajz(long $$0) {
      this.b = $$0;
   }

   private ajz(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zh<ajz> a() {
      return ajx.b;
   }

   public void a(ajy $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
