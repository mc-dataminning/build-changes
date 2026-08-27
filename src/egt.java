import com.google.common.base.Preconditions;

public class egt {
   private static final egt[] am = new egt[64];
   public static final egt a = new egt(0, 0);
   public static final egt b = new egt(1, 8368696);
   public static final egt c = new egt(2, 16247203);
   public static final egt d = new egt(3, 13092807);
   public static final egt e = new egt(4, 16711680);
   public static final egt f = new egt(5, 10526975);
   public static final egt g = new egt(6, 10987431);
   public static final egt h = new egt(7, 31744);
   public static final egt i = new egt(8, 16777215);
   public static final egt j = new egt(9, 10791096);
   public static final egt k = new egt(10, 9923917);
   public static final egt l = new egt(11, 7368816);
   public static final egt m = new egt(12, 4210943);
   public static final egt n = new egt(13, 9402184);
   public static final egt o = new egt(14, 16776437);
   public static final egt p = new egt(15, 14188339);
   public static final egt q = new egt(16, 11685080);
   public static final egt r = new egt(17, 6724056);
   public static final egt s = new egt(18, 15066419);
   public static final egt t = new egt(19, 8375321);
   public static final egt u = new egt(20, 15892389);
   public static final egt v = new egt(21, 5000268);
   public static final egt w = new egt(22, 10066329);
   public static final egt x = new egt(23, 5013401);
   public static final egt y = new egt(24, 8339378);
   public static final egt z = new egt(25, 3361970);
   public static final egt A = new egt(26, 6704179);
   public static final egt B = new egt(27, 6717235);
   public static final egt C = new egt(28, 10040115);
   public static final egt D = new egt(29, 1644825);
   public static final egt E = new egt(30, 16445005);
   public static final egt F = new egt(31, 6085589);
   public static final egt G = new egt(32, 4882687);
   public static final egt H = new egt(33, 55610);
   public static final egt I = new egt(34, 8476209);
   public static final egt J = new egt(35, 7340544);
   public static final egt K = new egt(36, 13742497);
   public static final egt L = new egt(37, 10441252);
   public static final egt M = new egt(38, 9787244);
   public static final egt N = new egt(39, 7367818);
   public static final egt O = new egt(40, 12223780);
   public static final egt P = new egt(41, 6780213);
   public static final egt Q = new egt(42, 10505550);
   public static final egt R = new egt(43, 3746083);
   public static final egt S = new egt(44, 8874850);
   public static final egt T = new egt(45, 5725276);
   public static final egt U = new egt(46, 8014168);
   public static final egt V = new egt(47, 4996700);
   public static final egt W = new egt(48, 4993571);
   public static final egt X = new egt(49, 5001770);
   public static final egt Y = new egt(50, 9321518);
   public static final egt Z = new egt(51, 2430480);
   public static final egt aa = new egt(52, 12398641);
   public static final egt ab = new egt(53, 9715553);
   public static final egt ac = new egt(54, 6035741);
   public static final egt ad = new egt(55, 1474182);
   public static final egt ae = new egt(56, 3837580);
   public static final egt af = new egt(57, 5647422);
   public static final egt ag = new egt(58, 1356933);
   public static final egt ah = new egt(59, 6579300);
   public static final egt ai = new egt(60, 14200723);
   public static final egt aj = new egt(61, 8365974);
   public final int ak;
   public final int al;

   private egt(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(egt.a $$0) {
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

   public static egt a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static egt c(int $$0) {
      egt $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(egt.a.b($$1 & 3));
   }

   public byte b(egt.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final egt.a[] g = new egt.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static egt.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static egt.a b(int $$0) {
         return g[$$0];
      }
   }
}
