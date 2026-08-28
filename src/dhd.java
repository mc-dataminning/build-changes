import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dhd(je<dhf> c, je<dhh> d) implements dbx {
   public static final Codec<dhd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhf.c.fieldOf("material").forGetter(dhd::a), dhh.c.fieldOf("pattern").forGetter(dhd::b)).apply($$0, dhd::new)
   );
   public static final yu<wh, dhd> b = yu.a(dhf.d, dhd::a, dhh.d, dhd::b, dhd::new);
   private static final ww e = ww.c(af.a("item", ale.b("smithing_template.upgrade"))).a(n.h);

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      $$1.accept(e);
      $$1.accept(wv.a().b(this.d.a().a(this.c)));
      $$1.accept(wv.a().b(this.c.a().b()));
   }

   public ale a(String $$0, ald<dgz> $$1) {
      dhe.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public je<dhf> a() {
      return this.c;
   }

   public je<dhh> b() {
      return this.d;
   }
}
