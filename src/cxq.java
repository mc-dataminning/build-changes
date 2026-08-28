import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cxq implements cyr {
   public static final Codec<cxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxr.c.fieldOf("material").forGetter(cxq::b),
               cxt.c.fieldOf("pattern").forGetter(cxq::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cxq::new)
   );
   public static final zb<wo, cxq> b = zb.a(cxr.d, cxq::b, cxt.d, cxq::a, yz.b, $$0 -> $$0.f, cxq::new);
   private static final xd c = xd.c(ad.a("item", alb.b("smithing_template.upgrade"))).a(n.h);
   private final jn<cxr> d;
   private final jn<cxt> e;
   private final boolean f;
   private final Function<jn<ctd>, alb> g;
   private final Function<jn<ctd>, alb> h;

   private cxq(jn<cxr> $$0, jn<cxt> $$1, boolean $$2, Function<jn<ctd>, alb> $$3, Function<jn<ctd>, alb> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cxq(jn<cxr> $$0, jn<cxt> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ad.b($$2x -> {
         alb $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ad.b($$2x -> {
         alb $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cxq(jn<cxr> $$0, jn<cxt> $$1) {
      this($$0, $$1, true);
   }

   private static String b(jn<cxr> $$0, jn<ctd> $$1) {
      Map<jn<ctd>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(jn<cxt> $$0, jn<cxr> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public jn<cxt> a() {
      return this.e;
   }

   public jn<cxr> b() {
      return this.d;
   }

   public alb a(jn<ctd> $$0) {
      return this.g.apply($$0);
   }

   public alb b(jn<ctd> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cxq $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      if (this.f) {
         $$1.accept(c);
         $$1.accept(xc.a().b(this.e.a().a(this.d)));
         $$1.accept(xc.a().b(this.d.a().e()));
      }
   }

   public cxq a(boolean $$0) {
      return new cxq(this.d, this.e, $$0, this.g, this.h);
   }
}
