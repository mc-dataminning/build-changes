import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fsg implements mo {
   private static final alr d = alr.b("trims/color_palettes/trim_palette");
   private static final Map<String, alr> e = c().collect(Collectors.toMap(diw.a::a, $$0 -> alr.b("trims/color_palettes/" + $$0.a())));
   private static final List<alq<diz>> f = List.of(
      dja.a, dja.b, dja.c, dja.d, dja.e, dja.f, dja.g, dja.h, dja.i, dja.j, dja.k, dja.l, dja.m, dja.n, dja.o, dja.p, dja.q, dja.r
   );
   private static final List<hmw.d> g = List.of(hmw.d.a, hmw.d.b);
   private final mq.a h;

   public fsg(mq $$0) {
      this.h = $$0.a(mq.b.b, "atlases");
   }

   private static List<alr> b() {
      List<alr> $$0 = new ArrayList<>(f.size() * g.size());

      for (alq<diz> $$1 : f) {
         alr $$2 = dja.a($$1);

         for (hmw.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hkv a(hmx $$0) {
      return new hlc($$0.b());
   }

   private static hkv a(grm $$0) {
      return new hkz($$0.b(), $$0.b() + "/");
   }

   private static List<hkv> b(grm $$0) {
      return List.of(a($$0));
   }

   private static List<hkv> a(String $$0) {
      return List.of(new hkz($$0, ""));
   }

   private static Stream<diw.a> c() {
      return fsj.e.stream().map(fsj.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(diw.a::a));
   }

   private static List<hkv> d() {
      return List.of(new hlb(b(), d, e));
   }

   private static List<hkv> e() {
      return List.of(a(gsh.j), a(gsh.i), a(gui.a), a(gty.a), a(gsh.A), a(guk.a), new hlb(List.of(fsj.a, fsj.b, fsj.c, fsj.d), d, e));
   }

   private static List<hkv> f() {
      return List.of(a(hna.f), a(gsh.k));
   }

   private static List<hkv> g() {
      return List.of(a(hna.g), a(hna.h), a(gsh.l));
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hmp.a, d()),
         this.a($$0, hmp.b, f()),
         this.a($$0, hmp.c, b(gsh.o)),
         this.a($$0, hmp.d, e()),
         this.a($$0, hmp.e, b(gsh.m)),
         this.a($$0, hmp.f, b(gsh.n)),
         this.a($$0, hmp.g, a("gui/sprites")),
         this.a($$0, hmp.h, a("map/decorations")),
         this.a($$0, hmp.i, a("mob_effect")),
         this.a($$0, hmp.j, a("painting")),
         this.a($$0, hmp.k, a("particle")),
         this.a($$0, hmp.l, g()),
         this.a($$0, hmp.m, b(gsh.p)),
         this.a($$0, hmp.n, b(gsh.q))
      );
   }

   private CompletableFuture<?> a(mm $$0, alr $$1, List<hkv> $$2) {
      return mo.a($$0, hkx.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
