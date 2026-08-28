import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cws implements cxu {
   public static final Codec<cws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwt.c.fieldOf("material").forGetter(cws::b),
               cwv.c.fieldOf("pattern").forGetter(cws::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cws::new)
   );
   public static final zm<wz, cws> b = zm.a(cwt.d, cws::b, cwv.d, cws::a, zk.b, $$0 -> $$0.f, cws::new);
   private static final xo c = xo.c(ac.a("item", new ale("smithing_template.upgrade"))).a(n.h);
   private final ji<cwt> d;
   private final ji<cwv> e;
   private final boolean f;
   private final Function<ji<cse>, ale> g;
   private final Function<ji<cse>, ale> h;

   private cws(ji<cwt> $$0, ji<cwv> $$1, boolean $$2, Function<ji<cse>, ale> $$3, Function<ji<cse>, ale> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cws(ji<cwt> $$0, ji<cwv> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         ale $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         ale $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cws(ji<cwt> $$0, ji<cwv> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ji<cwt> $$0, ji<cse> $$1) {
      Map<ji<cse>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ji<cwv> $$0, ji<cwt> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ji<cwv> a() {
      return this.e;
   }

   public ji<cwt> b() {
      return this.d;
   }

   public ale a(ji<cse> $$0) {
      return this.g.apply($$0);
   }

   public ale b(ji<cse> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cws $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xn.a().b(this.e.a().a(this.d)));
         $$1.accept(xn.a().b(this.d.a().e()));
      }
   }

   public cws a(boolean $$0) {
      return new cws(this.d, this.e, $$0, this.g, this.h);
   }
}
