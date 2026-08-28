import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dge(js<dgf> c, js<dgh> d, boolean e) implements day {
   public static final Codec<dge> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgf.c.fieldOf("material").forGetter(dge::a),
               dgh.c.fieldOf("pattern").forGetter(dge::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dge::new)
   );
   public static final yt<wg, dge> b = yt.a(dgf.d, dge::a, dgh.d, dge::b, yr.b, $$0 -> $$0.e, dge::new);
   private static final wv f = wv.c(af.a("item", ald.b("smithing_template.upgrade"))).a(n.h);

   public dge(js<dgf> $$0, js<dgh> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(js<dgh> $$0, js<dgf> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wu.a().b(this.d.a().a(this.c)));
         $$1.accept(wu.a().b(this.c.a().d()));
      }
   }

   public dge a(boolean $$0) {
      return new dge(this.c, this.d, $$0);
   }

   public js<dgf> a() {
      return this.c;
   }

   public js<dgh> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
