import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fst implements mn {
   private static final ali d = ali.b("trims/color_palettes/trim_palette");
   private static final Map<String, ali> e = c().collect(Collectors.toMap(dik.a::a, $$0 -> ali.b("trims/color_palettes/" + $$0.a())));
   private static final List<alh<din>> f = List.of(
      dio.a, dio.b, dio.c, dio.d, dio.e, dio.f, dio.g, dio.h, dio.i, dio.j, dio.k, dio.l, dio.m, dio.n, dio.o, dio.p, dio.q, dio.r
   );
   private static final List<hng.d> g = List.of(hng.d.a, hng.d.b);
   private final mp.a h;

   public fst(mp $$0) {
      this.h = $$0.a(mp.b.b, "atlases");
   }

   private static List<ali> b() {
      List<ali> $$0 = new ArrayList<>(f.size() * g.size());

      for (alh<din> $$1 : f) {
         ali $$2 = dio.a($$1);

         for (hng.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hlf a(hnh $$0) {
      return new hlm($$0.b());
   }

   private static hlf a(grz $$0) {
      return new hlj($$0.b(), $$0.b() + "/");
   }

   private static List<hlf> b(grz $$0) {
      return List.of(a($$0));
   }

   private static List<hlf> a(String $$0) {
      return List.of(new hlj($$0, ""));
   }

   private static Stream<dik.a> c() {
      return fsw.e.stream().map(fsw.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dik.a::a));
   }

   private static List<hlf> d() {
      return List.of(new hll(b(), d, e));
   }

   private static List<hlf> e() {
      return List.of(a(gsu.j), a(gsu.i), a(guv.a), a(gul.a), a(gsu.A), a(gux.a), new hll(List.of(fsw.a, fsw.b, fsw.c, fsw.d), d, e));
   }

   private static List<hlf> f() {
      return List.of(a(hnk.f), a(gsu.k));
   }

   private static List<hlf> g() {
      return List.of(a(hnk.g), a(hnk.h), a(gsu.l));
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hmz.a, d()),
         this.a($$0, hmz.b, f()),
         this.a($$0, hmz.c, b(gsu.o)),
         this.a($$0, hmz.d, e()),
         this.a($$0, hmz.e, b(gsu.m)),
         this.a($$0, hmz.f, b(gsu.n)),
         this.a($$0, hmz.g, a("gui/sprites")),
         this.a($$0, hmz.h, a("map/decorations")),
         this.a($$0, hmz.i, a("mob_effect")),
         this.a($$0, hmz.j, a("painting")),
         this.a($$0, hmz.k, a("particle")),
         this.a($$0, hmz.l, g()),
         this.a($$0, hmz.m, b(gsu.p)),
         this.a($$0, hmz.n, b(gsu.q))
      );
   }

   private CompletableFuture<?> a(ml $$0, ali $$1, List<hlf> $$2) {
      return mn.a($$0, hlh.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
