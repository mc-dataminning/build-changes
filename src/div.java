import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record div(jg<dix> c, jg<diz> d) implements ddp {
   public static final Codec<div> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dix.c.fieldOf("material").forGetter(div::a), diz.c.fieldOf("pattern").forGetter(div::b)).apply($$0, div::new)
   );
   public static final ze<wp, div> b = ze.a(dix.d, div::a, diz.d, div::b, div::new);
   private static final xg e = xg.c(ag.a("item", alr.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      $$1.accept(e);
      $$1.accept(xf.a().b(this.d.a().a(this.c)));
      $$1.accept(xf.a().b(this.c.a().b()));
   }

   public alr a(String $$0, alq<dir> $$1) {
      diw.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jg<dix> a() {
      return this.c;
   }

   public jg<diz> b() {
      return this.d;
   }
}
