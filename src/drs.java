import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drs extends dlx {
   public static final MapCodec<drs> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlc.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kd.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, drs::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ecg f = ebw.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dlc.c i;

   @Override
   public MapCodec<drs> a() {
      return c;
   }

   public drs(dlc.c $$0, kd.a $$1, ebf.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(ebg $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(exp $$0) {
      return $$0 == exr.c && this.i == dlc.c.b;
   }

   @Override
   protected double b(ebg $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$1 instanceof aru $$5 && $$3.bX() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.c($$5, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(ebg $$0, djz $$1, iw $$2) {
      if (this.i == dlc.c.c) {
         d(dng.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(ebg $$0, djz $$1, iw $$2) {
      int $$3 = $$0.c(f) - 1;
      ebg $$4 = $$3 == 0 ? dng.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(egg.c, $$2, egg.a.a($$4));
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, dlc.c $$3) {
      if (dob.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         ebg $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(egg.c, $$2, egg.a.a($$4));
      }
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, exp $$3) {
      if (!this.d($$0)) {
         ebg $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(egg.c, $$2, egg.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
