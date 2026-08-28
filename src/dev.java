import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dev(jr<dew> c, jr<dey> d, boolean e) implements czr {
   public static final Codec<dev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dew.c.fieldOf("material").forGetter(dev::a),
               dey.c.fieldOf("pattern").forGetter(dev::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dev::new)
   );
   public static final yn<wa, dev> b = yn.a(dew.d, dev::a, dey.d, dev::b, yl.b, $$0 -> $$0.e, dev::new);
   private static final wp f = wp.c(af.a("item", akv.b("smithing_template.upgrade"))).a(n.h);

   public dev(jr<dew> $$0, jr<dey> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(jr<dey> $$0, jr<dew> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wo.a().b(this.d.a().a(this.c)));
         $$1.accept(wo.a().b(this.c.a().d()));
      }
   }

   public dev a(boolean $$0) {
      return new dev(this.c, this.d, $$0);
   }

   public jr<dew> a() {
      return this.c;
   }

   public jr<dey> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
