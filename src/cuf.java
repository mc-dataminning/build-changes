import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cuf extends ctm implements cwt {
   public static final MapCodec<cuf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.f.q().fieldOf("turns_into").forGetter(cuf::b),
               jy.c.q().fieldOf("brush_sound").forGetter(cuf::c),
               jy.c.q().fieldOf("brush_comleted_sound").forGetter(cuf::d),
               t()
            )
            .apply($$0, cuf::new)
   );
   private static final dhb c = dgr.bv;
   public static final int b = 2;
   private final cua d;
   private final aqc e;
   private final aqc f;

   @Override
   public MapCodec<cuf> a() {
      return a;
   }

   public cuf(cua $$0, aqc $$1, aqc $$2, dga.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.c_($$2) instanceof deb $$4) {
         $$4.c();
      }

      if (cwu.h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         bzp $$5 = bzp.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, bzp $$2) {
      eif $$3 = $$2.cG().f();
      $$0.c(2001, ht.a($$3), cua.i($$2.t()));
      $$0.a($$2, dkl.f, $$3);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (cwu.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jk(js.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new deb($$0, $$1);
   }

   public cua b() {
      return this.d;
   }

   public aqc c() {
      return this.e;
   }

   public aqc d() {
      return this.f;
   }
}
