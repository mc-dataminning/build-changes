import com.google.common.base.Preconditions;

public class exs {
   private static final exs[] am = new exs[64];
   public static final exs a = new exs(0, 0);
   public static final exs b = new exs(1, 8368696);
   public static final exs c = new exs(2, 16247203);
   public static final exs d = new exs(3, 13092807);
   public static final exs e = new exs(4, 16711680);
   public static final exs f = new exs(5, 10526975);
   public static final exs g = new exs(6, 10987431);
   public static final exs h = new exs(7, 31744);
   public static final exs i = new exs(8, 16777215);
   public static final exs j = new exs(9, 10791096);
   public static final exs k = new exs(10, 9923917);
   public static final exs l = new exs(11, 7368816);
   public static final exs m = new exs(12, 4210943);
   public static final exs n = new exs(13, 9402184);
   public static final exs o = new exs(14, 16776437);
   public static final exs p = new exs(15, 14188339);
   public static final exs q = new exs(16, 11685080);
   public static final exs r = new exs(17, 6724056);
   public static final exs s = new exs(18, 15066419);
   public static final exs t = new exs(19, 8375321);
   public static final exs u = new exs(20, 15892389);
   public static final exs v = new exs(21, 5000268);
   public static final exs w = new exs(22, 10066329);
   public static final exs x = new exs(23, 5013401);
   public static final exs y = new exs(24, 8339378);
   public static final exs z = new exs(25, 3361970);
   public static final exs A = new exs(26, 6704179);
   public static final exs B = new exs(27, 6717235);
   public static final exs C = new exs(28, 10040115);
   public static final exs D = new exs(29, 1644825);
   public static final exs E = new exs(30, 16445005);
   public static final exs F = new exs(31, 6085589);
   public static final exs G = new exs(32, 4882687);
   public static final exs H = new exs(33, 55610);
   public static final exs I = new exs(34, 8476209);
   public static final exs J = new exs(35, 7340544);
   public static final exs K = new exs(36, 13742497);
   public static final exs L = new exs(37, 10441252);
   public static final exs M = new exs(38, 9787244);
   public static final exs N = new exs(39, 7367818);
   public static final exs O = new exs(40, 12223780);
   public static final exs P = new exs(41, 6780213);
   public static final exs Q = new exs(42, 10505550);
   public static final exs R = new exs(43, 3746083);
   public static final exs S = new exs(44, 8874850);
   public static final exs T = new exs(45, 5725276);
   public static final exs U = new exs(46, 8014168);
   public static final exs V = new exs(47, 4996700);
   public static final exs W = new exs(48, 4993571);
   public static final exs X = new exs(49, 5001770);
   public static final exs Y = new exs(50, 9321518);
   public static final exs Z = new exs(51, 2430480);
   public static final exs aa = new exs(52, 12398641);
   public static final exs ab = new exs(53, 9715553);
   public static final exs ac = new exs(54, 6035741);
   public static final exs ad = new exs(55, 1474182);
   public static final exs ae = new exs(56, 3837580);
   public static final exs af = new exs(57, 5647422);
   public static final exs ag = new exs(58, 1356933);
   public static final exs ah = new exs(59, 6579300);
   public static final exs ai = new exs(60, 14200723);
   public static final exs aj = new exs(61, 8365974);
   public final int ak;
   public final int al;

   private exs(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(exs.a $$0) {
      return this == a ? 0 : axy.b(axy.f(this.ak), $$0.f);
   }

   public static exs a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static exs c(int $$0) {
      exs $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(exs.a.b($$1 & 3));
   }

   public byte b(exs.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final exs.a[] g = new exs.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static exs.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static exs.a b(int $$0) {
         return g[$$0];
      }
   }
}
