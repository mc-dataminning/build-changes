import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fqi implements mm {
   private static final alg d = alg.b("trims/color_palettes/trim_palette");
   private static final Map<String, alg> e = c().collect(Collectors.toMap(dhk.a::a, $$0 -> alg.b("trims/color_palettes/" + $$0.a())));
   private static final List<alf<dhn>> f = List.of(
      dho.a, dho.b, dho.c, dho.d, dho.e, dho.f, dho.g, dho.h, dho.i, dho.j, dho.k, dho.l, dho.m, dho.n, dho.o, dho.p, dho.q, dho.r
   );
   private static final List<hkv.d> g = List.of(hkv.d.a, hkv.d.b);
   private final mo.a h;

   public fqi(mo $$0) {
      this.h = $$0.a(mo.b.b, "atlases");
   }

   private static List<alg> b() {
      List<alg> $$0 = new ArrayList<>(f.size() * g.size());

      for (alf<dhn> $$1 : f) {
         alg $$2 = dho.a($$1);

         for (hkv.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hiu a(hkw $$0) {
      return new hjb($$0.b());
   }

   private static hiu a(gpr $$0) {
      return new hiy($$0.b(), $$0.b() + "/");
   }

   private static List<hiu> b(gpr $$0) {
      return List.of(a($$0));
   }

   private static List<hiu> a(String $$0) {
      return List.of(new hiy($$0, ""));
   }

   private static Stream<dhk.a> c() {
      return fql.e.stream().map(fql.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dhk.a::a));
   }

   private static List<hiu> d() {
      return List.of(new hja(b(), d, e));
   }

   private static List<hiu> e() {
      return List.of(a(gqn.j), a(gqn.i), a(gsm.a), a(gsc.a), a(gqn.A), a(gso.a), new hja(List.of(fql.a, fql.b, fql.c, fql.d), d, e));
   }

   private static List<hiu> f() {
      return List.of(a(hkz.f), a(gqn.k));
   }

   private static List<hiu> g() {
      return List.of(a(hkz.g), a(hkz.h), a(gqn.l));
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hkn.a, d()),
         this.a($$0, hkn.b, f()),
         this.a($$0, hkn.c, b(gqn.o)),
         this.a($$0, hkn.d, e()),
         this.a($$0, hkn.e, b(gqn.m)),
         this.a($$0, hkn.f, b(gqn.n)),
         this.a($$0, hkn.g, a("gui/sprites")),
         this.a($$0, hkn.h, a("map/decorations")),
         this.a($$0, hkn.i, a("mob_effect")),
         this.a($$0, hkn.j, a("painting")),
         this.a($$0, hkn.k, a("particle")),
         this.a($$0, hkn.l, g()),
         this.a($$0, hkn.m, b(gqn.p)),
         this.a($$0, hkn.n, b(gqn.q))
      );
   }

   private CompletableFuture<?> a(mk $$0, alg $$1, List<hiu> $$2) {
      return mm.a($$0, hiw.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
