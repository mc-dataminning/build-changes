import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cus extends csm {
   public static final MapCodec<cus> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuq.a.forGetter($$0x -> $$0x.e), t()).apply($$0, cus::new));
   private final ctc e;
   protected static final float b = 6.0F;
   protected static final eia c = ctc.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cus> a() {
      return a;
   }

   protected cus(ctc $$0, dfc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      this.a($$0, (cqc)$$1, $$2);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }
}
