import com.google.common.base.Preconditions;

public class eny {
   private static final eny[] am = new eny[64];
   public static final eny a = new eny(0, 0);
   public static final eny b = new eny(1, 8368696);
   public static final eny c = new eny(2, 16247203);
   public static final eny d = new eny(3, 13092807);
   public static final eny e = new eny(4, 16711680);
   public static final eny f = new eny(5, 10526975);
   public static final eny g = new eny(6, 10987431);
   public static final eny h = new eny(7, 31744);
   public static final eny i = new eny(8, 16777215);
   public static final eny j = new eny(9, 10791096);
   public static final eny k = new eny(10, 9923917);
   public static final eny l = new eny(11, 7368816);
   public static final eny m = new eny(12, 4210943);
   public static final eny n = new eny(13, 9402184);
   public static final eny o = new eny(14, 16776437);
   public static final eny p = new eny(15, 14188339);
   public static final eny q = new eny(16, 11685080);
   public static final eny r = new eny(17, 6724056);
   public static final eny s = new eny(18, 15066419);
   public static final eny t = new eny(19, 8375321);
   public static final eny u = new eny(20, 15892389);
   public static final eny v = new eny(21, 5000268);
   public static final eny w = new eny(22, 10066329);
   public static final eny x = new eny(23, 5013401);
   public static final eny y = new eny(24, 8339378);
   public static final eny z = new eny(25, 3361970);
   public static final eny A = new eny(26, 6704179);
   public static final eny B = new eny(27, 6717235);
   public static final eny C = new eny(28, 10040115);
   public static final eny D = new eny(29, 1644825);
   public static final eny E = new eny(30, 16445005);
   public static final eny F = new eny(31, 6085589);
   public static final eny G = new eny(32, 4882687);
   public static final eny H = new eny(33, 55610);
   public static final eny I = new eny(34, 8476209);
   public static final eny J = new eny(35, 7340544);
   public static final eny K = new eny(36, 13742497);
   public static final eny L = new eny(37, 10441252);
   public static final eny M = new eny(38, 9787244);
   public static final eny N = new eny(39, 7367818);
   public static final eny O = new eny(40, 12223780);
   public static final eny P = new eny(41, 6780213);
   public static final eny Q = new eny(42, 10505550);
   public static final eny R = new eny(43, 3746083);
   public static final eny S = new eny(44, 8874850);
   public static final eny T = new eny(45, 5725276);
   public static final eny U = new eny(46, 8014168);
   public static final eny V = new eny(47, 4996700);
   public static final eny W = new eny(48, 4993571);
   public static final eny X = new eny(49, 5001770);
   public static final eny Y = new eny(50, 9321518);
   public static final eny Z = new eny(51, 2430480);
   public static final eny aa = new eny(52, 12398641);
   public static final eny ab = new eny(53, 9715553);
   public static final eny ac = new eny(54, 6035741);
   public static final eny ad = new eny(55, 1474182);
   public static final eny ae = new eny(56, 3837580);
   public static final eny af = new eny(57, 5647422);
   public static final eny ag = new eny(58, 1356933);
   public static final eny ah = new eny(59, 6579300);
   public static final eny ai = new eny(60, 14200723);
   public static final eny aj = new eny(61, 8365974);
   public final int ak;
   public final int al;

   private eny(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eny.a $$0) {
      if (this == a) {
         return 0;
      } else {
         int $$1 = $$0.f;
         int $$2 = (this.ak >> 16 & 0xFF) * $$1 / 255;
         int $$3 = (this.ak >> 8 & 0xFF) * $$1 / 255;
         int $$4 = (this.ak & 0xFF) * $$1 / 255;
         return 0xFF000000 | $$4 << 16 | $$3 << 8 | $$2;
      }
   }

   public static eny a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eny c(int $$0) {
      eny $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eny.a.b($$1 & 3));
   }

   public byte b(eny.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eny.a[] g = new eny.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eny.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eny.a b(int $$0) {
         return g[$$0];
      }
   }
}
