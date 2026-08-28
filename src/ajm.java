import io.netty.buffer.ByteBuf;

public class ajm implements zg<ajl> {
   public static final yx<ByteBuf, ajm> a = zg.a(ajm::a, ajm::new);
   private final long b;

   public ajm(long $$0) {
      this.b = $$0;
   }

   private ajm(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zi<ajm> a() {
      return ajk.b;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
