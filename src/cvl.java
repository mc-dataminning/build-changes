import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cvl implements azv {
   a(0, "white", 16383998, etc.i, 15790320, 16777215),
   b(1, "orange", 16351261, etc.p, 15435844, 16738335),
   c(2, "magenta", 13061821, etc.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, etc.r, 6719955, 10141901),
   e(4, "yellow", 16701501, etc.s, 14602026, 16776960),
   f(5, "lime", 8439583, etc.t, 4312372, 12582656),
   g(6, "pink", 15961002, etc.u, 14188952, 16738740),
   h(7, "gray", 4673362, etc.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, etc.w, 11250603, 13882323),
   j(9, "cyan", 1481884, etc.x, 2651799, 65535),
   k(10, "purple", 8991416, etc.y, 8073150, 10494192),
   l(11, "blue", 3949738, etc.z, 2437522, 255),
   m(12, "brown", 8606770, etc.A, 5320730, 9127187),
   n(13, "green", 6192150, etc.B, 3887386, 65280),
   o(14, "red", 11546150, etc.C, 11743532, 16711680),
   p(15, "black", 1908001, etc.D, 1973019, 0);

   private static final IntFunction<cvl> s = axq.a(cvl::a, values(), axq.a.a);
   private static final Int2ObjectOpenHashMap<cvl> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cvl)$$0))
   );
   public static final azv.a<cvl> q = azv.a(cvl::values);
   public static final yn<ByteBuf, cvl> r = yl.a(s, cvl::a);
   private final int u;
   private final String v;
   private final etc w;
   private final int x;
   private final int y;
   private final int z;

   private cvl(final int $$0, final String $$1, final int $$2, final etc $$3, final int $$4, final int $$5) {
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

   public etc e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cvl a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cvl a(String $$0, @Nullable cvl $$1) {
      cvl $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cvl b(int $$0) {
      return (cvl)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cvl a(ard $$0, cvl $$1, cvl $$2) {
      dar $$3 = a($$1, $$2);
      return $$0.t()
         .a(dbo.a, $$3, $$0)
         .map($$2x -> ((das)$$2x.b()).a($$3, $$0.K_()))
         .map(cwo::h)
         .filter(cvm.class::isInstance)
         .map(cvm.class::cast)
         .map(cvm::b)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dar a(cvl $$0, cvl $$1) {
      return dar.a(2, 1, List.of(new cwo(cvm.a($$0)), new cwo(cvm.a($$1))));
   }
}
