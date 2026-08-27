import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dja(String m, dic n, dcr o, dcr p, aqu q, aqu r) {
   private static final Map<String, dja> s = new Object2ObjectArrayMap();
   public static final Codec<dja> a = asy.a(dja::b, s::get);
   public static final dja b = a(new dja("oak", dic.g));
   public static final dja c = a(new dja("spruce", dic.h));
   public static final dja d = a(new dja("birch", dic.i));
   public static final dja e = a(new dja("acacia", dic.j));
   public static final dja f = a(new dja("cherry", dic.k, dcr.aU, dcr.aX, aqv.ef, aqv.eg));
   public static final dja g = a(new dja("jungle", dic.l));
   public static final dja h = a(new dja("dark_oak", dic.m));
   public static final dja i = a(new dja("crimson", dic.n, dcr.aT, dcr.aQ, aqv.pH, aqv.pI));
   public static final dja j = a(new dja("warped", dic.o, dcr.aT, dcr.aQ, aqv.pH, aqv.pI));
   public static final dja k = a(new dja("mangrove", dic.p));
   public static final dja l = a(new dja("bamboo", dic.q, dcr.aS, dcr.aR, aqv.bh, aqv.bi));

   public dja(String $$0, dic $$1) {
      this($$0, $$1, dcr.b, dcr.aP, aqv.hV, aqv.hW);
   }

   private static dja a(dja $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dja> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dic c() {
      return this.n;
   }

   public dcr d() {
      return this.o;
   }

   public dcr e() {
      return this.p;
   }

   public aqu f() {
      return this.q;
   }

   public aqu g() {
      return this.r;
   }
}
