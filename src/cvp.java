import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvp extends cti {
   public static final MapCodec<cvp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvo.a.forGetter($$0x -> $$0x.c), t()).apply($$0, cvp::new));
   private final cua c;

   @Override
   public MapCodec<cvp> a() {
      return b;
   }

   protected cvp(cua $$0, dga.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      this.a($$0, (cra)$$1, $$2);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cuc.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
