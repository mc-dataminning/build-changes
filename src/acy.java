import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class acy implements zc<abr> {
   public static final yt<vr, acy> a = zc.a(acy::a, acy::new);
   public static final acy.a b = new acy.a(0);
   public static final acy.a c = new acy.a(1);
   public static final acy.a d = new acy.a(2);
   public static final acy.a e = new acy.a(3);
   public static final acy.a f = new acy.a(4);
   public static final acy.a g = new acy.a(5);
   public static final acy.a h = new acy.a(6);
   public static final acy.a i = new acy.a(7);
   public static final acy.a j = new acy.a(8);
   public static final acy.a k = new acy.a(9);
   public static final acy.a l = new acy.a(10);
   public static final acy.a m = new acy.a(11);
   public static final acy.a n = new acy.a(12);
   public static final acy.a o = new acy.a(13);
   public static final int p = 0;
   public static final int q = 101;
   public static final int r = 102;
   public static final int s = 103;
   public static final int t = 104;
   private final acy.a u;
   private final float v;

   public acy(acy.a $$0, float $$1) {
      this.u = $$0;
      this.v = $$1;
   }

   private acy(vr $$0) {
      this.u = (acy.a)acy.a.a.get($$0.readUnsignedByte());
      this.v = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.l(this.u.b);
      $$0.a(this.v);
   }

   @Override
   public ze<acy> a() {
      return agk.G;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public acy.a b() {
      return this.u;
   }

   public float e() {
      return this.v;
   }

   public static class a {
      static final Int2ObjectMap<acy.a> a = new Int2ObjectOpenHashMap();
      final int b;

      public a(int $$0) {
         this.b = $$0;
         a.put($$0, this);
      }
   }
}
