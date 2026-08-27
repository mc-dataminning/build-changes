import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cya extends cvt {
   public static final MapCodec<cya> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxy.a.forGetter($$0x -> $$0x.e), u()).apply($$0, cya::new));
   private final cwj e;
   protected static final float b = 6.0F;
   protected static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cya> a() {
      return a;
   }

   protected cya(cwj $$0, diz.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      this.a($$0, (ctj)$$1, $$2);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }
}
