import com.google.common.base.Preconditions;

public class eir {
   private static final eir[] am = new eir[64];
   public static final eir a = new eir(0, 0);
   public static final eir b = new eir(1, 8368696);
   public static final eir c = new eir(2, 16247203);
   public static final eir d = new eir(3, 13092807);
   public static final eir e = new eir(4, 16711680);
   public static final eir f = new eir(5, 10526975);
   public static final eir g = new eir(6, 10987431);
   public static final eir h = new eir(7, 31744);
   public static final eir i = new eir(8, 16777215);
   public static final eir j = new eir(9, 10791096);
   public static final eir k = new eir(10, 9923917);
   public static final eir l = new eir(11, 7368816);
   public static final eir m = new eir(12, 4210943);
   public static final eir n = new eir(13, 9402184);
   public static final eir o = new eir(14, 16776437);
   public static final eir p = new eir(15, 14188339);
   public static final eir q = new eir(16, 11685080);
   public static final eir r = new eir(17, 6724056);
   public static final eir s = new eir(18, 15066419);
   public static final eir t = new eir(19, 8375321);
   public static final eir u = new eir(20, 15892389);
   public static final eir v = new eir(21, 5000268);
   public static final eir w = new eir(22, 10066329);
   public static final eir x = new eir(23, 5013401);
   public static final eir y = new eir(24, 8339378);
   public static final eir z = new eir(25, 3361970);
   public static final eir A = new eir(26, 6704179);
   public static final eir B = new eir(27, 6717235);
   public static final eir C = new eir(28, 10040115);
   public static final eir D = new eir(29, 1644825);
   public static final eir E = new eir(30, 16445005);
   public static final eir F = new eir(31, 6085589);
   public static final eir G = new eir(32, 4882687);
   public static final eir H = new eir(33, 55610);
   public static final eir I = new eir(34, 8476209);
   public static final eir J = new eir(35, 7340544);
   public static final eir K = new eir(36, 13742497);
   public static final eir L = new eir(37, 10441252);
   public static final eir M = new eir(38, 9787244);
   public static final eir N = new eir(39, 7367818);
   public static final eir O = new eir(40, 12223780);
   public static final eir P = new eir(41, 6780213);
   public static final eir Q = new eir(42, 10505550);
   public static final eir R = new eir(43, 3746083);
   public static final eir S = new eir(44, 8874850);
   public static final eir T = new eir(45, 5725276);
   public static final eir U = new eir(46, 8014168);
   public static final eir V = new eir(47, 4996700);
   public static final eir W = new eir(48, 4993571);
   public static final eir X = new eir(49, 5001770);
   public static final eir Y = new eir(50, 9321518);
   public static final eir Z = new eir(51, 2430480);
   public static final eir aa = new eir(52, 12398641);
   public static final eir ab = new eir(53, 9715553);
   public static final eir ac = new eir(54, 6035741);
   public static final eir ad = new eir(55, 1474182);
   public static final eir ae = new eir(56, 3837580);
   public static final eir af = new eir(57, 5647422);
   public static final eir ag = new eir(58, 1356933);
   public static final eir ah = new eir(59, 6579300);
   public static final eir ai = new eir(60, 14200723);
   public static final eir aj = new eir(61, 8365974);
   public final int ak;
   public final int al;

   private eir(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(eir.a $$0) {
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

   public static eir a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static eir c(int $$0) {
      eir $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(eir.a.b($$1 & 3));
   }

   public byte b(eir.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final eir.a[] g = new eir.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eir.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static eir.a b(int $$0) {
         return g[$$0];
      }
   }
}
