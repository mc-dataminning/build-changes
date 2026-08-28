import io.netty.buffer.ByteBuf;

public record ahj(int b, boolean c) implements yw<agg> {
   public static final yn<ByteBuf, ahj> a = yn.a(yl.h, ahj::b, yl.b, ahj::e, ahj::new);

   @Override
   public yy<ahj> a() {
      return age.bP;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
