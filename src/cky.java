import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cky {
   public static final Codec<cky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ckz.b.fieldOf("material").forGetter(cky::b), clb.b.fieldOf("pattern").forGetter(cky::a)).apply($$0, cky::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final te d = te.c(ac.a("item", new aep("smithing_template.upgrade"))).a(n.h);
   private final hf<ckz> e;
   private final hf<clb> f;
   private final Function<cgh, aep> g;
   private final Function<cgh, aep> h;

   public cky(hf<ckz> $$0, hf<clb> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aep $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aep $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cgh $$0) {
      Map<cgi, String> $$1 = this.e.a().d();
      return $$0 instanceof cgi && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(hf<clb> $$0, hf<ckz> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public hf<clb> a() {
      return this.f;
   }

   public hf<ckz> b() {
      return this.e;
   }

   public aep a(cgh $$0) {
      return this.g.apply($$0);
   }

   public aep b(cgh $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cky $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(ht $$0, ciw $$1, cky $$2) {
      if ($$1.a(apr.aH)) {
         $$1.w().a("Trim", (rl)a.encodeStart(aen.a(rd.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cky> a(ht $$0, ciw $$1, boolean $$2) {
      if ($$1.a(apr.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         qs $$3 = $$1.b("Trim");
         cky $$4 = (cky)a.parse(aen.a(rd.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(ciw $$0, ht $$1, List<te> $$2) {
      Optional<cky> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cky $$4 = $$3.get();
         $$2.add(d);
         $$2.add(td.a().b($$4.a().a().a($$4.b())));
         $$2.add(td.a().b($$4.b().a().e()));
      }
   }
}
