import com.google.common.base.Preconditions;

public class ena {
   private static final ena[] am = new ena[64];
   public static final ena a = new ena(0, 0);
   public static final ena b = new ena(1, 8368696);
   public static final ena c = new ena(2, 16247203);
   public static final ena d = new ena(3, 13092807);
   public static final ena e = new ena(4, 16711680);
   public static final ena f = new ena(5, 10526975);
   public static final ena g = new ena(6, 10987431);
   public static final ena h = new ena(7, 31744);
   public static final ena i = new ena(8, 16777215);
   public static final ena j = new ena(9, 10791096);
   public static final ena k = new ena(10, 9923917);
   public static final ena l = new ena(11, 7368816);
   public static final ena m = new ena(12, 4210943);
   public static final ena n = new ena(13, 9402184);
   public static final ena o = new ena(14, 16776437);
   public static final ena p = new ena(15, 14188339);
   public static final ena q = new ena(16, 11685080);
   public static final ena r = new ena(17, 6724056);
   public static final ena s = new ena(18, 15066419);
   public static final ena t = new ena(19, 8375321);
   public static final ena u = new ena(20, 15892389);
   public static final ena v = new ena(21, 5000268);
   public static final ena w = new ena(22, 10066329);
   public static final ena x = new ena(23, 5013401);
   public static final ena y = new ena(24, 8339378);
   public static final ena z = new ena(25, 3361970);
   public static final ena A = new ena(26, 6704179);
   public static final ena B = new ena(27, 6717235);
   public static final ena C = new ena(28, 10040115);
   public static final ena D = new ena(29, 1644825);
   public static final ena E = new ena(30, 16445005);
   public static final ena F = new ena(31, 6085589);
   public static final ena G = new ena(32, 4882687);
   public static final ena H = new ena(33, 55610);
   public static final ena I = new ena(34, 8476209);
   public static final ena J = new ena(35, 7340544);
   public static final ena K = new ena(36, 13742497);
   public static final ena L = new ena(37, 10441252);
   public static final ena M = new ena(38, 9787244);
   public static final ena N = new ena(39, 7367818);
   public static final ena O = new ena(40, 12223780);
   public static final ena P = new ena(41, 6780213);
   public static final ena Q = new ena(42, 10505550);
   public static final ena R = new ena(43, 3746083);
   public static final ena S = new ena(44, 8874850);
   public static final ena T = new ena(45, 5725276);
   public static final ena U = new ena(46, 8014168);
   public static final ena V = new ena(47, 4996700);
   public static final ena W = new ena(48, 4993571);
   public static final ena X = new ena(49, 5001770);
   public static final ena Y = new ena(50, 9321518);
   public static final ena Z = new ena(51, 2430480);
   public static final ena aa = new ena(52, 12398641);
   public static final ena ab = new ena(53, 9715553);
   public static final ena ac = new ena(54, 6035741);
   public static final ena ad = new ena(55, 1474182);
   public static final ena ae = new ena(56, 3837580);
   public static final ena af = new ena(57, 5647422);
   public static final ena ag = new ena(58, 1356933);
   public static final ena ah = new ena(59, 6579300);
   public static final ena ai = new ena(60, 14200723);
   public static final ena aj = new ena(61, 8365974);
   public final int ak;
   public final int al;

   private ena(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(ena.a $$0) {
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

   public static ena a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static ena c(int $$0) {
      ena $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(ena.a.b($$1 & 3));
   }

   public byte b(ena.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final ena.a[] g = new ena.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(int $$0, int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static ena.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static ena.a b(int $$0) {
         return g[$$0];
      }
   }
}
