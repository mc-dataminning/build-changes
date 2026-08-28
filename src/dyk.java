import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyk(String n, dxn o, drf p, drf q, avz r, avz s) {
   private static final Map<String, dyk> t = new Object2ObjectArrayMap();
   public static final Codec<dyk> a = Codec.stringResolver(dyk::b, t::get);
   public static final dyk b = a(new dyk("oak", dxn.g));
   public static final dyk c = a(new dyk("spruce", dxn.h));
   public static final dyk d = a(new dyk("birch", dxn.i));
   public static final dyk e = a(new dyk("acacia", dxn.j));
   public static final dyk f = a(new dyk("cherry", dxn.k, drf.aU, drf.aX, awa.eO, awa.eP));
   public static final dyk g = a(new dyk("jungle", dxn.l));
   public static final dyk h = a(new dyk("dark_oak", dxn.m));
   public static final dyk i = a(new dyk("pale_oak", dxn.n));
   public static final dyk j = a(new dyk("crimson", dxn.o, drf.aT, drf.aQ, awa.ru, awa.rv));
   public static final dyk k = a(new dyk("warped", dxn.p, drf.aT, drf.aQ, awa.ru, awa.rv));
   public static final dyk l = a(new dyk("mangrove", dxn.q));
   public static final dyk m = a(new dyk("bamboo", dxn.r, drf.aS, drf.aR, awa.bw, awa.bx));

   public dyk(String $$0, dxn $$1) {
      this($$0, $$1, drf.b, drf.aP, awa.ji, awa.jj);
   }

   private static dyk a(dyk $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dyk> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dxn c() {
      return this.o;
   }

   public drf d() {
      return this.p;
   }

   public drf e() {
      return this.q;
   }

   public avz f() {
      return this.r;
   }

   public avz g() {
      return this.s;
   }
}
