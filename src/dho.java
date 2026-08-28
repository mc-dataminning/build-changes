import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record dho(je<dhq> c, je<dhs> d) implements dci {
   public static final Codec<dho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhq.c.fieldOf("material").forGetter(dho::a), dhs.c.fieldOf("pattern").forGetter(dho::b)).apply($$0, dho::new)
   );
   public static final yw<wj, dho> b = yw.a(dhq.d, dho::a, dhs.d, dho::b, dho::new);
   private static final wy e = wy.c(af.a("item", alg.b("smithing_template.upgrade"))).a(n.h);

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      $$1.accept(e);
      $$1.accept(wx.a().b(this.d.a().a(this.c)));
      $$1.accept(wx.a().b(this.c.a().b()));
   }

   public alg a(String $$0, alf<dhk> $$1) {
      dhp.a $$2 = this.a().a().a().a($$1);
      return this.b().a().a().a((UnaryOperator<String>)($$2x -> $$0 + "/" + $$2x + "_" + $$2.a()));
   }

   public je<dhq> a() {
      return this.c;
   }

   public je<dhs> b() {
      return this.d;
   }
}
