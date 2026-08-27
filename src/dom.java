import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dom(String m, dno n, dhm o, dhm p, atx q, atx r) {
   private static final Map<String, dom> s = new Object2ObjectArrayMap();
   public static final Codec<dom> a = awe.a(dom::b, s::get);
   public static final dom b = a(new dom("oak", dno.g));
   public static final dom c = a(new dom("spruce", dno.h));
   public static final dom d = a(new dom("birch", dno.i));
   public static final dom e = a(new dom("acacia", dno.j));
   public static final dom f = a(new dom("cherry", dno.k, dhm.aU, dhm.aX, aty.eH, aty.eI));
   public static final dom g = a(new dom("jungle", dno.l));
   public static final dom h = a(new dom("dark_oak", dno.m));
   public static final dom i = a(new dom("crimson", dno.n, dhm.aT, dhm.aQ, aty.qu, aty.qv));
   public static final dom j = a(new dom("warped", dno.o, dhm.aT, dhm.aQ, aty.qu, aty.qv));
   public static final dom k = a(new dom("mangrove", dno.p));
   public static final dom l = a(new dom("bamboo", dno.q, dhm.aS, dhm.aR, aty.bw, aty.bx));

   public dom(String $$0, dno $$1) {
      this($$0, $$1, dhm.b, dhm.aP, aty.ix, aty.iy);
   }

   private static dom a(dom $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dom> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dno c() {
      return this.n;
   }

   public dhm d() {
      return this.o;
   }

   public dhm e() {
      return this.p;
   }

   public atx f() {
      return this.q;
   }

   public atx g() {
      return this.r;
   }
}
