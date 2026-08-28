import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwo implements cxq {
   public static final Codec<cwo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwp.c.fieldOf("material").forGetter(cwo::b),
               cwr.c.fieldOf("pattern").forGetter(cwo::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwo::new)
   );
   public static final zj<ww, cwo> b = zj.a(cwp.d, cwo::b, cwr.d, cwo::a, zh.b, $$0 -> $$0.f, cwo::new);
   private static final xl c = xl.c(ac.a("item", new alb("smithing_template.upgrade"))).a(n.h);
   private final ji<cwp> d;
   private final ji<cwr> e;
   private final boolean f;
   private final Function<ji<csa>, alb> g;
   private final Function<ji<csa>, alb> h;

   private cwo(ji<cwp> $$0, ji<cwr> $$1, boolean $$2, Function<ji<csa>, alb> $$3, Function<ji<csa>, alb> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwo(ji<cwp> $$0, ji<cwr> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         alb $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         alb $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwo(ji<cwp> $$0, ji<cwr> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ji<cwp> $$0, ji<csa> $$1) {
      Map<ji<csa>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ji<cwr> $$0, ji<cwp> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ji<cwr> a() {
      return this.e;
   }

   public ji<cwp> b() {
      return this.d;
   }

   public alb a(ji<csa> $$0) {
      return this.g.apply($$0);
   }

   public alb b(ji<csa> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwo $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xk.a().b(this.e.a().a(this.d)));
         $$1.accept(xk.a().b(this.d.a().e()));
      }
   }

   public cwo a(boolean $$0) {
      return new cwo(this.d, this.e, $$0, this.g, this.h);
   }
}
