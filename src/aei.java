import java.util.List;

public record aei(List<aei.a> b, boolean c) implements zh<abw> {
   public static final yy<wl, aei> a = yy.a(aei.a.c.a(yw.a()), aei::b, yw.b, aei::e, aei::new);

   @Override
   public zj<aei> a() {
      return agp.ak;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dfw d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yy<wl, aei.a> c = yy.a(dfw.a, aei.a::c, yw.c, aei.a::d, aei.a::new);

      public a(dfw $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dfw c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
