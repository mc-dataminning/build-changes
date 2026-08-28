import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwt implements cxv {
   public static final Codec<cwt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwu.c.fieldOf("material").forGetter(cwt::b),
               cww.c.fieldOf("pattern").forGetter(cwt::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwt::new)
   );
   public static final zn<xa, cwt> b = zn.a(cwu.d, cwt::b, cww.d, cwt::a, zl.b, $$0 -> $$0.f, cwt::new);
   private static final xp c = xp.c(ac.a("item", new alf("smithing_template.upgrade"))).a(n.h);
   private final ji<cwu> d;
   private final ji<cww> e;
   private final boolean f;
   private final Function<ji<csf>, alf> g;
   private final Function<ji<csf>, alf> h;

   private cwt(ji<cwu> $$0, ji<cww> $$1, boolean $$2, Function<ji<csf>, alf> $$3, Function<ji<csf>, alf> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwt(ji<cwu> $$0, ji<cww> $$1, boolean $$2) {
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

   public cwt(ji<cwu> $$0, ji<cww> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ji<cwu> $$0, ji<csf> $$1) {
      Map<ji<csf>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ji<cww> $$0, ji<cwu> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ji<cww> a() {
      return this.e;
   }

   public ji<cwu> b() {
      return this.d;
   }

   public alf a(ji<csf> $$0) {
      return this.g.apply($$0);
   }

   public alf b(ji<csf> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwt $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cuk.b $$0, Consumer<xp> $$1, cwi $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xo.a().b(this.e.a().a(this.d)));
         $$1.accept(xo.a().b(this.d.a().e()));
      }
   }

   public cwt a(boolean $$0) {
      return new cwt(this.d, this.e, $$0, this.g, this.h);
   }
}
