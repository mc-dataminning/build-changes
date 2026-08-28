import io.netty.buffer.ByteBuf;

public class aki implements zr<akh> {
   public static final zi<ByteBuf, aki> a = zr.a(aki::a, aki::new);
   private final long b;

   public aki(long $$0) {
      this.b = $$0;
   }

   private aki(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zt<aki> a() {
      return akg.b;
   }

   public void a(akh $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
