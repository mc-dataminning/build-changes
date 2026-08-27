import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwq extends cui {
   public static final MapCodec<cwq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwp.a.forGetter($$0x -> $$0x.c), u()).apply($$0, cwq::new));
   private final cva c;

   @Override
   public MapCodec<cwq> a() {
      return b;
   }

   protected cwq(cva $$0, dhh.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      this.a($$0, (csb)$$1, $$2);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
