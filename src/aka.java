import io.netty.buffer.ByteBuf;

public class aka implements zo<ajz> {
   public static final zf<ByteBuf, aka> a = zo.a(aka::a, aka::new);
   private final long b;

   public aka(long $$0) {
      this.b = $$0;
   }

   private aka(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zq<aka> a() {
      return ajy.b;
   }

   public void a(ajz $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
