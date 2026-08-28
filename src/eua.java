import com.google.common.base.Preconditions;

public class eua {
   private static final eua[] am = new eua[64];
   public static final eua a = new eua(0, 0);
   public static final eua b = new eua(1, 8368696);
   public static final eua c = new eua(2, 16247203);
   public static final eua d = new eua(3, 13092807);
   public static final eua e = new eua(4, 16711680);
   public static final eua f = new eua(5, 10526975);
   public static final eua g = new eua(6, 10987431);
   public static final eua h = new eua(7, 31744);
   public static final eua i = new eua(8, 16777215);
   public static final eua j = new eua(9, 10791096);
   public static final eua k = new eua(10, 9923917);
   public static final eua l = new eua(11, 7368816);
   public static final eua m = new eua(12, 4210943);
   public static final eua n = new eua(13, 9402184);
   public static final eua o = new eua(14, 16776437);
   public static final eua p = new eua(15, 14188339);
   public static final eua q = new eua(16, 11685080);
   public static final eua r = new eua(17, 6724056);
   public static final eua s = new eua(18, 15066419);
   public static final eua t = new eua(19, 8375321);
   public static final eua u = new eua(20, 15892389);
   public static final eua v = new eua(21, 5000268);
   public static final eua w = new eua(22, 10066329);
   public static final eua x = new eua(23, 5013401);
   public static final eua y = new eua(24, 8339378);
   public static final eua z = new eua(25, 3361970);
   public static final eua A = new eua(26, 6704179);
   public static final eua B = new eua(27, 6717235);
   public static final eua C = new eua(28, 10040115);
   public static final eua D = new eua(29, 1644825);
   public static final eua E = new eua(30, 16445005);
   public static final eua F = new eua(31, 6085589);
   public static final eua G = new eua(32, 4882687);
   public static final eua H = new eua(33, 55610);
   public static final eua I = new eua(34, 8476209);
   public static final eua J = new eua(35, 7340544);
   public static final eua K = new eua(36, 13742497);
   public static final eua L = new eua(37, 10441252);
   public static final eua M = new eua(38, 9787244);
   public static final eua N = new eua(39, 7367818);
   public static final eua O = new eua(40, 12223780);
   public static final eua P = new eua(41, 6780213);
   public static final eua Q = new eua(42, 10505550);
   public static final eua R = new eua(43, 3746083);
   public static final eua S = new eua(44, 8874850);
   public static final eua T = new eua(45, 5725276);
   public static final eua U = new eua(46, 8014168);
   public static final eua V = new eua(47, 4996700);
   public static final eua W = new eua(48, 4993571);
   public static final eua X = new eua(49, 5001770);
   public static final eua Y = new eua(50, 9321518);
   public static final eua Z = new eua(51, 2430480);
   public static final eua aa = new eua(52, 12398641);
   public static final eua ab = new eua(53, 9715553);
   public static final eua ac = new eua(54, 6035741);
   public static final eua ad = new eua(55, 1474182);
   public static final eua ae = new eua(56, 3837580);
   public static final eua af = new eua(57, 5647422);
   public static final eua ag = new eua(58, 1356933);
   public static final eua ah = new eua(59, 6579300);
   public static final eua ai = new eua(60, 14200723);
   public static final eua aj = new eua(61, 8365974);
   public final int ak;
   public final int al;

   private eua(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eua.a $$0) {
      return this == a ? 0 : axk.b(axk.f(this.ak), $$0.f);
   }

   public static eua a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eua c(int $$0) {
      eua $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eua.a.b($$1 & 3));
   }

   public byte b(eua.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eua.a[] g = new eua.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eua.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eua.a b(int $$0) {
         return g[$$0];
      }
   }
}
