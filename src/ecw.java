import com.google.common.base.Preconditions;

public class ecw {
   private static final ecw[] am = new ecw[64];
   public static final ecw a = new ecw(0, 0);
   public static final ecw b = new ecw(1, 8368696);
   public static final ecw c = new ecw(2, 16247203);
   public static final ecw d = new ecw(3, 13092807);
   public static final ecw e = new ecw(4, 16711680);
   public static final ecw f = new ecw(5, 10526975);
   public static final ecw g = new ecw(6, 10987431);
   public static final ecw h = new ecw(7, 31744);
   public static final ecw i = new ecw(8, 16777215);
   public static final ecw j = new ecw(9, 10791096);
   public static final ecw k = new ecw(10, 9923917);
   public static final ecw l = new ecw(11, 7368816);
   public static final ecw m = new ecw(12, 4210943);
   public static final ecw n = new ecw(13, 9402184);
   public static final ecw o = new ecw(14, 16776437);
   public static final ecw p = new ecw(15, 14188339);
   public static final ecw q = new ecw(16, 11685080);
   public static final ecw r = new ecw(17, 6724056);
   public static final ecw s = new ecw(18, 15066419);
   public static final ecw t = new ecw(19, 8375321);
   public static final ecw u = new ecw(20, 15892389);
   public static final ecw v = new ecw(21, 5000268);
   public static final ecw w = new ecw(22, 10066329);
   public static final ecw x = new ecw(23, 5013401);
   public static final ecw y = new ecw(24, 8339378);
   public static final ecw z = new ecw(25, 3361970);
   public static final ecw A = new ecw(26, 6704179);
   public static final ecw B = new ecw(27, 6717235);
   public static final ecw C = new ecw(28, 10040115);
   public static final ecw D = new ecw(29, 1644825);
   public static final ecw E = new ecw(30, 16445005);
   public static final ecw F = new ecw(31, 6085589);
   public static final ecw G = new ecw(32, 4882687);
   public static final ecw H = new ecw(33, 55610);
   public static final ecw I = new ecw(34, 8476209);
   public static final ecw J = new ecw(35, 7340544);
   public static final ecw K = new ecw(36, 13742497);
   public static final ecw L = new ecw(37, 10441252);
   public static final ecw M = new ecw(38, 9787244);
   public static final ecw N = new ecw(39, 7367818);
   public static final ecw O = new ecw(40, 12223780);
   public static final ecw P = new ecw(41, 6780213);
   public static final ecw Q = new ecw(42, 10505550);
   public static final ecw R = new ecw(43, 3746083);
   public static final ecw S = new ecw(44, 8874850);
   public static final ecw T = new ecw(45, 5725276);
   public static final ecw U = new ecw(46, 8014168);
   public static final ecw V = new ecw(47, 4996700);
   public static final ecw W = new ecw(48, 4993571);
   public static final ecw X = new ecw(49, 5001770);
   public static final ecw Y = new ecw(50, 9321518);
   public static final ecw Z = new ecw(51, 2430480);
   public static final ecw aa = new ecw(52, 12398641);
   public static final ecw ab = new ecw(53, 9715553);
   public static final ecw ac = new ecw(54, 6035741);
   public static final ecw ad = new ecw(55, 1474182);
   public static final ecw ae = new ecw(56, 3837580);
   public static final ecw af = new ecw(57, 5647422);
   public static final ecw ag = new ecw(58, 1356933);
   public static final ecw ah = new ecw(59, 6579300);
   public static final ecw ai = new ecw(60, 14200723);
   public static final ecw aj = new ecw(61, 8365974);
   public final int ak;
   public final int al;

   private ecw(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ecw.a $$0) {
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

   public static ecw a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ecw c(int $$0) {
      ecw $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ecw.a.b($$1 & 3));
   }

   public byte b(ecw.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ecw.a[] g = new ecw.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ecw.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ecw.a b(int $$0) {
         return g[$$0];
      }
   }
}
