import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diz extends dgr {
   public static final MapCodec<diz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(diy.a.forGetter($$0x -> $$0x.c), u()).apply($$0, diz::new));
   private final dhj c;

   @Override
   public MapCodec<diz> a() {
      return b;
   }

   protected diz(dhj $$0, dun.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      this.a($$0, (deh)$$1, $$2);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
