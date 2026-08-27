import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv extends dui {
   public static final Codec<dtv> a = RecordCodecBuilder.create($$0 -> $$0.group(dlt.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dtv::new));
   private final dlt c;

   private dtv(dlt $$0) {
      this.c = $$0;
   }

   public static dtv a(dlt $$0) {
      return new dtv($$0);
   }

   @Override
   protected boolean a(duh $$0, ash $$1, gw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public duk<?> b() {
      return duk.a;
   }
}
