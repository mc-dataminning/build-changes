import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgt extends dem {
   public static final MapCodec<dgt> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgt::new));
   private final dfb f;

   @Override
   public MapCodec<dgt> a() {
      return e;
   }

   protected dgt(dfb $$0, dsd.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      this.a($$0, (dcb)$$1, $$2);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dfd.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eny.c, eny.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
