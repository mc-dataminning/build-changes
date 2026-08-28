import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends dlv {
   public static final MapCodec<drq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dla.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.i), kc.b.fieldOf("interactions").forGetter($$0x -> $$0x.b), t())
            .apply($$0, drq::new)
   );
   public static final int d = 1;
   public static final int e = 3;
   public static final ece f = ebu.aN;
   private static final int g = 6;
   private static final double h = 3.0;
   private final dla.c i;

   @Override
   public MapCodec<drq> a() {
      return c;
   }

   public drq(dla.c $$0, kc.a $$1, ebd.d $$2) {
      super($$2, $$1);
      this.i = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(1)));
   }

   @Override
   public boolean d(ebe $$0) {
      return $$0.c(f) == 3;
   }

   @Override
   protected boolean a(exn $$0) {
      return $$0 == exp.c && this.i == dla.c.b;
   }

   @Override
   protected double b(ebe $$0) {
      return (6.0 + (double)$$0.c(f).intValue() * 3.0) / 16.0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$1 instanceof ars $$5 && $$3.bX() && this.a($$0, $$2, $$3)) {
         $$3.aF();
         if ($$3.c($$5, $$2)) {
            this.e($$0, $$1, $$2);
         }
      }
   }

   private void e(ebe $$0, djx $$1, iv $$2) {
      if (this.i == dla.c.c) {
         d(dne.fT.m().b(f, $$0.c(f)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(ebe $$0, djx $$1, iv $$2) {
      int $$3 = $$0.c(f) - 1;
      ebe $$4 = $$3 == 0 ? dne.fS.m() : $$0.b(f, Integer.valueOf($$3));
      $$1.b($$2, $$4);
      $$1.a(ege.c, $$2, ege.a.a($$4));
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, dla.c $$3) {
      if (dnz.a($$1, $$3) && $$0.c(f) != 3 && $$3 == this.i) {
         ebe $$4 = $$0.a(f);
         $$1.b($$2, $$4);
         $$1.a(ege.c, $$2, ege.a.a($$4));
      }
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$0.c(f);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, exn $$3) {
      if (!this.d($$0)) {
         ebe $$4 = $$0.b(f, Integer.valueOf($$0.c(f) + 1));
         $$1.b($$2, $$4);
         $$1.a(ege.c, $$2, ege.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
