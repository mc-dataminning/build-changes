import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record div(String m, dhx n, dcm o, dcm p, aqq q, aqq r) {
   private static final Map<String, div> s = new Object2ObjectArrayMap();
   public static final Codec<div> a = asu.a(div::b, s::get);
   public static final div b = a(new div("oak", dhx.g));
   public static final div c = a(new div("spruce", dhx.h));
   public static final div d = a(new div("birch", dhx.i));
   public static final div e = a(new div("acacia", dhx.j));
   public static final div f = a(new div("cherry", dhx.k, dcm.aU, dcm.aX, aqr.ef, aqr.eg));
   public static final div g = a(new div("jungle", dhx.l));
   public static final div h = a(new div("dark_oak", dhx.m));
   public static final div i = a(new div("crimson", dhx.n, dcm.aT, dcm.aQ, aqr.pH, aqr.pI));
   public static final div j = a(new div("warped", dhx.o, dcm.aT, dcm.aQ, aqr.pH, aqr.pI));
   public static final div k = a(new div("mangrove", dhx.p));
   public static final div l = a(new div("bamboo", dhx.q, dcm.aS, dcm.aR, aqr.bh, aqr.bi));

   public div(String $$0, dhx $$1) {
      this($$0, $$1, dcm.b, dcm.aP, aqr.hV, aqr.hW);
   }

   private static div a(div $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<div> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dhx c() {
      return this.n;
   }

   public dcm d() {
      return this.o;
   }

   public dcm e() {
      return this.p;
   }

   public aqq f() {
      return this.q;
   }

   public aqq g() {
      return this.r;
   }
}
