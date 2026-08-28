import com.google.common.base.Preconditions;

public class etu {
   private static final etu[] am = new etu[64];
   public static final etu a = new etu(0, 0);
   public static final etu b = new etu(1, 8368696);
   public static final etu c = new etu(2, 16247203);
   public static final etu d = new etu(3, 13092807);
   public static final etu e = new etu(4, 16711680);
   public static final etu f = new etu(5, 10526975);
   public static final etu g = new etu(6, 10987431);
   public static final etu h = new etu(7, 31744);
   public static final etu i = new etu(8, 16777215);
   public static final etu j = new etu(9, 10791096);
   public static final etu k = new etu(10, 9923917);
   public static final etu l = new etu(11, 7368816);
   public static final etu m = new etu(12, 4210943);
   public static final etu n = new etu(13, 9402184);
   public static final etu o = new etu(14, 16776437);
   public static final etu p = new etu(15, 14188339);
   public static final etu q = new etu(16, 11685080);
   public static final etu r = new etu(17, 6724056);
   public static final etu s = new etu(18, 15066419);
   public static final etu t = new etu(19, 8375321);
   public static final etu u = new etu(20, 15892389);
   public static final etu v = new etu(21, 5000268);
   public static final etu w = new etu(22, 10066329);
   public static final etu x = new etu(23, 5013401);
   public static final etu y = new etu(24, 8339378);
   public static final etu z = new etu(25, 3361970);
   public static final etu A = new etu(26, 6704179);
   public static final etu B = new etu(27, 6717235);
   public static final etu C = new etu(28, 10040115);
   public static final etu D = new etu(29, 1644825);
   public static final etu E = new etu(30, 16445005);
   public static final etu F = new etu(31, 6085589);
   public static final etu G = new etu(32, 4882687);
   public static final etu H = new etu(33, 55610);
   public static final etu I = new etu(34, 8476209);
   public static final etu J = new etu(35, 7340544);
   public static final etu K = new etu(36, 13742497);
   public static final etu L = new etu(37, 10441252);
   public static final etu M = new etu(38, 9787244);
   public static final etu N = new etu(39, 7367818);
   public static final etu O = new etu(40, 12223780);
   public static final etu P = new etu(41, 6780213);
   public static final etu Q = new etu(42, 10505550);
   public static final etu R = new etu(43, 3746083);
   public static final etu S = new etu(44, 8874850);
   public static final etu T = new etu(45, 5725276);
   public static final etu U = new etu(46, 8014168);
   public static final etu V = new etu(47, 4996700);
   public static final etu W = new etu(48, 4993571);
   public static final etu X = new etu(49, 5001770);
   public static final etu Y = new etu(50, 9321518);
   public static final etu Z = new etu(51, 2430480);
   public static final etu aa = new etu(52, 12398641);
   public static final etu ab = new etu(53, 9715553);
   public static final etu ac = new etu(54, 6035741);
   public static final etu ad = new etu(55, 1474182);
   public static final etu ae = new etu(56, 3837580);
   public static final etu af = new etu(57, 5647422);
   public static final etu ag = new etu(58, 1356933);
   public static final etu ah = new etu(59, 6579300);
   public static final etu ai = new etu(60, 14200723);
   public static final etu aj = new etu(61, 8365974);
   public final int ak;
   public final int al;

   private etu(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(etu.a $$0) {
      return this == a ? 0 : ayf.b(ayf.f(this.ak), $$0.f);
   }

   public static etu a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static etu c(int $$0) {
      etu $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(etu.a.b($$1 & 3));
   }

   public byte b(etu.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final etu.a[] g = new etu.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static etu.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static etu.a b(int $$0) {
         return g[$$0];
      }
   }
}
