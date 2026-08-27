import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum csy implements azg, cxx {
   a(0, "white", 16383998, epi.i, 15790320, 16777215),
   b(1, "orange", 16351261, epi.p, 15435844, 16738335),
   c(2, "magenta", 13061821, epi.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, epi.r, 6719955, 10141901),
   e(4, "yellow", 16701501, epi.s, 14602026, 16776960),
   f(5, "lime", 8439583, epi.t, 4312372, 12582656),
   g(6, "pink", 15961002, epi.u, 14188952, 16738740),
   h(7, "gray", 4673362, epi.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, epi.w, 11250603, 13882323),
   j(9, "cyan", 1481884, epi.x, 2651799, 65535),
   k(10, "purple", 8991416, epi.y, 8073150, 10494192),
   l(11, "blue", 3949738, epi.z, 2437522, 255),
   m(12, "brown", 8606770, epi.A, 5320730, 9127187),
   n(13, "green", 6192150, epi.B, 3887386, 65280),
   o(14, "red", 11546150, epi.C, 11743532, 16711680),
   p(15, "black", 1908001, epi.D, 1973019, 0);

   private static final IntFunction<csy> s = axd.a(csy::a, values(), axd.a.a);
   private static final Int2ObjectOpenHashMap<csy> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (csy)$$0))
   );
   public static final azg.a<csy> q = azg.a(csy::values);
   public static final zc<ByteBuf, csy> r = za.a(s, csy::a);
   private final int u;
   private final String v;
   private final epi w;
   private final float[] x;
   private final int y;
   private final int z;

   private csy(int $$0, String $$1, int $$2, epi $$3, int $$4, int $$5) {
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

   public epi e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static csy a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static csy a(String $$0, @Nullable csy $$1) {
      csy $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static csy b(int $$0) {
      return (csy)t.get($$0);
   }

   @Override
   public String toString() {
      return this.v;
   }

   @Override
   public String c() {
      return this.v;
   }

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      String $$2 = this.v.substring(0, 1).toUpperCase();
      String $$3 = $$2 + this.v.substring(1);
      $$0.accept(xe.a("baseColor.tooltip", $$3).b(this.z));
   }
}
