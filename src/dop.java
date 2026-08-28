import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dfh implements dom {
   public static final MapCodec<dop> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.e.fieldOf("weathering_state").forGetter(dgi::c), u()).apply($$0, dop::new)
   );
   private final dom.a e;

   @Override
   public MapCodec<dop> a() {
      return d;
   }

   public dop(dom.a $$0, dsj.d $$1) {
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
