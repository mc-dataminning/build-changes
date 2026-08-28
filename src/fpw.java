import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fpw implements mm {
   private static final ale d = ale.b("trims/color_palettes/trim_palette");
   private static final Map<String, ale> e = c().collect(Collectors.toMap(dhe.a::a, $$0 -> ale.b("trims/color_palettes/" + $$0.a())));
   private static final List<ald<dhh>> f = List.of(
      dhi.a, dhi.b, dhi.c, dhi.d, dhi.e, dhi.f, dhi.g, dhi.h, dhi.i, dhi.j, dhi.k, dhi.l, dhi.m, dhi.n, dhi.o, dhi.p, dhi.q, dhi.r
   );
   private static final List<hkf.d> g = List.of(hkf.d.a, hkf.d.b);
   private final mo.a h;

   public fpw(mo $$0) {
      this.h = $$0.a(mo.b.b, "atlases");
   }

   private static List<ale> b() {
      List<ale> $$0 = new ArrayList<>(f.size() * g.size());

      for (ald<dhh> $$1 : f) {
         ale $$2 = dhi.a($$1);

         for (hkf.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hie a(hkg $$0) {
      return new hil($$0.b());
   }

   private static hie a(gpc $$0) {
      return new hii($$0.b(), $$0.b() + "/");
   }

   private static List<hie> b(gpc $$0) {
      return List.of(a($$0));
   }

   private static List<hie> a(String $$0) {
      return List.of(new hii($$0, ""));
   }

   private static Stream<dhe.a> c() {
      return fpz.e.stream().map(fpz.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dhe.a::a));
   }

   private static List<hie> d() {
      return List.of(new hik(b(), d, e));
   }

   private static List<hie> e() {
      return List.of(a(gpy.j), a(gpy.i), a(grx.a), a(grn.a), a(gpy.A), a(grz.a), new hik(List.of(fpz.a, fpz.b, fpz.c, fpz.d), d, e));
   }

   private static List<hie> f() {
      return List.of(a(hkj.f), a(gpy.k));
   }

   private static List<hie> g() {
      return List.of(a(hkj.g), a(hkj.h), a(gpy.l));
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hjx.a, d()),
         this.a($$0, hjx.b, f()),
         this.a($$0, hjx.c, b(gpy.o)),
         this.a($$0, hjx.d, e()),
         this.a($$0, hjx.e, b(gpy.m)),
         this.a($$0, hjx.f, b(gpy.n)),
         this.a($$0, hjx.g, a("gui/sprites")),
         this.a($$0, hjx.h, a("map/decorations")),
         this.a($$0, hjx.i, a("mob_effect")),
         this.a($$0, hjx.j, a("painting")),
         this.a($$0, hjx.k, a("particle")),
         this.a($$0, hjx.l, g()),
         this.a($$0, hjx.m, b(gpy.p)),
         this.a($$0, hjx.n, b(gpy.q))
      );
   }

   private CompletableFuture<?> a(mk $$0, ale $$1, List<hie> $$2) {
      return mm.a($$0, hig.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
