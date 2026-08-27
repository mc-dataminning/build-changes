import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfc extends cxn implements dfb {
   public static final MapCodec<dfc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfb.a.e.fieldOf("weathering_state").forGetter(dfc::g), u()).apply($$0, dfc::new)
   );
   private final dfb.a e;

   @Override
   protected MapCodec<dfc> a() {
      return d;
   }

   public dfc(dfb.a $$0, dio.d $$1) {
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
