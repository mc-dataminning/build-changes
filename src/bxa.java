import com.mojang.serialization.Codec;

public class bxa {
   public static final Codec<jq<bxa>> a = ma.s.r();
   public static final zi<wv, jq<bxa>> b = zg.b(mb.c);
   private final double c;
   private boolean d;
   private final String e;
   private bxa.a f = bxa.a.a;

   protected bxa(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bxa a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bxa a(bxa.a $$0) {
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
