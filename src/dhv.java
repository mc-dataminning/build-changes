import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dhv(jf<dhx> c, jf<dhz> d) implements dcp {
   public static final Codec<dhv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhx.c.fieldOf("material").forGetter(dhv::a), dhz.c.fieldOf("pattern").forGetter(dhv::b)).apply($$0, dhv::new)
   );
   public static final yw<wj, dhv> b = yw.a(dhx.d, dhv::a, dhz.d, dhv::b, dhv::new);
   private static final wy e = wy.c(ag.a("item", alg.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      $$1.accept(e);
      $$1.accept(wx.a().b(this.d.a().a(this.c)));
      $$1.accept(wx.a().b(this.c.a().b()));
   }

   public alg a(String $$0, alf<dhr> $$1) {
      dhw.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jf<dhx> a() {
      return this.c;
   }

   public jf<dhz> b() {
      return this.d;
   }
}
