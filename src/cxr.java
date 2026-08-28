import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cxr implements cyw {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxs.c.fieldOf("material").forGetter(cxr::b),
               cxu.c.fieldOf("pattern").forGetter(cxr::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cxr::new)
   );
   public static final zb<wo, cxr> b = zb.a(cxs.d, cxr::b, cxu.d, cxr::a, yz.b, $$0 -> $$0.f, cxr::new);
   private static final xd c = xd.c(ad.a("item", alc.b("smithing_template.upgrade"))).a(n.h);
   private final jn<cxs> d;
   private final jn<cxu> e;
   private final boolean f;
   private final Function<jn<ctj>, alc> g;
   private final Function<jn<ctj>, alc> h;

   private cxr(jn<cxs> $$0, jn<cxu> $$1, boolean $$2, Function<jn<ctj>, alc> $$3, Function<jn<ctj>, alc> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cxr(jn<cxs> $$0, jn<cxu> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         alc $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         alc $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cxr(jn<cxs> $$0, jn<cxu> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jn<cxs> $$0, jn<ctj> $$1) {
      Map<jn<ctj>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jn<cxu> $$0, jn<cxs> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jn<cxu> a() {
      return this.e;
   }

   public jn<cxs> b() {
      return this.d;
   }

   public alc a(jn<ctj> $$0) {
      return this.g.apply($$0);
   }

   public alc b(jn<ctj> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cxr $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xc.a().b(this.e.a().a(this.d)));
         $$1.accept(xc.a().b(this.d.a().e()));
      }
   }

   public cxr a(boolean $$0) {
      return new cxr(this.d, this.e, $$0, this.g, this.h);
   }
}
