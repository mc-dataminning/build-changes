import io.netty.buffer.ByteBuf;

public record ahh(ji b, boolean c) implements yv<agf> {
   public static final ym<ByteBuf, ahh> a = ym.a(ji.b, ahh::b, yk.b, ahh::e, ahh::new);

   @Override
   public yx<ahh> a() {
      return agd.bO;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
