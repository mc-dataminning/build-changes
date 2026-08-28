import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyj(String n, dxm o, dre p, dre q, avz r, avz s) {
   private static final Map<String, dyj> t = new Object2ObjectArrayMap();
   public static final Codec<dyj> a = Codec.stringResolver(dyj::b, t::get);
   public static final dyj b = a(new dyj("oak", dxm.g));
   public static final dyj c = a(new dyj("spruce", dxm.h));
   public static final dyj d = a(new dyj("birch", dxm.i));
   public static final dyj e = a(new dyj("acacia", dxm.j));
   public static final dyj f = a(new dyj("cherry", dxm.k, dre.aU, dre.aX, awa.eO, awa.eP));
   public static final dyj g = a(new dyj("jungle", dxm.l));
   public static final dyj h = a(new dyj("dark_oak", dxm.m));
   public static final dyj i = a(new dyj("pale_oak", dxm.n));
   public static final dyj j = a(new dyj("crimson", dxm.o, dre.aT, dre.aQ, awa.ru, awa.rv));
   public static final dyj k = a(new dyj("warped", dxm.p, dre.aT, dre.aQ, awa.ru, awa.rv));
   public static final dyj l = a(new dyj("mangrove", dxm.q));
   public static final dyj m = a(new dyj("bamboo", dxm.r, dre.aS, dre.aR, awa.bw, awa.bx));

   public dyj(String $$0, dxm $$1) {
      this($$0, $$1, dre.b, dre.aP, awa.ji, awa.jj);
   }

   private static dyj a(dyj $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dyj> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dxm c() {
      return this.o;
   }

   public dre d() {
      return this.p;
   }

   public dre e() {
      return this.q;
   }

   public avz f() {
      return this.r;
   }

   public avz g() {
      return this.s;
   }
}
