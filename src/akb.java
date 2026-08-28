import io.netty.buffer.ByteBuf;

public class akb implements zh<aka> {
   public static final yy<ByteBuf, akb> a = zh.a(akb::a, akb::new);
   private final long b;

   public akb(long $$0) {
      this.b = $$0;
   }

   private akb(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zj<akb> a() {
      return ajz.b;
   }

   public void a(aka $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
