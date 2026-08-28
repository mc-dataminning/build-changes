import com.google.common.base.Preconditions;

public class ero {
   private static final ero[] am = new ero[64];
   public static final ero a = new ero(0, 0);
   public static final ero b = new ero(1, 8368696);
   public static final ero c = new ero(2, 16247203);
   public static final ero d = new ero(3, 13092807);
   public static final ero e = new ero(4, 16711680);
   public static final ero f = new ero(5, 10526975);
   public static final ero g = new ero(6, 10987431);
   public static final ero h = new ero(7, 31744);
   public static final ero i = new ero(8, 16777215);
   public static final ero j = new ero(9, 10791096);
   public static final ero k = new ero(10, 9923917);
   public static final ero l = new ero(11, 7368816);
   public static final ero m = new ero(12, 4210943);
   public static final ero n = new ero(13, 9402184);
   public static final ero o = new ero(14, 16776437);
   public static final ero p = new ero(15, 14188339);
   public static final ero q = new ero(16, 11685080);
   public static final ero r = new ero(17, 6724056);
   public static final ero s = new ero(18, 15066419);
   public static final ero t = new ero(19, 8375321);
   public static final ero u = new ero(20, 15892389);
   public static final ero v = new ero(21, 5000268);
   public static final ero w = new ero(22, 10066329);
   public static final ero x = new ero(23, 5013401);
   public static final ero y = new ero(24, 8339378);
   public static final ero z = new ero(25, 3361970);
   public static final ero A = new ero(26, 6704179);
   public static final ero B = new ero(27, 6717235);
   public static final ero C = new ero(28, 10040115);
   public static final ero D = new ero(29, 1644825);
   public static final ero E = new ero(30, 16445005);
   public static final ero F = new ero(31, 6085589);
   public static final ero G = new ero(32, 4882687);
   public static final ero H = new ero(33, 55610);
   public static final ero I = new ero(34, 8476209);
   public static final ero J = new ero(35, 7340544);
   public static final ero K = new ero(36, 13742497);
   public static final ero L = new ero(37, 10441252);
   public static final ero M = new ero(38, 9787244);
   public static final ero N = new ero(39, 7367818);
   public static final ero O = new ero(40, 12223780);
   public static final ero P = new ero(41, 6780213);
   public static final ero Q = new ero(42, 10505550);
   public static final ero R = new ero(43, 3746083);
   public static final ero S = new ero(44, 8874850);
   public static final ero T = new ero(45, 5725276);
   public static final ero U = new ero(46, 8014168);
   public static final ero V = new ero(47, 4996700);
   public static final ero W = new ero(48, 4993571);
   public static final ero X = new ero(49, 5001770);
   public static final ero Y = new ero(50, 9321518);
   public static final ero Z = new ero(51, 2430480);
   public static final ero aa = new ero(52, 12398641);
   public static final ero ab = new ero(53, 9715553);
   public static final ero ac = new ero(54, 6035741);
   public static final ero ad = new ero(55, 1474182);
   public static final ero ae = new ero(56, 3837580);
   public static final ero af = new ero(57, 5647422);
   public static final ero ag = new ero(58, 1356933);
   public static final ero ah = new ero(59, 6579300);
   public static final ero ai = new ero(60, 14200723);
   public static final ero aj = new ero(61, 8365974);
   public final int ak;
   public final int al;

   private ero(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ero.a $$0) {
      return this == a ? 0 : axv.b(axv.f(this.ak), $$0.f);
   }

   public static ero a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ero c(int $$0) {
      ero $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ero.a.b($$1 & 3));
   }

   public byte b(ero.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ero.a[] g = new ero.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ero.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ero.a b(int $$0) {
         return g[$$0];
      }
   }
}
