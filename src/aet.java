import java.util.List;

public record aet(List<aet.a> b, boolean c) implements zr<acg> {
   public static final zi<wv, aet> a = zi.a(aet.a.c.a(zg.a()), aet::b, zg.b, aet::e, aet::new);

   @Override
   public zt<aet> a() {
      return agz.ak;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(ddb d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final zi<wv, aet.a> c = zi.a(ddb.a, aet.a::c, zg.c, aet.a::d, aet.a::new);

      public a(ddb $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public ddb c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
