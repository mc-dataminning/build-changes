import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adh implements zl<aca> {
   public static final zc<wb, adh> a = zl.a(adh::a, adh::new);
   public static final adh.a b = new adh.a(0);
   public static final adh.a c = new adh.a(1);
   public static final adh.a d = new adh.a(2);
   public static final adh.a e = new adh.a(3);
   public static final adh.a f = new adh.a(4);
   public static final adh.a g = new adh.a(5);
   public static final adh.a h = new adh.a(6);
   public static final adh.a i = new adh.a(7);
   public static final adh.a j = new adh.a(8);
   public static final adh.a k = new adh.a(9);
   public static final adh.a l = new adh.a(10);
   public static final adh.a m = new adh.a(11);
   public static final adh.a n = new adh.a(12);
   public static final adh.a o = new adh.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adh.a u;
   private final float v;

   public adh(adh.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adh(wb $$0) {
      this.u = (adh.a)adh.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wb $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zn<adh> a() {
      return agp.G;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public adh.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adh.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
