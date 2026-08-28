import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyh(String n, dxk o, drc p, drc q, avy r, avy s) {
   private static final Map<String, dyh> t = new Object2ObjectArrayMap();
   public static final Codec<dyh> a = Codec.stringResolver(dyh::b, t::get);
   public static final dyh b = a(new dyh("oak", dxk.g));
   public static final dyh c = a(new dyh("spruce", dxk.h));
   public static final dyh d = a(new dyh("birch", dxk.i));
   public static final dyh e = a(new dyh("acacia", dxk.j));
   public static final dyh f = a(new dyh("cherry", dxk.k, drc.aU, drc.aX, avz.eO, avz.eP));
   public static final dyh g = a(new dyh("jungle", dxk.l));
   public static final dyh h = a(new dyh("dark_oak", dxk.m));
   public static final dyh i = a(new dyh("pale_oak", dxk.n));
   public static final dyh j = a(new dyh("crimson", dxk.o, drc.aT, drc.aQ, avz.ru, avz.rv));
   public static final dyh k = a(new dyh("warped", dxk.p, drc.aT, drc.aQ, avz.ru, avz.rv));
   public static final dyh l = a(new dyh("mangrove", dxk.q));
   public static final dyh m = a(new dyh("bamboo", dxk.r, drc.aS, drc.aR, avz.bw, avz.bx));

   public dyh(String $$0, dxk $$1) {
      this($$0, $$1, drc.b, drc.aP, avz.ji, avz.jj);
   }

   private static dyh a(dyh $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dyh> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dxk c() {
      return this.o;
   }

   public drc d() {
      return this.p;
   }

   public drc e() {
      return this.q;
   }

   public avy f() {
      return this.r;
   }

   public avy g() {
      return this.s;
   }
}
