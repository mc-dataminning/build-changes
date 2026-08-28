import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc extends dmh {
   public static final MapCodec<dsc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlm.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kd.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, dsc::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ecq f = ecg.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dlm.c i;

   @Override
   public MapCodec<dsc> a() {
      return c;
   }

   public dsc(dlm.c $$0, kd.a $$1, ebp.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(ebq $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(exz $$0) {
      return $$0 == eyb.c && this.i == dlm.c.b;
   }

   @Override
   protected double b(ebq $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$1 instanceof asb $$5 && $$3.bX() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.c($$5, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(ebq $$0, dkj $$1, iw $$2) {
      if (this.i == dlm.c.c) {
         d(dnq.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(ebq $$0, dkj $$1, iw $$2) {
      int $$3 = $$0.c(f) - 1;
      ebq $$4 = $$3 == 0 ? dnq.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(egq.c, $$2, egq.a.a($$4));
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, dlm.c $$3) {
      if (dol.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         ebq $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(egq.c, $$2, egq.a.a($$4));
      }
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, exz $$3) {
      if (!this.d($$0)) {
         ebq $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(egq.c, $$2, egq.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
