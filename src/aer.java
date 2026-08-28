import java.util.List;

public record aer(List<aer.a> b, boolean c) implements zo<acf> {
   public static final ze<wp, aer> a = ze.a(aer.a.c.a(zc.a()), aer::b, zc.b, aer::e, aer::new);

   @Override
   public zq<aer> a() {
      return agy.ak;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dgi d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final ze<wp, aer.a> c = ze.a(dgi.a, aer.a::c, zc.c, aer.a::d, aer.a::new);

      public a(dgi $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dgi c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
