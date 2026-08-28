import com.mojang.serialization.Codec;

public class bvy {
   public static final Codec<jp<bvy>> a = lx.s.r();
   public static final zf<ws, jp<bvy>> b = zd.b(ly.c);
   private final double c;
   private boolean d;
   private final String e;
   private bvy.a f = bvy.a.a;

   protected bvy(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bvy a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bvy a(bvy.a $$0) {
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
