import com.google.common.base.Preconditions;

public class eev {
   private static final eev[] am = new eev[64];
   public static final eev a = new eev(0, 0);
   public static final eev b = new eev(1, 8368696);
   public static final eev c = new eev(2, 16247203);
   public static final eev d = new eev(3, 13092807);
   public static final eev e = new eev(4, 16711680);
   public static final eev f = new eev(5, 10526975);
   public static final eev g = new eev(6, 10987431);
   public static final eev h = new eev(7, 31744);
   public static final eev i = new eev(8, 16777215);
   public static final eev j = new eev(9, 10791096);
   public static final eev k = new eev(10, 9923917);
   public static final eev l = new eev(11, 7368816);
   public static final eev m = new eev(12, 4210943);
   public static final eev n = new eev(13, 9402184);
   public static final eev o = new eev(14, 16776437);
   public static final eev p = new eev(15, 14188339);
   public static final eev q = new eev(16, 11685080);
   public static final eev r = new eev(17, 6724056);
   public static final eev s = new eev(18, 15066419);
   public static final eev t = new eev(19, 8375321);
   public static final eev u = new eev(20, 15892389);
   public static final eev v = new eev(21, 5000268);
   public static final eev w = new eev(22, 10066329);
   public static final eev x = new eev(23, 5013401);
   public static final eev y = new eev(24, 8339378);
   public static final eev z = new eev(25, 3361970);
   public static final eev A = new eev(26, 6704179);
   public static final eev B = new eev(27, 6717235);
   public static final eev C = new eev(28, 10040115);
   public static final eev D = new eev(29, 1644825);
   public static final eev E = new eev(30, 16445005);
   public static final eev F = new eev(31, 6085589);
   public static final eev G = new eev(32, 4882687);
   public static final eev H = new eev(33, 55610);
   public static final eev I = new eev(34, 8476209);
   public static final eev J = new eev(35, 7340544);
   public static final eev K = new eev(36, 13742497);
   public static final eev L = new eev(37, 10441252);
   public static final eev M = new eev(38, 9787244);
   public static final eev N = new eev(39, 7367818);
   public static final eev O = new eev(40, 12223780);
   public static final eev P = new eev(41, 6780213);
   public static final eev Q = new eev(42, 10505550);
   public static final eev R = new eev(43, 3746083);
   public static final eev S = new eev(44, 8874850);
   public static final eev T = new eev(45, 5725276);
   public static final eev U = new eev(46, 8014168);
   public static final eev V = new eev(47, 4996700);
   public static final eev W = new eev(48, 4993571);
   public static final eev X = new eev(49, 5001770);
   public static final eev Y = new eev(50, 9321518);
   public static final eev Z = new eev(51, 2430480);
   public static final eev aa = new eev(52, 12398641);
   public static final eev ab = new eev(53, 9715553);
   public static final eev ac = new eev(54, 6035741);
   public static final eev ad = new eev(55, 1474182);
   public static final eev ae = new eev(56, 3837580);
   public static final eev af = new eev(57, 5647422);
   public static final eev ag = new eev(58, 1356933);
   public static final eev ah = new eev(59, 6579300);
   public static final eev ai = new eev(60, 14200723);
   public static final eev aj = new eev(61, 8365974);
   public final int ak;
   public final int al;

   private eev(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eev.a $$0) {
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

   public static eev a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eev c(int $$0) {
      eev $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eev.a.b($$1 & 3));
   }

   public byte b(eev.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eev.a[] g = new eev.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eev.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eev.a b(int $$0) {
         return g[$$0];
      }
   }
}
