import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpg extends dmy {
   public static final MapCodec<dpg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dpe.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dpg::new));
   private final dno c;
   private static final fgw d = dno.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(dno $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(b, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.a && !$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }
}
