import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dmw(String m, dly n, dge o, dge p, atk q, atk r) {
   private static final Map<String, dmw> s = new Object2ObjectArrayMap();
   public static final Codec<dmw> a = avq.a(dmw::b, s::get);
   public static final dmw b = a(new dmw("oak", dly.g));
   public static final dmw c = a(new dmw("spruce", dly.h));
   public static final dmw d = a(new dmw("birch", dly.i));
   public static final dmw e = a(new dmw("acacia", dly.j));
   public static final dmw f = a(new dmw("cherry", dly.k, dge.aU, dge.aX, atl.eE, atl.eF));
   public static final dmw g = a(new dmw("jungle", dly.l));
   public static final dmw h = a(new dmw("dark_oak", dly.m));
   public static final dmw i = a(new dmw("crimson", dly.n, dge.aT, dge.aQ, atl.qr, atl.qs));
   public static final dmw j = a(new dmw("warped", dly.o, dge.aT, dge.aQ, atl.qr, atl.qs));
   public static final dmw k = a(new dmw("mangrove", dly.p));
   public static final dmw l = a(new dmw("bamboo", dly.q, dge.aS, dge.aR, atl.bu, atl.bv));

   public dmw(String $$0, dly $$1) {
      this($$0, $$1, dge.b, dge.aP, atl.iu, atl.iv);
   }

   private static dmw a(dmw $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dmw> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dly c() {
      return this.n;
   }

   public dge d() {
      return this.o;
   }

   public dge e() {
      return this.p;
   }

   public atk f() {
      return this.q;
   }

   public atk g() {
      return this.r;
   }
}
