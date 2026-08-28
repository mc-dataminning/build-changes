import io.netty.buffer.ByteBuf;

public record ahr(iv b, boolean c) implements zf<agp> {
   public static final yw<ByteBuf, ahr> a = yw.a(iv.b, ahr::b, yu.b, ahr::e, ahr::new);

   @Override
   public zh<ahr> a() {
      return agn.bO;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
