import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dkt(String m, djv n, deb o, deb p, arq q, arq r) {
   private static final Map<String, dkt> s = new Object2ObjectArrayMap();
   public static final Codec<dkt> a = atv.a(dkt::b, s::get);
   public static final dkt b = a(new dkt("oak", djv.g));
   public static final dkt c = a(new dkt("spruce", djv.h));
   public static final dkt d = a(new dkt("birch", djv.i));
   public static final dkt e = a(new dkt("acacia", djv.j));
   public static final dkt f = a(new dkt("cherry", djv.k, deb.aU, deb.aX, arr.eo, arr.ep));
   public static final dkt g = a(new dkt("jungle", djv.l));
   public static final dkt h = a(new dkt("dark_oak", djv.m));
   public static final dkt i = a(new dkt("crimson", djv.n, deb.aT, deb.aQ, arr.qb, arr.qc));
   public static final dkt j = a(new dkt("warped", djv.o, deb.aT, deb.aQ, arr.qb, arr.qc));
   public static final dkt k = a(new dkt("mangrove", djv.p));
   public static final dkt l = a(new dkt("bamboo", djv.q, deb.aS, deb.aR, arr.bh, arr.bi));

   public dkt(String $$0, djv $$1) {
      this($$0, $$1, deb.b, deb.aP, arr.ie, arr.if);
   }

   private static dkt a(dkt $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dkt> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public djv c() {
      return this.n;
   }

   public deb d() {
      return this.o;
   }

   public deb e() {
      return this.p;
   }

   public arq f() {
      return this.q;
   }

   public arq g() {
      return this.r;
   }
}
