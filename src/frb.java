public class frb implements ape {
   private final fra a;
   private final frd b;
   private final fpu c;
   private final frc d;
   private final ato e = ato.a();
   private final ets f;

   public frb(fra $$0, fpu $$1, ets $$2) {
      this.a = $$0;
      this.c = $$1;
      this.f = $$2;
      this.b = new frd(this.f);
      this.d = new frc();
   }

   public fra a() {
      return this.a;
   }

   public void a(dgw $$0, ht $$1, cqv $$2, enk $$3, eno $$4) {
      if ($$0.l() == day.c) {
         gdi $$5 = this.a.b($$0);
         long $$6 = $$0.a($$1);
         this.b.a($$2, $$5, $$0, $$1, $$3, $$4, true, this.e, $$6, gay.d);
      }
   }

   public void a(dgw $$0, ht $$1, cqv $$2, enk $$3, eno $$4, boolean $$5, ato $$6) {
      try {
         day $$7 = $$0.l();
         if ($$7 == day.c) {
            this.b.a($$2, this.a($$0), $$0, $$1, $$3, $$4, $$5, $$6, $$0.a($$1), gay.d);
         }
      } catch (Throwable var11) {
         o $$9 = o.a(var11, "Tesselating block in world");
         p $$10 = $$9.a("Block being tesselated");
         p.a($$10, $$2, $$1, $$0);
         throw new y($$9);
      }
   }

   public void a(ht $$0, cqv $$1, eno $$2, dgw $$3, ecg $$4) {
      try {
         this.d.a($$1, $$0, $$2, $$3, $$4);
      } catch (Throwable var9) {
         o $$6 = o.a(var9, "Tesselating liquid in world");
         p $$7 = $$6.a("Block being tesselated");
         p.a($$7, $$1, $$0, null);
         throw new y($$6);
      }
   }

   public frd b() {
      return this.b;
   }

   public gdi a(dgw $$0) {
      return this.a.b($$0);
   }

   public void a(dgw $$0, enk $$1, fqh $$2, int $$3, int $$4) {
      day $$5 = $$0.l();
      if ($$5 != day.a) {
         switch ($$5) {
            case c:
               gdi $$6 = this.a($$0);
               int $$7 = this.f.a($$0, null, null, 0);
               float $$8 = (float)($$7 >> 16 & 0xFF) / 255.0F;
               float $$9 = (float)($$7 >> 8 & 0xFF) / 255.0F;
               float $$10 = (float)($$7 & 0xFF) / 255.0F;
               this.b.a($$1.c(), $$2.getBuffer(fqc.a($$0, false)), $$0, $$6, $$8, $$9, $$10, $$3, $$4);
               break;
            case b:
               this.c.a(new clb($$0.b()), cky.a, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   public void a(apd $$0) {
      this.d.a();
   }
}
