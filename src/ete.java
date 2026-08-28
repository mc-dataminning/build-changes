import com.google.common.base.Preconditions;

public class ete {
   private static final ete[] am = new ete[64];
   public static final ete a = new ete(0, 0);
   public static final ete b = new ete(1, 8368696);
   public static final ete c = new ete(2, 16247203);
   public static final ete d = new ete(3, 13092807);
   public static final ete e = new ete(4, 16711680);
   public static final ete f = new ete(5, 10526975);
   public static final ete g = new ete(6, 10987431);
   public static final ete h = new ete(7, 31744);
   public static final ete i = new ete(8, 16777215);
   public static final ete j = new ete(9, 10791096);
   public static final ete k = new ete(10, 9923917);
   public static final ete l = new ete(11, 7368816);
   public static final ete m = new ete(12, 4210943);
   public static final ete n = new ete(13, 9402184);
   public static final ete o = new ete(14, 16776437);
   public static final ete p = new ete(15, 14188339);
   public static final ete q = new ete(16, 11685080);
   public static final ete r = new ete(17, 6724056);
   public static final ete s = new ete(18, 15066419);
   public static final ete t = new ete(19, 8375321);
   public static final ete u = new ete(20, 15892389);
   public static final ete v = new ete(21, 5000268);
   public static final ete w = new ete(22, 10066329);
   public static final ete x = new ete(23, 5013401);
   public static final ete y = new ete(24, 8339378);
   public static final ete z = new ete(25, 3361970);
   public static final ete A = new ete(26, 6704179);
   public static final ete B = new ete(27, 6717235);
   public static final ete C = new ete(28, 10040115);
   public static final ete D = new ete(29, 1644825);
   public static final ete E = new ete(30, 16445005);
   public static final ete F = new ete(31, 6085589);
   public static final ete G = new ete(32, 4882687);
   public static final ete H = new ete(33, 55610);
   public static final ete I = new ete(34, 8476209);
   public static final ete J = new ete(35, 7340544);
   public static final ete K = new ete(36, 13742497);
   public static final ete L = new ete(37, 10441252);
   public static final ete M = new ete(38, 9787244);
   public static final ete N = new ete(39, 7367818);
   public static final ete O = new ete(40, 12223780);
   public static final ete P = new ete(41, 6780213);
   public static final ete Q = new ete(42, 10505550);
   public static final ete R = new ete(43, 3746083);
   public static final ete S = new ete(44, 8874850);
   public static final ete T = new ete(45, 5725276);
   public static final ete U = new ete(46, 8014168);
   public static final ete V = new ete(47, 4996700);
   public static final ete W = new ete(48, 4993571);
   public static final ete X = new ete(49, 5001770);
   public static final ete Y = new ete(50, 9321518);
   public static final ete Z = new ete(51, 2430480);
   public static final ete aa = new ete(52, 12398641);
   public static final ete ab = new ete(53, 9715553);
   public static final ete ac = new ete(54, 6035741);
   public static final ete ad = new ete(55, 1474182);
   public static final ete ae = new ete(56, 3837580);
   public static final ete af = new ete(57, 5647422);
   public static final ete ag = new ete(58, 1356933);
   public static final ete ah = new ete(59, 6579300);
   public static final ete ai = new ete(60, 14200723);
   public static final ete aj = new ete(61, 8365974);
   public final int ak;
   public final int al;

   private ete(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ete.a $$0) {
      return this == a ? 0 : axk.b(axk.f(this.ak), $$0.f);
   }

   public static ete a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ete c(int $$0) {
      ete $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ete.a.b($$1 & 3));
   }

   public byte b(ete.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ete.a[] g = new ete.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ete.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ete.a b(int $$0) {
         return g[$$0];
      }
   }
}
