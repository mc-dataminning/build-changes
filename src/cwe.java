import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwe implements cxf {
   public static final Codec<cwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwf.c.fieldOf("material").forGetter(cwe::b),
               cwh.c.fieldOf("pattern").forGetter(cwe::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwe::new)
   );
   public static final ys<wf, cwe> b = ys.a(cwf.d, cwe::b, cwh.d, cwe::a, yq.b, $$0 -> $$0.f, cwe::new);
   private static final wu c = wu.c(ac.a("item", new akk("smithing_template.upgrade"))).a(n.h);
   private final jj<cwf> d;
   private final jj<cwh> e;
   private final boolean f;
   private final Function<jj<crq>, akk> g;
   private final Function<jj<crq>, akk> h;

   private cwe(jj<cwf> $$0, jj<cwh> $$1, boolean $$2, Function<jj<crq>, akk> $$3, Function<jj<crq>, akk> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwe(jj<cwf> $$0, jj<cwh> $$1, boolean $$2) {
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

   public cwe(jj<cwf> $$0, jj<cwh> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jj<cwf> $$0, jj<crq> $$1) {
      Map<jj<crq>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jj<cwh> $$0, jj<cwf> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jj<cwh> a() {
      return this.e;
   }

   public jj<cwf> b() {
      return this.d;
   }

   public akk a(jj<crq> $$0) {
      return this.g.apply($$0);
   }

   public akk b(jj<crq> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwe $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(wt.a().b(this.e.a().a(this.d)));
         $$1.accept(wt.a().b(this.d.a().e()));
      }
   }

   public cwe a(boolean $$0) {
      return new cwe(this.d, this.e, $$0, this.g, this.h);
   }
}
