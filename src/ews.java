import com.google.common.base.Preconditions;

public class ews {
   private static final ews[] am = new ews[64];
   public static final ews a = new ews(0, 0);
   public static final ews b = new ews(1, 8368696);
   public static final ews c = new ews(2, 16247203);
   public static final ews d = new ews(3, 13092807);
   public static final ews e = new ews(4, 16711680);
   public static final ews f = new ews(5, 10526975);
   public static final ews g = new ews(6, 10987431);
   public static final ews h = new ews(7, 31744);
   public static final ews i = new ews(8, 16777215);
   public static final ews j = new ews(9, 10791096);
   public static final ews k = new ews(10, 9923917);
   public static final ews l = new ews(11, 7368816);
   public static final ews m = new ews(12, 4210943);
   public static final ews n = new ews(13, 9402184);
   public static final ews o = new ews(14, 16776437);
   public static final ews p = new ews(15, 14188339);
   public static final ews q = new ews(16, 11685080);
   public static final ews r = new ews(17, 6724056);
   public static final ews s = new ews(18, 15066419);
   public static final ews t = new ews(19, 8375321);
   public static final ews u = new ews(20, 15892389);
   public static final ews v = new ews(21, 5000268);
   public static final ews w = new ews(22, 10066329);
   public static final ews x = new ews(23, 5013401);
   public static final ews y = new ews(24, 8339378);
   public static final ews z = new ews(25, 3361970);
   public static final ews A = new ews(26, 6704179);
   public static final ews B = new ews(27, 6717235);
   public static final ews C = new ews(28, 10040115);
   public static final ews D = new ews(29, 1644825);
   public static final ews E = new ews(30, 16445005);
   public static final ews F = new ews(31, 6085589);
   public static final ews G = new ews(32, 4882687);
   public static final ews H = new ews(33, 55610);
   public static final ews I = new ews(34, 8476209);
   public static final ews J = new ews(35, 7340544);
   public static final ews K = new ews(36, 13742497);
   public static final ews L = new ews(37, 10441252);
   public static final ews M = new ews(38, 9787244);
   public static final ews N = new ews(39, 7367818);
   public static final ews O = new ews(40, 12223780);
   public static final ews P = new ews(41, 6780213);
   public static final ews Q = new ews(42, 10505550);
   public static final ews R = new ews(43, 3746083);
   public static final ews S = new ews(44, 8874850);
   public static final ews T = new ews(45, 5725276);
   public static final ews U = new ews(46, 8014168);
   public static final ews V = new ews(47, 4996700);
   public static final ews W = new ews(48, 4993571);
   public static final ews X = new ews(49, 5001770);
   public static final ews Y = new ews(50, 9321518);
   public static final ews Z = new ews(51, 2430480);
   public static final ews aa = new ews(52, 12398641);
   public static final ews ab = new ews(53, 9715553);
   public static final ews ac = new ews(54, 6035741);
   public static final ews ad = new ews(55, 1474182);
   public static final ews ae = new ews(56, 3837580);
   public static final ews af = new ews(57, 5647422);
   public static final ews ag = new ews(58, 1356933);
   public static final ews ah = new ews(59, 6579300);
   public static final ews ai = new ews(60, 14200723);
   public static final ews aj = new ews(61, 8365974);
   public final int ak;
   public final int al;

   private ews(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ews.a $$0) {
      return this == a ? 0 : axw.b(axw.f(this.ak), $$0.f);
   }

   public static ews a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ews c(int $$0) {
      ews $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ews.a.b($$1 & 3));
   }

   public byte b(ews.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ews.a[] g = new ews.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ews.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ews.a b(int $$0) {
         return g[$$0];
      }
   }
}
