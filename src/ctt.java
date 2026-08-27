import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ctt implements cus {
   public static final Codec<ctt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctu.c.fieldOf("material").forGetter(ctt::b),
               ctw.c.fieldOf("pattern").forGetter(ctt::a),
               awu.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ctt::new)
   );
   public static final yg<vt, ctt> b = yg.a(ctu.d, ctt::b, ctw.d, ctt::a, ye.b, $$0 -> $$0.f, ctt::new);
   private static final wi c = wi.c(ac.a("item", new ajv("smithing_template.upgrade"))).a(n.h);
   private final in<ctu> d;
   private final in<ctw> e;
   private final boolean f;
   private final Function<in<cpi>, ajv> g;
   private final Function<in<cpi>, ajv> h;

   public ctt(in<ctu> $$0, in<ctw> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$1x -> {
         ajv $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         ajv $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
      this.f = $$2;
   }

   public ctt(in<ctu> $$0, in<ctw> $$1) {
      this($$0, $$1, true);
   }

   private String c(in<cpi> $$0) {
      Map<in<cpi>, String> $$1 = this.d.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.d.a().a();
   }

   public boolean a(in<ctw> $$0, in<ctu> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public in<ctw> a() {
      return this.e;
   }

   public in<ctu> b() {
      return this.d;
   }

   public ajv a(in<cpi> $$0) {
      return this.g.apply($$0);
   }

   public ajv b(in<cpi> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ctt $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(wh.a().b(this.e.a().a(this.d)));
         $$0.accept(wh.a().b(this.d.a().e()));
      }
   }
}
