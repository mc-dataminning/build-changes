import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnu extends dna implements dql {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mh.e.q().fieldOf("turns_into").forGetter(dnu::b),
               mh.b.q().fieldOf("brush_sound").forGetter(dnu::c),
               mh.b.q().fieldOf("brush_completed_sound").forGetter(dnu::d),
               t()
            )
            .apply($$0, dnu::new)
   );
   private static final ecq c = ecg.by;
   public static final int b = 2;
   private final dno d;
   private final awx e;
   private final awx f;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dno $$0, awx $$1, awx $$2, ebp.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.c_($$2) instanceof dyt $$4) {
         $$4.a($$1);
      }

      if (dqm.n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         com $$5 = com.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, com $$2) {
      fgc $$3 = $$2.cR().f();
      $$0.c(2001, iw.a((jq)$$3), dno.j($$2.j()));
      $$0.a($$2, egq.f, $$3);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(16) == 0) {
         iw $$4 = $$2.e();
         if (dqm.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lr(lz.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyt($$0, $$1);
   }

   public dno b() {
      return this.d;
   }

   public awx c() {
      return this.e;
   }

   public awx d() {
      return this.f;
   }
}
