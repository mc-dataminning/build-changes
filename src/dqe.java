import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe extends djv implements djo {
   public static final MapCodec<dqe> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwl.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dqe::new)
   );
   public static final dxv f = dxm.aX;
   protected static final float g = 6.0F;
   protected static final fbt h = djl.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dwl i;

   @Override
   public MapCodec<? extends dqe> a() {
      return e;
   }

   protected dqe(dwl $$0, dwv.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return h;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ard $$0, ji $$1, dww $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return true;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f);
   }
}
