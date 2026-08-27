import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cra {
   public static final Codec<cra> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crb.b.fieldOf("material").forGetter(cra::b), crd.b.fieldOf("pattern").forGetter(cra::a)).apply($$0, cra::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vq d = vq.c(ac.a("item", new aiy("smithing_template.upgrade"))).a(n.h);
   private final ij<crb> e;
   private final ij<crd> f;
   private final Function<cmk, aiy> g;
   private final Function<cmk, aiy> h;

   public cra(ij<crb> $$0, ij<crd> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aiy $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aiy $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cmk $$0) {
      Map<cml, String> $$1 = this.e.a().d();
      return $$0 instanceof cml && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ij<crd> $$0, ij<crb> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public ij<crd> a() {
      return this.f;
   }

   public ij<crb> b() {
      return this.e;
   }

   public aiy a(cmk $$0) {
      return this.g.apply($$0);
   }

   public aiy b(cmk $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cra $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iw $$0, coz $$1, cra $$2) {
      if ($$1.a(auh.aM)) {
         $$1.x().a("Trim", (tt)a.encodeStart(aiw.a(tk.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cra> a(iw $$0, coz $$1, boolean $$2) {
      if ($$1.a(auh.aM) && $$1.w() != null && $$1.w().e("Trim")) {
         sw $$3 = $$1.b("Trim");
         cra $$4 = (cra)a.parse(aiw.a(tk.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(coz $$0, iw $$1, List<vq> $$2) {
      Optional<cra> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cra $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vp.a().b($$4.a().a().a($$4.b())));
         $$2.add(vp.a().b($$4.b().a().e()));
      }
   }
}
