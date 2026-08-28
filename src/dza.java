import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dza(String n, dyd o, drv p, drv q, awu r, awu s) {
   private static final Map<String, dza> t = new Object2ObjectArrayMap();
   public static final Codec<dza> a = Codec.stringResolver(dza::b, t::get);
   public static final dza b = a(new dza("oak", dyd.g));
   public static final dza c = a(new dza("spruce", dyd.h));
   public static final dza d = a(new dza("birch", dyd.i));
   public static final dza e = a(new dza("acacia", dyd.j));
   public static final dza f = a(new dza("cherry", dyd.k, drv.aU, drv.aX, awv.eO, awv.eP));
   public static final dza g = a(new dza("jungle", dyd.l));
   public static final dza h = a(new dza("dark_oak", dyd.m));
   public static final dza i = a(new dza("pale_oak", dyd.n));
   public static final dza j = a(new dza("crimson", dyd.o, drv.aT, drv.aQ, awv.ru, awv.rv));
   public static final dza k = a(new dza("warped", dyd.p, drv.aT, drv.aQ, awv.ru, awv.rv));
   public static final dza l = a(new dza("mangrove", dyd.q));
   public static final dza m = a(new dza("bamboo", dyd.r, drv.aS, drv.aR, awv.bw, awv.bx));

   public dza(String $$0, dyd $$1) {
      this($$0, $$1, drv.b, drv.aP, awv.ji, awv.jj);
   }

   private static dza a(dza $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dza> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dyd c() {
      return this.o;
   }

   public drv d() {
      return this.p;
   }

   public drv e() {
      return this.q;
   }

   public awu f() {
      return this.r;
   }

   public awu g() {
      return this.s;
   }
}
