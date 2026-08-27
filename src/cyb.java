import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyb extends cvu {
   public static final MapCodec<cyb> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxy.a.forGetter($$0x -> $$0x.f), u()).apply($$0, cyb::new));
   private final cwj f;

   @Override
   public MapCodec<cyb> a() {
      return e;
   }

   protected cyb(cwj $$0, diz.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      this.a($$0, (ctj)$$1, $$2);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.o().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
