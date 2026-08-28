import java.util.List;

public record aeg(List<aeg.a> b, boolean c) implements zf<abu> {
   public static final yw<wj, aeg> a = yw.a(aeg.a.c.a(yu.a()), aeg::b, yu.b, aeg::e, aeg::new);

   @Override
   public zh<aeg> a() {
      return agn.ak;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dew d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yw<wj, aeg.a> c = yw.a(dew.a, aeg.a::c, yu.c, aeg.a::d, aeg.a::new);

      public a(dew $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dew c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
