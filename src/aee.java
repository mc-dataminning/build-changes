import java.util.List;

public record aee(List<aee.a> b, boolean c) implements zd<abs> {
   public static final yu<wh, aee> a = yu.a(aee.a.c.a(ys.a()), aee::b, ys.b, aee::e, aee::new);

   @Override
   public zf<aee> a() {
      return agl.ak;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public static record a(deq d, byte e) {
      public static final byte a = 1;
      public static final byte b = 2;
      public static final yu<wh, aee.a> c = yu.a(deq.a, aee.a::c, ys.c, aee.a::d, aee.a::new);

      public a(deq $$0, boolean $$1, boolean $$2) {
         this($$0, (byte)(($$1 ? 1 : 0) | ($$2 ? 2 : 0)));
      }

      public boolean a() {
         return (this.e & 1) != 0;
      }

      public boolean b() {
         return (this.e & 2) != 0;
      }

      public deq c() {
         return this.d;
      }

      public byte d() {
         return this.e;
      }
   }
}
