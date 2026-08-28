import com.mojang.serialization.MapCodec;

public class dqz extends dne implements dnh {
   public static final MapCodec<dqz> a = b(dqz::new);
   private static final fgm c = dne.b(14.0, 0.0, 16.0);
   private static final fgm d = dne.b(14.0, 2.0, 16.0);
   public static final ebx b = ebw.F;

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(500) == 0) {
         ebg $$4 = $$1.a_($$2.d());
         if ($$4.a(axg.w) || $$4.a(dng.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awr.tg, aws.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(ebg $$0) {
      return true;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(djd $$0, iw $$1) {
      iw $$2 = $$1.a(jc.b);
      ebg $$3 = $$0.a_($$2);
      return dsk.a($$0, jc.b, $$2, $$3) || $$3.a(dng.ug);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(ebg $$0) {
      return $$0.l();
   }

   public iw a(djd $$0, iw $$1) {
      iw.a $$2 = $$1.k();

      ebg $$3;
      do {
         $$2.c(jc.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jc.b).j();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      iw $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
