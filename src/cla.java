import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cla {
   public static final Codec<cla> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(clb.b.fieldOf("material").forGetter(cla::b), cld.b.fieldOf("pattern").forGetter(cla::a)).apply($$0, cla::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final tf d = tf.c(ac.a("item", new aer("smithing_template.upgrade"))).a(n.h);
   private final he<clb> e;
   private final he<cld> f;
   private final Function<cgj, aer> g;
   private final Function<cgj, aer> h;

   public cla(he<clb> $$0, he<cld> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aer $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aer $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cgj $$0) {
      Map<cgk, String> $$1 = this.e.a().d();
      return $$0 instanceof cgk && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(he<cld> $$0, he<clb> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public he<cld> a() {
      return this.f;
   }

   public he<clb> b() {
      return this.e;
   }

   public aer a(cgj $$0) {
      return this.g.apply($$0);
   }

   public aer b(cgj $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cla $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(hs $$0, ciy $$1, cla $$2) {
      if ($$1.a(apt.aH)) {
         $$1.w().a("Trim", (rk)a.encodeStart(aep.a(rc.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cla> a(hs $$0, ciy $$1, boolean $$2) {
      if ($$1.a(apt.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         qr $$3 = $$1.b("Trim");
         cla $$4 = (cla)a.parse(aep.a(rc.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(ciy $$0, hs $$1, List<tf> $$2) {
      Optional<cla> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cla $$4 = $$3.get();
         $$2.add(d);
         $$2.add(te.a().b($$4.a().a().a($$4.b())));
         $$2.add(te.a().b($$4.b().a().e()));
      }
   }
}
