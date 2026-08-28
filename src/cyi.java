import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cyi implements bak {
   a(0, "white", 16383998, ewz.i, 15790320, 16777215),
   b(1, "orange", 16351261, ewz.p, 15435844, 16738335),
   c(2, "magenta", 13061821, ewz.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, ewz.r, 6719955, 10141901),
   e(4, "yellow", 16701501, ewz.s, 14602026, 16776960),
   f(5, "lime", 8439583, ewz.t, 4312372, 12582656),
   g(6, "pink", 15961002, ewz.u, 14188952, 16738740),
   h(7, "gray", 4673362, ewz.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, ewz.w, 11250603, 13882323),
   j(9, "cyan", 1481884, ewz.x, 2651799, 65535),
   k(10, "purple", 8991416, ewz.y, 8073150, 10494192),
   l(11, "blue", 3949738, ewz.z, 2437522, 255),
   m(12, "brown", 8606770, ewz.A, 5320730, 9127187),
   n(13, "green", 6192150, ewz.B, 3887386, 65280),
   o(14, "red", 11546150, ewz.C, 11743532, 16711680),
   p(15, "black", 1908001, ewz.D, 1973019, 0);

   private static final IntFunction<cyi> t = ayc.a(cyi::a, values(), ayc.a.a);
   private static final Int2ObjectOpenHashMap<cyi> u = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> (cyi)$$0))
   );
   public static final bak.a<cyi> q = bak.a(cyi::values);
   public static final yw<ByteBuf, cyi> r = yu.a(t, cyi::a);
   @Deprecated
   public static final Codec<cyi> s = Codec.BYTE.xmap(cyi::a, $$0 -> (byte)$$0.v);
   private final int v;
   private final String w;
   private final ewz x;
   private final int y;
   private final int z;
   private final int A;

   private cyi(final int $$0, final String $$1, final int $$2, final ewz $$3, final int $$4, final int $$5) {
      this.v = $$0;
      this.w = $$1;
      this.x = $$3;
      this.A = $$5;
      this.y = axw.f($$2);
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

   public ewz e() {
      return this.x;
   }

   public int f() {
      return this.z;
   }

   public int g() {
      return this.A;
   }

   public static cyi a(int $$0) {
      return t.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cyi a(String $$0, @Nullable cyi $$1) {
      cyi $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cyi b(int $$0) {
      return (cyi)u.get($$0);
   }

   @Override
   public String toString() {
      return this.w;
   }

   @Override
   public String c() {
      return this.w;
   }

   public static cyi a(arq $$0, cyi $$1, cyi $$2) {
      ddp $$3 = a($$1, $$2);
      return $$0.t()
         .a(dem.a, $$3, $$0)
         .map($$2x -> ((ddq)$$2x.b()).a($$3, $$0.F_()))
         .map(czk::h)
         .filter(cyj.class::isInstance)
         .map(cyj.class::cast)
         .map(cyj::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static ddp a(cyi $$0, cyi $$1) {
      return ddp.a(2, 1, List.of(new czk(cyj.a($$0)), new czk(cyj.a($$1))));
   }
}
