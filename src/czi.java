import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum czi implements bax {
   a(0, "white", 16383998, eye.i, 15790320, 16777215),
   b(1, "orange", 16351261, eye.p, 15435844, 16738335),
   c(2, "magenta", 13061821, eye.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, eye.r, 6719955, 10141901),
   e(4, "yellow", 16701501, eye.s, 14602026, 16776960),
   f(5, "lime", 8439583, eye.t, 4312372, 12582656),
   g(6, "pink", 15961002, eye.u, 14188952, 16738740),
   h(7, "gray", 4673362, eye.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, eye.w, 11250603, 13882323),
   j(9, "cyan", 1481884, eye.x, 2651799, 65535),
   k(10, "purple", 8991416, eye.y, 8073150, 10494192),
   l(11, "blue", 3949738, eye.z, 2437522, 255),
   m(12, "brown", 8606770, eye.A, 5320730, 9127187),
   n(13, "green", 6192150, eye.B, 3887386, 65280),
   o(14, "red", 11546150, eye.C, 11743532, 16711680),
   p(15, "black", 1908001, eye.D, 1973019, 0);

   private static final IntFunction<czi> t = ayo.a(czi::a, values(), ayo.a.a);
   private static final Int2ObjectOpenHashMap<czi> u = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> (czi)$$0))
   );
   public static final bax.a<czi> q = bax.a(czi::values);
   public static final ze<ByteBuf, czi> r = zc.a(t, czi::a);
   @Deprecated
   public static final Codec<czi> s = Codec.BYTE.xmap(czi::a, $$0 -> (byte)$$0.v);
   private final int v;
   private final String w;
   private final eye x;
   private final int y;
   private final int z;
   private final int A;

   private czi(final int $$0, final String $$1, final int $$2, final eye $$3, final int $$4, final int $$5) {
      this.v = $$0;
      this.w = $$1;
      this.x = $$3;
      this.A = $$5;
      this.y = ayh.f($$2);
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

   public eye e() {
      return this.x;
   }

   public int f() {
      return this.z;
   }

   public int g() {
      return this.A;
   }

   public static czi a(int $$0) {
      return t.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static czi a(String $$0, @Nullable czi $$1) {
      czi $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static czi b(int $$0) {
      return (czi)u.get($$0);
   }

   @Override
   public String toString() {
      return this.w;
   }

   @Override
   public String c() {
      return this.w;
   }

   public static czi a(asb $$0, czi $$1, czi $$2) {
      dep $$3 = a($$1, $$2);
      return $$0.t()
         .a(dfm.a, $$3, $$0)
         .map($$2x -> ((deq)$$2x.b()).a($$3, $$0.J_()))
         .map(dak::h)
         .filter(czj.class::isInstance)
         .map(czj.class::cast)
         .map(czj::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dep a(czi $$0, czi $$1) {
      return dep.a(2, 1, List.of(new dak(czj.a($$0)), new dak(czj.a($$1))));
   }
}
