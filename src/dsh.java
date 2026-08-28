import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsh extends dtb implements dkd {
   public static final MapCodec<dsh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(dsh::b), t()).apply($$0, dsh::new));
   private final cwm c;

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(cwm $$0, dxu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwm b() {
      return this.c;
   }
}
