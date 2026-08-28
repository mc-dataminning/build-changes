import com.google.common.base.Preconditions;

public class evz {
   private static final evz[] am = new evz[64];
   public static final evz a = new evz(0, 0);
   public static final evz b = new evz(1, 8368696);
   public static final evz c = new evz(2, 16247203);
   public static final evz d = new evz(3, 13092807);
   public static final evz e = new evz(4, 16711680);
   public static final evz f = new evz(5, 10526975);
   public static final evz g = new evz(6, 10987431);
   public static final evz h = new evz(7, 31744);
   public static final evz i = new evz(8, 16777215);
   public static final evz j = new evz(9, 10791096);
   public static final evz k = new evz(10, 9923917);
   public static final evz l = new evz(11, 7368816);
   public static final evz m = new evz(12, 4210943);
   public static final evz n = new evz(13, 9402184);
   public static final evz o = new evz(14, 16776437);
   public static final evz p = new evz(15, 14188339);
   public static final evz q = new evz(16, 11685080);
   public static final evz r = new evz(17, 6724056);
   public static final evz s = new evz(18, 15066419);
   public static final evz t = new evz(19, 8375321);
   public static final evz u = new evz(20, 15892389);
   public static final evz v = new evz(21, 5000268);
   public static final evz w = new evz(22, 10066329);
   public static final evz x = new evz(23, 5013401);
   public static final evz y = new evz(24, 8339378);
   public static final evz z = new evz(25, 3361970);
   public static final evz A = new evz(26, 6704179);
   public static final evz B = new evz(27, 6717235);
   public static final evz C = new evz(28, 10040115);
   public static final evz D = new evz(29, 1644825);
   public static final evz E = new evz(30, 16445005);
   public static final evz F = new evz(31, 6085589);
   public static final evz G = new evz(32, 4882687);
   public static final evz H = new evz(33, 55610);
   public static final evz I = new evz(34, 8476209);
   public static final evz J = new evz(35, 7340544);
   public static final evz K = new evz(36, 13742497);
   public static final evz L = new evz(37, 10441252);
   public static final evz M = new evz(38, 9787244);
   public static final evz N = new evz(39, 7367818);
   public static final evz O = new evz(40, 12223780);
   public static final evz P = new evz(41, 6780213);
   public static final evz Q = new evz(42, 10505550);
   public static final evz R = new evz(43, 3746083);
   public static final evz S = new evz(44, 8874850);
   public static final evz T = new evz(45, 5725276);
   public static final evz U = new evz(46, 8014168);
   public static final evz V = new evz(47, 4996700);
   public static final evz W = new evz(48, 4993571);
   public static final evz X = new evz(49, 5001770);
   public static final evz Y = new evz(50, 9321518);
   public static final evz Z = new evz(51, 2430480);
   public static final evz aa = new evz(52, 12398641);
   public static final evz ab = new evz(53, 9715553);
   public static final evz ac = new evz(54, 6035741);
   public static final evz ad = new evz(55, 1474182);
   public static final evz ae = new evz(56, 3837580);
   public static final evz af = new evz(57, 5647422);
   public static final evz ag = new evz(58, 1356933);
   public static final evz ah = new evz(59, 6579300);
   public static final evz ai = new evz(60, 14200723);
   public static final evz aj = new evz(61, 8365974);
   public final int ak;
   public final int al;

   private evz(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(evz.a $$0) {
      return this == a ? 0 : axu.b(axu.f(this.ak), $$0.f);
   }

   public static evz a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static evz c(int $$0) {
      evz $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(evz.a.b($$1 & 3));
   }

   public byte b(evz.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final evz.a[] g = new evz.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static evz.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static evz.a b(int $$0) {
         return g[$$0];
      }
   }
}
