import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dgv implements dom {
   public static final MapCodec<don> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.e.fieldOf("weathering_state").forGetter(don::m), u()).apply($$0, don::new)
   );
   private final dom.a e;

   @Override
   protected MapCodec<don> a() {
      return d;
   }

   public don(dom.a $$0, dsj.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsk $$0) {
      return dom.c($$0.b()).isPresent();
   }

   public dom.a m() {
      return this.e;
   }
}
