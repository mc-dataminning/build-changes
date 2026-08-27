import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cpj {
   public static final Codec<cpj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpk.b.fieldOf("material").forGetter(cpj::b), cpm.b.fieldOf("pattern").forGetter(cpj::a)).apply($$0, cpj::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vg d = vg.c(ac.a("item", new ahh("smithing_template.upgrade"))).a(n.h);
   private final ih<cpk> e;
   private final ih<cpm> f;
   private final Function<cks, ahh> g;
   private final Function<cks, ahh> h;

   public cpj(ih<cpk> $$0, ih<cpm> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         ahh $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ahh $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cks $$0) {
      Map<ckt, String> $$1 = this.e.a().d();
      return $$0 instanceof ckt && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ih<cpm> $$0, ih<cpk> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public ih<cpm> a() {
      return this.f;
   }

   public ih<cpk> b() {
      return this.e;
   }

   public ahh a(cks $$0) {
      return this.g.apply($$0);
   }

   public ahh b(cks $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cpj $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iu $$0, cng $$1, cpj $$2) {
      if ($$1.a(asq.aH)) {
         $$1.w().a("Trim", (tl)a.encodeStart(ahf.a(tc.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cpj> a(iu $$0, cng $$1, boolean $$2) {
      if ($$1.a(asq.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         so $$3 = $$1.b("Trim");
         cpj $$4 = (cpj)a.parse(ahf.a(tc.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cng $$0, iu $$1, List<vg> $$2) {
      Optional<cpj> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cpj $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vf.a().b($$4.a().a().a($$4.b())));
         $$2.add(vf.a().b($$4.b().a().e()));
      }
   }
}
