import com.google.common.base.Preconditions;

public class ehv {
   private static final ehv[] am = new ehv[64];
   public static final ehv a = new ehv(0, 0);
   public static final ehv b = new ehv(1, 8368696);
   public static final ehv c = new ehv(2, 16247203);
   public static final ehv d = new ehv(3, 13092807);
   public static final ehv e = new ehv(4, 16711680);
   public static final ehv f = new ehv(5, 10526975);
   public static final ehv g = new ehv(6, 10987431);
   public static final ehv h = new ehv(7, 31744);
   public static final ehv i = new ehv(8, 16777215);
   public static final ehv j = new ehv(9, 10791096);
   public static final ehv k = new ehv(10, 9923917);
   public static final ehv l = new ehv(11, 7368816);
   public static final ehv m = new ehv(12, 4210943);
   public static final ehv n = new ehv(13, 9402184);
   public static final ehv o = new ehv(14, 16776437);
   public static final ehv p = new ehv(15, 14188339);
   public static final ehv q = new ehv(16, 11685080);
   public static final ehv r = new ehv(17, 6724056);
   public static final ehv s = new ehv(18, 15066419);
   public static final ehv t = new ehv(19, 8375321);
   public static final ehv u = new ehv(20, 15892389);
   public static final ehv v = new ehv(21, 5000268);
   public static final ehv w = new ehv(22, 10066329);
   public static final ehv x = new ehv(23, 5013401);
   public static final ehv y = new ehv(24, 8339378);
   public static final ehv z = new ehv(25, 3361970);
   public static final ehv A = new ehv(26, 6704179);
   public static final ehv B = new ehv(27, 6717235);
   public static final ehv C = new ehv(28, 10040115);
   public static final ehv D = new ehv(29, 1644825);
   public static final ehv E = new ehv(30, 16445005);
   public static final ehv F = new ehv(31, 6085589);
   public static final ehv G = new ehv(32, 4882687);
   public static final ehv H = new ehv(33, 55610);
   public static final ehv I = new ehv(34, 8476209);
   public static final ehv J = new ehv(35, 7340544);
   public static final ehv K = new ehv(36, 13742497);
   public static final ehv L = new ehv(37, 10441252);
   public static final ehv M = new ehv(38, 9787244);
   public static final ehv N = new ehv(39, 7367818);
   public static final ehv O = new ehv(40, 12223780);
   public static final ehv P = new ehv(41, 6780213);
   public static final ehv Q = new ehv(42, 10505550);
   public static final ehv R = new ehv(43, 3746083);
   public static final ehv S = new ehv(44, 8874850);
   public static final ehv T = new ehv(45, 5725276);
   public static final ehv U = new ehv(46, 8014168);
   public static final ehv V = new ehv(47, 4996700);
   public static final ehv W = new ehv(48, 4993571);
   public static final ehv X = new ehv(49, 5001770);
   public static final ehv Y = new ehv(50, 9321518);
   public static final ehv Z = new ehv(51, 2430480);
   public static final ehv aa = new ehv(52, 12398641);
   public static final ehv ab = new ehv(53, 9715553);
   public static final ehv ac = new ehv(54, 6035741);
   public static final ehv ad = new ehv(55, 1474182);
   public static final ehv ae = new ehv(56, 3837580);
   public static final ehv af = new ehv(57, 5647422);
   public static final ehv ag = new ehv(58, 1356933);
   public static final ehv ah = new ehv(59, 6579300);
   public static final ehv ai = new ehv(60, 14200723);
   public static final ehv aj = new ehv(61, 8365974);
   public final int ak;
   public final int al;

   private ehv(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ehv.a $$0) {
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

   public static ehv a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ehv c(int $$0) {
      ehv $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ehv.a.b($$1 & 3));
   }

   public byte b(ehv.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ehv.a[] g = new ehv.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ehv.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ehv.a b(int $$0) {
         return g[$$0];
      }
   }
}
