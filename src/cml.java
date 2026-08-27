import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cml {
   public static final Codec<cml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cmm.b.fieldOf("material").forGetter(cml::b), cmo.b.fieldOf("pattern").forGetter(cml::a)).apply($$0, cml::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final ui d = ui.c(ac.a("item", new afw("smithing_template.upgrade"))).a(n.h);
   private final ib<cmm> e;
   private final ib<cmo> f;
   private final Function<chu, afw> g;
   private final Function<chu, afw> h;

   public cml(ib<cmm> $$0, ib<cmo> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         afw $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         afw $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(chu $$0) {
      Map<chv, String> $$1 = this.e.a().d();
      return $$0 instanceof chv && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ib<cmo> $$0, ib<cmm> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ib<cmo> a() {
      return this.f;
   }

   public ib<cmm> b() {
      return this.e;
   }

   public afw a(chu $$0) {
      return this.g.apply($$0);
   }

   public afw b(chu $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cml $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(ip $$0, ckj $$1, cml $$2) {
      if ($$1.a(ara.aH)) {
         $$1.w().a("Trim", (sn)a.encodeStart(afu.a(sf.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cml> a(ip $$0, ckj $$1, boolean $$2) {
      if ($$1.a(ara.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         rt $$3 = $$1.b("Trim");
         cml $$4 = (cml)a.parse(afu.a(sf.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(ckj $$0, ip $$1, List<ui> $$2) {
      Optional<cml> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cml $$4 = $$3.get();
         $$2.add(d);
         $$2.add(uh.a().b($$4.a().a().a($$4.b())));
         $$2.add(uh.a().b($$4.b().a().e()));
      }
   }
}
