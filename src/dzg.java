import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dzg(String n, dyj o, dsb p, dsb q, axe r, axe s) {
   private static final Map<String, dzg> t = new Object2ObjectArrayMap();
   public static final Codec<dzg> a = Codec.stringResolver(dzg::b, t::get);
   public static final dzg b = a(new dzg("oak", dyj.g));
   public static final dzg c = a(new dzg("spruce", dyj.h));
   public static final dzg d = a(new dzg("birch", dyj.i));
   public static final dzg e = a(new dzg("acacia", dyj.j));
   public static final dzg f = a(new dzg("cherry", dyj.k, dsb.aU, dsb.aX, axf.eO, axf.eP));
   public static final dzg g = a(new dzg("jungle", dyj.l));
   public static final dzg h = a(new dzg("dark_oak", dyj.m));
   public static final dzg i = a(new dzg("pale_oak", dyj.n));
   public static final dzg j = a(new dzg("crimson", dyj.o, dsb.aT, dsb.aQ, axf.ro, axf.rp));
   public static final dzg k = a(new dzg("warped", dyj.p, dsb.aT, dsb.aQ, axf.ro, axf.rp));
   public static final dzg l = a(new dzg("mangrove", dyj.q));
   public static final dzg m = a(new dzg("bamboo", dyj.r, dsb.aS, dsb.aR, axf.bw, axf.bx));

   public dzg(String $$0, dyj $$1) {
      this($$0, $$1, dsb.b, dsb.aP, axf.jc, axf.jd);
   }

   private static dzg a(dzg $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dzg> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dyj c() {
      return this.o;
   }

   public dsb d() {
      return this.p;
   }

   public dsb e() {
      return this.q;
   }

   public axe f() {
      return this.r;
   }

   public axe g() {
      return this.s;
   }
}
