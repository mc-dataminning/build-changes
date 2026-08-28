import io.netty.buffer.ByteBuf;

public record ahs(int b, boolean c) implements zf<agp> {
   public static final yw<ByteBuf, ahs> a = yw.a(yu.h, ahs::b, yu.b, ahs::e, ahs::new);

   @Override
   public zh<ahs> a() {
      return agn.bP;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
