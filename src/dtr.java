import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr extends drk implements dtm {
   public static final MapCodec<dtr> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtm.a.e.fieldOf("weathering_state").forGetter(dlg::c), t()).apply($$0, dtr::new)
   );
   private final dtm.a g;

   @Override
   public MapCodec<dtr> a() {
      return f;
   }

   public dtr(dtm.a $$0, dxm.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxn $$0) {
      return dtm.c($$0.b()).isPresent();
   }

   public dtm.a q() {
      return this.g;
   }
}
