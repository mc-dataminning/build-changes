import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dni extends dmo implements dpz {
   public static final MapCodec<dni> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mg.e.q().fieldOf("turns_into").forGetter(dni::b),
               mg.b.q().fieldOf("brush_sound").forGetter(dni::c),
               mg.b.q().fieldOf("brush_completed_sound").forGetter(dni::d),
               t()
            )
            .apply($$0, dni::new)
   );
   private static final ece c = ebu.by;
   public static final int b = 2;
   private final dnc d;
   private final awo e;
   private final awo f;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dnc $$0, awo $$1, awo $$2, ebd.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.c_($$2) instanceof dyh $$4) {
         $$4.a($$1);
      }

      if (dqa.n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         cob $$5 = cob.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(djx $$0, iv $$1, cob $$2) {
      ffq $$3 = $$2.cR().f();
      $$0.c(2001, iv.a((jp)$$3), dnc.j($$2.j()));
      $$0.a($$2, ege.f, $$3);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(16) == 0) {
         iv $$4 = $$2.e();
         if (dqa.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lq(ly.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyh($$0, $$1);
   }

   public dnc b() {
      return this.d;
   }

   public awo c() {
      return this.e;
   }

   public awo d() {
      return this.f;
   }
}
