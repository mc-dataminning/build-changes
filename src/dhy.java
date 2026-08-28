import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dhy(jf<dia> c, jf<dic> d) implements dcs {
   public static final Codec<dhy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dia.c.fieldOf("material").forGetter(dhy::a), dic.c.fieldOf("pattern").forGetter(dhy::b)).apply($$0, dhy::new)
   );
   public static final yw<wj, dhy> b = yw.a(dia.d, dhy::a, dic.d, dhy::b, dhy::new);
   private static final wy e = wy.c(ag.a("item", alg.b("smithing_template.upgrade"))).a(o.h);

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      $$1.accept(e);
      $$1.accept(wx.a().b(this.d.a().a(this.c)));
      $$1.accept(wx.a().b(this.c.a().b()));
   }

   public alg a(String $$0, alf<dhu> $$1) {
      dhz.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public jf<dia> a() {
      return this.c;
   }

   public jf<dic> b() {
      return this.d;
   }
}
