import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqf extends djw implements djp {
   public static final MapCodec<dqf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwm.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dqf::new)
   );
   public static final dxw f = dxn.aX;
   protected static final float g = 6.0F;
   protected static final fbu h = djm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dwm i;

   @Override
   public MapCodec<? extends dqf> a() {
      return e;
   }

   protected dqf(dwm $$0, dww.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return h;
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ard $$0, ji $$1, dwx $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return true;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f);
   }
}
