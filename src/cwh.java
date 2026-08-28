import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwh implements cxi {
   public static final Codec<cwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwi.c.fieldOf("material").forGetter(cwh::b),
               cwk.c.fieldOf("pattern").forGetter(cwh::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwh::new)
   );
   public static final ys<wf, cwh> b = ys.a(cwi.d, cwh::b, cwk.d, cwh::a, yq.b, $$0 -> $$0.f, cwh::new);
   private static final wu c = wu.c(ac.a("item", new akk("smithing_template.upgrade"))).a(n.h);
   private final jj<cwi> d;
   private final jj<cwk> e;
   private final boolean f;
   private final Function<jj<cru>, akk> g;
   private final Function<jj<cru>, akk> h;

   private cwh(jj<cwi> $$0, jj<cwk> $$1, boolean $$2, Function<jj<cru>, akk> $$3, Function<jj<cru>, akk> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwh(jj<cwi> $$0, jj<cwk> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         akk $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         akk $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwh(jj<cwi> $$0, jj<cwk> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jj<cwi> $$0, jj<cru> $$1) {
      Map<jj<cru>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jj<cwk> $$0, jj<cwi> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jj<cwk> a() {
      return this.e;
   }

   public jj<cwi> b() {
      return this.d;
   }

   public akk a(jj<cru> $$0) {
      return this.g.apply($$0);
   }

   public akk b(jj<cru> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwh $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cty.b $$0, Consumer<wu> $$1, cvw $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(wt.a().b(this.e.a().a(this.d)));
         $$1.accept(wt.a().b(this.d.a().e()));
      }
   }

   public cwh a(boolean $$0) {
      return new cwh(this.d, this.e, $$0, this.g, this.h);
   }
}
