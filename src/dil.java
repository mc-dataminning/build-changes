import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dil(jg<din> c, jg<dip> d) implements ddf {
   public static final Codec<dil> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(din.c.fieldOf("material").forGetter(dil::a), dip.c.fieldOf("pattern").forGetter(dil::b)).apply($$0, dil::new)
   );
   public static final za<wn, dil> b = za.a(din.d, dil::a, dip.d, dil::b, dil::new);
   private static final xc e = xc.c(ag.a("item", alk.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      $$1.accept(e);
      $$1.accept(xb.a().b(this.d.a().a(this.c)));
      $$1.accept(xb.a().b(this.c.a().b()));
   }

   public alk a(String $$0, alj<dih> $$1) {
      dim.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jg<din> a() {
      return this.c;
   }

   public jg<dip> b() {
      return this.d;
   }
}
