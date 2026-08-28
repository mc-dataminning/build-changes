import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dty(String m, dta n, dmv o, dmv p, avg q, avg r) {
   private static final Map<String, dty> s = new Object2ObjectArrayMap();
   public static final Codec<dty> a = Codec.stringResolver(dty::b, s::get);
   public static final dty b = a(new dty("oak", dta.g));
   public static final dty c = a(new dty("spruce", dta.h));
   public static final dty d = a(new dty("birch", dta.i));
   public static final dty e = a(new dty("acacia", dta.j));
   public static final dty f = a(new dty("cherry", dta.k, dmv.aU, dmv.aX, avh.eM, avh.eN));
   public static final dty g = a(new dty("jungle", dta.l));
   public static final dty h = a(new dty("dark_oak", dta.m));
   public static final dty i = a(new dty("crimson", dta.n, dmv.aT, dmv.aQ, avh.qW, avh.qX));
   public static final dty j = a(new dty("warped", dta.o, dmv.aT, dmv.aQ, avh.qW, avh.qX));
   public static final dty k = a(new dty("mangrove", dta.p));
   public static final dty l = a(new dty("bamboo", dta.q, dmv.aS, dmv.aR, avh.bw, avh.bx));

   public dty(String $$0, dta $$1) {
      this($$0, $$1, dmv.b, dmv.aP, avh.iI, avh.iJ);
   }

   private static dty a(dty $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dty> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dta c() {
      return this.n;
   }

   public dmv d() {
      return this.o;
   }

   public dmv e() {
      return this.p;
   }

   public avg f() {
      return this.q;
   }

   public avg g() {
      return this.r;
   }
}
