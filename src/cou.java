import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cou {
   public static final Codec<cou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cov.b.fieldOf("material").forGetter(cou::b), cox.b.fieldOf("pattern").forGetter(cou::a)).apply($$0, cou::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vd d = vd.c(ac.a("item", new ahd("smithing_template.upgrade"))).a(n.h);
   private final ih<cov> e;
   private final ih<cox> f;
   private final Function<ckc, ahd> g;
   private final Function<ckc, ahd> h;

   public cou(ih<cov> $$0, ih<cox> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         ahd $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ahd $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(ckc $$0) {
      Map<ckd, String> $$1 = this.e.a().d();
      return $$0 instanceof ckd && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ih<cox> $$0, ih<cov> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ih<cox> a() {
      return this.f;
   }

   public ih<cov> b() {
      return this.e;
   }

   public ahd a(ckc $$0) {
      return this.g.apply($$0);
   }

   public ahd b(ckc $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cou $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(iu $$0, cmr $$1, cou $$2) {
      if ($$1.a(asj.aH)) {
         $$1.w().a("Trim", (ti)a.encodeStart(ahb.a(sz.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cou> a(iu $$0, cmr $$1, boolean $$2) {
      if ($$1.a(asj.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         sl $$3 = $$1.b("Trim");
         cou $$4 = (cou)a.parse(ahb.a(sz.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cmr $$0, iu $$1, List<vd> $$2) {
      Optional<cou> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cou $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vc.a().b($$4.a().a().a($$4.b())));
         $$2.add(vc.a().b($$4.b().a().e()));
      }
   }
}
