import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dff extends dem implements dhv {
   public static final MapCodec<dff> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lp.e.q().fieldOf("turns_into").forGetter(dff::b),
               lp.b.q().fieldOf("brush_sound").forGetter(dff::c),
               lp.b.q().fieldOf("brush_comleted_sound").forGetter(dff::d),
               u()
            )
            .apply($$0, dff::new)
   );
   private static final dtd c = dst.bv;
   public static final int b = 2;
   private final dfa d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dfa $$0, avz $$1, avz $$2, dsc.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }

   @Override
   public dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   public void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dpm $$4) {
         $$4.b();
      }

      if (dhw.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjh $$5 = cjh.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, cjh $$2) {
      evs $$3 = $$2.cK().f();
      $$0.c(2001, iz.a($$3), dfa.i($$2.u()));
      $$0.a($$2, dww.f, $$3);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (dhw.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new la(li.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpm($$0, $$1);
   }

   public dfa b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
