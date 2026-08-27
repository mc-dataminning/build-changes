import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dlc(String m, dke n, dek o, dek p, ars q, ars r) {
   private static final Map<String, dlc> s = new Object2ObjectArrayMap();
   public static final Codec<dlc> a = atx.a(dlc::b, s::get);
   public static final dlc b = a(new dlc("oak", dke.g));
   public static final dlc c = a(new dlc("spruce", dke.h));
   public static final dlc d = a(new dlc("birch", dke.i));
   public static final dlc e = a(new dlc("acacia", dke.j));
   public static final dlc f = a(new dlc("cherry", dke.k, dek.aU, dek.aX, art.eD, art.eE));
   public static final dlc g = a(new dlc("jungle", dke.l));
   public static final dlc h = a(new dlc("dark_oak", dke.m));
   public static final dlc i = a(new dlc("crimson", dke.n, dek.aT, dek.aQ, art.qq, art.qr));
   public static final dlc j = a(new dlc("warped", dke.o, dek.aT, dek.aQ, art.qq, art.qr));
   public static final dlc k = a(new dlc("mangrove", dke.p));
   public static final dlc l = a(new dlc("bamboo", dke.q, dek.aS, dek.aR, art.bt, art.bu));

   public dlc(String $$0, dke $$1) {
      this($$0, $$1, dek.b, dek.aP, art.it, art.iu);
   }

   private static dlc a(dlc $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dlc> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dke c() {
      return this.n;
   }

   public dek d() {
      return this.o;
   }

   public dek e() {
      return this.p;
   }

   public ars f() {
      return this.q;
   }

   public ars g() {
      return this.r;
   }
}
