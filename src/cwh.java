import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cwh implements bba {
   a(0, "white", 16383998, ett.i, 15790320, 16777215),
   b(1, "orange", 16351261, ett.p, 15435844, 16738335),
   c(2, "magenta", 13061821, ett.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, ett.r, 6719955, 10141901),
   e(4, "yellow", 16701501, ett.s, 14602026, 16776960),
   f(5, "lime", 8439583, ett.t, 4312372, 12582656),
   g(6, "pink", 15961002, ett.u, 14188952, 16738740),
   h(7, "gray", 4673362, ett.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, ett.w, 11250603, 13882323),
   j(9, "cyan", 1481884, ett.x, 2651799, 65535),
   k(10, "purple", 8991416, ett.y, 8073150, 10494192),
   l(11, "blue", 3949738, ett.z, 2437522, 255),
   m(12, "brown", 8606770, ett.A, 5320730, 9127187),
   n(13, "green", 6192150, ett.B, 3887386, 65280),
   o(14, "red", 11546150, ett.C, 11743532, 16711680),
   p(15, "black", 1908001, ett.D, 1973019, 0);

   private static final IntFunction<cwh> s = ayv.a(cwh::a, values(), ayv.a.a);
   private static final Int2ObjectOpenHashMap<cwh> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cwh)$$0))
   );
   public static final bba.a<cwh> q = bba.a(cwh::values);
   public static final zt<ByteBuf, cwh> r = zr.a(s, cwh::a);
   private final int u;
   private final String v;
   private final ett w;
   private final int x;
   private final int y;
   private final int z;

   private cwh(final int $$0, final String $$1, final int $$2, final ett $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = ayp.f($$2);
      this.y = $$4;
   }

   public int a() {
      return this.u;
   }

   public String b() {
      return this.v;
   }

   public int d() {
      return this.x;
   }

   public ett e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cwh a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cwh a(String $$0, @Nullable cwh $$1) {
      cwh $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cwh b(int $$0) {
      return (cwh)t.get($$0);
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
