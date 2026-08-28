import io.netty.buffer.ByteBuf;

public record aie(int b, boolean c) implements zr<ahb> {
   public static final zi<ByteBuf, aie> a = zi.a(zg.h, aie::b, zg.b, aie::e, aie::new);

   @Override
   public zt<aie> a() {
      return agz.bP;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
