import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsa extends dsu implements dju {
   public static final MapCodec<dsa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(dsa::b), t()).apply($$0, dsa::new));
   private final cwd c;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(cwd $$0, dxn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwd b() {
      return this.c;
   }
}
