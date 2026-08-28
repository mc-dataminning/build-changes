import io.netty.buffer.ByteBuf;

public class ajn implements yw<ajm> {
   public static final yn<ByteBuf, ajn> a = yw.a(ajn::a, ajn::new);
   private final long b;

   public ajn(long $$0) {
      this.b = $$0;
   }

   private ajn(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public yy<ajn> a() {
      return ajl.b;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
