import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class cln {
   public static final Codec<cln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(clo.b.fieldOf("material").forGetter(cln::b), clq.b.fieldOf("pattern").forGetter(cln::a)).apply($$0, cln::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final tl d = tl.c(ac.a("item", new aez("smithing_template.upgrade"))).a(n.h);
   private final he<clo> e;
   private final he<clq> f;
   private final Function<cgw, aez> g;
   private final Function<cgw, aez> h;

   public cln(he<clo> $$0, he<clq> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aez $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aez $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cgw $$0) {
      Map<cgx, String> $$1 = this.e.a().d();
      return $$0 instanceof cgx && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(he<clq> $$0, he<clo> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public he<clq> a() {
      return this.f;
   }

   public he<clo> b() {
      return this.e;
   }

   public aez a(cgw $$0) {
      return this.g.apply($$0);
   }

   public aez b(cgw $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cln $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(hr $$0, cjl $$1, cln $$2) {
      if ($$1.a(aqd.aH)) {
         $$1.w().a("Trim", (rq)a.encodeStart(aex.a(ri.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<cln> a(hr $$0, cjl $$1, boolean $$2) {
      if ($$1.a(aqd.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         qw $$3 = $$1.b("Trim");
         cln $$4 = (cln)a.parse(aex.a(ri.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cjl $$0, hr $$1, List<tl> $$2) {
      Optional<cln> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         cln $$4 = $$3.get();
         $$2.add(d);
         $$2.add(tk.a().b($$4.a().a().a($$4.b())));
         $$2.add(tk.a().b($$4.b().a().e()));
      }
   }
}
