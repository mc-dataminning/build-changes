import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfe extends cvz implements dfb {
   public static final MapCodec<dfe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfb.a.e.fieldOf("weathering_state").forGetter(cxa::c), u()).apply($$0, dfe::new)
   );
   private final dfb.a e;

   @Override
   public MapCodec<dfe> a() {
      return d;
   }

   public dfe(dfb.a $$0, dio.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dip $$0) {
      return dfb.c($$0.b()).isPresent();
   }

   public dfb.a g() {
      return this.e;
   }
}
