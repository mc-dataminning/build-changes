import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class crr {
   public static final Codec<crr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crs.b.fieldOf("material").forGetter(crr::b), cru.b.fieldOf("pattern").forGetter(crr::a)).apply($$0, crr::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vs d = vs.c(ac.a("item", new ajc("smithing_template.upgrade"))).a(n.h);
   private final il<crs> e;
   private final il<cru> f;
   private final Function<il<cnd>, ajc> g;
   private final Function<il<cnd>, ajc> h;

   public crr(il<crs> $$0, il<cru> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         ajc $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ajc $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(il<cnd> $$0) {
      Map<il<cnd>, String> $$1 = this.e.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.e.a().a();
   }

   public boolean a(il<cru> $$0, il<crs> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public il<cru> a() {
      return this.f;
   }

   public il<crs> b() {
      return this.e;
   }

   public ajc a(il<cnd> $$0) {
      return this.g.apply($$0);
   }

   public ajc b(il<cnd> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof crr $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iy $$0, cpq $$1, crr $$2) {
      if ($$1.a(aum.aM)) {
         $$1.x().a("Trim", (tv)a.encodeStart(aja.a(tm.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<crr> a(iy $$0, cpq $$1, boolean $$2) {
      if ($$1.a(aum.aM) && $$1.w() != null && $$1.w().e("Trim")) {
         sy $$3 = $$1.c("Trim");
         crr $$4 = (crr)a.parse(aja.a(tm.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cpq $$0, iy $$1, List<vs> $$2) {
      Optional<crr> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         crr $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vr.a().b($$4.a().a().a($$4.b())));
         $$2.add(vr.a().b($$4.b().a().e()));
      }
   }
}
