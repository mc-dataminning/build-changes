import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dil extends dgd {
   public static final MapCodec<dil> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dik.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dil::new));
   private final dgv c;

   @Override
   public MapCodec<dil> a() {
      return b;
   }

   protected dil(dgv $$0, dtz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      this.a($$0, (ddt)$$1, $$2);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !$$0.a($$3, $$4)) {
         return dgx.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
