import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fqp implements mm {
   private static final alg d = alg.b("trims/color_palettes/trim_palette");
   private static final Map<String, alg> e = c().collect(Collectors.toMap(dhp.a::a, $$0 -> alg.b("trims/color_palettes/" + $$0.a())));
   private static final List<alf<dhs>> f = List.of(
      dht.a, dht.b, dht.c, dht.d, dht.e, dht.f, dht.g, dht.h, dht.i, dht.j, dht.k, dht.l, dht.m, dht.n, dht.o, dht.p, dht.q, dht.r
   );
   private static final List<hld.d> g = List.of(hld.d.a, hld.d.b);
   private final mo.a h;

   public fqp(mo $$0) {
      this.h = $$0.a(mo.b.b, "atlases");
   }

   private static List<alg> b() {
      List<alg> $$0 = new ArrayList<>(f.size() * g.size());

      for (alf<dhs> $$1 : f) {
         alg $$2 = dht.a($$1);

         for (hld.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hjc a(hle $$0) {
      return new hjj($$0.b());
   }

   private static hjc a(gpz $$0) {
      return new hjg($$0.b(), $$0.b() + "/");
   }

   private static List<hjc> b(gpz $$0) {
      return List.of(a($$0));
   }

   private static List<hjc> a(String $$0) {
      return List.of(new hjg($$0, ""));
   }

   private static Stream<dhp.a> c() {
      return fqs.e.stream().map(fqs.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dhp.a::a));
   }

   private static List<hjc> d() {
      return List.of(new hji(b(), d, e));
   }

   private static List<hjc> e() {
      return List.of(a(gqv.j), a(gqv.i), a(gsu.a), a(gsk.a), a(gqv.A), a(gsw.a), new hji(List.of(fqs.a, fqs.b, fqs.c, fqs.d), d, e));
   }

   private static List<hjc> f() {
      return List.of(a(hlh.f), a(gqv.k));
   }

   private static List<hjc> g() {
      return List.of(a(hlh.g), a(hlh.h), a(gqv.l));
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hkv.a, d()),
         this.a($$0, hkv.b, f()),
         this.a($$0, hkv.c, b(gqv.o)),
         this.a($$0, hkv.d, e()),
         this.a($$0, hkv.e, b(gqv.m)),
         this.a($$0, hkv.f, b(gqv.n)),
         this.a($$0, hkv.g, a("gui/sprites")),
         this.a($$0, hkv.h, a("map/decorations")),
         this.a($$0, hkv.i, a("mob_effect")),
         this.a($$0, hkv.j, a("painting")),
         this.a($$0, hkv.k, a("particle")),
         this.a($$0, hkv.l, g()),
         this.a($$0, hkv.m, b(gqv.p)),
         this.a($$0, hkv.n, b(gqv.q))
      );
   }

   private CompletableFuture<?> a(mk $$0, alg $$1, List<hjc> $$2) {
      return mm.a($$0, hje.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
