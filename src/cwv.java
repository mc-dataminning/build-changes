import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwv implements cxx {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cww.c.fieldOf("material").forGetter(cwv::b),
               cwy.c.fieldOf("pattern").forGetter(cwv::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwv::new)
   );
   public static final zn<xa, cwv> b = zn.a(cww.d, cwv::b, cwy.d, cwv::a, zl.b, $$0 -> $$0.f, cwv::new);
   private static final xp c = xp.c(ac.a("item", new alf("smithing_template.upgrade"))).a(n.h);
   private final ji<cww> d;
   private final ji<cwy> e;
   private final boolean f;
   private final Function<ji<csh>, alf> g;
   private final Function<ji<csh>, alf> h;

   private cwv(ji<cww> $$0, ji<cwy> $$1, boolean $$2, Function<ji<csh>, alf> $$3, Function<ji<csh>, alf> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwv(ji<cww> $$0, ji<cwy> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         alf $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         alf $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwv(ji<cww> $$0, ji<cwy> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ji<cww> $$0, ji<csh> $$1) {
      Map<ji<csh>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ji<cwy> $$0, ji<cww> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ji<cwy> a() {
      return this.e;
   }

   public ji<cww> b() {
      return this.d;
   }

   public alf a(ji<csh> $$0) {
      return this.g.apply($$0);
   }

   public alf b(ji<csh> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwv $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cum.b $$0, Consumer<xp> $$1, cwk $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xo.a().b(this.e.a().a(this.d)));
         $$1.accept(xo.a().b(this.d.a().e()));
      }
   }

   public cwv a(boolean $$0) {
      return new cwv(this.d, this.e, $$0, this.g, this.h);
   }
}
