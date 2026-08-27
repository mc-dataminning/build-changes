import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cpb {
   public static final Codec<cpb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpc.b.fieldOf("material").forGetter(cpb::b), cpe.b.fieldOf("pattern").forGetter(cpb::a)).apply($$0, cpb::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vf d = vf.c(ac.a("item", new ahg("smithing_template.upgrade"))).a(n.h);
   private final ih<cpc> e;
   private final ih<cpe> f;
   private final Function<ckj, ahg> g;
   private final Function<ckj, ahg> h;

   public cpb(ih<cpc> $$0, ih<cpe> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         ahg $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ahg $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(ckj $$0) {
      Map<ckk, String> $$1 = this.e.a().d();
      return $$0 instanceof ckk && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ih<cpe> $$0, ih<cpc> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ih<cpe> a() {
      return this.f;
   }

   public ih<cpc> b() {
      return this.e;
   }

   public ahg a(ckj $$0) {
      return this.g.apply($$0);
   }

   public ahg b(ckj $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cpb $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(iu $$0, cmy $$1, cpb $$2) {
      if ($$1.a(asp.aH)) {
         $$1.w().a("Trim", (tk)a.encodeStart(ahe.a(tb.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cpb> a(iu $$0, cmy $$1, boolean $$2) {
      if ($$1.a(asp.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         sn $$3 = $$1.b("Trim");
         cpb $$4 = (cpb)a.parse(ahe.a(tb.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cmy $$0, iu $$1, List<vf> $$2) {
      Optional<cpb> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cpb $$4 = $$3.get();
         $$2.add(d);
         $$2.add(ve.a().b($$4.a().a().a($$4.b())));
         $$2.add(ve.a().b($$4.b().a().e()));
      }
   }
}
