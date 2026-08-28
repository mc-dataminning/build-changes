import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dzh(String n, dyk o, dsc p, dsc q, axe r, axe s) {
   private static final Map<String, dzh> t = new Object2ObjectArrayMap();
   public static final Codec<dzh> a = Codec.stringResolver(dzh::b, t::get);
   public static final dzh b = a(new dzh("oak", dyk.g));
   public static final dzh c = a(new dzh("spruce", dyk.h));
   public static final dzh d = a(new dzh("birch", dyk.i));
   public static final dzh e = a(new dzh("acacia", dyk.j));
   public static final dzh f = a(new dzh("cherry", dyk.k, dsc.aU, dsc.aX, axf.eO, axf.eP));
   public static final dzh g = a(new dzh("jungle", dyk.l));
   public static final dzh h = a(new dzh("dark_oak", dyk.m));
   public static final dzh i = a(new dzh("pale_oak", dyk.n));
   public static final dzh j = a(new dzh("crimson", dyk.o, dsc.aT, dsc.aQ, axf.ro, axf.rp));
   public static final dzh k = a(new dzh("warped", dyk.p, dsc.aT, dsc.aQ, axf.ro, axf.rp));
   public static final dzh l = a(new dzh("mangrove", dyk.q));
   public static final dzh m = a(new dzh("bamboo", dyk.r, dsc.aS, dsc.aR, axf.bw, axf.bx));

   public dzh(String $$0, dyk $$1) {
      this($$0, $$1, dsc.b, dsc.aP, axf.jc, axf.jd);
   }

   private static dzh a(dzh $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dzh> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dyk c() {
      return this.o;
   }

   public dsc d() {
      return this.p;
   }

   public dsc e() {
      return this.q;
   }

   public axe f() {
      return this.r;
   }

   public axe g() {
      return this.s;
   }
}
