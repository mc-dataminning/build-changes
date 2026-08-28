import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dow extends dfs implements ctt {
   public static final MapCodec<dow> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(dow::b), u()).apply($$0, dow::new));
   private final ctk d;

   @Override
   public MapCodec<dow> a() {
      return c;
   }

   protected dow(ctk $$0, dsd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public ctk b() {
      return this.d;
   }

   @Override
   public btd m() {
      return btd.g;
   }

   @Override
   public ji<avz> n() {
      return awa.og;
   }
}
