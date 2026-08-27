import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dku(String m, djw n, dec o, dec p, arr q, arr r) {
   private static final Map<String, dku> s = new Object2ObjectArrayMap();
   public static final Codec<dku> a = atw.a(dku::b, s::get);
   public static final dku b = a(new dku("oak", djw.g));
   public static final dku c = a(new dku("spruce", djw.h));
   public static final dku d = a(new dku("birch", djw.i));
   public static final dku e = a(new dku("acacia", djw.j));
   public static final dku f = a(new dku("cherry", djw.k, dec.aU, dec.aX, ars.eo, ars.ep));
   public static final dku g = a(new dku("jungle", djw.l));
   public static final dku h = a(new dku("dark_oak", djw.m));
   public static final dku i = a(new dku("crimson", djw.n, dec.aT, dec.aQ, ars.qb, ars.qc));
   public static final dku j = a(new dku("warped", djw.o, dec.aT, dec.aQ, ars.qb, ars.qc));
   public static final dku k = a(new dku("mangrove", djw.p));
   public static final dku l = a(new dku("bamboo", djw.q, dec.aS, dec.aR, ars.bh, ars.bi));

   public dku(String $$0, djw $$1) {
      this($$0, $$1, dec.b, dec.aP, ars.ie, ars.if);
   }

   private static dku a(dku $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dku> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public djw c() {
      return this.n;
   }

   public dec d() {
      return this.o;
   }

   public dec e() {
      return this.p;
   }

   public arr f() {
      return this.q;
   }

   public arr g() {
      return this.r;
   }
}
