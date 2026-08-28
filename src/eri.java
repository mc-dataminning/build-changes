import com.google.common.base.Preconditions;

public class eri {
   private static final eri[] am = new eri[64];
   public static final eri a = new eri(0, 0);
   public static final eri b = new eri(1, 8368696);
   public static final eri c = new eri(2, 16247203);
   public static final eri d = new eri(3, 13092807);
   public static final eri e = new eri(4, 16711680);
   public static final eri f = new eri(5, 10526975);
   public static final eri g = new eri(6, 10987431);
   public static final eri h = new eri(7, 31744);
   public static final eri i = new eri(8, 16777215);
   public static final eri j = new eri(9, 10791096);
   public static final eri k = new eri(10, 9923917);
   public static final eri l = new eri(11, 7368816);
   public static final eri m = new eri(12, 4210943);
   public static final eri n = new eri(13, 9402184);
   public static final eri o = new eri(14, 16776437);
   public static final eri p = new eri(15, 14188339);
   public static final eri q = new eri(16, 11685080);
   public static final eri r = new eri(17, 6724056);
   public static final eri s = new eri(18, 15066419);
   public static final eri t = new eri(19, 8375321);
   public static final eri u = new eri(20, 15892389);
   public static final eri v = new eri(21, 5000268);
   public static final eri w = new eri(22, 10066329);
   public static final eri x = new eri(23, 5013401);
   public static final eri y = new eri(24, 8339378);
   public static final eri z = new eri(25, 3361970);
   public static final eri A = new eri(26, 6704179);
   public static final eri B = new eri(27, 6717235);
   public static final eri C = new eri(28, 10040115);
   public static final eri D = new eri(29, 1644825);
   public static final eri E = new eri(30, 16445005);
   public static final eri F = new eri(31, 6085589);
   public static final eri G = new eri(32, 4882687);
   public static final eri H = new eri(33, 55610);
   public static final eri I = new eri(34, 8476209);
   public static final eri J = new eri(35, 7340544);
   public static final eri K = new eri(36, 13742497);
   public static final eri L = new eri(37, 10441252);
   public static final eri M = new eri(38, 9787244);
   public static final eri N = new eri(39, 7367818);
   public static final eri O = new eri(40, 12223780);
   public static final eri P = new eri(41, 6780213);
   public static final eri Q = new eri(42, 10505550);
   public static final eri R = new eri(43, 3746083);
   public static final eri S = new eri(44, 8874850);
   public static final eri T = new eri(45, 5725276);
   public static final eri U = new eri(46, 8014168);
   public static final eri V = new eri(47, 4996700);
   public static final eri W = new eri(48, 4993571);
   public static final eri X = new eri(49, 5001770);
   public static final eri Y = new eri(50, 9321518);
   public static final eri Z = new eri(51, 2430480);
   public static final eri aa = new eri(52, 12398641);
   public static final eri ab = new eri(53, 9715553);
   public static final eri ac = new eri(54, 6035741);
   public static final eri ad = new eri(55, 1474182);
   public static final eri ae = new eri(56, 3837580);
   public static final eri af = new eri(57, 5647422);
   public static final eri ag = new eri(58, 1356933);
   public static final eri ah = new eri(59, 6579300);
   public static final eri ai = new eri(60, 14200723);
   public static final eri aj = new eri(61, 8365974);
   public final int ak;
   public final int al;

   private eri(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eri.a $$0) {
      return this == a ? 0 : axu.b(axu.f(this.ak), $$0.f);
   }

   public static eri a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eri c(int $$0) {
      eri $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eri.a.b($$1 & 3));
   }

   public byte b(eri.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eri.a[] g = new eri.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eri.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eri.a b(int $$0) {
         return g[$$0];
      }
   }
}
