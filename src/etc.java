import com.google.common.base.Preconditions;

public class etc {
   private static final etc[] am = new etc[64];
   public static final etc a = new etc(0, 0);
   public static final etc b = new etc(1, 8368696);
   public static final etc c = new etc(2, 16247203);
   public static final etc d = new etc(3, 13092807);
   public static final etc e = new etc(4, 16711680);
   public static final etc f = new etc(5, 10526975);
   public static final etc g = new etc(6, 10987431);
   public static final etc h = new etc(7, 31744);
   public static final etc i = new etc(8, 16777215);
   public static final etc j = new etc(9, 10791096);
   public static final etc k = new etc(10, 9923917);
   public static final etc l = new etc(11, 7368816);
   public static final etc m = new etc(12, 4210943);
   public static final etc n = new etc(13, 9402184);
   public static final etc o = new etc(14, 16776437);
   public static final etc p = new etc(15, 14188339);
   public static final etc q = new etc(16, 11685080);
   public static final etc r = new etc(17, 6724056);
   public static final etc s = new etc(18, 15066419);
   public static final etc t = new etc(19, 8375321);
   public static final etc u = new etc(20, 15892389);
   public static final etc v = new etc(21, 5000268);
   public static final etc w = new etc(22, 10066329);
   public static final etc x = new etc(23, 5013401);
   public static final etc y = new etc(24, 8339378);
   public static final etc z = new etc(25, 3361970);
   public static final etc A = new etc(26, 6704179);
   public static final etc B = new etc(27, 6717235);
   public static final etc C = new etc(28, 10040115);
   public static final etc D = new etc(29, 1644825);
   public static final etc E = new etc(30, 16445005);
   public static final etc F = new etc(31, 6085589);
   public static final etc G = new etc(32, 4882687);
   public static final etc H = new etc(33, 55610);
   public static final etc I = new etc(34, 8476209);
   public static final etc J = new etc(35, 7340544);
   public static final etc K = new etc(36, 13742497);
   public static final etc L = new etc(37, 10441252);
   public static final etc M = new etc(38, 9787244);
   public static final etc N = new etc(39, 7367818);
   public static final etc O = new etc(40, 12223780);
   public static final etc P = new etc(41, 6780213);
   public static final etc Q = new etc(42, 10505550);
   public static final etc R = new etc(43, 3746083);
   public static final etc S = new etc(44, 8874850);
   public static final etc T = new etc(45, 5725276);
   public static final etc U = new etc(46, 8014168);
   public static final etc V = new etc(47, 4996700);
   public static final etc W = new etc(48, 4993571);
   public static final etc X = new etc(49, 5001770);
   public static final etc Y = new etc(50, 9321518);
   public static final etc Z = new etc(51, 2430480);
   public static final etc aa = new etc(52, 12398641);
   public static final etc ab = new etc(53, 9715553);
   public static final etc ac = new etc(54, 6035741);
   public static final etc ad = new etc(55, 1474182);
   public static final etc ae = new etc(56, 3837580);
   public static final etc af = new etc(57, 5647422);
   public static final etc ag = new etc(58, 1356933);
   public static final etc ah = new etc(59, 6579300);
   public static final etc ai = new etc(60, 14200723);
   public static final etc aj = new etc(61, 8365974);
   public final int ak;
   public final int al;

   private etc(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(etc.a $$0) {
      return this == a ? 0 : axk.b(axk.f(this.ak), $$0.f);
   }

   public static etc a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static etc c(int $$0) {
      etc $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(etc.a.b($$1 & 3));
   }

   public byte b(etc.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final etc.a[] g = new etc.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static etc.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static etc.a b(int $$0) {
         return g[$$0];
      }
   }
}
