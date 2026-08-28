import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol extends dqa {
   public static final MapCodec<dol> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dol::new)
   );
   protected final ayh b;

   @Override
   public MapCodec<? extends dol> a() {
      return a;
   }

   public dol(ayh $$0, ebd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(ebe $$0, djb $$1, iv $$2) {
      return this.b.a();
   }
}
