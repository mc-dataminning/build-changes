import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwv extends cun {
   public static final MapCodec<cwv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwu.a.forGetter($$0x -> $$0x.c), u()).apply($$0, cwv::new));
   private final cvf c;

   @Override
   public MapCodec<cwv> a() {
      return b;
   }

   protected cwv(cvf $$0, dhm.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      this.a($$0, (csg)$$1, $$2);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a && !$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
