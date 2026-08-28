import com.google.common.base.Preconditions;

public class ett {
   private static final ett[] am = new ett[64];
   public static final ett a = new ett(0, 0);
   public static final ett b = new ett(1, 8368696);
   public static final ett c = new ett(2, 16247203);
   public static final ett d = new ett(3, 13092807);
   public static final ett e = new ett(4, 16711680);
   public static final ett f = new ett(5, 10526975);
   public static final ett g = new ett(6, 10987431);
   public static final ett h = new ett(7, 31744);
   public static final ett i = new ett(8, 16777215);
   public static final ett j = new ett(9, 10791096);
   public static final ett k = new ett(10, 9923917);
   public static final ett l = new ett(11, 7368816);
   public static final ett m = new ett(12, 4210943);
   public static final ett n = new ett(13, 9402184);
   public static final ett o = new ett(14, 16776437);
   public static final ett p = new ett(15, 14188339);
   public static final ett q = new ett(16, 11685080);
   public static final ett r = new ett(17, 6724056);
   public static final ett s = new ett(18, 15066419);
   public static final ett t = new ett(19, 8375321);
   public static final ett u = new ett(20, 15892389);
   public static final ett v = new ett(21, 5000268);
   public static final ett w = new ett(22, 10066329);
   public static final ett x = new ett(23, 5013401);
   public static final ett y = new ett(24, 8339378);
   public static final ett z = new ett(25, 3361970);
   public static final ett A = new ett(26, 6704179);
   public static final ett B = new ett(27, 6717235);
   public static final ett C = new ett(28, 10040115);
   public static final ett D = new ett(29, 1644825);
   public static final ett E = new ett(30, 16445005);
   public static final ett F = new ett(31, 6085589);
   public static final ett G = new ett(32, 4882687);
   public static final ett H = new ett(33, 55610);
   public static final ett I = new ett(34, 8476209);
   public static final ett J = new ett(35, 7340544);
   public static final ett K = new ett(36, 13742497);
   public static final ett L = new ett(37, 10441252);
   public static final ett M = new ett(38, 9787244);
   public static final ett N = new ett(39, 7367818);
   public static final ett O = new ett(40, 12223780);
   public static final ett P = new ett(41, 6780213);
   public static final ett Q = new ett(42, 10505550);
   public static final ett R = new ett(43, 3746083);
   public static final ett S = new ett(44, 8874850);
   public static final ett T = new ett(45, 5725276);
   public static final ett U = new ett(46, 8014168);
   public static final ett V = new ett(47, 4996700);
   public static final ett W = new ett(48, 4993571);
   public static final ett X = new ett(49, 5001770);
   public static final ett Y = new ett(50, 9321518);
   public static final ett Z = new ett(51, 2430480);
   public static final ett aa = new ett(52, 12398641);
   public static final ett ab = new ett(53, 9715553);
   public static final ett ac = new ett(54, 6035741);
   public static final ett ad = new ett(55, 1474182);
   public static final ett ae = new ett(56, 3837580);
   public static final ett af = new ett(57, 5647422);
   public static final ett ag = new ett(58, 1356933);
   public static final ett ah = new ett(59, 6579300);
   public static final ett ai = new ett(60, 14200723);
   public static final ett aj = new ett(61, 8365974);
   public final int ak;
   public final int al;

   private ett(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ett.a $$0) {
      return this == a ? 0 : ayp.b(ayp.f(this.ak), $$0.f);
   }

   public static ett a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ett c(int $$0) {
      ett $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ett.a.b($$1 & 3));
   }

   public byte b(ett.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ett.a[] g = new ett.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ett.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ett.a b(int $$0) {
         return g[$$0];
      }
   }
}
