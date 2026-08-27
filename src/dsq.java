import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsq(String m, drs n, dln o, dln p, avh q, avh r) {
   private static final Map<String, dsq> s = new Object2ObjectArrayMap();
   public static final Codec<dsq> a = Codec.stringResolver(dsq::b, s::get);
   public static final dsq b = a(new dsq("oak", drs.g));
   public static final dsq c = a(new dsq("spruce", drs.h));
   public static final dsq d = a(new dsq("birch", drs.i));
   public static final dsq e = a(new dsq("acacia", drs.j));
   public static final dsq f = a(new dsq("cherry", drs.k, dln.aU, dln.aX, avi.eM, avi.eN));
   public static final dsq g = a(new dsq("jungle", drs.l));
   public static final dsq h = a(new dsq("dark_oak", drs.m));
   public static final dsq i = a(new dsq("crimson", drs.n, dln.aT, dln.aQ, avi.qT, avi.qU));
   public static final dsq j = a(new dsq("warped", drs.o, dln.aT, dln.aQ, avi.qT, avi.qU));
   public static final dsq k = a(new dsq("mangrove", drs.p));
   public static final dsq l = a(new dsq("bamboo", drs.q, dln.aS, dln.aR, avi.bw, avi.bx));

   public dsq(String $$0, drs $$1) {
      this($$0, $$1, dln.b, dln.aP, avi.iI, avi.iJ);
   }

   private static dsq a(dsq $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dsq> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public drs c() {
      return this.n;
   }

   public dln d() {
      return this.o;
   }

   public dln e() {
      return this.p;
   }

   public avh f() {
      return this.q;
   }

   public avh g() {
      return this.r;
   }
}
