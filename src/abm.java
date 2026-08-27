import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class abm implements xx<aag> {
   public static final xo<uq, abm> a = xx.a(abm::a, abm::new);
   public static final abm.a b = new abm.a(0);
   public static final abm.a c = new abm.a(1);
   public static final abm.a d = new abm.a(2);
   public static final abm.a e = new abm.a(3);
   public static final abm.a f = new abm.a(4);
   public static final abm.a g = new abm.a(5);
   public static final abm.a h = new abm.a(6);
   public static final abm.a i = new abm.a(7);
   public static final abm.a j = new abm.a(8);
   public static final abm.a k = new abm.a(9);
   public static final abm.a l = new abm.a(10);
   public static final abm.a m = new abm.a(11);
   public static final abm.a n = new abm.a(12);
   public static final abm.a o = new abm.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final abm.a u;
   private final float v;

   public abm(abm.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private abm(uq $$0) {
      this.u = (abm.a)abm.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(uq $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public xz<abm> a() {
      return aeq.F;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public abm.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<abm.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
