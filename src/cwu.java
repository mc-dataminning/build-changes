import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwu implements cxx {
   public static final Codec<cwu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwv.c.fieldOf("material").forGetter(cwu::b),
               cwx.c.fieldOf("pattern").forGetter(cwu::a),
               axu.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwu::new)
   );
   public static final zc<wp, cwu> b = zc.a(cwv.d, cwu::b, cwx.d, cwu::a, za.b, $$0 -> $$0.f, cwu::new);
   private static final xe c = xe.c(ad.a("item", new akt("smithing_template.upgrade"))).a(n.h);
   private final ja<cwv> d;
   private final ja<cwx> e;
   private final boolean f;
   private final Function<ja<cru>, akt> g;
   private final Function<ja<cru>, akt> h;

   private cwu(ja<cwv> $$0, ja<cwx> $$1, boolean $$2, Function<ja<cru>, akt> $$3, Function<ja<cru>, akt> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwu(ja<cwv> $$0, ja<cwx> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         akt $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         akt $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwu(ja<cwv> $$0, ja<cwx> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ja<cwv> $$0, ja<cru> $$1) {
      Map<ja<cru>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ja<cwx> $$0, ja<cwv> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ja<cwx> a() {
      return this.e;
   }

   public ja<cwv> b() {
      return this.d;
   }

   public akt a(ja<cru> $$0) {
      return this.g.apply($$0);
   }

   public akt b(ja<cru> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cwu $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(xd.a().a(this.e.a().a(this.d)));
         $$0.accept(xd.a().a(this.d.a().e()));
      }
   }

   public cwu a(boolean $$0) {
      return new cwu(this.d, this.e, $$0, this.g, this.h);
   }
}
