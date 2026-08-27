import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czo extends ctl implements ctf {
   public static final MapCodec<czo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(des.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, czo::new)
   );
   public static final dgd f = dft.aU;
   protected static final float g = 6.0F;
   protected static final eia h = ctc.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final des i;

   @Override
   public MapCodec<? extends czo> a() {
      return e;
   }

   protected czo(des $$0, dfc.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return h;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(akt $$0, gw $$1, dfd $$2, ash $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f);
   }
}
