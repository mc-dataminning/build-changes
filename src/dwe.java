import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwe extends dmf implements dwb {
   public static final MapCodec<dwe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwb.a.e.fieldOf("weathering_state").forGetter(dni::c), t()).apply($$0, dwe::new)
   );
   private final dwb.a e;

   @Override
   public MapCodec<dwe> a() {
      return d;
   }

   public dwe(dwb.a $$0, eag.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a q() {
      return this.e;
   }
}
