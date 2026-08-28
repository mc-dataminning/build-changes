import io.netty.buffer.ByteBuf;

public class akc implements zq<akb> {
   public static final zh<ByteBuf, akc> a = zq.a(akc::a, akc::new);
   private final long b;

   public akc(long $$0) {
      this.b = $$0;
   }

   private akc(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zs<akc> a() {
      return aka.b;
   }

   public void a(akb $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
