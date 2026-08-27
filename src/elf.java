import com.google.common.base.Preconditions;

public class elf {
   private static final elf[] am = new elf[64];
   public static final elf a = new elf(0, 0);
   public static final elf b = new elf(1, 8368696);
   public static final elf c = new elf(2, 16247203);
   public static final elf d = new elf(3, 13092807);
   public static final elf e = new elf(4, 16711680);
   public static final elf f = new elf(5, 10526975);
   public static final elf g = new elf(6, 10987431);
   public static final elf h = new elf(7, 31744);
   public static final elf i = new elf(8, 16777215);
   public static final elf j = new elf(9, 10791096);
   public static final elf k = new elf(10, 9923917);
   public static final elf l = new elf(11, 7368816);
   public static final elf m = new elf(12, 4210943);
   public static final elf n = new elf(13, 9402184);
   public static final elf o = new elf(14, 16776437);
   public static final elf p = new elf(15, 14188339);
   public static final elf q = new elf(16, 11685080);
   public static final elf r = new elf(17, 6724056);
   public static final elf s = new elf(18, 15066419);
   public static final elf t = new elf(19, 8375321);
   public static final elf u = new elf(20, 15892389);
   public static final elf v = new elf(21, 5000268);
   public static final elf w = new elf(22, 10066329);
   public static final elf x = new elf(23, 5013401);
   public static final elf y = new elf(24, 8339378);
   public static final elf z = new elf(25, 3361970);
   public static final elf A = new elf(26, 6704179);
   public static final elf B = new elf(27, 6717235);
   public static final elf C = new elf(28, 10040115);
   public static final elf D = new elf(29, 1644825);
   public static final elf E = new elf(30, 16445005);
   public static final elf F = new elf(31, 6085589);
   public static final elf G = new elf(32, 4882687);
   public static final elf H = new elf(33, 55610);
   public static final elf I = new elf(34, 8476209);
   public static final elf J = new elf(35, 7340544);
   public static final elf K = new elf(36, 13742497);
   public static final elf L = new elf(37, 10441252);
   public static final elf M = new elf(38, 9787244);
   public static final elf N = new elf(39, 7367818);
   public static final elf O = new elf(40, 12223780);
   public static final elf P = new elf(41, 6780213);
   public static final elf Q = new elf(42, 10505550);
   public static final elf R = new elf(43, 3746083);
   public static final elf S = new elf(44, 8874850);
   public static final elf T = new elf(45, 5725276);
   public static final elf U = new elf(46, 8014168);
   public static final elf V = new elf(47, 4996700);
   public static final elf W = new elf(48, 4993571);
   public static final elf X = new elf(49, 5001770);
   public static final elf Y = new elf(50, 9321518);
   public static final elf Z = new elf(51, 2430480);
   public static final elf aa = new elf(52, 12398641);
   public static final elf ab = new elf(53, 9715553);
   public static final elf ac = new elf(54, 6035741);
   public static final elf ad = new elf(55, 1474182);
   public static final elf ae = new elf(56, 3837580);
   public static final elf af = new elf(57, 5647422);
   public static final elf ag = new elf(58, 1356933);
   public static final elf ah = new elf(59, 6579300);
   public static final elf ai = new elf(60, 14200723);
   public static final elf aj = new elf(61, 8365974);
   public final int ak;
   public final int al;

   private elf(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(elf.a $$0) {
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

   public static elf a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static elf c(int $$0) {
      elf $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(elf.a.b($$1 & 3));
   }

   public byte b(elf.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final elf.a[] g = new elf.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static elf.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static elf.a b(int $$0) {
         return g[$$0];
      }
   }
}
