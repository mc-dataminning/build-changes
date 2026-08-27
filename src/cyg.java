import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyg extends cvy {
   public static final MapCodec<cyg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyf.a.forGetter($$0x -> $$0x.c), u()).apply($$0, cyg::new));
   private final cwq c;

   @Override
   public MapCodec<cyg> a() {
      return b;
   }

   protected cyg(cwq $$0, djg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      this.a($$0, (ctq)$$1, $$2);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
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
}
