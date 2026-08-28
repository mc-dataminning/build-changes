import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cyl implements bak {
   a(0, "white", 16383998, exe.i, 15790320, 16777215),
   b(1, "orange", 16351261, exe.p, 15435844, 16738335),
   c(2, "magenta", 13061821, exe.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, exe.r, 6719955, 10141901),
   e(4, "yellow", 16701501, exe.s, 14602026, 16776960),
   f(5, "lime", 8439583, exe.t, 4312372, 12582656),
   g(6, "pink", 15961002, exe.u, 14188952, 16738740),
   h(7, "gray", 4673362, exe.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, exe.w, 11250603, 13882323),
   j(9, "cyan", 1481884, exe.x, 2651799, 65535),
   k(10, "purple", 8991416, exe.y, 8073150, 10494192),
   l(11, "blue", 3949738, exe.z, 2437522, 255),
   m(12, "brown", 8606770, exe.A, 5320730, 9127187),
   n(13, "green", 6192150, exe.B, 3887386, 65280),
   o(14, "red", 11546150, exe.C, 11743532, 16711680),
   p(15, "black", 1908001, exe.D, 1973019, 0);

   private static final IntFunction<cyl> t = ayc.a(cyl::a, values(), ayc.a.a);
   private static final Int2ObjectOpenHashMap<cyl> u = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> (cyl)$$0))
   );
   public static final bak.a<cyl> q = bak.a(cyl::values);
   public static final yw<ByteBuf, cyl> r = yu.a(t, cyl::a);
   @Deprecated
   public static final Codec<cyl> s = Codec.BYTE.xmap(cyl::a, $$0 -> (byte)$$0.v);
   private final int v;
   private final String w;
   private final exe x;
   private final int y;
   private final int z;
   private final int A;

   private cyl(final int $$0, final String $$1, final int $$2, final exe $$3, final int $$4, final int $$5) {
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

   public exe e() {
      return this.x;
   }

   public int f() {
      return this.z;
   }

   public int g() {
      return this.A;
   }

   public static cyl a(int $$0) {
      return t.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cyl a(String $$0, @Nullable cyl $$1) {
      cyl $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cyl b(int $$0) {
      return (cyl)u.get($$0);
   }

   @Override
   public String toString() {
      return this.w;
   }

   @Override
   public String c() {
      return this.w;
   }

   public static cyl a(arq $$0, cyl $$1, cyl $$2) {
      dds $$3 = a($$1, $$2);
      return $$0.t()
         .a(dep.a, $$3, $$0)
         .map($$2x -> ((ddt)$$2x.b()).a($$3, $$0.F_()))
         .map(czn::h)
         .filter(cym.class::isInstance)
         .map(cym.class::cast)
         .map(cym::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dds a(cyl $$0, cyl $$1) {
      return dds.a(2, 1, List.of(new czn(cym.a($$0)), new czn(cym.a($$1))));
   }
}
