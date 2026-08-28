import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgx extends dep {
   public static final MapCodec<dgx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgw.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgx::new));
   private final dfh c;

   @Override
   public MapCodec<dgx> a() {
      return b;
   }

   protected dgx(dfh $$0, dsj.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      this.a($$0, (dcg)$$1, $$2);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfj.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
