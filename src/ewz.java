import com.google.common.base.Preconditions;

public class ewz {
   private static final ewz[] am = new ewz[64];
   public static final ewz a = new ewz(0, 0);
   public static final ewz b = new ewz(1, 8368696);
   public static final ewz c = new ewz(2, 16247203);
   public static final ewz d = new ewz(3, 13092807);
   public static final ewz e = new ewz(4, 16711680);
   public static final ewz f = new ewz(5, 10526975);
   public static final ewz g = new ewz(6, 10987431);
   public static final ewz h = new ewz(7, 31744);
   public static final ewz i = new ewz(8, 16777215);
   public static final ewz j = new ewz(9, 10791096);
   public static final ewz k = new ewz(10, 9923917);
   public static final ewz l = new ewz(11, 7368816);
   public static final ewz m = new ewz(12, 4210943);
   public static final ewz n = new ewz(13, 9402184);
   public static final ewz o = new ewz(14, 16776437);
   public static final ewz p = new ewz(15, 14188339);
   public static final ewz q = new ewz(16, 11685080);
   public static final ewz r = new ewz(17, 6724056);
   public static final ewz s = new ewz(18, 15066419);
   public static final ewz t = new ewz(19, 8375321);
   public static final ewz u = new ewz(20, 15892389);
   public static final ewz v = new ewz(21, 5000268);
   public static final ewz w = new ewz(22, 10066329);
   public static final ewz x = new ewz(23, 5013401);
   public static final ewz y = new ewz(24, 8339378);
   public static final ewz z = new ewz(25, 3361970);
   public static final ewz A = new ewz(26, 6704179);
   public static final ewz B = new ewz(27, 6717235);
   public static final ewz C = new ewz(28, 10040115);
   public static final ewz D = new ewz(29, 1644825);
   public static final ewz E = new ewz(30, 16445005);
   public static final ewz F = new ewz(31, 6085589);
   public static final ewz G = new ewz(32, 4882687);
   public static final ewz H = new ewz(33, 55610);
   public static final ewz I = new ewz(34, 8476209);
   public static final ewz J = new ewz(35, 7340544);
   public static final ewz K = new ewz(36, 13742497);
   public static final ewz L = new ewz(37, 10441252);
   public static final ewz M = new ewz(38, 9787244);
   public static final ewz N = new ewz(39, 7367818);
   public static final ewz O = new ewz(40, 12223780);
   public static final ewz P = new ewz(41, 6780213);
   public static final ewz Q = new ewz(42, 10505550);
   public static final ewz R = new ewz(43, 3746083);
   public static final ewz S = new ewz(44, 8874850);
   public static final ewz T = new ewz(45, 5725276);
   public static final ewz U = new ewz(46, 8014168);
   public static final ewz V = new ewz(47, 4996700);
   public static final ewz W = new ewz(48, 4993571);
   public static final ewz X = new ewz(49, 5001770);
   public static final ewz Y = new ewz(50, 9321518);
   public static final ewz Z = new ewz(51, 2430480);
   public static final ewz aa = new ewz(52, 12398641);
   public static final ewz ab = new ewz(53, 9715553);
   public static final ewz ac = new ewz(54, 6035741);
   public static final ewz ad = new ewz(55, 1474182);
   public static final ewz ae = new ewz(56, 3837580);
   public static final ewz af = new ewz(57, 5647422);
   public static final ewz ag = new ewz(58, 1356933);
   public static final ewz ah = new ewz(59, 6579300);
   public static final ewz ai = new ewz(60, 14200723);
   public static final ewz aj = new ewz(61, 8365974);
   public final int ak;
   public final int al;

   private ewz(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ewz.a $$0) {
      return this == a ? 0 : axw.b(axw.f(this.ak), $$0.f);
   }

   public static ewz a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ewz c(int $$0) {
      ewz $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ewz.a.b($$1 & 3));
   }

   public byte b(ewz.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ewz.a[] g = new ewz.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ewz.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ewz.a b(int $$0) {
         return g[$$0];
      }
   }
}
