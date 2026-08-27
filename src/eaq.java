import com.google.common.base.Preconditions;

public class eaq {
   private static final eaq[] am = new eaq[64];
   public static final eaq a = new eaq(0, 0);
   public static final eaq b = new eaq(1, 8368696);
   public static final eaq c = new eaq(2, 16247203);
   public static final eaq d = new eaq(3, 13092807);
   public static final eaq e = new eaq(4, 16711680);
   public static final eaq f = new eaq(5, 10526975);
   public static final eaq g = new eaq(6, 10987431);
   public static final eaq h = new eaq(7, 31744);
   public static final eaq i = new eaq(8, 16777215);
   public static final eaq j = new eaq(9, 10791096);
   public static final eaq k = new eaq(10, 9923917);
   public static final eaq l = new eaq(11, 7368816);
   public static final eaq m = new eaq(12, 4210943);
   public static final eaq n = new eaq(13, 9402184);
   public static final eaq o = new eaq(14, 16776437);
   public static final eaq p = new eaq(15, 14188339);
   public static final eaq q = new eaq(16, 11685080);
   public static final eaq r = new eaq(17, 6724056);
   public static final eaq s = new eaq(18, 15066419);
   public static final eaq t = new eaq(19, 8375321);
   public static final eaq u = new eaq(20, 15892389);
   public static final eaq v = new eaq(21, 5000268);
   public static final eaq w = new eaq(22, 10066329);
   public static final eaq x = new eaq(23, 5013401);
   public static final eaq y = new eaq(24, 8339378);
   public static final eaq z = new eaq(25, 3361970);
   public static final eaq A = new eaq(26, 6704179);
   public static final eaq B = new eaq(27, 6717235);
   public static final eaq C = new eaq(28, 10040115);
   public static final eaq D = new eaq(29, 1644825);
   public static final eaq E = new eaq(30, 16445005);
   public static final eaq F = new eaq(31, 6085589);
   public static final eaq G = new eaq(32, 4882687);
   public static final eaq H = new eaq(33, 55610);
   public static final eaq I = new eaq(34, 8476209);
   public static final eaq J = new eaq(35, 7340544);
   public static final eaq K = new eaq(36, 13742497);
   public static final eaq L = new eaq(37, 10441252);
   public static final eaq M = new eaq(38, 9787244);
   public static final eaq N = new eaq(39, 7367818);
   public static final eaq O = new eaq(40, 12223780);
   public static final eaq P = new eaq(41, 6780213);
   public static final eaq Q = new eaq(42, 10505550);
   public static final eaq R = new eaq(43, 3746083);
   public static final eaq S = new eaq(44, 8874850);
   public static final eaq T = new eaq(45, 5725276);
   public static final eaq U = new eaq(46, 8014168);
   public static final eaq V = new eaq(47, 4996700);
   public static final eaq W = new eaq(48, 4993571);
   public static final eaq X = new eaq(49, 5001770);
   public static final eaq Y = new eaq(50, 9321518);
   public static final eaq Z = new eaq(51, 2430480);
   public static final eaq aa = new eaq(52, 12398641);
   public static final eaq ab = new eaq(53, 9715553);
   public static final eaq ac = new eaq(54, 6035741);
   public static final eaq ad = new eaq(55, 1474182);
   public static final eaq ae = new eaq(56, 3837580);
   public static final eaq af = new eaq(57, 5647422);
   public static final eaq ag = new eaq(58, 1356933);
   public static final eaq ah = new eaq(59, 6579300);
   public static final eaq ai = new eaq(60, 14200723);
   public static final eaq aj = new eaq(61, 8365974);
   public final int ak;
   public final int al;

   private eaq(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eaq.a $$0) {
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

   public static eaq a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eaq c(int $$0) {
      eaq $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eaq.a.b($$1 & 3));
   }

   public byte b(eaq.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eaq.a[] g = new eaq.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eaq.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eaq.a b(int $$0) {
         return g[$$0];
      }
   }
}
