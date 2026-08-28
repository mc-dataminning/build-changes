import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dup(String m, dtr n, dnm o, dnm p, avo q, avo r) {
   private static final Map<String, dup> s = new Object2ObjectArrayMap();
   public static final Codec<dup> a = Codec.stringResolver(dup::b, s::get);
   public static final dup b = a(new dup("oak", dtr.g));
   public static final dup c = a(new dup("spruce", dtr.h));
   public static final dup d = a(new dup("birch", dtr.i));
   public static final dup e = a(new dup("acacia", dtr.j));
   public static final dup f = a(new dup("cherry", dtr.k, dnm.aU, dnm.aX, avp.eM, avp.eN));
   public static final dup g = a(new dup("jungle", dtr.l));
   public static final dup h = a(new dup("dark_oak", dtr.m));
   public static final dup i = a(new dup("crimson", dtr.n, dnm.aT, dnm.aQ, avp.qW, avp.qX));
   public static final dup j = a(new dup("warped", dtr.o, dnm.aT, dnm.aQ, avp.qW, avp.qX));
   public static final dup k = a(new dup("mangrove", dtr.p));
   public static final dup l = a(new dup("bamboo", dtr.q, dnm.aS, dnm.aR, avp.bw, avp.bx));

   public dup(String $$0, dtr $$1) {
      this($$0, $$1, dnm.b, dnm.aP, avp.iI, avp.iJ);
   }

   private static dup a(dup $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dup> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dtr c() {
      return this.n;
   }

   public dnm d() {
      return this.o;
   }

   public dnm e() {
      return this.p;
   }

   public avo f() {
      return this.q;
   }

   public avo g() {
      return this.r;
   }
}
