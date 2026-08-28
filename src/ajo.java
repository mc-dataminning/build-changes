import io.netty.buffer.ByteBuf;

public class ajo implements yw<ajn> {
   public static final yn<ByteBuf, ajo> a = yw.a(ajo::a, ajo::new);
   private final long b;

   public ajo(long $$0) {
      this.b = $$0;
   }

   private ajo(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public yy<ajo> a() {
      return ajm.b;
   }

   public void a(ajn $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
