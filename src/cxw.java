import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cxw implements bak {
   a(0, "white", 16383998, ewk.i, 15790320, 16777215),
   b(1, "orange", 16351261, ewk.p, 15435844, 16738335),
   c(2, "magenta", 13061821, ewk.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, ewk.r, 6719955, 10141901),
   e(4, "yellow", 16701501, ewk.s, 14602026, 16776960),
   f(5, "lime", 8439583, ewk.t, 4312372, 12582656),
   g(6, "pink", 15961002, ewk.u, 14188952, 16738740),
   h(7, "gray", 4673362, ewk.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, ewk.w, 11250603, 13882323),
   j(9, "cyan", 1481884, ewk.x, 2651799, 65535),
   k(10, "purple", 8991416, ewk.y, 8073150, 10494192),
   l(11, "blue", 3949738, ewk.z, 2437522, 255),
   m(12, "brown", 8606770, ewk.A, 5320730, 9127187),
   n(13, "green", 6192150, ewk.B, 3887386, 65280),
   o(14, "red", 11546150, ewk.C, 11743532, 16711680),
   p(15, "black", 1908001, ewk.D, 1973019, 0);

   private static final IntFunction<cxw> s = ayc.a(cxw::a, values(), ayc.a.a);
   private static final Int2ObjectOpenHashMap<cxw> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cxw)$$0))
   );
   public static final bak.a<cxw> q = bak.a(cxw::values);
   public static final yw<ByteBuf, cxw> r = yu.a(s, cxw::a);
   private final int u;
   private final String v;
   private final ewk w;
   private final int x;
   private final int y;
   private final int z;

   private cxw(final int $$0, final String $$1, final int $$2, final ewk $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = axw.f($$2);
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

   public ewk e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cxw a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cxw a(String $$0, @Nullable cxw $$1) {
      cxw $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cxw b(int $$0) {
      return (cxw)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cxw a(arq $$0, cxw $$1, cxw $$2) {
      ddd $$3 = a($$1, $$2);
      return $$0.t()
         .a(dea.a, $$3, $$0)
         .map($$2x -> ((dde)$$2x.b()).a($$3, $$0.F_()))
         .map(cyy::h)
         .filter(cxx.class::isInstance)
         .map(cxx.class::cast)
         .map(cxx::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static ddd a(cxw $$0, cxw $$1) {
      return ddd.a(2, 1, List.of(new cyy(cxx.a($$0)), new cyy(cxx.a($$1))));
   }
}
