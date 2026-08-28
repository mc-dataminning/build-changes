import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cwv implements bag {
   a(0, "white", 16383998, eux.i, 15790320, 16777215),
   b(1, "orange", 16351261, eux.p, 15435844, 16738335),
   c(2, "magenta", 13061821, eux.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, eux.r, 6719955, 10141901),
   e(4, "yellow", 16701501, eux.s, 14602026, 16776960),
   f(5, "lime", 8439583, eux.t, 4312372, 12582656),
   g(6, "pink", 15961002, eux.u, 14188952, 16738740),
   h(7, "gray", 4673362, eux.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, eux.w, 11250603, 13882323),
   j(9, "cyan", 1481884, eux.x, 2651799, 65535),
   k(10, "purple", 8991416, eux.y, 8073150, 10494192),
   l(11, "blue", 3949738, eux.z, 2437522, 255),
   m(12, "brown", 8606770, eux.A, 5320730, 9127187),
   n(13, "green", 6192150, eux.B, 3887386, 65280),
   o(14, "red", 11546150, eux.C, 11743532, 16711680),
   p(15, "black", 1908001, eux.D, 1973019, 0);

   private static final IntFunction<cwv> s = aya.a(cwv::a, values(), aya.a.a);
   private static final Int2ObjectOpenHashMap<cwv> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cwv)$$0))
   );
   public static final bag.a<cwv> q = bag.a(cwv::values);
   public static final yt<ByteBuf, cwv> r = yr.a(s, cwv::a);
   private final int u;
   private final String v;
   private final eux w;
   private final int x;
   private final int y;
   private final int z;

   private cwv(final int $$0, final String $$1, final int $$2, final eux $$3, final int $$4, final int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      this.x = axu.f($$2);
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

   public eux e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cwv a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cwv a(String $$0, @Nullable cwv $$1) {
      cwv $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cwv b(int $$0) {
      return (cwv)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   public static cwv a(arn $$0, cwv $$1, cwv $$2) {
      dbz $$3 = a($$1, $$2);
      return $$0.t()
         .a(dcw.a, $$3, $$0)
         .map($$2x -> ((dca)$$2x.b()).a($$3, $$0.F_()))
         .map(cxy::h)
         .filter(cww.class::isInstance)
         .map(cww.class::cast)
         .map(cww::b)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dbz a(cwv $$0, cwv $$1) {
      return dbz.a(2, 1, List.of(new cxy(cww.a($$0)), new cxy(cww.a($$1))));
   }
}
