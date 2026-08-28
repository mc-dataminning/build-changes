import java.util.List;

public record aek(List<aek.a> b, boolean c) implements zj<aby> {
   public static final za<wn, aek> a = za.a(aek.a.c.a(yy.a()), aek::b, yy.b, aek::e, aek::new);

   @Override
   public zl<aek> a() {
      return agr.ak;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(dfy d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final za<wn, aek.a> c = za.a(dfy.a, aek.a::c, yy.c, aek.a::d, aek.a::new);

      public a(dfy $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public dfy c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
