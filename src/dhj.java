import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dhj(je<dhl> c, je<dhn> d) implements dcd {
   public static final Codec<dhj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhl.c.fieldOf("material").forGetter(dhj::a), dhn.c.fieldOf("pattern").forGetter(dhj::b)).apply($$0, dhj::new)
   );
   public static final yw<wj, dhj> b = yw.a(dhl.d, dhj::a, dhn.d, dhj::b, dhj::new);
   private static final wy e = wy.c(af.a("item", alg.b("smithing_template.upgrade"))).a(n.h);

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      $$1.accept(e);
      $$1.accept(wx.a().b(this.d.a().a(this.c)));
      $$1.accept(wx.a().b(this.c.a().b()));
   }

   public alg a(String $$0, alf<dhf> $$1) {
      dhk.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public je<dhl> a() {
      return this.c;
   }

   public je<dhn> b() {
      return this.d;
   }
}
