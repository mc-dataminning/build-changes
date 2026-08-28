import com.mojang.serialization.Codec;

public class bue {
   public static final Codec<jj<bue>> a = lq.s.s();
   private final double b;
   private boolean c;
   private final String d;
   private bue.a e = bue.a.a;

   protected bue(String $$0, double $$1) {
      this.b = $$1;
      this.d = $$0;
   }

   public double a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }

   public bue a(boolean $$0) {
      this.c = $$0;
      return this;
   }

   public bue a(bue.a $$0) {
      this.e = $$0;
      return this;
   }

   public double a(double $$0) {
      return $$0;
   }

   public String c() {
      return this.d;
   }

   public n b(boolean $$0) {
      return this.e.a($$0);
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
