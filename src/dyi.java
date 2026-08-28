import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyi(String n, dxl o, drd p, drd q, avz r, avz s) {
   private static final Map<String, dyi> t = new Object2ObjectArrayMap();
   public static final Codec<dyi> a = Codec.stringResolver(dyi::b, t::get);
   public static final dyi b = a(new dyi("oak", dxl.g));
   public static final dyi c = a(new dyi("spruce", dxl.h));
   public static final dyi d = a(new dyi("birch", dxl.i));
   public static final dyi e = a(new dyi("acacia", dxl.j));
   public static final dyi f = a(new dyi("cherry", dxl.k, drd.aU, drd.aX, awa.eO, awa.eP));
   public static final dyi g = a(new dyi("jungle", dxl.l));
   public static final dyi h = a(new dyi("dark_oak", dxl.m));
   public static final dyi i = a(new dyi("pale_oak", dxl.n));
   public static final dyi j = a(new dyi("crimson", dxl.o, drd.aT, drd.aQ, awa.ru, awa.rv));
   public static final dyi k = a(new dyi("warped", dxl.p, drd.aT, drd.aQ, awa.ru, awa.rv));
   public static final dyi l = a(new dyi("mangrove", dxl.q));
   public static final dyi m = a(new dyi("bamboo", dxl.r, drd.aS, drd.aR, awa.bw, awa.bx));

   public dyi(String $$0, dxl $$1) {
      this($$0, $$1, drd.b, drd.aP, awa.ji, awa.jj);
   }

   private static dyi a(dyi $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dyi> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dxl c() {
      return this.o;
   }

   public drd d() {
      return this.p;
   }

   public drd e() {
      return this.q;
   }

   public avz f() {
      return this.r;
   }

   public avz g() {
      return this.s;
   }
}
