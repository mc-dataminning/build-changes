import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cvn implements azv {
   a(0, "white", 16383998, ete.i, 15790320, 16777215),
   b(1, "orange", 16351261, ete.p, 15435844, 16738335),
   c(2, "magenta", 13061821, ete.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, ete.r, 6719955, 10141901),
   e(4, "yellow", 16701501, ete.s, 14602026, 16776960),
   f(5, "lime", 8439583, ete.t, 4312372, 12582656),
   g(6, "pink", 15961002, ete.u, 14188952, 16738740),
   h(7, "gray", 4673362, ete.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, ete.w, 11250603, 13882323),
   j(9, "cyan", 1481884, ete.x, 2651799, 65535),
   k(10, "purple", 8991416, ete.y, 8073150, 10494192),
   l(11, "blue", 3949738, ete.z, 2437522, 255),
   m(12, "brown", 8606770, ete.A, 5320730, 9127187),
   n(13, "green", 6192150, ete.B, 3887386, 65280),
   o(14, "red", 11546150, ete.C, 11743532, 16711680),
   p(15, "black", 1908001, ete.D, 1973019, 0);

   private static final IntFunction<cvn> s = axq.a(cvn::a, values(), axq.a.a);
   private static final Int2ObjectOpenHashMap<cvn> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cvn)$$0))
   );
   public static final azv.a<cvn> q = azv.a(cvn::values);
   public static final yn<ByteBuf, cvn> r = yl.a(s, cvn::a);
   private final int u;
   private final String v;
   private final ete w;
   private final int x;
   private final int y;
   private final int z;

   private cvn(final int $$0, final String $$1, final int $$2, final ete $$3, final int $$4, final int $$5) {
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

   public ete e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cvn a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cvn a(String $$0, @Nullable cvn $$1) {
      cvn $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cvn b(int $$0) {
      return (cvn)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cvn a(ard $$0, cvn $$1, cvn $$2) {
      dat $$3 = a($$1, $$2);
      return $$0.t()
         .a(dbq.a, $$3, $$0)
         .map($$2x -> ((dau)$$2x.b()).a($$3, $$0.K_()))
         .map(cwq::h)
         .filter(cvo.class::isInstance)
         .map(cvo.class::cast)
         .map(cvo::b)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dat a(cvn $$0, cvn $$1) {
      return dat.a(2, 1, List.of(new cwq(cvo.a($$0)), new cwq(cvo.a($$1))));
   }
}
