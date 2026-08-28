import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class adm implements zq<acf> {
   public static final zh<wg, adm> a = zq.a(adm::a, adm::new);
   public static final adm.a b = new adm.a(0);
   public static final adm.a c = new adm.a(1);
   public static final adm.a d = new adm.a(2);
   public static final adm.a e = new adm.a(3);
   public static final adm.a f = new adm.a(4);
   public static final adm.a g = new adm.a(5);
   public static final adm.a h = new adm.a(6);
   public static final adm.a i = new adm.a(7);
   public static final adm.a j = new adm.a(8);
   public static final adm.a k = new adm.a(9);
   public static final adm.a l = new adm.a(10);
   public static final adm.a m = new adm.a(11);
   public static final adm.a n = new adm.a(12);
   public static final adm.a o = new adm.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final adm.a u;
   private final float v;

   public adm(adm.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private adm(wg $$0) {
      this.u = (adm.a)adm.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(wg $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public zs<adm> a() {
      return agu.G;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public adm.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<adm.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
