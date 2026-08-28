import io.netty.buffer.ByteBuf;

public class aks implements aac<akr> {
   public static final zt<ByteBuf, aks> a = aac.a(aks::a, aks::new);
   private final long b;

   public aks(long $$0) {
      this.b = $$0;
   }

   private aks(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public aae<aks> a() {
      return akq.b;
   }

   public void a(akr $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
