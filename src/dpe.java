import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpe extends dic implements dpc {
   public static final MapCodec<dpe> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("block_set_type").forGetter(dic::b), dpc.a.e.fieldOf("weathering_state").forGetter(dpe::m), u()).apply($$0, dpe::new)
   );
   private final dpc.a m;

   @Override
   public MapCodec<dpe> a() {
      return l;
   }

   protected dpe(dtp $$0, dpc.a $$1, dsz.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(dic.f) == dtw.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dta $$0) {
      return dpc.c($$0.b()).isPresent();
   }

   public dpc.a m() {
      return this.m;
   }
}
