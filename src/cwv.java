import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cwv implements cxw {
   public static final Codec<cwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cww.c.fieldOf("material").forGetter(cwv::b),
               cwy.c.fieldOf("pattern").forGetter(cwv::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cwv::new)
   );
   public static final yw<wj, cwv> b = yw.a(cww.d, cwv::b, cwy.d, cwv::a, yu.b, $$0 -> $$0.f, cwv::new);
   private static final wy c = wy.c(ad.a("item", akq.b("smithing_template.upgrade"))).a(n.h);
   private final jm<cww> d;
   private final jm<cwy> e;
   private final boolean f;
   private final Function<jm<cse>, akq> g;
   private final Function<jm<cse>, akq> h;

   private cwv(jm<cww> $$0, jm<cwy> $$1, boolean $$2, Function<jm<cse>, akq> $$3, Function<jm<cse>, akq> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cwv(jm<cww> $$0, jm<cwy> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         akq $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         akq $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cwv(jm<cww> $$0, jm<cwy> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jm<cww> $$0, jm<cse> $$1) {
      Map<jm<cse>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jm<cwy> $$0, jm<cww> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jm<cwy> a() {
      return this.e;
   }

   public jm<cww> b() {
      return this.d;
   }

   public akq a(jm<cse> $$0) {
      return this.g.apply($$0);
   }

   public akq b(jm<cse> $$0) {
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
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(wx.a().b(this.e.a().a(this.d)));
         $$1.accept(wx.a().b(this.d.a().e()));
      }
   }

   public cwv a(boolean $$0) {
      return new cwv(this.d, this.e, $$0, this.g, this.h);
   }
}
