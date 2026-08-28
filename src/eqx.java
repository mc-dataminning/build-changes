import com.google.common.base.Preconditions;

public class eqx {
   private static final eqx[] am = new eqx[64];
   public static final eqx a = new eqx(0, 0);
   public static final eqx b = new eqx(1, 8368696);
   public static final eqx c = new eqx(2, 16247203);
   public static final eqx d = new eqx(3, 13092807);
   public static final eqx e = new eqx(4, 16711680);
   public static final eqx f = new eqx(5, 10526975);
   public static final eqx g = new eqx(6, 10987431);
   public static final eqx h = new eqx(7, 31744);
   public static final eqx i = new eqx(8, 16777215);
   public static final eqx j = new eqx(9, 10791096);
   public static final eqx k = new eqx(10, 9923917);
   public static final eqx l = new eqx(11, 7368816);
   public static final eqx m = new eqx(12, 4210943);
   public static final eqx n = new eqx(13, 9402184);
   public static final eqx o = new eqx(14, 16776437);
   public static final eqx p = new eqx(15, 14188339);
   public static final eqx q = new eqx(16, 11685080);
   public static final eqx r = new eqx(17, 6724056);
   public static final eqx s = new eqx(18, 15066419);
   public static final eqx t = new eqx(19, 8375321);
   public static final eqx u = new eqx(20, 15892389);
   public static final eqx v = new eqx(21, 5000268);
   public static final eqx w = new eqx(22, 10066329);
   public static final eqx x = new eqx(23, 5013401);
   public static final eqx y = new eqx(24, 8339378);
   public static final eqx z = new eqx(25, 3361970);
   public static final eqx A = new eqx(26, 6704179);
   public static final eqx B = new eqx(27, 6717235);
   public static final eqx C = new eqx(28, 10040115);
   public static final eqx D = new eqx(29, 1644825);
   public static final eqx E = new eqx(30, 16445005);
   public static final eqx F = new eqx(31, 6085589);
   public static final eqx G = new eqx(32, 4882687);
   public static final eqx H = new eqx(33, 55610);
   public static final eqx I = new eqx(34, 8476209);
   public static final eqx J = new eqx(35, 7340544);
   public static final eqx K = new eqx(36, 13742497);
   public static final eqx L = new eqx(37, 10441252);
   public static final eqx M = new eqx(38, 9787244);
   public static final eqx N = new eqx(39, 7367818);
   public static final eqx O = new eqx(40, 12223780);
   public static final eqx P = new eqx(41, 6780213);
   public static final eqx Q = new eqx(42, 10505550);
   public static final eqx R = new eqx(43, 3746083);
   public static final eqx S = new eqx(44, 8874850);
   public static final eqx T = new eqx(45, 5725276);
   public static final eqx U = new eqx(46, 8014168);
   public static final eqx V = new eqx(47, 4996700);
   public static final eqx W = new eqx(48, 4993571);
   public static final eqx X = new eqx(49, 5001770);
   public static final eqx Y = new eqx(50, 9321518);
   public static final eqx Z = new eqx(51, 2430480);
   public static final eqx aa = new eqx(52, 12398641);
   public static final eqx ab = new eqx(53, 9715553);
   public static final eqx ac = new eqx(54, 6035741);
   public static final eqx ad = new eqx(55, 1474182);
   public static final eqx ae = new eqx(56, 3837580);
   public static final eqx af = new eqx(57, 5647422);
   public static final eqx ag = new eqx(58, 1356933);
   public static final eqx ah = new eqx(59, 6579300);
   public static final eqx ai = new eqx(60, 14200723);
   public static final eqx aj = new eqx(61, 8365974);
   public final int ak;
   public final int al;

   private eqx(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eqx.a $$0) {
      return this == a ? 0 : axq.b(axq.f(this.ak), $$0.f);
   }

   public static eqx a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eqx c(int $$0) {
      eqx $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eqx.a.b($$1 & 3));
   }

   public byte b(eqx.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eqx.a[] g = new eqx.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eqx.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eqx.a b(int $$0) {
         return g[$$0];
      }
   }
}
