import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dfo(jr<dfp> c, jr<dfr> d, boolean e) implements dai {
   public static final Codec<dfo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfp.c.fieldOf("material").forGetter(dfo::a),
               dfr.c.fieldOf("pattern").forGetter(dfo::b),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dfo::new)
   );
   public static final yn<wa, dfo> b = yn.a(dfp.d, dfo::a, dfr.d, dfo::b, yl.b, $$0 -> $$0.e, dfo::new);
   private static final wp f = wp.c(af.a("item", aku.b("smithing_template.upgrade"))).a(n.h);

   public dfo(jr<dfp> $$0, jr<dfr> $$1) {
      this($$0, $$1, true);
   }

   public boolean a(jr<dfr> $$0, jr<dfp> $$1) {
      return $$0.equals(this.d) && $$1.equals(this.c);
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      if (this.e) {
         $$1.accept(f);
         $$1.accept(wo.a().b(this.d.a().a(this.c)));
         $$1.accept(wo.a().b(this.c.a().d()));
      }
   }

   public dfo a(boolean $$0) {
      return new dfo(this.c, this.d, $$0);
   }

   public jr<dfp> a() {
      return this.c;
   }

   public jr<dfr> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
