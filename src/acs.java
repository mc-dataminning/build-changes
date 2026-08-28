import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acs implements yv<abk> {
   public static final ym<vl, acs> a = yv.a(acs::a, acs::new);
   public static final acs.a b = new acs.a(0);
   public static final acs.a c = new acs.a(1);
   public static final acs.a d = new acs.a(2);
   public static final acs.a e = new acs.a(3);
   public static final acs.a f = new acs.a(4);
   public static final acs.a g = new acs.a(5);
   public static final acs.a h = new acs.a(6);
   public static final acs.a i = new acs.a(7);
   public static final acs.a j = new acs.a(8);
   public static final acs.a k = new acs.a(9);
   public static final acs.a l = new acs.a(10);
   public static final acs.a m = new acs.a(11);
   public static final acs.a n = new acs.a(12);
   public static final acs.a o = new acs.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acs.a u;
   private final float v;

   public acs(acs.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acs(vl $$0) {
      this.u = (acs.a)acs.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vl $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public yx<acs> a() {
      return agd.G;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public acs.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acs.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
