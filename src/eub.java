import com.google.common.base.Preconditions;

public class eub {
   private static final eub[] am = new eub[64];
   public static final eub a = new eub(0, 0);
   public static final eub b = new eub(1, 8368696);
   public static final eub c = new eub(2, 16247203);
   public static final eub d = new eub(3, 13092807);
   public static final eub e = new eub(4, 16711680);
   public static final eub f = new eub(5, 10526975);
   public static final eub g = new eub(6, 10987431);
   public static final eub h = new eub(7, 31744);
   public static final eub i = new eub(8, 16777215);
   public static final eub j = new eub(9, 10791096);
   public static final eub k = new eub(10, 9923917);
   public static final eub l = new eub(11, 7368816);
   public static final eub m = new eub(12, 4210943);
   public static final eub n = new eub(13, 9402184);
   public static final eub o = new eub(14, 16776437);
   public static final eub p = new eub(15, 14188339);
   public static final eub q = new eub(16, 11685080);
   public static final eub r = new eub(17, 6724056);
   public static final eub s = new eub(18, 15066419);
   public static final eub t = new eub(19, 8375321);
   public static final eub u = new eub(20, 15892389);
   public static final eub v = new eub(21, 5000268);
   public static final eub w = new eub(22, 10066329);
   public static final eub x = new eub(23, 5013401);
   public static final eub y = new eub(24, 8339378);
   public static final eub z = new eub(25, 3361970);
   public static final eub A = new eub(26, 6704179);
   public static final eub B = new eub(27, 6717235);
   public static final eub C = new eub(28, 10040115);
   public static final eub D = new eub(29, 1644825);
   public static final eub E = new eub(30, 16445005);
   public static final eub F = new eub(31, 6085589);
   public static final eub G = new eub(32, 4882687);
   public static final eub H = new eub(33, 55610);
   public static final eub I = new eub(34, 8476209);
   public static final eub J = new eub(35, 7340544);
   public static final eub K = new eub(36, 13742497);
   public static final eub L = new eub(37, 10441252);
   public static final eub M = new eub(38, 9787244);
   public static final eub N = new eub(39, 7367818);
   public static final eub O = new eub(40, 12223780);
   public static final eub P = new eub(41, 6780213);
   public static final eub Q = new eub(42, 10505550);
   public static final eub R = new eub(43, 3746083);
   public static final eub S = new eub(44, 8874850);
   public static final eub T = new eub(45, 5725276);
   public static final eub U = new eub(46, 8014168);
   public static final eub V = new eub(47, 4996700);
   public static final eub W = new eub(48, 4993571);
   public static final eub X = new eub(49, 5001770);
   public static final eub Y = new eub(50, 9321518);
   public static final eub Z = new eub(51, 2430480);
   public static final eub aa = new eub(52, 12398641);
   public static final eub ab = new eub(53, 9715553);
   public static final eub ac = new eub(54, 6035741);
   public static final eub ad = new eub(55, 1474182);
   public static final eub ae = new eub(56, 3837580);
   public static final eub af = new eub(57, 5647422);
   public static final eub ag = new eub(58, 1356933);
   public static final eub ah = new eub(59, 6579300);
   public static final eub ai = new eub(60, 14200723);
   public static final eub aj = new eub(61, 8365974);
   public final int ak;
   public final int al;

   private eub(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eub.a $$0) {
      return this == a ? 0 : ayp.b(ayp.f(this.ak), $$0.f);
   }

   public static eub a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eub c(int $$0) {
      eub $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eub.a.b($$1 & 3));
   }

   public byte b(eub.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eub.a[] g = new eub.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eub.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eub.a b(int $$0) {
         return g[$$0];
      }
   }
}
