import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fre implements mn {
   private static final alg d = alg.b("trims/color_palettes/trim_palette");
   private static final Map<String, alg> e = c().collect(Collectors.toMap(dhw.a::a, $$0 -> alg.b("trims/color_palettes/" + $$0.a())));
   private static final List<alf<dhz>> f = List.of(
      dia.a, dia.b, dia.c, dia.d, dia.e, dia.f, dia.g, dia.h, dia.i, dia.j, dia.k, dia.l, dia.m, dia.n, dia.o, dia.p, dia.q, dia.r
   );
   private static final List<hlp.d> g = List.of(hlp.d.a, hlp.d.b);
   private final mp.a h;

   public fre(mp $$0) {
      this.h = $$0.a(mp.b.b, "atlases");
   }

   private static List<alg> b() {
      List<alg> $$0 = new ArrayList<>(f.size() * g.size());

      for (alf<dhz> $$1 : f) {
         alg $$2 = dia.a($$1);

         for (hlp.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hjp a(hlq $$0) {
      return new hjw($$0.b());
   }

   private static hjp a(gql $$0) {
      return new hjt($$0.b(), $$0.b() + "/");
   }

   private static List<hjp> b(gql $$0) {
      return List.of(a($$0));
   }

   private static List<hjp> a(String $$0) {
      return List.of(new hjt($$0, ""));
   }

   private static Stream<dhw.a> c() {
      return frh.e.stream().map(frh.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dhw.a::a));
   }

   private static List<hjp> d() {
      return List.of(new hjv(b(), d, e));
   }

   private static List<hjp> e() {
      return List.of(a(grg.j), a(grg.i), a(gtg.a), a(gsw.a), a(grg.A), a(gti.a), new hjv(List.of(frh.a, frh.b, frh.c, frh.d), d, e));
   }

   private static List<hjp> f() {
      return List.of(a(hlt.f), a(grg.k));
   }

   private static List<hjp> g() {
      return List.of(a(hlt.g), a(hlt.h), a(grg.l));
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hli.a, d()),
         this.a($$0, hli.b, f()),
         this.a($$0, hli.c, b(grg.o)),
         this.a($$0, hli.d, e()),
         this.a($$0, hli.e, b(grg.m)),
         this.a($$0, hli.f, b(grg.n)),
         this.a($$0, hli.g, a("gui/sprites")),
         this.a($$0, hli.h, a("map/decorations")),
         this.a($$0, hli.i, a("mob_effect")),
         this.a($$0, hli.j, a("painting")),
         this.a($$0, hli.k, a("particle")),
         this.a($$0, hli.l, g()),
         this.a($$0, hli.m, b(grg.p)),
         this.a($$0, hli.n, b(grg.q))
      );
   }

   private CompletableFuture<?> a(ml $$0, alg $$1, List<hjp> $$2) {
      return mn.a($$0, hjr.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
