import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dep extends dfj implements cwp {
   public static final MapCodec<dep> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(dep::b), u()).apply($$0, dep::new));
   private final clv c;

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public dep(clv $$0, djo.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public clv b() {
      return this.c;
   }
}
