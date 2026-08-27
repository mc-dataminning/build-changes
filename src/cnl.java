import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cnl {
   public static final Codec<cnl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cnm.b.fieldOf("material").forGetter(cnl::b), cno.b.fieldOf("pattern").forGetter(cnl::a)).apply($$0, cnl::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final ur d = ur.c(ac.a("item", new agi("smithing_template.upgrade"))).a(n.h);
   private final ib<cnm> e;
   private final ib<cno> f;
   private final Function<ciu, agi> g;
   private final Function<ciu, agi> h;

   public cnl(ib<cnm> $$0, ib<cno> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         agi $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         agi $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(ciu $$0) {
      Map<civ, String> $$1 = this.e.a().d();
      return $$0 instanceof civ && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ib<cno> $$0, ib<cnm> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ib<cno> a() {
      return this.f;
   }

   public ib<cnm> b() {
      return this.e;
   }

   public agi a(ciu $$0) {
      return this.g.apply($$0);
   }

   public agi b(ciu $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cnl $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(ip $$0, clj $$1, cnl $$2) {
      if ($$1.a(aro.aH)) {
         $$1.w().a("Trim", (sw)a.encodeStart(agg.a(sn.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cnl> a(ip $$0, clj $$1, boolean $$2) {
      if ($$1.a(aro.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         rz $$3 = $$1.b("Trim");
         cnl $$4 = (cnl)a.parse(agg.a(sn.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(clj $$0, ip $$1, List<ur> $$2) {
      Optional<cnl> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cnl $$4 = $$3.get();
         $$2.add(d);
         $$2.add(uq.a().b($$4.a().a().a($$4.b())));
         $$2.add(uq.a().b($$4.b().a().e()));
      }
   }
}
