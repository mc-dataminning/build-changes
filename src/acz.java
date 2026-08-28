import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acz implements zd<abs> {
   public static final yu<vs, acz> a = zd.a(acz::a, acz::new);
   public static final acz.a b = new acz.a(0);
   public static final acz.a c = new acz.a(1);
   public static final acz.a d = new acz.a(2);
   public static final acz.a e = new acz.a(3);
   public static final acz.a f = new acz.a(4);
   public static final acz.a g = new acz.a(5);
   public static final acz.a h = new acz.a(6);
   public static final acz.a i = new acz.a(7);
   public static final acz.a j = new acz.a(8);
   public static final acz.a k = new acz.a(9);
   public static final acz.a l = new acz.a(10);
   public static final acz.a m = new acz.a(11);
   public static final acz.a n = new acz.a(12);
   public static final acz.a o = new acz.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acz.a u;
   private final float v;

   public acz(acz.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acz(vs $$0) {
      this.u = (acz.a)acz.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zf<acz> a() {
      return agl.G;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public acz.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acz.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
