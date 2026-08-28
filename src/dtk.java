import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtk(String m, dsm n, dmh o, dmh p, avv q, avv r) {
   private static final Map<String, dtk> s = new Object2ObjectArrayMap();
   public static final Codec<dtk> a = Codec.stringResolver(dtk::b, s::get);
   public static final dtk b = a(new dtk("oak", dsm.g));
   public static final dtk c = a(new dtk("spruce", dsm.h));
   public static final dtk d = a(new dtk("birch", dsm.i));
   public static final dtk e = a(new dtk("acacia", dsm.j));
   public static final dtk f = a(new dtk("cherry", dsm.k, dmh.aU, dmh.aX, avw.eM, avw.eN));
   public static final dtk g = a(new dtk("jungle", dsm.l));
   public static final dtk h = a(new dtk("dark_oak", dsm.m));
   public static final dtk i = a(new dtk("crimson", dsm.n, dmh.aT, dmh.aQ, avw.qT, avw.qU));
   public static final dtk j = a(new dtk("warped", dsm.o, dmh.aT, dmh.aQ, avw.qT, avw.qU));
   public static final dtk k = a(new dtk("mangrove", dsm.p));
   public static final dtk l = a(new dtk("bamboo", dsm.q, dmh.aS, dmh.aR, avw.bw, avw.bx));

   public dtk(String $$0, dsm $$1) {
      this($$0, $$1, dmh.b, dmh.aP, avw.iI, avw.iJ);
   }

   private static dtk a(dtk $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtk> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsm c() {
      return this.n;
   }

   public dmh d() {
      return this.o;
   }

   public dmh e() {
      return this.p;
   }

   public avv f() {
      return this.q;
   }

   public avv g() {
      return this.r;
   }
}
