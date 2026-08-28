import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dfo(jq<dfp> c, jq<dfr> d, boolean e) implements dan {
   public static final Codec<dfo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfp.c.fieldOf("material").forGetter(dfo::a),
               dfr.c.fieldOf("pattern").forGetter(dfo::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfo::new)
   );
   public static final zt<xg, dfo> b = zt.a(dfp.d, dfo::a, dfr.d, dfo::b, zr.b, $$0 -> $$0.e, dfo::new);
   private static final xv f = xv.c(ae.a("item", alz.b("smithing_template.upgrade"))).a(n.h);

   public dfo(jq<dfp> $$0, jq<dfr> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<dfp> $$0, alz $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<dfr> $$0, jq<dfp> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alz a(dfk.d $$0, alz $$1) {
      alz $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xu.a().b(this.d.a().a(this.c)));
         $$1.accept(xu.a().b(this.c.a().e()));
      }
   }

   public dfo a(boolean $$0) {
      return new dfo(this.c, this.d, $$0);
   }

   public jq<dfp> a() {
      return this.c;
   }

   public jq<dfr> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
