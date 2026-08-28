import java.util.List;

public record afe(List<afe.a> b) implements aac<acr> {
   public static final zt<xg, afe> a = zt.a(afe.a.c.a(zr.a()), afe::b, afe::new);

   @Override
   public aae<afe> a() {
      return ahk.ak;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public static record a(ddd d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final zt<xg, afe.a> c = zt.a(ddd.a, afe.a::c, zr.c, afe.a::d, afe.a::new);

      public a(ddd $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public ddd c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
