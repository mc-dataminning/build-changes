import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dzd(String n, dyf o, drx p, drx q, avz r, avz s) {
   private static final Map<String, dzd> t = new Object2ObjectArrayMap();
   public static final Codec<dzd> a = Codec.stringResolver(dzd::b, t::get);
   public static final dzd b = a(new dzd("oak", dyf.g));
   public static final dzd c = a(new dzd("spruce", dyf.h));
   public static final dzd d = a(new dzd("birch", dyf.i));
   public static final dzd e = a(new dzd("acacia", dyf.j));
   public static final dzd f = a(new dzd("cherry", dyf.k, drx.aV, drx.aY, awa.eO, awa.eP));
   public static final dzd g = a(new dzd("jungle", dyf.l));
   public static final dzd h = a(new dzd("dark_oak", dyf.m));
   public static final dzd i = a(new dzd("pale_oak", dyf.n));
   public static final dzd j = a(new dzd("crimson", dyf.o, drx.aU, drx.aR, awa.rE, awa.rF));
   public static final dzd k = a(new dzd("warped", dyf.p, drx.aU, drx.aR, awa.rE, awa.rF));
   public static final dzd l = a(new dzd("mangrove", dyf.q));
   public static final dzd m = a(new dzd("bamboo", dyf.r, drx.aT, drx.aS, awa.bw, awa.bx));

   public dzd(String $$0, dyf $$1) {
      this($$0, $$1, drx.b, drx.aQ, awa.ji, awa.jj);
   }

   private static dzd a(dzd $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dzd> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dyf c() {
      return this.o;
   }

   public drx d() {
      return this.p;
   }

   public drx e() {
      return this.q;
   }

   public avz f() {
      return this.r;
   }

   public avz g() {
      return this.s;
   }
}
