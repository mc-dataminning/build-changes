import com.google.common.base.Preconditions;

public class eqt {
   private static final eqt[] am = new eqt[64];
   public static final eqt a = new eqt(0, 0);
   public static final eqt b = new eqt(1, 8368696);
   public static final eqt c = new eqt(2, 16247203);
   public static final eqt d = new eqt(3, 13092807);
   public static final eqt e = new eqt(4, 16711680);
   public static final eqt f = new eqt(5, 10526975);
   public static final eqt g = new eqt(6, 10987431);
   public static final eqt h = new eqt(7, 31744);
   public static final eqt i = new eqt(8, 16777215);
   public static final eqt j = new eqt(9, 10791096);
   public static final eqt k = new eqt(10, 9923917);
   public static final eqt l = new eqt(11, 7368816);
   public static final eqt m = new eqt(12, 4210943);
   public static final eqt n = new eqt(13, 9402184);
   public static final eqt o = new eqt(14, 16776437);
   public static final eqt p = new eqt(15, 14188339);
   public static final eqt q = new eqt(16, 11685080);
   public static final eqt r = new eqt(17, 6724056);
   public static final eqt s = new eqt(18, 15066419);
   public static final eqt t = new eqt(19, 8375321);
   public static final eqt u = new eqt(20, 15892389);
   public static final eqt v = new eqt(21, 5000268);
   public static final eqt w = new eqt(22, 10066329);
   public static final eqt x = new eqt(23, 5013401);
   public static final eqt y = new eqt(24, 8339378);
   public static final eqt z = new eqt(25, 3361970);
   public static final eqt A = new eqt(26, 6704179);
   public static final eqt B = new eqt(27, 6717235);
   public static final eqt C = new eqt(28, 10040115);
   public static final eqt D = new eqt(29, 1644825);
   public static final eqt E = new eqt(30, 16445005);
   public static final eqt F = new eqt(31, 6085589);
   public static final eqt G = new eqt(32, 4882687);
   public static final eqt H = new eqt(33, 55610);
   public static final eqt I = new eqt(34, 8476209);
   public static final eqt J = new eqt(35, 7340544);
   public static final eqt K = new eqt(36, 13742497);
   public static final eqt L = new eqt(37, 10441252);
   public static final eqt M = new eqt(38, 9787244);
   public static final eqt N = new eqt(39, 7367818);
   public static final eqt O = new eqt(40, 12223780);
   public static final eqt P = new eqt(41, 6780213);
   public static final eqt Q = new eqt(42, 10505550);
   public static final eqt R = new eqt(43, 3746083);
   public static final eqt S = new eqt(44, 8874850);
   public static final eqt T = new eqt(45, 5725276);
   public static final eqt U = new eqt(46, 8014168);
   public static final eqt V = new eqt(47, 4996700);
   public static final eqt W = new eqt(48, 4993571);
   public static final eqt X = new eqt(49, 5001770);
   public static final eqt Y = new eqt(50, 9321518);
   public static final eqt Z = new eqt(51, 2430480);
   public static final eqt aa = new eqt(52, 12398641);
   public static final eqt ab = new eqt(53, 9715553);
   public static final eqt ac = new eqt(54, 6035741);
   public static final eqt ad = new eqt(55, 1474182);
   public static final eqt ae = new eqt(56, 3837580);
   public static final eqt af = new eqt(57, 5647422);
   public static final eqt ag = new eqt(58, 1356933);
   public static final eqt ah = new eqt(59, 6579300);
   public static final eqt ai = new eqt(60, 14200723);
   public static final eqt aj = new eqt(61, 8365974);
   public final int ak;
   public final int al;

   private eqt(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eqt.a $$0) {
      return this == a ? 0 : axo.b(axo.f(this.ak), $$0.f);
   }

   public static eqt a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eqt c(int $$0) {
      eqt $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eqt.a.b($$1 & 3));
   }

   public byte b(eqt.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eqt.a[] g = new eqt.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eqt.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eqt.a b(int $$0) {
         return g[$$0];
      }
   }
}
