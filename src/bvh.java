import com.mojang.serialization.Codec;

public class bvh {
   public static final Codec<jn<bvh>> a = lu.s.r();
   public static final zb<wo, jn<bvh>> b = yz.b(lv.c);
   private final double c;
   private boolean d;
   private final String e;
   private bvh.a f = bvh.a.a;

   protected bvh(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public bvh a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public bvh a(bvh.a $$0) {
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
