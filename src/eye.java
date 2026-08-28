import com.google.common.base.Preconditions;

public class eye {
   private static final eye[] am = new eye[64];
   public static final eye a = new eye(0, 0);
   public static final eye b = new eye(1, 8368696);
   public static final eye c = new eye(2, 16247203);
   public static final eye d = new eye(3, 13092807);
   public static final eye e = new eye(4, 16711680);
   public static final eye f = new eye(5, 10526975);
   public static final eye g = new eye(6, 10987431);
   public static final eye h = new eye(7, 31744);
   public static final eye i = new eye(8, 16777215);
   public static final eye j = new eye(9, 10791096);
   public static final eye k = new eye(10, 9923917);
   public static final eye l = new eye(11, 7368816);
   public static final eye m = new eye(12, 4210943);
   public static final eye n = new eye(13, 9402184);
   public static final eye o = new eye(14, 16776437);
   public static final eye p = new eye(15, 14188339);
   public static final eye q = new eye(16, 11685080);
   public static final eye r = new eye(17, 6724056);
   public static final eye s = new eye(18, 15066419);
   public static final eye t = new eye(19, 8375321);
   public static final eye u = new eye(20, 15892389);
   public static final eye v = new eye(21, 5000268);
   public static final eye w = new eye(22, 10066329);
   public static final eye x = new eye(23, 5013401);
   public static final eye y = new eye(24, 8339378);
   public static final eye z = new eye(25, 3361970);
   public static final eye A = new eye(26, 6704179);
   public static final eye B = new eye(27, 6717235);
   public static final eye C = new eye(28, 10040115);
   public static final eye D = new eye(29, 1644825);
   public static final eye E = new eye(30, 16445005);
   public static final eye F = new eye(31, 6085589);
   public static final eye G = new eye(32, 4882687);
   public static final eye H = new eye(33, 55610);
   public static final eye I = new eye(34, 8476209);
   public static final eye J = new eye(35, 7340544);
   public static final eye K = new eye(36, 13742497);
   public static final eye L = new eye(37, 10441252);
   public static final eye M = new eye(38, 9787244);
   public static final eye N = new eye(39, 7367818);
   public static final eye O = new eye(40, 12223780);
   public static final eye P = new eye(41, 6780213);
   public static final eye Q = new eye(42, 10505550);
   public static final eye R = new eye(43, 3746083);
   public static final eye S = new eye(44, 8874850);
   public static final eye T = new eye(45, 5725276);
   public static final eye U = new eye(46, 8014168);
   public static final eye V = new eye(47, 4996700);
   public static final eye W = new eye(48, 4993571);
   public static final eye X = new eye(49, 5001770);
   public static final eye Y = new eye(50, 9321518);
   public static final eye Z = new eye(51, 2430480);
   public static final eye aa = new eye(52, 12398641);
   public static final eye ab = new eye(53, 9715553);
   public static final eye ac = new eye(54, 6035741);
   public static final eye ad = new eye(55, 1474182);
   public static final eye ae = new eye(56, 3837580);
   public static final eye af = new eye(57, 5647422);
   public static final eye ag = new eye(58, 1356933);
   public static final eye ah = new eye(59, 6579300);
   public static final eye ai = new eye(60, 14200723);
   public static final eye aj = new eye(61, 8365974);
   public final int ak;
   public final int al;

   private eye(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eye.a $$0) {
      return this == a ? 0 : ayh.b(ayh.f(this.ak), $$0.f);
   }

   public static eye a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eye c(int $$0) {
      eye $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eye.a.b($$1 & 3));
   }

   public byte b(eye.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eye.a[] g = new eye.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eye.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eye.a b(int $$0) {
         return g[$$0];
      }
   }
}
