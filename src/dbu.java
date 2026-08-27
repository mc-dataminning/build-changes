import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbu extends czn {
   public static final MapCodec<dbu> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dbu::new));
   private final dac f;

   @Override
   public MapCodec<dbu> a() {
      return e;
   }

   protected dbu(dac $$0, dna.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      this.a($$0, (cxc)$$1, $$2);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dae.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eiq.c, eiq.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
