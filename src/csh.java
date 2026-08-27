import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum csh implements ayx {
   a(0, "white", 16383998, emy.i, 15790320, 16777215),
   b(1, "orange", 16351261, emy.p, 15435844, 16738335),
   c(2, "magenta", 13061821, emy.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, emy.r, 6719955, 10141901),
   e(4, "yellow", 16701501, emy.s, 14602026, 16776960),
   f(5, "lime", 8439583, emy.t, 4312372, 12582656),
   g(6, "pink", 15961002, emy.u, 14188952, 16738740),
   h(7, "gray", 4673362, emy.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, emy.w, 11250603, 13882323),
   j(9, "cyan", 1481884, emy.x, 2651799, 65535),
   k(10, "purple", 8991416, emy.y, 8073150, 10494192),
   l(11, "blue", 3949738, emy.z, 2437522, 255),
   m(12, "brown", 8606770, emy.A, 5320730, 9127187),
   n(13, "green", 6192150, emy.B, 3887386, 65280),
   o(14, "red", 11546150, emy.C, 11743532, 16711680),
   p(15, "black", 1908001, emy.D, 1973019, 0);

   private static final IntFunction<csh> s = awv.a(csh::a, values(), awv.a.a);
   private static final Int2ObjectOpenHashMap<csh> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (csh)$$0))
   );
   public static final ayx.a<csh> q = ayx.a(csh::values);
   public static final yv<ByteBuf, csh> r = yt.a(s, csh::a);
   private final int u;
   private final String v;
   private final emy w;
   private final float[] x;
   private final int y;
   private final int z;

   private csh(int $$0, String $$1, int $$2, emy $$3, int $$4, int $$5) {
      this.u = $$0;
      this.v = $$1;
      this.w = $$3;
      this.z = $$5;
      int $$6 = ($$2 & 0xFF0000) >> 16;
      int $$7 = ($$2 & 0xFF00) >> 8;
      int $$8 = ($$2 & 0xFF) >> 0;
      this.x = new float[]{(float)$$6 / 255.0F, (float)$$7 / 255.0F, (float)$$8 / 255.0F};
      this.y = $$4;
   }

   public int a() {
      return this.u;
   }

   public String b() {
      return this.v;
   }

   public float[] d() {
      return this.x;
   }

   public emy e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static csh a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static csh a(String $$0, @Nullable csh $$1) {
      csh $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static csh b(int $$0) {
      return (csh)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }
}
