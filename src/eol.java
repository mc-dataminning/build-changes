import com.google.common.base.Preconditions;

public class eol {
   private static final eol[] am = new eol[64];
   public static final eol a = new eol(0, 0);
   public static final eol b = new eol(1, 8368696);
   public static final eol c = new eol(2, 16247203);
   public static final eol d = new eol(3, 13092807);
   public static final eol e = new eol(4, 16711680);
   public static final eol f = new eol(5, 10526975);
   public static final eol g = new eol(6, 10987431);
   public static final eol h = new eol(7, 31744);
   public static final eol i = new eol(8, 16777215);
   public static final eol j = new eol(9, 10791096);
   public static final eol k = new eol(10, 9923917);
   public static final eol l = new eol(11, 7368816);
   public static final eol m = new eol(12, 4210943);
   public static final eol n = new eol(13, 9402184);
   public static final eol o = new eol(14, 16776437);
   public static final eol p = new eol(15, 14188339);
   public static final eol q = new eol(16, 11685080);
   public static final eol r = new eol(17, 6724056);
   public static final eol s = new eol(18, 15066419);
   public static final eol t = new eol(19, 8375321);
   public static final eol u = new eol(20, 15892389);
   public static final eol v = new eol(21, 5000268);
   public static final eol w = new eol(22, 10066329);
   public static final eol x = new eol(23, 5013401);
   public static final eol y = new eol(24, 8339378);
   public static final eol z = new eol(25, 3361970);
   public static final eol A = new eol(26, 6704179);
   public static final eol B = new eol(27, 6717235);
   public static final eol C = new eol(28, 10040115);
   public static final eol D = new eol(29, 1644825);
   public static final eol E = new eol(30, 16445005);
   public static final eol F = new eol(31, 6085589);
   public static final eol G = new eol(32, 4882687);
   public static final eol H = new eol(33, 55610);
   public static final eol I = new eol(34, 8476209);
   public static final eol J = new eol(35, 7340544);
   public static final eol K = new eol(36, 13742497);
   public static final eol L = new eol(37, 10441252);
   public static final eol M = new eol(38, 9787244);
   public static final eol N = new eol(39, 7367818);
   public static final eol O = new eol(40, 12223780);
   public static final eol P = new eol(41, 6780213);
   public static final eol Q = new eol(42, 10505550);
   public static final eol R = new eol(43, 3746083);
   public static final eol S = new eol(44, 8874850);
   public static final eol T = new eol(45, 5725276);
   public static final eol U = new eol(46, 8014168);
   public static final eol V = new eol(47, 4996700);
   public static final eol W = new eol(48, 4993571);
   public static final eol X = new eol(49, 5001770);
   public static final eol Y = new eol(50, 9321518);
   public static final eol Z = new eol(51, 2430480);
   public static final eol aa = new eol(52, 12398641);
   public static final eol ab = new eol(53, 9715553);
   public static final eol ac = new eol(54, 6035741);
   public static final eol ad = new eol(55, 1474182);
   public static final eol ae = new eol(56, 3837580);
   public static final eol af = new eol(57, 5647422);
   public static final eol ag = new eol(58, 1356933);
   public static final eol ah = new eol(59, 6579300);
   public static final eol ai = new eol(60, 14200723);
   public static final eol aj = new eol(61, 8365974);
   public final int ak;
   public final int al;

   private eol(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eol.a $$0) {
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

   public static eol a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eol c(int $$0) {
      eol $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eol.a.b($$1 & 3));
   }

   public byte b(eol.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eol.a[] g = new eol.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eol.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eol.a b(int $$0) {
         return g[$$0];
      }
   }
}
