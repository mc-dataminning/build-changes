import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cll implements avj {
   a(0, "white", 16383998, eeu.i, 15790320, 16777215),
   b(1, "orange", 16351261, eeu.p, 15435844, 16738335),
   c(2, "magenta", 13061821, eeu.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, eeu.r, 6719955, 10141901),
   e(4, "yellow", 16701501, eeu.s, 14602026, 16776960),
   f(5, "lime", 8439583, eeu.t, 4312372, 12582656),
   g(6, "pink", 15961002, eeu.u, 14188952, 16738740),
   h(7, "gray", 4673362, eeu.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, eeu.w, 11250603, 13882323),
   j(9, "cyan", 1481884, eeu.x, 2651799, 65535),
   k(10, "purple", 8991416, eeu.y, 8073150, 10494192),
   l(11, "blue", 3949738, eeu.z, 2437522, 255),
   m(12, "brown", 8606770, eeu.A, 5320730, 9127187),
   n(13, "green", 6192150, eeu.B, 3887386, 65280),
   o(14, "red", 11546150, eeu.C, 11743532, 16711680),
   p(15, "black", 1908001, eeu.D, 1973019, 0);

   private static final IntFunction<cll> r = atf.a(cll::a, values(), atf.a.a);
   private static final Int2ObjectOpenHashMap<cll> s = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.x, $$0 -> (cll)$$0))
   );
   public static final avj.a<cll> q = avj.a(cll::values);
   private final int t;
   private final String u;
   private final eeu v;
   private final float[] w;
   private final int x;
   private final int y;

   private cll(int $$0, String $$1, int $$2, eeu $$3, int $$4, int $$5) {
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

   public eeu e() {
      return this.v;
   }

   public int f() {
      return this.x;
   }

   public int g() {
      return this.y;
   }

   public static cll a(int $$0) {
      return r.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cll a(String $$0, @Nullable cll $$1) {
      cll $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cll b(int $$0) {
      return (cll)s.get($$0);
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
