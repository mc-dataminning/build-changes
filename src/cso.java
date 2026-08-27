import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cso {
   public static final Codec<cso> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(csp.b.fieldOf("material").forGetter(cso::b), csr.b.fieldOf("pattern").forGetter(cso::a)).apply($$0, cso::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vu d = vu.c(ac.a("item", new ajh("smithing_template.upgrade"))).a(n.h);
   private final il<csp> e;
   private final il<csr> f;
   private final Function<il<cnz>, ajh> g;
   private final Function<il<cnz>, ajh> h;

   public cso(il<csp> $$0, il<csr> $$1) {
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

   private String c(il<cnz> $$0) {
      Map<il<cnz>, String> $$1 = this.e.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.e.a().a();
   }

   public boolean a(il<csr> $$0, il<csp> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public il<csr> a() {
      return this.f;
   }

   public il<csp> b() {
      return this.e;
   }

   public ajh a(il<cnz> $$0) {
      return this.g.apply($$0);
   }

   public ajh b(il<cnz> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cso $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iz $$0, cqm $$1, cso $$2) {
      if ($$1.a(auv.aM)) {
         $$1.x().a("Trim", (tx)a.encodeStart($$0.a(to.a), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cso> a(iz $$0, cqm $$1, boolean $$2) {
      if ($$1.a(auv.aM) && $$1.w() != null && $$1.w().e("Trim")) {
         ta $$3 = $$1.c("Trim");
         cso $$4 = (cso)a.parse($$0.a(to.a), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cqm $$0, iz $$1, List<vu> $$2) {
      Optional<cso> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cso $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vt.a().b($$4.a().a().a($$4.b())));
         $$2.add(vt.a().b($$4.b().a().e()));
      }
   }
}
