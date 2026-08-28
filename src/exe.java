import com.google.common.base.Preconditions;

public class exe {
   private static final exe[] am = new exe[64];
   public static final exe a = new exe(0, 0);
   public static final exe b = new exe(1, 8368696);
   public static final exe c = new exe(2, 16247203);
   public static final exe d = new exe(3, 13092807);
   public static final exe e = new exe(4, 16711680);
   public static final exe f = new exe(5, 10526975);
   public static final exe g = new exe(6, 10987431);
   public static final exe h = new exe(7, 31744);
   public static final exe i = new exe(8, 16777215);
   public static final exe j = new exe(9, 10791096);
   public static final exe k = new exe(10, 9923917);
   public static final exe l = new exe(11, 7368816);
   public static final exe m = new exe(12, 4210943);
   public static final exe n = new exe(13, 9402184);
   public static final exe o = new exe(14, 16776437);
   public static final exe p = new exe(15, 14188339);
   public static final exe q = new exe(16, 11685080);
   public static final exe r = new exe(17, 6724056);
   public static final exe s = new exe(18, 15066419);
   public static final exe t = new exe(19, 8375321);
   public static final exe u = new exe(20, 15892389);
   public static final exe v = new exe(21, 5000268);
   public static final exe w = new exe(22, 10066329);
   public static final exe x = new exe(23, 5013401);
   public static final exe y = new exe(24, 8339378);
   public static final exe z = new exe(25, 3361970);
   public static final exe A = new exe(26, 6704179);
   public static final exe B = new exe(27, 6717235);
   public static final exe C = new exe(28, 10040115);
   public static final exe D = new exe(29, 1644825);
   public static final exe E = new exe(30, 16445005);
   public static final exe F = new exe(31, 6085589);
   public static final exe G = new exe(32, 4882687);
   public static final exe H = new exe(33, 55610);
   public static final exe I = new exe(34, 8476209);
   public static final exe J = new exe(35, 7340544);
   public static final exe K = new exe(36, 13742497);
   public static final exe L = new exe(37, 10441252);
   public static final exe M = new exe(38, 9787244);
   public static final exe N = new exe(39, 7367818);
   public static final exe O = new exe(40, 12223780);
   public static final exe P = new exe(41, 6780213);
   public static final exe Q = new exe(42, 10505550);
   public static final exe R = new exe(43, 3746083);
   public static final exe S = new exe(44, 8874850);
   public static final exe T = new exe(45, 5725276);
   public static final exe U = new exe(46, 8014168);
   public static final exe V = new exe(47, 4996700);
   public static final exe W = new exe(48, 4993571);
   public static final exe X = new exe(49, 5001770);
   public static final exe Y = new exe(50, 9321518);
   public static final exe Z = new exe(51, 2430480);
   public static final exe aa = new exe(52, 12398641);
   public static final exe ab = new exe(53, 9715553);
   public static final exe ac = new exe(54, 6035741);
   public static final exe ad = new exe(55, 1474182);
   public static final exe ae = new exe(56, 3837580);
   public static final exe af = new exe(57, 5647422);
   public static final exe ag = new exe(58, 1356933);
   public static final exe ah = new exe(59, 6579300);
   public static final exe ai = new exe(60, 14200723);
   public static final exe aj = new exe(61, 8365974);
   public final int ak;
   public final int al;

   private exe(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(exe.a $$0) {
      return this == a ? 0 : axw.b(axw.f(this.ak), $$0.f);
   }

   public static exe a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static exe c(int $$0) {
      exe $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(exe.a.b($$1 & 3));
   }

   public byte b(exe.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final exe.a[] g = new exe.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static exe.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static exe.a b(int $$0) {
         return g[$$0];
      }
   }
}
