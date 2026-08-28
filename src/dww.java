import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dww(String m, dvy n, dpr o, dpr p, awk q, awk r) {
   private static final Map<String, dww> s = new Object2ObjectArrayMap();
   public static final Codec<dww> a = Codec.stringResolver(dww::b, s::get);
   public static final dww b = a(new dww("oak", dvy.g));
   public static final dww c = a(new dww("spruce", dvy.h));
   public static final dww d = a(new dww("birch", dvy.i));
   public static final dww e = a(new dww("acacia", dvy.j));
   public static final dww f = a(new dww("cherry", dvy.k, dpr.aU, dpr.aX, awl.eN, awl.eO));
   public static final dww g = a(new dww("jungle", dvy.l));
   public static final dww h = a(new dww("dark_oak", dvy.m));
   public static final dww i = a(new dww("crimson", dvy.n, dpr.aT, dpr.aQ, awl.qV, awl.qW));
   public static final dww j = a(new dww("warped", dvy.o, dpr.aT, dpr.aQ, awl.qV, awl.qW));
   public static final dww k = a(new dww("mangrove", dvy.p));
   public static final dww l = a(new dww("bamboo", dvy.q, dpr.aS, dpr.aR, awl.bw, awl.bx));

   public dww(String $$0, dvy $$1) {
      this($$0, $$1, dpr.b, dpr.aP, awl.iJ, awl.iK);
   }

   private static dww a(dww $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dww> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dvy c() {
      return this.n;
   }

   public dpr d() {
      return this.o;
   }

   public dpr e() {
      return this.p;
   }

   public awk f() {
      return this.q;
   }

   public awk g() {
      return this.r;
   }
}
