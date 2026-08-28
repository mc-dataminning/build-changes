import com.mojang.serialization.Codec;

public class byv {
   public static final Codec<jf<byv>> a = mg.s.r();
   public static final yy<wl, jf<byv>> b = yw.b(mh.c);
   private final double c;
   private boolean d;
   private final String e;
   private byv.a f = byv.a.a;

   protected byv(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public byv a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public byv a(byv.a $$0) {
      this.f = $$0;
      return this;
   }

   public double a(double $$0) {
      return $$0;
   }

   public String c() {
      return this.e;
   }

   public o b(boolean $$0) {
      return this.f.a($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public o a(boolean $$0) {
         return switch (this) {
            case a -> $$0 ? o.j : o.m;
            case b -> o.h;
            case c -> $$0 ? o.m : o.j;
         };
      }
   }
}
