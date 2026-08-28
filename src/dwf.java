import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dwf(String m, dvh n, dpa o, dpa p, awf q, awf r) {
   private static final Map<String, dwf> s = new Object2ObjectArrayMap();
   public static final Codec<dwf> a = Codec.stringResolver(dwf::b, s::get);
   public static final dwf b = a(new dwf("oak", dvh.g));
   public static final dwf c = a(new dwf("spruce", dvh.h));
   public static final dwf d = a(new dwf("birch", dvh.i));
   public static final dwf e = a(new dwf("acacia", dvh.j));
   public static final dwf f = a(new dwf("cherry", dvh.k, dpa.aU, dpa.aX, awg.eN, awg.eO));
   public static final dwf g = a(new dwf("jungle", dvh.l));
   public static final dwf h = a(new dwf("dark_oak", dvh.m));
   public static final dwf i = a(new dwf("crimson", dvh.n, dpa.aT, dpa.aQ, awg.qX, awg.qY));
   public static final dwf j = a(new dwf("warped", dvh.o, dpa.aT, dpa.aQ, awg.qX, awg.qY));
   public static final dwf k = a(new dwf("mangrove", dvh.p));
   public static final dwf l = a(new dwf("bamboo", dvh.q, dpa.aS, dpa.aR, awg.bw, awg.bx));

   public dwf(String $$0, dvh $$1) {
      this($$0, $$1, dpa.b, dpa.aP, awg.iJ, awg.iK);
   }

   private static dwf a(dwf $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dwf> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dvh c() {
      return this.n;
   }

   public dpa d() {
      return this.o;
   }

   public dpa e() {
      return this.p;
   }

   public awf f() {
      return this.q;
   }

   public awf g() {
      return this.r;
   }
}
