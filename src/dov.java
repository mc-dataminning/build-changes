import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dov extends dfr implements cts {
   public static final MapCodec<dov> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(dov::b), u()).apply($$0, dov::new));
   private final ctj d;

   @Override
   public MapCodec<dov> a() {
      return c;
   }

   protected dov(ctj $$0, dsc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ctj b() {
      return this.d;
   }

   @Override
   public btc m() {
      return btc.g;
   }

   @Override
   public ji<avz> n() {
      return awa.og;
   }
}
