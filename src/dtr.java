import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtr(String m, dst n, dmo o, dmo p, avz q, avz r) {
   private static final Map<String, dtr> s = new Object2ObjectArrayMap();
   public static final Codec<dtr> a = Codec.stringResolver(dtr::b, s::get);
   public static final dtr b = a(new dtr("oak", dst.g));
   public static final dtr c = a(new dtr("spruce", dst.h));
   public static final dtr d = a(new dtr("birch", dst.i));
   public static final dtr e = a(new dtr("acacia", dst.j));
   public static final dtr f = a(new dtr("cherry", dst.k, dmo.aU, dmo.aX, awa.eM, awa.eN));
   public static final dtr g = a(new dtr("jungle", dst.l));
   public static final dtr h = a(new dtr("dark_oak", dst.m));
   public static final dtr i = a(new dtr("crimson", dst.n, dmo.aT, dmo.aQ, awa.qT, awa.qU));
   public static final dtr j = a(new dtr("warped", dst.o, dmo.aT, dmo.aQ, awa.qT, awa.qU));
   public static final dtr k = a(new dtr("mangrove", dst.p));
   public static final dtr l = a(new dtr("bamboo", dst.q, dmo.aS, dmo.aR, awa.bw, awa.bx));

   public dtr(String $$0, dst $$1) {
      this($$0, $$1, dmo.b, dmo.aP, awa.iI, awa.iJ);
   }

   private static dtr a(dtr $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtr> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dst c() {
      return this.n;
   }

   public dmo d() {
      return this.o;
   }

   public dmo e() {
      return this.p;
   }

   public avz f() {
      return this.q;
   }

   public avz g() {
      return this.r;
   }
}
