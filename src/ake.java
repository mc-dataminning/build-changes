import io.netty.buffer.ByteBuf;

public class ake implements zs<akd> {
   public static final zj<ByteBuf, ake> a = zs.a(ake::a, ake::new);
   private final long b;

   public ake(long $$0) {
      this.b = $$0;
   }

   private ake(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zu<ake> a() {
      return akc.b;
   }

   public void a(akd $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
