import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cyy implements bao {
   a(0, "white", 16383998, exu.i, 15790320, 16777215),
   b(1, "orange", 16351261, exu.p, 15435844, 16738335),
   c(2, "magenta", 13061821, exu.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, exu.r, 6719955, 10141901),
   e(4, "yellow", 16701501, exu.s, 14602026, 16776960),
   f(5, "lime", 8439583, exu.t, 4312372, 12582656),
   g(6, "pink", 15961002, exu.u, 14188952, 16738740),
   h(7, "gray", 4673362, exu.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, exu.w, 11250603, 13882323),
   j(9, "cyan", 1481884, exu.x, 2651799, 65535),
   k(10, "purple", 8991416, exu.y, 8073150, 10494192),
   l(11, "blue", 3949738, exu.z, 2437522, 255),
   m(12, "brown", 8606770, exu.A, 5320730, 9127187),
   n(13, "green", 6192150, exu.B, 3887386, 65280),
   o(14, "red", 11546150, exu.C, 11743532, 16711680),
   p(15, "black", 1908001, exu.D, 1973019, 0);

   private static final IntFunction<cyy> t = ayg.a(cyy::a, values(), ayg.a.a);
   private static final Int2ObjectOpenHashMap<cyy> u = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> (cyy)$$0))
   );
   public static final bao.a<cyy> q = bao.a(cyy::values);
   public static final za<ByteBuf, cyy> r = yy.a(t, cyy::a);
   @Deprecated
   public static final Codec<cyy> s = Codec.BYTE.xmap(cyy::a, $$0 -> (byte)$$0.v);
   private final int v;
   private final String w;
   private final exu x;
   private final int y;
   private final int z;
   private final int A;

   private cyy(final int $$0, final String $$1, final int $$2, final exu $$3, final int $$4, final int $$5) {
      this.v = $$0;
      this.w = $$1;
      this.x = $$3;
      this.A = $$5;
      this.y = aya.f($$2);
      this.z = $$4;
   }

   public int a() {
      return this.v;
   }

   public String b() {
      return this.w;
   }

   public int d() {
      return this.y;
   }

   public exu e() {
      return this.x;
   }

   public int f() {
      return this.z;
   }

   public int g() {
      return this.A;
   }

   public static cyy a(int $$0) {
      return t.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cyy a(String $$0, @Nullable cyy $$1) {
      cyy $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cyy b(int $$0) {
      return (cyy)u.get($$0);
   }

   @Override
   public String toString() {
      return this.w;
   }

   @Override
   public String c() {
      return this.w;
   }

   public static cyy a(aru $$0, cyy $$1, cyy $$2) {
      def $$3 = a($$1, $$2);
      return $$0.t()
         .a(dfc.a, $$3, $$0)
         .map($$2x -> ((deg)$$2x.b()).a($$3, $$0.J_()))
         .map(daa::h)
         .filter(cyz.class::isInstance)
         .map(cyz.class::cast)
         .map(cyz::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static def a(cyy $$0, cyy $$1) {
      return def.a(2, 1, List.of(new daa(cyz.a($$0)), new daa(cyz.a($$1))));
   }
}
