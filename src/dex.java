import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dex(jr<dey> c, jr<dfa> d, boolean e) implements czt {
   public static final Codec<dex> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dey.c.fieldOf("material").forGetter(dex::a),
               dfa.c.fieldOf("pattern").forGetter(dex::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dex::new)
   );
   public static final yn<wa, dex> b = yn.a(dey.d, dex::a, dfa.d, dex::b, yl.b, $$0 -> $$0.e, dex::new);
   private static final wp f = wp.c(af.a("item", akv.b("smithing_template.upgrade"))).a(n.h);

   public dex(jr<dey> $$0, jr<dfa> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(jr<dfa> $$0, jr<dey> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wo.a().b(this.d.a().a(this.c)));
         $$1.accept(wo.a().b(this.c.a().d()));
      }
   }

   public dex a(boolean $$0) {
      return new dex(this.c, this.d, $$0);
   }

   public jr<dey> a() {
      return this.c;
   }

   public jr<dfa> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
