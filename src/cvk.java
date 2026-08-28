import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cvk implements azu {
   a(0, "white", 16383998, etb.i, 15790320, 16777215),
   b(1, "orange", 16351261, etb.p, 15435844, 16738335),
   c(2, "magenta", 13061821, etb.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, etb.r, 6719955, 10141901),
   e(4, "yellow", 16701501, etb.s, 14602026, 16776960),
   f(5, "lime", 8439583, etb.t, 4312372, 12582656),
   g(6, "pink", 15961002, etb.u, 14188952, 16738740),
   h(7, "gray", 4673362, etb.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, etb.w, 11250603, 13882323),
   j(9, "cyan", 1481884, etb.x, 2651799, 65535),
   k(10, "purple", 8991416, etb.y, 8073150, 10494192),
   l(11, "blue", 3949738, etb.z, 2437522, 255),
   m(12, "brown", 8606770, etb.A, 5320730, 9127187),
   n(13, "green", 6192150, etb.B, 3887386, 65280),
   o(14, "red", 11546150, etb.C, 11743532, 16711680),
   p(15, "black", 1908001, etb.D, 1973019, 0);

   private static final IntFunction<cvk> s = axp.a(cvk::a, values(), axp.a.a);
   private static final Int2ObjectOpenHashMap<cvk> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cvk)$$0))
   );
   public static final azu.a<cvk> q = azu.a(cvk::values);
   public static final ym<ByteBuf, cvk> r = yk.a(s, cvk::a);
   private final int u;
   private final String v;
   private final etb w;
   private final int x;
   private final int y;
   private final int z;

   private cvk(final int $$0, final String $$1, final int $$2, final etb $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = axj.f($$2);
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

   public etb e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cvk a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cvk a(String $$0, @Nullable cvk $$1) {
      cvk $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cvk b(int $$0) {
      return (cvk)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cvk a(arc $$0, cvk $$1, cvk $$2) {
      daq $$3 = a($$1, $$2);
      return $$0.t()
         .a(dbn.a, $$3, $$0)
         .map($$2x -> ((dar)$$2x.b()).a($$3, $$0.K_()))
         .map(cwn::h)
         .filter(cvl.class::isInstance)
         .map(cvl.class::cast)
         .map(cvl::b)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static daq a(cvk $$0, cvk $$1) {
      return daq.a(2, 1, List.of(new cwn(cvl.a($$0)), new cwn(cvl.a($$1))));
   }
}
