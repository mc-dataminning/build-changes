import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class clh {
   public static final Codec<clh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cli.b.fieldOf("material").forGetter(clh::b), clk.b.fieldOf("pattern").forGetter(clh::a)).apply($$0, clh::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final tl d = tl.c(ac.a("item", new aex("smithing_template.upgrade"))).a(n.h);
   private final hg<cli> e;
   private final hg<clk> f;
   private final Function<cgq, aex> g;
   private final Function<cgq, aex> h;

   public clh(hg<cli> $$0, hg<clk> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         aex $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         aex $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cgq $$0) {
      Map<cgr, String> $$1 = this.e.a().d();
      return $$0 instanceof cgr && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(hg<clk> $$0, hg<cli> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public hg<clk> a() {
      return this.f;
   }

   public hg<cli> b() {
      return this.e;
   }

   public aex a(cgq $$0) {
      return this.g.apply($$0);
   }

   public aex b(cgq $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof clh $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(hu $$0, cjf $$1, clh $$2) {
      if ($$1.a(aqb.aH)) {
         $$1.w().a("Trim", (rq)a.encodeStart(aev.a(ri.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<clh> a(hu $$0, cjf $$1, boolean $$2) {
      if ($$1.a(aqb.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         qx $$3 = $$1.b("Trim");
         clh $$4 = (clh)a.parse(aev.a(ri.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cjf $$0, hu $$1, List<tl> $$2) {
      Optional<clh> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         clh $$4 = $$3.get();
         $$2.add(d);
         $$2.add(tk.a().b($$4.a().a().a($$4.b())));
         $$2.add(tk.a().b($$4.b().a().e()));
      }
   }
}
