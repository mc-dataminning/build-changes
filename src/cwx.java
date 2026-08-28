import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwx implements cxy {
   public static final Codec<cwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwy.c.fieldOf("material").forGetter(cwx::b),
               cxa.c.fieldOf("pattern").forGetter(cwx::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwx::new)
   );
   public static final yx<wk, cwx> b = yx.a(cwy.d, cwx::b, cxa.d, cwx::a, yv.b, $$0 -> $$0.f, cwx::new);
   private static final wz c = wz.c(ad.a("item", akr.b("smithing_template.upgrade"))).a(n.h);
   private final jm<cwy> d;
   private final jm<cxa> e;
   private final boolean f;
   private final Function<jm<csg>, akr> g;
   private final Function<jm<csg>, akr> h;

   private cwx(jm<cwy> $$0, jm<cxa> $$1, boolean $$2, Function<jm<csg>, akr> $$3, Function<jm<csg>, akr> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwx(jm<cwy> $$0, jm<cxa> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         akr $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         akr $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwx(jm<cwy> $$0, jm<cxa> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jm<cwy> $$0, jm<csg> $$1) {
      Map<jm<csg>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jm<cxa> $$0, jm<cwy> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jm<cxa> a() {
      return this.e;
   }

   public jm<cwy> b() {
      return this.d;
   }

   public akr a(jm<csg> $$0) {
      return this.g.apply($$0);
   }

   public akr b(jm<csg> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwx $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(wy.a().b(this.e.a().a(this.d)));
         $$1.accept(wy.a().b(this.d.a().e()));
      }
   }

   public cwx a(boolean $$0) {
      return new cwx(this.d, this.e, $$0, this.g, this.h);
   }
}
