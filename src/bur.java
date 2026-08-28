import com.mojang.serialization.Codec;

public class bur {
   public static final Codec<jm<bur>> a = lt.s.s();
   public static final yx<wk, jm<bur>> b = yv.b(lu.c);
   private final double c;
   private boolean d;
   private final String e;
   private bur.a f = bur.a.a;

   protected bur(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bur a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bur a(bur.a $$0) {
      this.f = $$0;
      return this;
   }

   public double a(double $$0) {
      return $$0;
   }

   public String c() {
      return this.e;
   }

   public n b(boolean $$0) {
      return this.f.a($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public n a(boolean $$0) {
         return switch (this) {
            case a -> $$0 ? n.j : n.m;
            case b -> n.h;
            case c -> $$0 ? n.m : n.j;
         };
      }
   }
}
