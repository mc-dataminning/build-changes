import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfd extends dek implements dht {
   public static final MapCodec<dfd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lp.e.q().fieldOf("turns_into").forGetter(dfd::b),
               lp.b.q().fieldOf("brush_sound").forGetter(dfd::c),
               lp.b.q().fieldOf("brush_comleted_sound").forGetter(dfd::d),
               u()
            )
            .apply($$0, dfd::new)
   );
   private static final dtb c = dsr.bv;
   public static final int b = 2;
   private final dey d;
   private final avy e;
   private final avy f;

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public dfd(dey $$0, avy $$1, avy $$2, dsa.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   public dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   public void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.c_($$2) instanceof dpk $$4) {
         $$4.b();
      }

      if (dhu.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjf $$5 = cjf.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, cjf $$2) {
      evq $$3 = $$2.cK().f();
      $$0.c(2001, iz.a($$3), dey.i($$2.u()));
      $$0.a($$2, dwu.f, $$3);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (dhu.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new la(li.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpk($$0, $$1);
   }

   public dey b() {
      return this.d;
   }

   public avy c() {
      return this.e;
   }

   public avy d() {
      return this.f;
   }
}
