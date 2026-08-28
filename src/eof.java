import com.google.common.base.Preconditions;

public class eof {
   private static final eof[] am = new eof[64];
   public static final eof a = new eof(0, 0);
   public static final eof b = new eof(1, 8368696);
   public static final eof c = new eof(2, 16247203);
   public static final eof d = new eof(3, 13092807);
   public static final eof e = new eof(4, 16711680);
   public static final eof f = new eof(5, 10526975);
   public static final eof g = new eof(6, 10987431);
   public static final eof h = new eof(7, 31744);
   public static final eof i = new eof(8, 16777215);
   public static final eof j = new eof(9, 10791096);
   public static final eof k = new eof(10, 9923917);
   public static final eof l = new eof(11, 7368816);
   public static final eof m = new eof(12, 4210943);
   public static final eof n = new eof(13, 9402184);
   public static final eof o = new eof(14, 16776437);
   public static final eof p = new eof(15, 14188339);
   public static final eof q = new eof(16, 11685080);
   public static final eof r = new eof(17, 6724056);
   public static final eof s = new eof(18, 15066419);
   public static final eof t = new eof(19, 8375321);
   public static final eof u = new eof(20, 15892389);
   public static final eof v = new eof(21, 5000268);
   public static final eof w = new eof(22, 10066329);
   public static final eof x = new eof(23, 5013401);
   public static final eof y = new eof(24, 8339378);
   public static final eof z = new eof(25, 3361970);
   public static final eof A = new eof(26, 6704179);
   public static final eof B = new eof(27, 6717235);
   public static final eof C = new eof(28, 10040115);
   public static final eof D = new eof(29, 1644825);
   public static final eof E = new eof(30, 16445005);
   public static final eof F = new eof(31, 6085589);
   public static final eof G = new eof(32, 4882687);
   public static final eof H = new eof(33, 55610);
   public static final eof I = new eof(34, 8476209);
   public static final eof J = new eof(35, 7340544);
   public static final eof K = new eof(36, 13742497);
   public static final eof L = new eof(37, 10441252);
   public static final eof M = new eof(38, 9787244);
   public static final eof N = new eof(39, 7367818);
   public static final eof O = new eof(40, 12223780);
   public static final eof P = new eof(41, 6780213);
   public static final eof Q = new eof(42, 10505550);
   public static final eof R = new eof(43, 3746083);
   public static final eof S = new eof(44, 8874850);
   public static final eof T = new eof(45, 5725276);
   public static final eof U = new eof(46, 8014168);
   public static final eof V = new eof(47, 4996700);
   public static final eof W = new eof(48, 4993571);
   public static final eof X = new eof(49, 5001770);
   public static final eof Y = new eof(50, 9321518);
   public static final eof Z = new eof(51, 2430480);
   public static final eof aa = new eof(52, 12398641);
   public static final eof ab = new eof(53, 9715553);
   public static final eof ac = new eof(54, 6035741);
   public static final eof ad = new eof(55, 1474182);
   public static final eof ae = new eof(56, 3837580);
   public static final eof af = new eof(57, 5647422);
   public static final eof ag = new eof(58, 1356933);
   public static final eof ah = new eof(59, 6579300);
   public static final eof ai = new eof(60, 14200723);
   public static final eof aj = new eof(61, 8365974);
   public final int ak;
   public final int al;

   private eof(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eof.a $$0) {
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

   public static eof a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eof c(int $$0) {
      eof $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eof.a.b($$1 & 3));
   }

   public byte b(eof.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eof.a[] g = new eof.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eof.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eof.a b(int $$0) {
         return g[$$0];
      }
   }
}
