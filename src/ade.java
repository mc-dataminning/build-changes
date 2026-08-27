import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ade implements zl<abw> {
   public static final zc<we, ade> a = zl.a(ade::a, ade::new);
   public static final ade.a b = new ade.a(0);
   public static final ade.a c = new ade.a(1);
   public static final ade.a d = new ade.a(2);
   public static final ade.a e = new ade.a(3);
   public static final ade.a f = new ade.a(4);
   public static final ade.a g = new ade.a(5);
   public static final ade.a h = new ade.a(6);
   public static final ade.a i = new ade.a(7);
   public static final ade.a j = new ade.a(8);
   public static final ade.a k = new ade.a(9);
   public static final ade.a l = new ade.a(10);
   public static final ade.a m = new ade.a(11);
   public static final ade.a n = new ade.a(12);
   public static final ade.a o = new ade.a(13);
   public static final ade.a p = new ade.a(15);
   public static final int q = 0;
   public static final int r = 101;
   public static final int s = 102;
   public static final int t = 103;
   public static final int u = 104;
   private final ade.a v;
   private final float w;

   public ade(ade.a $$0, float $$1) {
      this.v = $$0;
      this.w = $$1;
   }

   private ade(we $$0) {
      this.v = (ade.a)ade.a.a.get($$0.readUnsignedByte());
      this.w = $$0.readFloat();
   }

   private void a(we $$0) {
      $$0.k(this.v.b);
      $$0.a(this.w);
   }

   @Override
   public zn<ade> a() {
      return agj.H;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public ade.a b() {
      return this.v;
   }

   public float e() {
      return this.w;
   }

   public static class a {
      static final Int2ObjectMap<ade.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
