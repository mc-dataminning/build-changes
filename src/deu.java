import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record deu(jr<dev> c, jr<dex> d, boolean e) implements czq {
   public static final Codec<deu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dev.c.fieldOf("material").forGetter(deu::a),
               dex.c.fieldOf("pattern").forGetter(deu::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, deu::new)
   );
   public static final ym<vz, deu> b = ym.a(dev.d, deu::a, dex.d, deu::b, yk.b, $$0 -> $$0.e, deu::new);
   private static final wo f = wo.c(af.a("item", aku.b("smithing_template.upgrade"))).a(n.h);

   public deu(jr<dev> $$0, jr<dex> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(jr<dex> $$0, jr<dev> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wn.a().b(this.d.a().a(this.c)));
         $$1.accept(wn.a().b(this.c.a().d()));
      }
   }

   public deu a(boolean $$0) {
      return new deu(this.c, this.d, $$0);
   }

   public jr<dev> a() {
      return this.c;
   }

   public jr<dex> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
