import io.netty.buffer.ByteBuf;

public record aad(alh c, byte[] d) implements zo<zu> {
   public static final zf<we, aad> a = zo.a(aad::a, aad::new);
   private static final int e = 5120;
   public static final zf<ByteBuf, byte[]> b = zd.a(5120);

   private aad(we $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(we $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zq<aad> a() {
      return aag.i;
   }

   public void a(zu $$0) {
      $$0.a(this);
   }

   public alh b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
