import com.mojang.serialization.Codec;

public class bvm {
   public static final Codec<jn<bvm>> a = lu.s.r();
   public static final zb<wo, jn<bvm>> b = yz.b(lv.c);
   private final double c;
   private boolean d;
   private final String e;
   private bvm.a f = bvm.a.a;

   protected bvm(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bvm a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bvm a(bvm.a $$0) {
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
