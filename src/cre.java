import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cre {
   public static final Codec<cre> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(crf.b.fieldOf("material").forGetter(cre::b), crh.b.fieldOf("pattern").forGetter(cre::a)).apply($$0, cre::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vq d = vq.c(ac.a("item", new aiy("smithing_template.upgrade"))).a(n.h);
   private final ij<crf> e;
   private final ij<crh> f;
   private final Function<cmo, aiy> g;
   private final Function<cmo, aiy> h;

   public cre(ij<crf> $$0, ij<crh> $$1) {
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

   private String c(cmo $$0) {
      Map<cmp, String> $$1 = this.e.a().d();
      return $$0 instanceof cmp && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ij<crh> $$0, ij<crf> $$1) {
      return $$0.equals(this.f) && $$1.equals(this.e);
   }

   public ij<crh> a() {
      return this.f;
   }

   public ij<crf> b() {
      return this.e;
   }

   public aiy a(cmo $$0) {
      return this.g.apply($$0);
   }

   public aiy b(cmo $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cre $$1) ? false : this.f.equals($$1.f) && this.e.equals($$1.e);
   }

   public static boolean a(iw $$0, cpd $$1, cre $$2) {
      if ($$1.a(aui.aM)) {
         $$1.x().a("Trim", (tt)a.encodeStart(aiw.a(tk.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cre> a(iw $$0, cpd $$1, boolean $$2) {
      if ($$1.a(aui.aM) && $$1.w() != null && $$1.w().e("Trim")) {
         sw $$3 = $$1.b("Trim");
         cre $$4 = (cre)a.parse(aiw.a(tk.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cpd $$0, iw $$1, List<vq> $$2) {
      Optional<cre> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cre $$4 = $$3.get();
         $$2.add(d);
         $$2.add(vp.a().b($$4.a().a().a($$4.b())));
         $$2.add(vp.a().b($$4.b().a().e()));
      }
   }
}
