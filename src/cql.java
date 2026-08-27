import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum cql implements ayg {
   a(0, "white", 16383998, elf.i, 15790320, 16777215),
   b(1, "orange", 16351261, elf.p, 15435844, 16738335),
   c(2, "magenta", 13061821, elf.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, elf.r, 6719955, 10141901),
   e(4, "yellow", 16701501, elf.s, 14602026, 16776960),
   f(5, "lime", 8439583, elf.t, 4312372, 12582656),
   g(6, "pink", 15961002, elf.u, 14188952, 16738740),
   h(7, "gray", 4673362, elf.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, elf.w, 11250603, 13882323),
   j(9, "cyan", 1481884, elf.x, 2651799, 65535),
   k(10, "purple", 8991416, elf.y, 8073150, 10494192),
   l(11, "blue", 3949738, elf.z, 2437522, 255),
   m(12, "brown", 8606770, elf.A, 5320730, 9127187),
   n(13, "green", 6192150, elf.B, 3887386, 65280),
   o(14, "red", 11546150, elf.C, 11743532, 16711680),
   p(15, "black", 1908001, elf.D, 1973019, 0);

   private static final IntFunction<cql> s = awd.a(cql::a, values(), awd.a.a);
   private static final Int2ObjectOpenHashMap<cql> t = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.y, $$0 -> (cql)$$0))
   );
   public static final ayg.a<cql> q = ayg.a(cql::values);
   public static final yg<ByteBuf, cql> r = ye.a(s, cql::a);
   private final int u;
   private final String v;
   private final elf w;
   private final float[] x;
   private final int y;
   private final int z;

   private cql(int $$0, String $$1, int $$2, elf $$3, int $$4, int $$5) {
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

   public elf e() {
      return this.w;
   }

   public int f() {
      return this.y;
   }

   public int g() {
      return this.z;
   }

   public static cql a(int $$0) {
      return s.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static cql a(String $$0, @Nullable cql $$1) {
      cql $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static cql b(int $$0) {
      return (cql)t.get($$0);
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
