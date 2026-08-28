import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doe extends dgm implements dod {
   public static final MapCodec<doe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dod.a.e.fieldOf("weathering_state").forGetter(doe::m), u()).apply($$0, doe::new)
   );
   private final dod.a e;

   @Override
   protected MapCodec<doe> a() {
      return d;
   }

   public doe(dod.a $$0, dsa.d $$1) {
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
