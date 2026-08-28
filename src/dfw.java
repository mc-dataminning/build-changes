import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dfw(jq<dfx> c, jq<dfz> d, boolean e) implements das {
   public static final Codec<dfw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfx.c.fieldOf("material").forGetter(dfw::a),
               dfz.c.fieldOf("pattern").forGetter(dfw::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfw::new)
   );
   public static final zt<xg, dfw> b = zt.a(dfx.d, dfw::a, dfz.d, dfw::b, zr.b, $$0 -> $$0.e, dfw::new);
   private static final xv f = xv.c(ae.a("item", alz.b("smithing_template.upgrade"))).a(n.h);

   public dfw(jq<dfx> $$0, jq<dfz> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<dfx> $$0, alz $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<dfz> $$0, jq<dfx> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alz a(dfs.d $$0, alz $$1) {
      alz $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xu.a().b(this.d.a().a(this.c)));
         $$1.accept(xu.a().b(this.c.a().e()));
      }
   }

   public dfw a(boolean $$0) {
      return new dfw(this.c, this.d, $$0);
   }

   public jq<dfx> a() {
      return this.c;
   }

   public jq<dfz> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
