import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deh extends dfb implements cwh {
   public static final MapCodec<deh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(deh::b), u()).apply($$0, deh::new));
   private final clm c;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(clm $$0, djg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public clm b() {
      return this.c;
   }
}
