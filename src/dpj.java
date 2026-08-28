import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpj extends dok implements dpc {
   public static final MapCodec<dpj> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("block_set_type").forGetter(dok::m), dpc.a.e.fieldOf("weathering_state").forGetter(dpj::n), u()).apply($$0, dpj::new)
   );
   private final dpc.a n;

   @Override
   public MapCodec<dpj> a() {
      return m;
   }

   protected dpj(dtp $$0, dpc.a $$1, dsz.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dta $$0) {
      return dpc.c($$0.b()).isPresent();
   }

   public dpc.a n() {
      return this.n;
   }
}
