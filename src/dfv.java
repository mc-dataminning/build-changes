import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dfv(jq<dfw> c, jq<dfy> d, boolean e) implements dar {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfw.c.fieldOf("material").forGetter(dfv::a),
               dfy.c.fieldOf("pattern").forGetter(dfv::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfv::new)
   );
   public static final zt<xg, dfv> b = zt.a(dfw.d, dfv::a, dfy.d, dfv::b, zr.b, $$0 -> $$0.e, dfv::new);
   private static final xv f = xv.c(ae.a("item", alz.b("smithing_template.upgrade"))).a(n.h);

   public dfv(jq<dfw> $$0, jq<dfy> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<dfw> $$0, alz $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<dfy> $$0, jq<dfw> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alz a(dfr.d $$0, alz $$1) {
      alz $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xu.a().b(this.d.a().a(this.c)));
         $$1.accept(xu.a().b(this.c.a().e()));
      }
   }

   public dfv a(boolean $$0) {
      return new dfv(this.c, this.d, $$0);
   }

   public jq<dfw> a() {
      return this.c;
   }

   public jq<dfy> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
