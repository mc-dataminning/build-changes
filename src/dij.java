import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dij(jf<dil> c, jf<din> d) implements ddd {
   public static final Codec<dij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dil.c.fieldOf("material").forGetter(dij::a), din.c.fieldOf("pattern").forGetter(dij::b)).apply($$0, dij::new)
   );
   public static final yy<wl, dij> b = yy.a(dil.d, dij::a, din.d, dij::b, dij::new);
   private static final xa e = xa.c(ag.a("item", ali.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      $$1.accept(e);
      $$1.accept(wz.a().b(this.d.a().a(this.c)));
      $$1.accept(wz.a().b(this.c.a().b()));
   }

   public ali a(String $$0, alh<dif> $$1) {
      dik.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jf<dil> a() {
      return this.c;
   }

   public jf<din> b() {
      return this.d;
   }
}
