import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class clc {
   public static final Codec<clc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cld.b.fieldOf("material").forGetter(clc::b), clf.b.fieldOf("pattern").forGetter(clc::a)).apply($$0, clc::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final ti d = ti.c(ac.a("item", new aeu("smithing_template.upgrade"))).a(n.h);
   private final hg<cld> e;
   private final hg<clf> f;
   private final Function<cgl, aeu> g;
   private final Function<cgl, aeu> h;

   public clc(hg<cld> $$0, hg<clf> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aeu $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aeu $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cgl $$0) {
      Map<cgm, String> $$1 = this.e.a().d();
      return $$0 instanceof cgm && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(hg<clf> $$0, hg<cld> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public hg<clf> a() {
      return this.f;
   }

   public hg<cld> b() {
      return this.e;
   }

   public aeu a(cgl $$0) {
      return this.g.apply($$0);
   }

   public aeu b(cgl $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof clc $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(hu $$0, cja $$1, clc $$2) {
      if ($$1.a(apw.aH)) {
         $$1.w().a("Trim", (rn)a.encodeStart(aes.a(rf.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<clc> a(hu $$0, cja $$1, boolean $$2) {
      if ($$1.a(apw.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         qu $$3 = $$1.b("Trim");
         clc $$4 = (clc)a.parse(aes.a(rf.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cja $$0, hu $$1, List<ti> $$2) {
      Optional<clc> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         clc $$4 = $$3.get();
         $$2.add(d);
         $$2.add(th.a().b($$4.a().a().a($$4.b())));
         $$2.add(th.a().b($$4.b().a().e()));
      }
   }
}
