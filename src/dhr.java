import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhr extends dfh {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpl.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhr::new)
   );
   private final bpl b;

   @Override
   public MapCodec<? extends dhr> a() {
      return a;
   }

   public dhr(bpl $$0, dsj.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
