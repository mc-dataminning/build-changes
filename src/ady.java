import java.util.List;

public record ady(List<ady.a> b, boolean c) implements yw<abl> {
   public static final yn<wa, ady> a = yn.a(ady.a.c.a(yl.a()), ady::b, yl.b, ady::e, ady::new);

   @Override
   public yy<ady> a() {
      return age.ak;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dcl d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yn<wa, ady.a> c = yn.a(dcl.a, ady.a::c, yl.c, ady.a::d, ady.a::new);

      public a(dcl $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dcl c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
