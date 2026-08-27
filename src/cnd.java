import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cnd {
   public static final Codec<cnd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cne.b.fieldOf("material").forGetter(cnd::b), cng.b.fieldOf("pattern").forGetter(cnd::a)).apply($$0, cnd::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final ur d = ur.c(ac.a("item", new agg("smithing_template.upgrade"))).a(n.h);
   private final ib<cne> e;
   private final ib<cng> f;
   private final Function<cim, agg> g;
   private final Function<cim, agg> h;

   public cnd(ib<cne> $$0, ib<cng> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         agg $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         agg $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cim $$0) {
      Map<cin, String> $$1 = this.e.a().d();
      return $$0 instanceof cin && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ib<cng> $$0, ib<cne> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ib<cng> a() {
      return this.f;
   }

   public ib<cne> b() {
      return this.e;
   }

   public agg a(cim $$0) {
      return this.g.apply($$0);
   }

   public agg b(cim $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cnd $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(ip $$0, clb $$1, cnd $$2) {
      if ($$1.a(ark.aH)) {
         $$1.w().a("Trim", (sw)a.encodeStart(age.a(sn.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cnd> a(ip $$0, clb $$1, boolean $$2) {
      if ($$1.a(ark.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         rz $$3 = $$1.b("Trim");
         cnd $$4 = (cnd)a.parse(age.a(sn.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(clb $$0, ip $$1, List<ur> $$2) {
      Optional<cnd> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cnd $$4 = $$3.get();
         $$2.add(d);
         $$2.add(uq.a().b($$4.a().a().a($$4.b())));
         $$2.add(uq.a().b($$4.b().a().e()));
      }
   }
}
