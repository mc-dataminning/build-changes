import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acf implements yn<aay> {
   public static final ye<vg, acf> a = yn.a(acf::a, acf::new);
   public static final acf.a b = new acf.a(0);
   public static final acf.a c = new acf.a(1);
   public static final acf.a d = new acf.a(2);
   public static final acf.a e = new acf.a(3);
   public static final acf.a f = new acf.a(4);
   public static final acf.a g = new acf.a(5);
   public static final acf.a h = new acf.a(6);
   public static final acf.a i = new acf.a(7);
   public static final acf.a j = new acf.a(8);
   public static final acf.a k = new acf.a(9);
   public static final acf.a l = new acf.a(10);
   public static final acf.a m = new acf.a(11);
   public static final acf.a n = new acf.a(12);
   public static final acf.a o = new acf.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acf.a u;
   private final float v;

   public acf(acf.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acf(vg $$0) {
      this.u = (acf.a)acf.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vg $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public yp<acf> a() {
      return afj.G;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public acf.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acf.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
