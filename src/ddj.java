import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record ddj(jp<ddk> c, jp<ddm> d, boolean e) implements cyy {
   public static final Codec<ddj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddk.c.fieldOf("material").forGetter(ddj::a),
               ddm.c.fieldOf("pattern").forGetter(ddj::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddj::new)
   );
   public static final zf<ws, ddj> b = zf.a(ddk.d, ddj::a, ddm.d, ddj::b, zd.b, $$0 -> $$0.e, ddj::new);
   private static final xh f = xh.c(ad.a("item", alh.b("smithing_template.upgrade"))).a(n.h);

   public ddj(jp<ddk> $$0, jp<ddm> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jp<ddk> $$0, alh $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jp<ddm> $$0, jp<ddk> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public alh a(ddf.d $$0, alh $$1) {
      alh $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xg.a().b(this.d.a().a(this.c)));
         $$1.accept(xg.a().b(this.c.a().e()));
      }
   }

   public ddj a(boolean $$0) {
      return new ddj(this.c, this.d, $$0);
   }

   public jp<ddk> a() {
      return this.c;
   }

   public jp<ddm> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
