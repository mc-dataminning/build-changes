import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtw extends duj {
   public static final Codec<dtw> a = RecordCodecBuilder.create($$0 -> $$0.group(dlu.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dtw::new));
   private final dlu c;

   private dtw(dlu $$0) {
      this.c = $$0;
   }

   public static dtw a(dlu $$0) {
      return new dtw($$0);
   }

   @Override
   protected boolean a(dui $$0, arx $$1, gw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dul<?> b() {
      return dul.a;
   }
}
