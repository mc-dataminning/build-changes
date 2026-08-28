import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cvc implements baj {
   a(0, "white", 16383998, ers.i, 15790320, 16777215),
   b(1, "orange", 16351261, ers.p, 15435844, 16738335),
   c(2, "magenta", 13061821, ers.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, ers.r, 6719955, 10141901),
   e(4, "yellow", 16701501, ers.s, 14602026, 16776960),
   f(5, "lime", 8439583, ers.t, 4312372, 12582656),
   g(6, "pink", 15961002, ers.u, 14188952, 16738740),
   h(7, "gray", 4673362, ers.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, ers.w, 11250603, 13882323),
   j(9, "cyan", 1481884, ers.x, 2651799, 65535),
   k(10, "purple", 8991416, ers.y, 8073150, 10494192),
   l(11, "blue", 3949738, ers.z, 2437522, 255),
   m(12, "brown", 8606770, ers.A, 5320730, 9127187),
   n(13, "green", 6192150, ers.B, 3887386, 65280),
   o(14, "red", 11546150, ers.C, 11743532, 16711680),
   p(15, "black", 1908001, ers.D, 1973019, 0);

   private static final IntFunction<cvc> s = aye.a(cvc::a, values(), aye.a.a);
   private static final Int2ObjectOpenHashMap<cvc> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cvc)$$0))
   );
   public static final baj.a<cvc> q = baj.a(cvc::values);
   public static final zj<ByteBuf, cvc> r = zh.a(s, cvc::a);
   private final int u;
   private final String v;
   private final ers w;
   private final int x;
   private final int y;
   private final int z;

   private cvc(final int $$0, final String $$1, final int $$2, final ers $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = axy.f($$2);
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

   public ers e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cvc a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cvc a(String $$0, @Nullable cvc $$1) {
      cvc $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cvc b(int $$0) {
      return (cvc)t.get($$0);
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
