import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cvm implements azv {
   a(0, "white", 16383998, etd.i, 15790320, 16777215),
   b(1, "orange", 16351261, etd.p, 15435844, 16738335),
   c(2, "magenta", 13061821, etd.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, etd.r, 6719955, 10141901),
   e(4, "yellow", 16701501, etd.s, 14602026, 16776960),
   f(5, "lime", 8439583, etd.t, 4312372, 12582656),
   g(6, "pink", 15961002, etd.u, 14188952, 16738740),
   h(7, "gray", 4673362, etd.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, etd.w, 11250603, 13882323),
   j(9, "cyan", 1481884, etd.x, 2651799, 65535),
   k(10, "purple", 8991416, etd.y, 8073150, 10494192),
   l(11, "blue", 3949738, etd.z, 2437522, 255),
   m(12, "brown", 8606770, etd.A, 5320730, 9127187),
   n(13, "green", 6192150, etd.B, 3887386, 65280),
   o(14, "red", 11546150, etd.C, 11743532, 16711680),
   p(15, "black", 1908001, etd.D, 1973019, 0);

   private static final IntFunction<cvm> s = axq.a(cvm::a, values(), axq.a.a);
   private static final Int2ObjectOpenHashMap<cvm> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cvm)$$0))
   );
   public static final azv.a<cvm> q = azv.a(cvm::values);
   public static final yn<ByteBuf, cvm> r = yl.a(s, cvm::a);
   private final int u;
   private final String v;
   private final etd w;
   private final int x;
   private final int y;
   private final int z;

   private cvm(final int $$0, final String $$1, final int $$2, final etd $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = axk.f($$2);
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

   public etd e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cvm a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cvm a(String $$0, @Nullable cvm $$1) {
      cvm $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cvm b(int $$0) {
      return (cvm)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cvm a(ard $$0, cvm $$1, cvm $$2) {
      das $$3 = a($$1, $$2);
      return $$0.t()
         .a(dbp.a, $$3, $$0)
         .map($$2x -> ((dat)$$2x.b()).a($$3, $$0.K_()))
         .map(cwp::h)
         .filter(cvn.class::isInstance)
         .map(cvn.class::cast)
         .map(cvn::b)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static das a(cvm $$0, cvm $$1) {
      return das.a(2, 1, List.of(new cwp(cvn.a($$0)), new cwp(cvn.a($$1))));
   }
}
