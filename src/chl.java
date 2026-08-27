import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum chl implements ash {
   a(0, "white", 16383998, eag.i, 15790320, 16777215),
   b(1, "orange", 16351261, eag.p, 15435844, 16738335),
   c(2, "magenta", 13061821, eag.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, eag.r, 6719955, 10141901),
   e(4, "yellow", 16701501, eag.s, 14602026, 16776960),
   f(5, "lime", 8439583, eag.t, 4312372, 12582656),
   g(6, "pink", 15961002, eag.u, 14188952, 16738740),
   h(7, "gray", 4673362, eag.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, eag.w, 11250603, 13882323),
   j(9, "cyan", 1481884, eag.x, 2651799, 65535),
   k(10, "purple", 8991416, eag.y, 8073150, 10494192),
   l(11, "blue", 3949738, eag.z, 2437522, 255),
   m(12, "brown", 8606770, eag.A, 5320730, 9127187),
   n(13, "green", 6192150, eag.B, 3887386, 65280),
   o(14, "red", 11546150, eag.C, 11743532, 16711680),
   p(15, "black", 1908001, eag.D, 1973019, 0);

   private static final IntFunction<chl> r = aqk.a(chl::a, values(), aqk.a.a);
   private static final Int2ObjectOpenHashMap<chl> s = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.x, $$0 -> (chl)$$0))
   );
   public static final ash.a<chl> q = ash.a(chl::values);
   private final int t;
   private final String u;
   private final eag v;
   private final float[] w;
   private final int x;
   private final int y;

   private chl(int $$0, String $$1, int $$2, eag $$3, int $$4, int $$5) {
      this.t = $$0;
      this.u = $$1;
      this.v = $$3;
      this.y = $$5;
      int $$6 = ($$2 & 0xFF0000) >> 16;
      int $$7 = ($$2 & 0xFF00) >> 8;
      int $$8 = ($$2 & 0xFF) >> 0;
      this.w = new float[]{(float)$$6 / 255.0F, (float)$$7 / 255.0F, (float)$$8 / 255.0F};
      this.x = $$4;
   }

   public int a() {
      return this.t;
   }

   public String b() {
      return this.u;
   }

   public float[] d() {
      return this.w;
   }

   public eag e() {
      return this.v;
   }

   public int f() {
      return this.x;
   }

   public int g() {
      return this.y;
   }

   public static chl a(int $$0) {
      return r.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static chl a(String $$0, @Nullable chl $$1) {
      chl $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static chl b(int $$0) {
      return (chl)s.get($$0);
   }

   @Override
   public String toString() {
      return this.u;
   }

   @Override
   public String c() {
      return this.u;
   }
}
