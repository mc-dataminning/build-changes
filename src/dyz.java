import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyz(String n, dyc o, dru p, dru q, axe r, axe s) {
   private static final Map<String, dyz> t = new Object2ObjectArrayMap();
   public static final Codec<dyz> a = Codec.stringResolver(dyz::b, t::get);
   public static final dyz b = a(new dyz("oak", dyc.g));
   public static final dyz c = a(new dyz("spruce", dyc.h));
   public static final dyz d = a(new dyz("birch", dyc.i));
   public static final dyz e = a(new dyz("acacia", dyc.j));
   public static final dyz f = a(new dyz("cherry", dyc.k, dru.aU, dru.aX, axf.eN, axf.eO));
   public static final dyz g = a(new dyz("jungle", dyc.l));
   public static final dyz h = a(new dyz("dark_oak", dyc.m));
   public static final dyz i = a(new dyz("pale_oak", dyc.n));
   public static final dyz j = a(new dyz("crimson", dyc.o, dru.aT, dru.aQ, axf.rn, axf.ro));
   public static final dyz k = a(new dyz("warped", dyc.p, dru.aT, dru.aQ, axf.rn, axf.ro));
   public static final dyz l = a(new dyz("mangrove", dyc.q));
   public static final dyz m = a(new dyz("bamboo", dyc.r, dru.aS, dru.aR, axf.bw, axf.bx));

   public dyz(String $$0, dyc $$1) {
      this($$0, $$1, dru.b, dru.aP, axf.jb, axf.jc);
   }

   private static dyz a(dyz $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dyz> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dyc c() {
      return this.o;
   }

   public dru d() {
      return this.p;
   }

   public dru e() {
      return this.q;
   }

   public axe f() {
      return this.r;
   }

   public axe g() {
      return this.s;
   }
}
