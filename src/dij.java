import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dij(String m, dhl n, dcf o, dcf p, aqm q, aqm r) {
   private static final Map<String, dij> s = new Object2ObjectArrayMap();
   public static final Codec<dij> a = asq.a(dij::b, s::get);
   public static final dij b = a(new dij("oak", dhl.f));
   public static final dij c = a(new dij("spruce", dhl.g));
   public static final dij d = a(new dij("birch", dhl.h));
   public static final dij e = a(new dij("acacia", dhl.i));
   public static final dij f = a(new dij("cherry", dhl.j, dcf.aQ, dcf.aT, aqn.ef, aqn.eg));
   public static final dij g = a(new dij("jungle", dhl.k));
   public static final dij h = a(new dij("dark_oak", dhl.l));
   public static final dij i = a(new dij("crimson", dhl.m, dcf.aP, dcf.aM, aqn.pr, aqn.ps));
   public static final dij j = a(new dij("warped", dhl.n, dcf.aP, dcf.aM, aqn.pr, aqn.ps));
   public static final dij k = a(new dij("mangrove", dhl.o));
   public static final dij l = a(new dij("bamboo", dhl.p, dcf.aO, dcf.aN, aqn.bh, aqn.bi));

   public dij(String $$0, dhl $$1) {
      this($$0, $$1, dcf.b, dcf.aL, aqn.hF, aqn.hG);
   }

   private static dij a(dij $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dij> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dhl c() {
      return this.n;
   }

   public dcf d() {
      return this.o;
   }

   public dcf e() {
      return this.p;
   }

   public aqm f() {
      return this.q;
   }

   public aqm g() {
      return this.r;
   }
}
