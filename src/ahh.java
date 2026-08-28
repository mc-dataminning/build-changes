import io.netty.buffer.ByteBuf;

public record ahh(ji b, boolean c) implements yw<agf> {
   public static final yn<ByteBuf, ahh> a = yn.a(ji.b, ahh::b, yl.b, ahh::e, ahh::new);

   @Override
   public yy<ahh> a() {
      return agd.bN;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
