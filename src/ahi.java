import io.netty.buffer.ByteBuf;

public record ahi(int b, boolean c) implements yv<agf> {
   public static final ym<ByteBuf, ahi> a = ym.a(yk.h, ahi::b, yk.b, ahi::e, ahi::new);

   @Override
   public yx<ahi> a() {
      return agd.bP;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
