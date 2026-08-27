import com.google.common.base.Preconditions;

public class ebi {
   private static final ebi[] am = new ebi[64];
   public static final ebi a = new ebi(0, 0);
   public static final ebi b = new ebi(1, 8368696);
   public static final ebi c = new ebi(2, 16247203);
   public static final ebi d = new ebi(3, 13092807);
   public static final ebi e = new ebi(4, 16711680);
   public static final ebi f = new ebi(5, 10526975);
   public static final ebi g = new ebi(6, 10987431);
   public static final ebi h = new ebi(7, 31744);
   public static final ebi i = new ebi(8, 16777215);
   public static final ebi j = new ebi(9, 10791096);
   public static final ebi k = new ebi(10, 9923917);
   public static final ebi l = new ebi(11, 7368816);
   public static final ebi m = new ebi(12, 4210943);
   public static final ebi n = new ebi(13, 9402184);
   public static final ebi o = new ebi(14, 16776437);
   public static final ebi p = new ebi(15, 14188339);
   public static final ebi q = new ebi(16, 11685080);
   public static final ebi r = new ebi(17, 6724056);
   public static final ebi s = new ebi(18, 15066419);
   public static final ebi t = new ebi(19, 8375321);
   public static final ebi u = new ebi(20, 15892389);
   public static final ebi v = new ebi(21, 5000268);
   public static final ebi w = new ebi(22, 10066329);
   public static final ebi x = new ebi(23, 5013401);
   public static final ebi y = new ebi(24, 8339378);
   public static final ebi z = new ebi(25, 3361970);
   public static final ebi A = new ebi(26, 6704179);
   public static final ebi B = new ebi(27, 6717235);
   public static final ebi C = new ebi(28, 10040115);
   public static final ebi D = new ebi(29, 1644825);
   public static final ebi E = new ebi(30, 16445005);
   public static final ebi F = new ebi(31, 6085589);
   public static final ebi G = new ebi(32, 4882687);
   public static final ebi H = new ebi(33, 55610);
   public static final ebi I = new ebi(34, 8476209);
   public static final ebi J = new ebi(35, 7340544);
   public static final ebi K = new ebi(36, 13742497);
   public static final ebi L = new ebi(37, 10441252);
   public static final ebi M = new ebi(38, 9787244);
   public static final ebi N = new ebi(39, 7367818);
   public static final ebi O = new ebi(40, 12223780);
   public static final ebi P = new ebi(41, 6780213);
   public static final ebi Q = new ebi(42, 10505550);
   public static final ebi R = new ebi(43, 3746083);
   public static final ebi S = new ebi(44, 8874850);
   public static final ebi T = new ebi(45, 5725276);
   public static final ebi U = new ebi(46, 8014168);
   public static final ebi V = new ebi(47, 4996700);
   public static final ebi W = new ebi(48, 4993571);
   public static final ebi X = new ebi(49, 5001770);
   public static final ebi Y = new ebi(50, 9321518);
   public static final ebi Z = new ebi(51, 2430480);
   public static final ebi aa = new ebi(52, 12398641);
   public static final ebi ab = new ebi(53, 9715553);
   public static final ebi ac = new ebi(54, 6035741);
   public static final ebi ad = new ebi(55, 1474182);
   public static final ebi ae = new ebi(56, 3837580);
   public static final ebi af = new ebi(57, 5647422);
   public static final ebi ag = new ebi(58, 1356933);
   public static final ebi ah = new ebi(59, 6579300);
   public static final ebi ai = new ebi(60, 14200723);
   public static final ebi aj = new ebi(61, 8365974);
   public final int ak;
   public final int al;

   private ebi(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ebi.a $$0) {
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

   public static ebi a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ebi c(int $$0) {
      ebi $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ebi.a.b($$1 & 3));
   }

   public byte b(ebi.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ebi.a[] g = new ebi.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ebi.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ebi.a b(int $$0) {
         return g[$$0];
      }
   }
}
