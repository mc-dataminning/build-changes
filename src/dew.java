import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dew(jr<dex> c, jr<dez> d, boolean e) implements czs {
   public static final Codec<dew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dex.c.fieldOf("material").forGetter(dew::a),
               dez.c.fieldOf("pattern").forGetter(dew::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dew::new)
   );
   public static final yn<wa, dew> b = yn.a(dex.d, dew::a, dez.d, dew::b, yl.b, $$0 -> $$0.e, dew::new);
   private static final wp f = wp.c(af.a("item", akv.b("smithing_template.upgrade"))).a(n.h);

   public dew(jr<dex> $$0, jr<dez> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(jr<dez> $$0, jr<dex> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wo.a().b(this.d.a().a(this.c)));
         $$1.accept(wo.a().b(this.c.a().d()));
      }
   }

   public dew a(boolean $$0) {
      return new dew(this.c, this.d, $$0);
   }

   public jr<dex> a() {
      return this.c;
   }

   public jr<dez> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
