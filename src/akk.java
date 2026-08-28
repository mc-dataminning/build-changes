import io.netty.buffer.ByteBuf;

public class akk implements zo<akj> {
   public static final ze<ByteBuf, akk> a = zo.a(akk::a, akk::new);
   private final long b;

   public akk(long $$0) {
      this.b = $$0;
   }

   private akk(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zq<akk> a() {
      return aki.b;
   }

   public void a(akj $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
