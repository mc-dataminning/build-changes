import com.google.common.base.Preconditions;

public class erz {
   private static final erz[] am = new erz[64];
   public static final erz a = new erz(0, 0);
   public static final erz b = new erz(1, 8368696);
   public static final erz c = new erz(2, 16247203);
   public static final erz d = new erz(3, 13092807);
   public static final erz e = new erz(4, 16711680);
   public static final erz f = new erz(5, 10526975);
   public static final erz g = new erz(6, 10987431);
   public static final erz h = new erz(7, 31744);
   public static final erz i = new erz(8, 16777215);
   public static final erz j = new erz(9, 10791096);
   public static final erz k = new erz(10, 9923917);
   public static final erz l = new erz(11, 7368816);
   public static final erz m = new erz(12, 4210943);
   public static final erz n = new erz(13, 9402184);
   public static final erz o = new erz(14, 16776437);
   public static final erz p = new erz(15, 14188339);
   public static final erz q = new erz(16, 11685080);
   public static final erz r = new erz(17, 6724056);
   public static final erz s = new erz(18, 15066419);
   public static final erz t = new erz(19, 8375321);
   public static final erz u = new erz(20, 15892389);
   public static final erz v = new erz(21, 5000268);
   public static final erz w = new erz(22, 10066329);
   public static final erz x = new erz(23, 5013401);
   public static final erz y = new erz(24, 8339378);
   public static final erz z = new erz(25, 3361970);
   public static final erz A = new erz(26, 6704179);
   public static final erz B = new erz(27, 6717235);
   public static final erz C = new erz(28, 10040115);
   public static final erz D = new erz(29, 1644825);
   public static final erz E = new erz(30, 16445005);
   public static final erz F = new erz(31, 6085589);
   public static final erz G = new erz(32, 4882687);
   public static final erz H = new erz(33, 55610);
   public static final erz I = new erz(34, 8476209);
   public static final erz J = new erz(35, 7340544);
   public static final erz K = new erz(36, 13742497);
   public static final erz L = new erz(37, 10441252);
   public static final erz M = new erz(38, 9787244);
   public static final erz N = new erz(39, 7367818);
   public static final erz O = new erz(40, 12223780);
   public static final erz P = new erz(41, 6780213);
   public static final erz Q = new erz(42, 10505550);
   public static final erz R = new erz(43, 3746083);
   public static final erz S = new erz(44, 8874850);
   public static final erz T = new erz(45, 5725276);
   public static final erz U = new erz(46, 8014168);
   public static final erz V = new erz(47, 4996700);
   public static final erz W = new erz(48, 4993571);
   public static final erz X = new erz(49, 5001770);
   public static final erz Y = new erz(50, 9321518);
   public static final erz Z = new erz(51, 2430480);
   public static final erz aa = new erz(52, 12398641);
   public static final erz ab = new erz(53, 9715553);
   public static final erz ac = new erz(54, 6035741);
   public static final erz ad = new erz(55, 1474182);
   public static final erz ae = new erz(56, 3837580);
   public static final erz af = new erz(57, 5647422);
   public static final erz ag = new erz(58, 1356933);
   public static final erz ah = new erz(59, 6579300);
   public static final erz ai = new erz(60, 14200723);
   public static final erz aj = new erz(61, 8365974);
   public final int ak;
   public final int al;

   private erz(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(erz.a $$0) {
      return this == a ? 0 : axx.b(axx.f(this.ak), $$0.f);
   }

   public static erz a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static erz c(int $$0) {
      erz $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(erz.a.b($$1 & 3));
   }

   public byte b(erz.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final erz.a[] g = new erz.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static erz.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static erz.a b(int $$0) {
         return g[$$0];
      }
   }
}
