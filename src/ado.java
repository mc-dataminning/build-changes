import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ado implements zv<ach> {
   public static final zm<wl, ado> a = zv.a(ado::a, ado::new);
   public static final ado.a b = new ado.a(0);
   public static final ado.a c = new ado.a(1);
   public static final ado.a d = new ado.a(2);
   public static final ado.a e = new ado.a(3);
   public static final ado.a f = new ado.a(4);
   public static final ado.a g = new ado.a(5);
   public static final ado.a h = new ado.a(6);
   public static final ado.a i = new ado.a(7);
   public static final ado.a j = new ado.a(8);
   public static final ado.a k = new ado.a(9);
   public static final ado.a l = new ado.a(10);
   public static final ado.a m = new ado.a(11);
   public static final ado.a n = new ado.a(12);
   public static final ado.a o = new ado.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final ado.a u;
   private final float v;

   public ado(ado.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private ado(wl $$0) {
      this.u = (ado.a)ado.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zx<ado> a() {
      return agt.G;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public ado.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<ado.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
