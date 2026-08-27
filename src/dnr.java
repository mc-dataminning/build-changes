import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dnr(String m, dmt n, dgr o, dgr p, ato q, ato r) {
   private static final Map<String, dnr> s = new Object2ObjectArrayMap();
   public static final Codec<dnr> a = avu.a(dnr::b, s::get);
   public static final dnr b = a(new dnr("oak", dmt.g));
   public static final dnr c = a(new dnr("spruce", dmt.h));
   public static final dnr d = a(new dnr("birch", dmt.i));
   public static final dnr e = a(new dnr("acacia", dmt.j));
   public static final dnr f = a(new dnr("cherry", dmt.k, dgr.aU, dgr.aX, atp.eE, atp.eF));
   public static final dnr g = a(new dnr("jungle", dmt.l));
   public static final dnr h = a(new dnr("dark_oak", dmt.m));
   public static final dnr i = a(new dnr("crimson", dmt.n, dgr.aT, dgr.aQ, atp.qr, atp.qs));
   public static final dnr j = a(new dnr("warped", dmt.o, dgr.aT, dgr.aQ, atp.qr, atp.qs));
   public static final dnr k = a(new dnr("mangrove", dmt.p));
   public static final dnr l = a(new dnr("bamboo", dmt.q, dgr.aS, dgr.aR, atp.bu, atp.bv));

   public dnr(String $$0, dmt $$1) {
      this($$0, $$1, dgr.b, dgr.aP, atp.iu, atp.iv);
   }

   private static dnr a(dnr $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dnr> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dmt c() {
      return this.n;
   }

   public dgr d() {
      return this.o;
   }

   public dgr e() {
      return this.p;
   }

   public ato f() {
      return this.q;
   }

   public ato g() {
      return this.r;
   }
}
