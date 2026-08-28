import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtn(String m, dsp n, dmk o, dmk p, avy q, avy r) {
   private static final Map<String, dtn> s = new Object2ObjectArrayMap();
   public static final Codec<dtn> a = Codec.stringResolver(dtn::b, s::get);
   public static final dtn b = a(new dtn("oak", dsp.g));
   public static final dtn c = a(new dtn("spruce", dsp.h));
   public static final dtn d = a(new dtn("birch", dsp.i));
   public static final dtn e = a(new dtn("acacia", dsp.j));
   public static final dtn f = a(new dtn("cherry", dsp.k, dmk.aU, dmk.aX, avz.eM, avz.eN));
   public static final dtn g = a(new dtn("jungle", dsp.l));
   public static final dtn h = a(new dtn("dark_oak", dsp.m));
   public static final dtn i = a(new dtn("crimson", dsp.n, dmk.aT, dmk.aQ, avz.qT, avz.qU));
   public static final dtn j = a(new dtn("warped", dsp.o, dmk.aT, dmk.aQ, avz.qT, avz.qU));
   public static final dtn k = a(new dtn("mangrove", dsp.p));
   public static final dtn l = a(new dtn("bamboo", dsp.q, dmk.aS, dmk.aR, avz.bw, avz.bx));

   public dtn(String $$0, dsp $$1) {
      this($$0, $$1, dmk.b, dmk.aP, avz.iI, avz.iJ);
   }

   private static dtn a(dtn $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtn> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsp c() {
      return this.n;
   }

   public dmk d() {
      return this.o;
   }

   public dmk e() {
      return this.p;
   }

   public avy f() {
      return this.q;
   }

   public avy g() {
      return this.r;
   }
}
