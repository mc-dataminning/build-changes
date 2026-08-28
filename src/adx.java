import java.util.List;

public record adx(List<adx.a> b, boolean c) implements yv<abk> {
   public static final ym<vz, adx> a = ym.a(adx.a.c.a(yk.a()), adx::b, yk.b, adx::e, adx::new);

   @Override
   public yx<adx> a() {
      return agd.ak;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dci d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final ym<vz, adx.a> c = ym.a(dci.a, adx.a::c, yk.c, adx.a::d, adx.a::new);

      public a(dci $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dci c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
