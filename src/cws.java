import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cws extends cul {
   public static final MapCodec<cws> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwp.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cws::new));
   private final cva f;

   @Override
   public MapCodec<cws> a() {
      return e;
   }

   protected cws(cva $$0, dhh.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      this.a($$0, (csb)$$1, $$2);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
