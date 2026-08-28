import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class frj implements mn {
   private static final alg d = alg.b("trims/color_palettes/trim_palette");
   private static final Map<String, alg> e = c().collect(Collectors.toMap(dhz.a::a, $$0 -> alg.b("trims/color_palettes/" + $$0.a())));
   private static final List<alf<dic>> f = List.of(
      did.a, did.b, did.c, did.d, did.e, did.f, did.g, did.h, did.i, did.j, did.k, did.l, did.m, did.n, did.o, did.p, did.q, did.r
   );
   private static final List<hlw.d> g = List.of(hlw.d.a, hlw.d.b);
   private final mp.a h;

   public frj(mp $$0) {
      this.h = $$0.a(mp.b.b, "atlases");
   }

   private static List<alg> b() {
      List<alg> $$0 = new ArrayList<>(f.size() * g.size());

      for (alf<dic> $$1 : f) {
         alg $$2 = did.a($$1);

         for (hlw.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hjv a(hlx $$0) {
      return new hkc($$0.b());
   }

   private static hjv a(gqq $$0) {
      return new hjz($$0.b(), $$0.b() + "/");
   }

   private static List<hjv> b(gqq $$0) {
      return List.of(a($$0));
   }

   private static List<hjv> a(String $$0) {
      return List.of(new hjz($$0, ""));
   }

   private static Stream<dhz.a> c() {
      return frm.e.stream().map(frm.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dhz.a::a));
   }

   private static List<hjv> d() {
      return List.of(new hkb(b(), d, e));
   }

   private static List<hjv> e() {
      return List.of(a(grl.j), a(grl.i), a(gtl.a), a(gtb.a), a(grl.A), a(gtn.a), new hkb(List.of(frm.a, frm.b, frm.c, frm.d), d, e));
   }

   private static List<hjv> f() {
      return List.of(a(hma.f), a(grl.k));
   }

   private static List<hjv> g() {
      return List.of(a(hma.g), a(hma.h), a(grl.l));
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hlp.a, d()),
         this.a($$0, hlp.b, f()),
         this.a($$0, hlp.c, b(grl.o)),
         this.a($$0, hlp.d, e()),
         this.a($$0, hlp.e, b(grl.m)),
         this.a($$0, hlp.f, b(grl.n)),
         this.a($$0, hlp.g, a("gui/sprites")),
         this.a($$0, hlp.h, a("map/decorations")),
         this.a($$0, hlp.i, a("mob_effect")),
         this.a($$0, hlp.j, a("painting")),
         this.a($$0, hlp.k, a("particle")),
         this.a($$0, hlp.l, g()),
         this.a($$0, hlp.m, b(grl.p)),
         this.a($$0, hlp.n, b(grl.q))
      );
   }

   private CompletableFuture<?> a(ml $$0, alg $$1, List<hjv> $$2) {
      return mn.a($$0, hjx.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
