import io.netty.buffer.ByteBuf;

public record ahi(int b, boolean c) implements yw<agf> {
   public static final yn<ByteBuf, ahi> a = yn.a(yl.h, ahi::b, yl.b, ahi::e, ahi::new);

   @Override
   public yy<ahi> a() {
      return agd.bO;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
