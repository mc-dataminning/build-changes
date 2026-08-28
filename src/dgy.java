import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgy extends deq {
   public static final MapCodec<dgy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgx.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgy::new));
   private final dfi c;

   @Override
   public MapCodec<dgy> a() {
      return b;
   }

   protected dgy(dfi $$0, dsk.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      this.a($$0, (dch)$$1, $$2);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.a && !$$0.a($$3, $$4)) {
         return dfk.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
