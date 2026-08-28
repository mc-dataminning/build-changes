import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dey implements dod {
   public static final MapCodec<dog> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dod.a.e.fieldOf("weathering_state").forGetter(dfz::c), u()).apply($$0, dog::new)
   );
   private final dod.a e;

   @Override
   public MapCodec<dog> a() {
      return d;
   }

   public dog(dod.a $$0, dsa.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsb $$0) {
      return dod.c($$0.b()).isPresent();
   }

   public dod.a m() {
      return this.e;
   }
}
