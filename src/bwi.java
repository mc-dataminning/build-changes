import com.mojang.serialization.Codec;

public class bwi {
   public static final Codec<jr<bwi>> a = mb.s.r();
   public static final ym<vz, jr<bwi>> b = yk.b(mc.c);
   private final double c;
   private boolean d;
   private final String e;
   private bwi.a f = bwi.a.a;

   protected bwi(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bwi a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bwi a(bwi.a $$0) {
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
