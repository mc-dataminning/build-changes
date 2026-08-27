import com.google.common.base.Preconditions;

public class dxi {
   private static final dxi[] am = new dxi[64];
   public static final dxi a = new dxi(0, 0);
   public static final dxi b = new dxi(1, 8368696);
   public static final dxi c = new dxi(2, 16247203);
   public static final dxi d = new dxi(3, 13092807);
   public static final dxi e = new dxi(4, 16711680);
   public static final dxi f = new dxi(5, 10526975);
   public static final dxi g = new dxi(6, 10987431);
   public static final dxi h = new dxi(7, 31744);
   public static final dxi i = new dxi(8, 16777215);
   public static final dxi j = new dxi(9, 10791096);
   public static final dxi k = new dxi(10, 9923917);
   public static final dxi l = new dxi(11, 7368816);
   public static final dxi m = new dxi(12, 4210943);
   public static final dxi n = new dxi(13, 9402184);
   public static final dxi o = new dxi(14, 16776437);
   public static final dxi p = new dxi(15, 14188339);
   public static final dxi q = new dxi(16, 11685080);
   public static final dxi r = new dxi(17, 6724056);
   public static final dxi s = new dxi(18, 15066419);
   public static final dxi t = new dxi(19, 8375321);
   public static final dxi u = new dxi(20, 15892389);
   public static final dxi v = new dxi(21, 5000268);
   public static final dxi w = new dxi(22, 10066329);
   public static final dxi x = new dxi(23, 5013401);
   public static final dxi y = new dxi(24, 8339378);
   public static final dxi z = new dxi(25, 3361970);
   public static final dxi A = new dxi(26, 6704179);
   public static final dxi B = new dxi(27, 6717235);
   public static final dxi C = new dxi(28, 10040115);
   public static final dxi D = new dxi(29, 1644825);
   public static final dxi E = new dxi(30, 16445005);
   public static final dxi F = new dxi(31, 6085589);
   public static final dxi G = new dxi(32, 4882687);
   public static final dxi H = new dxi(33, 55610);
   public static final dxi I = new dxi(34, 8476209);
   public static final dxi J = new dxi(35, 7340544);
   public static final dxi K = new dxi(36, 13742497);
   public static final dxi L = new dxi(37, 10441252);
   public static final dxi M = new dxi(38, 9787244);
   public static final dxi N = new dxi(39, 7367818);
   public static final dxi O = new dxi(40, 12223780);
   public static final dxi P = new dxi(41, 6780213);
   public static final dxi Q = new dxi(42, 10505550);
   public static final dxi R = new dxi(43, 3746083);
   public static final dxi S = new dxi(44, 8874850);
   public static final dxi T = new dxi(45, 5725276);
   public static final dxi U = new dxi(46, 8014168);
   public static final dxi V = new dxi(47, 4996700);
   public static final dxi W = new dxi(48, 4993571);
   public static final dxi X = new dxi(49, 5001770);
   public static final dxi Y = new dxi(50, 9321518);
   public static final dxi Z = new dxi(51, 2430480);
   public static final dxi aa = new dxi(52, 12398641);
   public static final dxi ab = new dxi(53, 9715553);
   public static final dxi ac = new dxi(54, 6035741);
   public static final dxi ad = new dxi(55, 1474182);
   public static final dxi ae = new dxi(56, 3837580);
   public static final dxi af = new dxi(57, 5647422);
   public static final dxi ag = new dxi(58, 1356933);
   public static final dxi ah = new dxi(59, 6579300);
   public static final dxi ai = new dxi(60, 14200723);
   public static final dxi aj = new dxi(61, 8365974);
   public final int ak;
   public final int al;

   private dxi(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(dxi.a $$0) {
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

   public static dxi a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static dxi c(int $$0) {
      dxi $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(dxi.a.b($$1 & 3));
   }

   public byte b(dxi.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final dxi.a[] g = new dxi.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static dxi.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static dxi.a b(int $$0) {
         return g[$$0];
      }
   }
}
