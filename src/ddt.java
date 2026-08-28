import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record ddt(jq<ddu> c, jq<ddw> d, boolean e) implements czi {
   public static final Codec<ddt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddu.c.fieldOf("material").forGetter(ddt::a),
               ddw.c.fieldOf("pattern").forGetter(ddt::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddt::new)
   );
   public static final zj<ww, ddt> b = zj.a(ddu.d, ddt::a, ddw.d, ddt::b, zh.b, $$0 -> $$0.e, ddt::new);
   private static final xl f = xl.c(ae.a("item", all.b("smithing_template.upgrade"))).a(n.h);

   public ddt(jq<ddu> $$0, jq<ddw> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<ddu> $$0, all $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<ddw> $$0, jq<ddu> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public all a(ddp.d $$0, all $$1) {
      all $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xk.a().b(this.d.a().a(this.c)));
         $$1.accept(xk.a().b(this.c.a().e()));
      }
   }

   public ddt a(boolean $$0) {
      return new ddt(this.c, this.d, $$0);
   }

   public jq<ddu> a() {
      return this.c;
   }

   public jq<ddw> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
