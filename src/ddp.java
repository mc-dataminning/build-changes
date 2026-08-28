import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public record ddp(jq<ddq> c, jq<dds> d, boolean e) implements cze {
   public static final Codec<ddp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddq.c.fieldOf("material").forGetter(ddp::a),
               dds.c.fieldOf("pattern").forGetter(ddp::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ddp::new)
   );
   public static final zg<wt, ddp> b = zg.a(ddq.d, ddp::a, dds.d, ddp::b, ze.b, $$0 -> $$0.e, ddp::new);
   private static final xi f = xi.c(ae.a("item", ali.b("smithing_template.upgrade"))).a(n.h);

   public ddp(jq<ddq> $$0, jq<dds> $$1) {
      this($$0, $$1, true);
   }

   private static String a(jq<ddq> $$0, ali $$1) {
      String $$2 = $$0.a().d().get($$1);
      return $$2 != null ? $$2 : $$0.a().a();
   }

   public boolean a(jq<dds> $$0, jq<ddq> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   public ali a(ddl.d $$0, ali $$1) {
      ali $$2 = this.d.a().a();
      String $$3 = a(this.c, $$1);
      return $$2.a((UnaryOperator<String>)($$2x -> "trims/entity/" + $$0.c() + "/" + $$2x + "_" + $$3));
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(xh.a().b(this.d.a().a(this.c)));
         $$1.accept(xh.a().b(this.c.a().e()));
      }
   }

   public ddp a(boolean $$0) {
      return new ddp(this.c, this.d, $$0);
   }

   public jq<ddq> a() {
      return this.c;
   }

   public jq<dds> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
