import com.google.common.base.Preconditions;

public class ers {
   private static final ers[] am = new ers[64];
   public static final ers a = new ers(0, 0);
   public static final ers b = new ers(1, 8368696);
   public static final ers c = new ers(2, 16247203);
   public static final ers d = new ers(3, 13092807);
   public static final ers e = new ers(4, 16711680);
   public static final ers f = new ers(5, 10526975);
   public static final ers g = new ers(6, 10987431);
   public static final ers h = new ers(7, 31744);
   public static final ers i = new ers(8, 16777215);
   public static final ers j = new ers(9, 10791096);
   public static final ers k = new ers(10, 9923917);
   public static final ers l = new ers(11, 7368816);
   public static final ers m = new ers(12, 4210943);
   public static final ers n = new ers(13, 9402184);
   public static final ers o = new ers(14, 16776437);
   public static final ers p = new ers(15, 14188339);
   public static final ers q = new ers(16, 11685080);
   public static final ers r = new ers(17, 6724056);
   public static final ers s = new ers(18, 15066419);
   public static final ers t = new ers(19, 8375321);
   public static final ers u = new ers(20, 15892389);
   public static final ers v = new ers(21, 5000268);
   public static final ers w = new ers(22, 10066329);
   public static final ers x = new ers(23, 5013401);
   public static final ers y = new ers(24, 8339378);
   public static final ers z = new ers(25, 3361970);
   public static final ers A = new ers(26, 6704179);
   public static final ers B = new ers(27, 6717235);
   public static final ers C = new ers(28, 10040115);
   public static final ers D = new ers(29, 1644825);
   public static final ers E = new ers(30, 16445005);
   public static final ers F = new ers(31, 6085589);
   public static final ers G = new ers(32, 4882687);
   public static final ers H = new ers(33, 55610);
   public static final ers I = new ers(34, 8476209);
   public static final ers J = new ers(35, 7340544);
   public static final ers K = new ers(36, 13742497);
   public static final ers L = new ers(37, 10441252);
   public static final ers M = new ers(38, 9787244);
   public static final ers N = new ers(39, 7367818);
   public static final ers O = new ers(40, 12223780);
   public static final ers P = new ers(41, 6780213);
   public static final ers Q = new ers(42, 10505550);
   public static final ers R = new ers(43, 3746083);
   public static final ers S = new ers(44, 8874850);
   public static final ers T = new ers(45, 5725276);
   public static final ers U = new ers(46, 8014168);
   public static final ers V = new ers(47, 4996700);
   public static final ers W = new ers(48, 4993571);
   public static final ers X = new ers(49, 5001770);
   public static final ers Y = new ers(50, 9321518);
   public static final ers Z = new ers(51, 2430480);
   public static final ers aa = new ers(52, 12398641);
   public static final ers ab = new ers(53, 9715553);
   public static final ers ac = new ers(54, 6035741);
   public static final ers ad = new ers(55, 1474182);
   public static final ers ae = new ers(56, 3837580);
   public static final ers af = new ers(57, 5647422);
   public static final ers ag = new ers(58, 1356933);
   public static final ers ah = new ers(59, 6579300);
   public static final ers ai = new ers(60, 14200723);
   public static final ers aj = new ers(61, 8365974);
   public final int ak;
   public final int al;

   private ers(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ers.a $$0) {
      return this == a ? 0 : axy.b(axy.f(this.ak), $$0.f);
   }

   public static ers a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ers c(int $$0) {
      ers $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ers.a.b($$1 & 3));
   }

   public byte b(ers.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ers.a[] g = new ers.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ers.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ers.a b(int $$0) {
         return g[$$0];
      }
   }
}
