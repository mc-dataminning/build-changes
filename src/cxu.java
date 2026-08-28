import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cxu implements cyz {
   public static final Codec<cxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxv.c.fieldOf("material").forGetter(cxu::b),
               cxx.c.fieldOf("pattern").forGetter(cxu::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cxu::new)
   );
   public static final zc<wp, cxu> b = zc.a(cxv.d, cxu::b, cxx.d, cxu::a, za.b, $$0 -> $$0.f, cxu::new);
   private static final xe c = xe.c(ad.a("item", ale.b("smithing_template.upgrade"))).a(n.h);
   private final jo<cxv> d;
   private final jo<cxx> e;
   private final boolean f;
   private final Function<jo<ctm>, ale> g;
   private final Function<jo<ctm>, ale> h;

   private cxu(jo<cxv> $$0, jo<cxx> $$1, boolean $$2, Function<jo<ctm>, ale> $$3, Function<jo<ctm>, ale> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cxu(jo<cxv> $$0, jo<cxx> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         ale $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         ale $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cxu(jo<cxv> $$0, jo<cxx> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jo<cxv> $$0, jo<ctm> $$1) {
      Map<jo<ctm>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jo<cxx> $$0, jo<cxv> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jo<cxx> a() {
      return this.e;
   }

   public jo<cxv> b() {
      return this.d;
   }

   public ale a(jo<ctm> $$0) {
      return this.g.apply($$0);
   }

   public ale b(jo<ctm> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cxu $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xd.a().b(this.e.a().a(this.d)));
         $$1.accept(xd.a().b(this.d.a().e()));
      }
   }

   public cxu a(boolean $$0) {
      return new cxu(this.d, this.e, $$0, this.g, this.h);
   }
}
