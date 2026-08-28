import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ada implements zf<abt> {
   public static final yw<vv, ada> a = zf.a(ada::a, ada::new);
   public static final ada.a b = new ada.a(0);
   public static final ada.a c = new ada.a(1);
   public static final ada.a d = new ada.a(2);
   public static final ada.a e = new ada.a(3);
   public static final ada.a f = new ada.a(4);
   public static final ada.a g = new ada.a(5);
   public static final ada.a h = new ada.a(6);
   public static final ada.a i = new ada.a(7);
   public static final ada.a j = new ada.a(8);
   public static final ada.a k = new ada.a(9);
   public static final ada.a l = new ada.a(10);
   public static final ada.a m = new ada.a(11);
   public static final ada.a n = new ada.a(12);
   public static final ada.a o = new ada.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final ada.a u;
   private final float v;

   public ada(ada.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private ada(vv $$0) {
      this.u = (ada.a)ada.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vv $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zh<ada> a() {
      return agf.G;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public ada.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<ada.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
