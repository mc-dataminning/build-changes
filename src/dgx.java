import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgx extends deq {
   public static final MapCodec<dgx> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgu.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgx::new));
   private final dff f;

   @Override
   public MapCodec<dgx> a() {
      return e;
   }

   protected dgx(dff $$0, dsg.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      this.a($$0, (dce)$$1, $$2);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfh.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
