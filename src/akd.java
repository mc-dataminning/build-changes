import io.netty.buffer.ByteBuf;

public class akd implements zj<akc> {
   public static final za<ByteBuf, akd> a = zj.a(akd::a, akd::new);
   private final long b;

   public akd(long $$0) {
      this.b = $$0;
   }

   private akd(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zl<akd> a() {
      return akb.b;
   }

   public void a(akc $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
