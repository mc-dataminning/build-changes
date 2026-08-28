import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfc extends dej implements dhs {
   public static final MapCodec<dfc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lp.e.q().fieldOf("turns_into").forGetter(dfc::b),
               lp.b.q().fieldOf("brush_sound").forGetter(dfc::c),
               lp.b.q().fieldOf("brush_comleted_sound").forGetter(dfc::d),
               u()
            )
            .apply($$0, dfc::new)
   );
   private static final dta c = dsq.bv;
   public static final int b = 2;
   private final dex d;
   private final avy e;
   private final avy f;

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dex $$0, avy $$1, avy $$2, drz.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   public dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   public void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.c_($$2) instanceof dpj $$4) {
         $$4.b();
      }

      if (dht.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cje $$5 = cje.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dbw $$0, iz $$1, cje $$2) {
      evp $$3 = $$2.cK().f();
      $$0.c(2001, iz.a($$3), dex.i($$2.u()));
      $$0.a($$2, dwt.f, $$3);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (dht.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new la(li.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpj($$0, $$1);
   }

   public dex b() {
      return this.d;
   }

   public avy c() {
      return this.e;
   }

   public avy d() {
      return this.f;
   }
}
