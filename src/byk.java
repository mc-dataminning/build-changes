import com.mojang.serialization.Codec;

public class byk {
   public static final Codec<jf<byk>> a = mg.s.r();
   public static final yw<wj, jf<byk>> b = yu.b(mh.c);
   private final double c;
   private boolean d;
   private final String e;
   private byk.a f = byk.a.a;

   protected byk(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public byk a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public byk a(byk.a $$0) {
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
