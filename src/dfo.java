import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfo extends ddg {
   public static final MapCodec<dfo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfn.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dfo::new));
   private final ddy c;

   @Override
   public MapCodec<dfo> a() {
      return b;
   }

   protected dfo(ddy $$0, dra.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      this.a($$0, (day)$$1, $$2);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == it.a && !$$0.a($$3, $$4)) {
         return dea.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, emv.c, emv.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
