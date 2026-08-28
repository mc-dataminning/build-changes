import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtx(String m, dsz n, dmu o, dmu p, avg q, avg r) {
   private static final Map<String, dtx> s = new Object2ObjectArrayMap();
   public static final Codec<dtx> a = Codec.stringResolver(dtx::b, s::get);
   public static final dtx b = a(new dtx("oak", dsz.g));
   public static final dtx c = a(new dtx("spruce", dsz.h));
   public static final dtx d = a(new dtx("birch", dsz.i));
   public static final dtx e = a(new dtx("acacia", dsz.j));
   public static final dtx f = a(new dtx("cherry", dsz.k, dmu.aU, dmu.aX, avh.eM, avh.eN));
   public static final dtx g = a(new dtx("jungle", dsz.l));
   public static final dtx h = a(new dtx("dark_oak", dsz.m));
   public static final dtx i = a(new dtx("crimson", dsz.n, dmu.aT, dmu.aQ, avh.qW, avh.qX));
   public static final dtx j = a(new dtx("warped", dsz.o, dmu.aT, dmu.aQ, avh.qW, avh.qX));
   public static final dtx k = a(new dtx("mangrove", dsz.p));
   public static final dtx l = a(new dtx("bamboo", dsz.q, dmu.aS, dmu.aR, avh.bw, avh.bx));

   public dtx(String $$0, dsz $$1) {
      this($$0, $$1, dmu.b, dmu.aP, avh.iI, avh.iJ);
   }

   private static dtx a(dtx $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtx> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsz c() {
      return this.n;
   }

   public dmu d() {
      return this.o;
   }

   public dmu e() {
      return this.p;
   }

   public avg f() {
      return this.q;
   }

   public avg g() {
      return this.r;
   }
}
