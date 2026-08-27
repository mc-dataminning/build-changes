import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class csm {
   public static final Codec<csm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csn.b.fieldOf("material").forGetter(csm::b), csp.b.fieldOf("pattern").forGetter(csm::a)).apply($$0, csm::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vu d = vu.c(ac.a("item", new ajh("smithing_template.upgrade"))).a(n.h);
   private final il<csn> e;
   private final il<csp> f;
   private final Function<il<cnx>, ajh> g;
   private final Function<il<cnx>, ajh> h;

   public csm(il<csn> $$0, il<csp> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         ajh $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ajh $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(il<cnx> $$0) {
      Map<il<cnx>, String> $$1 = this.e.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.e.a().a();
   }

   public boolean a(il<csp> $$0, il<csn> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public il<csp> a() {
      return this.f;
   }

   public il<csn> b() {
      return this.e;
   }

   public ajh a(il<cnx> $$0) {
      return this.g.apply($$0);
   }

   public ajh b(il<cnx> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof csm $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iz $$0, cqk $$1, csm $$2) {
      if ($$1.a(auv.aM)) {
         $$1.x().a("Trim", (tx)a.encodeStart(ajf.a(to.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<csm> a(iz $$0, cqk $$1, boolean $$2) {
      if ($$1.a(auv.aM) && $$1.w() != null && $$1.w().e("Trim")) {
         ta $$3 = $$1.c("Trim");
         csm $$4 = (csm)a.parse(ajf.a(to.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cqk $$0, iz $$1, List<vu> $$2) {
      Optional<csm> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         csm $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vt.a().b($$4.a().a().a($$4.b())));
         $$2.add(vt.a().b($$4.b().a().e()));
      }
   }
}
