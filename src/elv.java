import com.google.common.base.Preconditions;

public class elv {
   private static final elv[] am = new elv[64];
   public static final elv a = new elv(0, 0);
   public static final elv b = new elv(1, 8368696);
   public static final elv c = new elv(2, 16247203);
   public static final elv d = new elv(3, 13092807);
   public static final elv e = new elv(4, 16711680);
   public static final elv f = new elv(5, 10526975);
   public static final elv g = new elv(6, 10987431);
   public static final elv h = new elv(7, 31744);
   public static final elv i = new elv(8, 16777215);
   public static final elv j = new elv(9, 10791096);
   public static final elv k = new elv(10, 9923917);
   public static final elv l = new elv(11, 7368816);
   public static final elv m = new elv(12, 4210943);
   public static final elv n = new elv(13, 9402184);
   public static final elv o = new elv(14, 16776437);
   public static final elv p = new elv(15, 14188339);
   public static final elv q = new elv(16, 11685080);
   public static final elv r = new elv(17, 6724056);
   public static final elv s = new elv(18, 15066419);
   public static final elv t = new elv(19, 8375321);
   public static final elv u = new elv(20, 15892389);
   public static final elv v = new elv(21, 5000268);
   public static final elv w = new elv(22, 10066329);
   public static final elv x = new elv(23, 5013401);
   public static final elv y = new elv(24, 8339378);
   public static final elv z = new elv(25, 3361970);
   public static final elv A = new elv(26, 6704179);
   public static final elv B = new elv(27, 6717235);
   public static final elv C = new elv(28, 10040115);
   public static final elv D = new elv(29, 1644825);
   public static final elv E = new elv(30, 16445005);
   public static final elv F = new elv(31, 6085589);
   public static final elv G = new elv(32, 4882687);
   public static final elv H = new elv(33, 55610);
   public static final elv I = new elv(34, 8476209);
   public static final elv J = new elv(35, 7340544);
   public static final elv K = new elv(36, 13742497);
   public static final elv L = new elv(37, 10441252);
   public static final elv M = new elv(38, 9787244);
   public static final elv N = new elv(39, 7367818);
   public static final elv O = new elv(40, 12223780);
   public static final elv P = new elv(41, 6780213);
   public static final elv Q = new elv(42, 10505550);
   public static final elv R = new elv(43, 3746083);
   public static final elv S = new elv(44, 8874850);
   public static final elv T = new elv(45, 5725276);
   public static final elv U = new elv(46, 8014168);
   public static final elv V = new elv(47, 4996700);
   public static final elv W = new elv(48, 4993571);
   public static final elv X = new elv(49, 5001770);
   public static final elv Y = new elv(50, 9321518);
   public static final elv Z = new elv(51, 2430480);
   public static final elv aa = new elv(52, 12398641);
   public static final elv ab = new elv(53, 9715553);
   public static final elv ac = new elv(54, 6035741);
   public static final elv ad = new elv(55, 1474182);
   public static final elv ae = new elv(56, 3837580);
   public static final elv af = new elv(57, 5647422);
   public static final elv ag = new elv(58, 1356933);
   public static final elv ah = new elv(59, 6579300);
   public static final elv ai = new elv(60, 14200723);
   public static final elv aj = new elv(61, 8365974);
   public final int ak;
   public final int al;

   private elv(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(elv.a $$0) {
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

   public static elv a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static elv c(int $$0) {
      elv $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(elv.a.b($$1 & 3));
   }

   public byte b(elv.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final elv.a[] g = new elv.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static elv.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static elv.a b(int $$0) {
         return g[$$0];
      }
   }
}
