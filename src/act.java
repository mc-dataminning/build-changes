import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class act implements zb<abm> {
   public static final ys<vu, act> a = zb.a(act::a, act::new);
   public static final act.a b = new act.a(0);
   public static final act.a c = new act.a(1);
   public static final act.a d = new act.a(2);
   public static final act.a e = new act.a(3);
   public static final act.a f = new act.a(4);
   public static final act.a g = new act.a(5);
   public static final act.a h = new act.a(6);
   public static final act.a i = new act.a(7);
   public static final act.a j = new act.a(8);
   public static final act.a k = new act.a(9);
   public static final act.a l = new act.a(10);
   public static final act.a m = new act.a(11);
   public static final act.a n = new act.a(12);
   public static final act.a o = new act.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final act.a u;
   private final float v;

   public act(act.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private act(vu $$0) {
      this.u = (act.a)act.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.k(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zd<act> a() {
      return afx.G;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public act.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<act.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
