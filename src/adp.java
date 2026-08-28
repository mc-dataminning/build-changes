import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adp implements zw<aci> {
   public static final zn<wm, adp> a = zw.a(adp::a, adp::new);
   public static final adp.a b = new adp.a(0);
   public static final adp.a c = new adp.a(1);
   public static final adp.a d = new adp.a(2);
   public static final adp.a e = new adp.a(3);
   public static final adp.a f = new adp.a(4);
   public static final adp.a g = new adp.a(5);
   public static final adp.a h = new adp.a(6);
   public static final adp.a i = new adp.a(7);
   public static final adp.a j = new adp.a(8);
   public static final adp.a k = new adp.a(9);
   public static final adp.a l = new adp.a(10);
   public static final adp.a m = new adp.a(11);
   public static final adp.a n = new adp.a(12);
   public static final adp.a o = new adp.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adp.a u;
   private final float v;

   public adp(adp.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adp(wm $$0) {
      this.u = (adp.a)adp.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wm $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zy<adp> a() {
      return agu.G;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public adp.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adp.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
