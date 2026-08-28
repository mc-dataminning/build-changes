import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtp(String m, dsr n, dmm o, dmm p, avz q, avz r) {
   private static final Map<String, dtp> s = new Object2ObjectArrayMap();
   public static final Codec<dtp> a = Codec.stringResolver(dtp::b, s::get);
   public static final dtp b = a(new dtp("oak", dsr.g));
   public static final dtp c = a(new dtp("spruce", dsr.h));
   public static final dtp d = a(new dtp("birch", dsr.i));
   public static final dtp e = a(new dtp("acacia", dsr.j));
   public static final dtp f = a(new dtp("cherry", dsr.k, dmm.aU, dmm.aX, awa.eM, awa.eN));
   public static final dtp g = a(new dtp("jungle", dsr.l));
   public static final dtp h = a(new dtp("dark_oak", dsr.m));
   public static final dtp i = a(new dtp("crimson", dsr.n, dmm.aT, dmm.aQ, awa.qT, awa.qU));
   public static final dtp j = a(new dtp("warped", dsr.o, dmm.aT, dmm.aQ, awa.qT, awa.qU));
   public static final dtp k = a(new dtp("mangrove", dsr.p));
   public static final dtp l = a(new dtp("bamboo", dsr.q, dmm.aS, dmm.aR, awa.bw, awa.bx));

   public dtp(String $$0, dsr $$1) {
      this($$0, $$1, dmm.b, dmm.aP, awa.iI, awa.iJ);
   }

   private static dtp a(dtp $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtp> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsr c() {
      return this.n;
   }

   public dmm d() {
      return this.o;
   }

   public dmm e() {
      return this.p;
   }

   public avz f() {
      return this.q;
   }

   public avz g() {
      return this.r;
   }
}
