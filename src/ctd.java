import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum ctd implements azp {
   a(0, "white", 16383998, enu.i, 15790320, 16777215),
   b(1, "orange", 16351261, enu.p, 15435844, 16738335),
   c(2, "magenta", 13061821, enu.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, enu.r, 6719955, 10141901),
   e(4, "yellow", 16701501, enu.s, 14602026, 16776960),
   f(5, "lime", 8439583, enu.t, 4312372, 12582656),
   g(6, "pink", 15961002, enu.u, 14188952, 16738740),
   h(7, "gray", 4673362, enu.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, enu.w, 11250603, 13882323),
   j(9, "cyan", 1481884, enu.x, 2651799, 65535),
   k(10, "purple", 8991416, enu.y, 8073150, 10494192),
   l(11, "blue", 3949738, enu.z, 2437522, 255),
   m(12, "brown", 8606770, enu.A, 5320730, 9127187),
   n(13, "green", 6192150, enu.B, 3887386, 65280),
   o(14, "red", 11546150, enu.C, 11743532, 16711680),
   p(15, "black", 1908001, enu.D, 1973019, 0);

   private static final IntFunction<ctd> s = axl.a(ctd::a, values(), axl.a.a);
   private static final Int2ObjectOpenHashMap<ctd> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (ctd)$$0))
   );
   public static final azp.a<ctd> q = azp.a(ctd::values);
   public static final zj<ByteBuf, ctd> r = zh.a(s, ctd::a);
   private final int u;
   private final String v;
   private final enu w;
   private final float[] x;
   private final int y;
   private final int z;

   private ctd(final int $$0, final String $$1, final int $$2, final enu $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      int $$6 = ($$2 & 0xFF0000) >> 16;
      int $$7 = ($$2 & 0xFF00) >> 8;
      int $$8 = ($$2 & 0xFF) >> 0;
      this.x = new float[]{(float)$$6 / 255.0F, (float)$$7 / 255.0F, (float)$$8 / 255.0F};
      this.y = $$4;
   }

   public int a() {
      return this.u;
   }

   public String b() {
      return this.v;
   }

   public float[] d() {
      return this.x;
   }

   public enu e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static ctd a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static ctd a(String $$0, @Nullable ctd $$1) {
      ctd $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static ctd b(int $$0) {
      return (ctd)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }
}
