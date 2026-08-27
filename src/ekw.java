import com.google.common.base.Preconditions;

public class ekw {
   private static final ekw[] am = new ekw[64];
   public static final ekw a = new ekw(0, 0);
   public static final ekw b = new ekw(1, 8368696);
   public static final ekw c = new ekw(2, 16247203);
   public static final ekw d = new ekw(3, 13092807);
   public static final ekw e = new ekw(4, 16711680);
   public static final ekw f = new ekw(5, 10526975);
   public static final ekw g = new ekw(6, 10987431);
   public static final ekw h = new ekw(7, 31744);
   public static final ekw i = new ekw(8, 16777215);
   public static final ekw j = new ekw(9, 10791096);
   public static final ekw k = new ekw(10, 9923917);
   public static final ekw l = new ekw(11, 7368816);
   public static final ekw m = new ekw(12, 4210943);
   public static final ekw n = new ekw(13, 9402184);
   public static final ekw o = new ekw(14, 16776437);
   public static final ekw p = new ekw(15, 14188339);
   public static final ekw q = new ekw(16, 11685080);
   public static final ekw r = new ekw(17, 6724056);
   public static final ekw s = new ekw(18, 15066419);
   public static final ekw t = new ekw(19, 8375321);
   public static final ekw u = new ekw(20, 15892389);
   public static final ekw v = new ekw(21, 5000268);
   public static final ekw w = new ekw(22, 10066329);
   public static final ekw x = new ekw(23, 5013401);
   public static final ekw y = new ekw(24, 8339378);
   public static final ekw z = new ekw(25, 3361970);
   public static final ekw A = new ekw(26, 6704179);
   public static final ekw B = new ekw(27, 6717235);
   public static final ekw C = new ekw(28, 10040115);
   public static final ekw D = new ekw(29, 1644825);
   public static final ekw E = new ekw(30, 16445005);
   public static final ekw F = new ekw(31, 6085589);
   public static final ekw G = new ekw(32, 4882687);
   public static final ekw H = new ekw(33, 55610);
   public static final ekw I = new ekw(34, 8476209);
   public static final ekw J = new ekw(35, 7340544);
   public static final ekw K = new ekw(36, 13742497);
   public static final ekw L = new ekw(37, 10441252);
   public static final ekw M = new ekw(38, 9787244);
   public static final ekw N = new ekw(39, 7367818);
   public static final ekw O = new ekw(40, 12223780);
   public static final ekw P = new ekw(41, 6780213);
   public static final ekw Q = new ekw(42, 10505550);
   public static final ekw R = new ekw(43, 3746083);
   public static final ekw S = new ekw(44, 8874850);
   public static final ekw T = new ekw(45, 5725276);
   public static final ekw U = new ekw(46, 8014168);
   public static final ekw V = new ekw(47, 4996700);
   public static final ekw W = new ekw(48, 4993571);
   public static final ekw X = new ekw(49, 5001770);
   public static final ekw Y = new ekw(50, 9321518);
   public static final ekw Z = new ekw(51, 2430480);
   public static final ekw aa = new ekw(52, 12398641);
   public static final ekw ab = new ekw(53, 9715553);
   public static final ekw ac = new ekw(54, 6035741);
   public static final ekw ad = new ekw(55, 1474182);
   public static final ekw ae = new ekw(56, 3837580);
   public static final ekw af = new ekw(57, 5647422);
   public static final ekw ag = new ekw(58, 1356933);
   public static final ekw ah = new ekw(59, 6579300);
   public static final ekw ai = new ekw(60, 14200723);
   public static final ekw aj = new ekw(61, 8365974);
   public final int ak;
   public final int al;

   private ekw(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ekw.a $$0) {
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

   public static ekw a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ekw c(int $$0) {
      ekw $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ekw.a.b($$1 & 3));
   }

   public byte b(ekw.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ekw.a[] g = new ekw.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ekw.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ekw.a b(int $$0) {
         return g[$$0];
      }
   }
}
