import com.mojang.serialization.MapCodec;

public class dka extends dje {
   public static final MapCodec<dka> a = b(dka::new);
   private static final wu b = wu.c("container.loom");

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   protected dka(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ax);
         return bqh.c;
      }
   }

   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return new bqr(($$2x, $$3, $$4) -> new cqo($$2x, $$3, cpu.a($$1, $$2)), b);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE);
   }
}
