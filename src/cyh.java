import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyh extends cwa {
   public static final MapCodec<cyh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyf.a.forGetter($$0x -> $$0x.e), u()).apply($$0, cyh::new));
   private final cwq e;
   protected static final float b = 6.0F;
   protected static final emm c = cwq.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   protected cyh(cwq $$0, djg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      this.a($$0, (ctq)$$1, $$2);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }
}
