import com.mojang.serialization.Codec;

public class bxs {
   public static final Codec<js<bxs>> a = md.s.r();
   public static final yt<wg, js<bxs>> b = yr.b(me.c);
   private final double c;
   private boolean d;
   private final String e;
   private bxs.a f = bxs.a.a;

   protected bxs(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bxs a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bxs a(bxs.a $$0) {
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
