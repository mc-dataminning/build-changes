import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dfn(jq<dfo> c, jq<dfq> d, boolean e) implements daj {
   public static final Codec<dfn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfo.c.fieldOf("material").forGetter(dfn::a),
               dfq.c.fieldOf("pattern").forGetter(dfn::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfn::new)
   );
   public static final zi<wv, dfn> b = zi.a(dfo.d, dfn::a, dfq.d, dfn::b, zg.b, $$0 -> $$0.e, dfn::new);
   private static final xk f = xk.c(ae.a("item", alp.b("smithing_template.upgrade"))).a(n.h);

   public dfn(jq<dfo> $$0, jq<dfq> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<dfo> $$0, alp $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<dfq> $$0, jq<dfo> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alp a(dfj.d $$0, alp $$1) {
      alp $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xj.a().b(this.d.a().a(this.c)));
         $$1.accept(xj.a().b(this.c.a().e()));
      }
   }

   public dfn a(boolean $$0) {
      return new dfn(this.c, this.d, $$0);
   }

   public jq<dfo> a() {
      return this.c;
   }

   public jq<dfq> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
