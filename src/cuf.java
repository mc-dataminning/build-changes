import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cuf implements cvg {
   public static final Codec<cuf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cug.c.fieldOf("material").forGetter(cuf::b),
               cui.c.fieldOf("pattern").forGetter(cuf::a),
               axe.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cuf::new)
   );
   public static final yq<wd, cuf> b = yq.a(cug.d, cuf::b, cui.d, cuf::a, yo.b, $$0 -> $$0.f, cuf::new);
   private static final ws c = ws.c(ac.a("item", new akf("smithing_template.upgrade"))).a(n.h);
   private final iv<cug> d;
   private final iv<cui> e;
   private final boolean f;
   private final Function<iv<cpt>, akf> g;
   private final Function<iv<cpt>, akf> h;

   public cuf(iv<cug> $$0, iv<cui> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$1x -> {
         akf $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         akf $$2x = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2x.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
      this.f = $$2;
   }

   public cuf(iv<cug> $$0, iv<cui> $$1) {
      this($$0, $$1, true);
   }

   private String c(iv<cpt> $$0) {
      Map<iv<cpt>, String> $$1 = this.d.a().d();
      String $$2 = $$1.get($$0);
      return $$2 != null ? $$2 : this.d.a().a();
   }

   public boolean a(iv<cui> $$0, iv<cug> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public iv<cui> a() {
      return this.e;
   }

   public iv<cug> b() {
      return this.d;
   }

   public akf a(iv<cpt> $$0) {
      return this.g.apply($$0);
   }

   public akf b(iv<cpt> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cuf $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(wr.a().b(this.e.a().a(this.d)));
         $$0.accept(wr.a().b(this.d.a().e()));
      }
   }
}
