import java.util.List;

public record adx(List<adx.a> b, boolean c) implements yw<abl> {
   public static final yn<wa, adx> a = yn.a(adx.a.c.a(yl.a()), adx::b, yl.b, adx::e, adx::new);

   @Override
   public yy<adx> a() {
      return agd.aj;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(ddc d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yn<wa, adx.a> c = yn.a(ddc.a, adx.a::c, yl.c, adx.a::d, adx.a::new);

      public a(ddc $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public ddc c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
