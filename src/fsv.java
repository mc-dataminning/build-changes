import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fsv implements mo {
   private static final alk d = alk.b("trims/color_palettes/trim_palette");
   private static final Map<String, alk> e = c().collect(Collectors.toMap(dim.a::a, $$0 -> alk.b("trims/color_palettes/" + $$0.a())));
   private static final List<alj<dip>> f = List.of(
      diq.a, diq.b, diq.c, diq.d, diq.e, diq.f, diq.g, diq.h, diq.i, diq.j, diq.k, diq.l, diq.m, diq.n, diq.o, diq.p, diq.q, diq.r
   );
   private static final List<hni.d> g = List.of(hni.d.a, hni.d.b);
   private final mq.a h;

   public fsv(mq $$0) {
      this.h = $$0.a(mq.b.b, "atlases");
   }

   private static List<alk> b() {
      List<alk> $$0 = new ArrayList<>(f.size() * g.size());

      for (alj<dip> $$1 : f) {
         alk $$2 = diq.a($$1);

         for (hni.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hlh a(hnj $$0) {
      return new hlo($$0.b());
   }

   private static hlh a(gsb $$0) {
      return new hll($$0.b(), $$0.b() + "/");
   }

   private static List<hlh> b(gsb $$0) {
      return List.of(a($$0));
   }

   private static List<hlh> a(String $$0) {
      return List.of(new hll($$0, ""));
   }

   private static Stream<dim.a> c() {
      return fsy.e.stream().map(fsy.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dim.a::a));
   }

   private static List<hlh> d() {
      return List.of(new hln(b(), d, e));
   }

   private static List<hlh> e() {
      return List.of(a(gsw.j), a(gsw.i), a(gux.a), a(gun.a), a(gsw.A), a(guz.a), new hln(List.of(fsy.a, fsy.b, fsy.c, fsy.d), d, e));
   }

   private static List<hlh> f() {
      return List.of(a(hnm.f), a(gsw.k));
   }

   private static List<hlh> g() {
      return List.of(a(hnm.g), a(hnm.h), a(gsw.l));
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hnb.a, d()),
         this.a($$0, hnb.b, f()),
         this.a($$0, hnb.c, b(gsw.o)),
         this.a($$0, hnb.d, e()),
         this.a($$0, hnb.e, b(gsw.m)),
         this.a($$0, hnb.f, b(gsw.n)),
         this.a($$0, hnb.g, a("gui/sprites")),
         this.a($$0, hnb.h, a("map/decorations")),
         this.a($$0, hnb.i, a("mob_effect")),
         this.a($$0, hnb.j, a("painting")),
         this.a($$0, hnb.k, a("particle")),
         this.a($$0, hnb.l, g()),
         this.a($$0, hnb.m, b(gsw.p)),
         this.a($$0, hnb.n, b(gsw.q))
      );
   }

   private CompletableFuture<?> a(mm $$0, alk $$1, List<hlh> $$2) {
      return mo.a($$0, hlj.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
