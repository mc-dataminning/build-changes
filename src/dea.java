import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dea(jq<deb> c, jq<ded> d, boolean e) implements czp {
   public static final Codec<dea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               deb.c.fieldOf("material").forGetter(dea::a),
               ded.c.fieldOf("pattern").forGetter(dea::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dea::new)
   );
   public static final zh<wu, dea> b = zh.a(deb.d, dea::a, ded.d, dea::b, zf.b, $$0 -> $$0.e, dea::new);
   private static final xj f = xj.c(ae.a("item", alj.b("smithing_template.upgrade"))).a(n.h);

   public dea(jq<deb> $$0, jq<ded> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<deb> $$0, alj $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<ded> $$0, jq<deb> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alj a(ddw.d $$0, alj $$1) {
      alj $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xi.a().b(this.d.a().a(this.c)));
         $$1.accept(xi.a().b(this.c.a().e()));
      }
   }

   public dea a(boolean $$0) {
      return new dea(this.c, this.d, $$0);
   }

   public jq<deb> a() {
      return this.c;
   }

   public jq<ded> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
