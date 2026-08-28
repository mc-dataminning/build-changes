import io.netty.buffer.ByteBuf;

public class ajn implements yv<ajm> {
   public static final ym<ByteBuf, ajn> a = yv.a(ajn::a, ajn::new);
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
   public yx<ajn> a() {
      return ajl.b;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
