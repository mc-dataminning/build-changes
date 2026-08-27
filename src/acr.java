import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acr implements yz<abk> {
   public static final yq<vs, acr> a = yz.a(acr::a, acr::new);
   public static final acr.a b = new acr.a(0);
   public static final acr.a c = new acr.a(1);
   public static final acr.a d = new acr.a(2);
   public static final acr.a e = new acr.a(3);
   public static final acr.a f = new acr.a(4);
   public static final acr.a g = new acr.a(5);
   public static final acr.a h = new acr.a(6);
   public static final acr.a i = new acr.a(7);
   public static final acr.a j = new acr.a(8);
   public static final acr.a k = new acr.a(9);
   public static final acr.a l = new acr.a(10);
   public static final acr.a m = new acr.a(11);
   public static final acr.a n = new acr.a(12);
   public static final acr.a o = new acr.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acr.a u;
   private final float v;

   public acr(acr.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acr(vs $$0) {
      this.u = (acr.a)acr.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zb<acr> a() {
      return afv.G;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public acr.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acr.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
