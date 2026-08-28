import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtq(String m, dss n, dmn o, dmn p, avz q, avz r) {
   private static final Map<String, dtq> s = new Object2ObjectArrayMap();
   public static final Codec<dtq> a = Codec.stringResolver(dtq::b, s::get);
   public static final dtq b = a(new dtq("oak", dss.g));
   public static final dtq c = a(new dtq("spruce", dss.h));
   public static final dtq d = a(new dtq("birch", dss.i));
   public static final dtq e = a(new dtq("acacia", dss.j));
   public static final dtq f = a(new dtq("cherry", dss.k, dmn.aU, dmn.aX, awa.eM, awa.eN));
   public static final dtq g = a(new dtq("jungle", dss.l));
   public static final dtq h = a(new dtq("dark_oak", dss.m));
   public static final dtq i = a(new dtq("crimson", dss.n, dmn.aT, dmn.aQ, awa.qT, awa.qU));
   public static final dtq j = a(new dtq("warped", dss.o, dmn.aT, dmn.aQ, awa.qT, awa.qU));
   public static final dtq k = a(new dtq("mangrove", dss.p));
   public static final dtq l = a(new dtq("bamboo", dss.q, dmn.aS, dmn.aR, awa.bw, awa.bx));

   public dtq(String $$0, dss $$1) {
      this($$0, $$1, dmn.b, dmn.aP, awa.iI, awa.iJ);
   }

   private static dtq a(dtq $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtq> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dss c() {
      return this.n;
   }

   public dmn d() {
      return this.o;
   }

   public dmn e() {
      return this.p;
   }

   public avz f() {
      return this.q;
   }

   public avz g() {
      return this.r;
   }
}
