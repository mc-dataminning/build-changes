import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dho extends dfg {
   public static final MapCodec<dho> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhn.a.forGetter($$0x -> $$0x.c), u()).apply($$0, dho::new));
   private final dfy c;

   @Override
   public MapCodec<dho> a() {
      return b;
   }

   protected dho(dfy $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      this.a($$0, (dcx)$$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, epd.c, epd.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
