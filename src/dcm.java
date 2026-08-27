import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dcm extends dbt implements dfc {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kt.e.q().fieldOf("turns_into").forGetter(dcm::b),
               kt.b.q().fieldOf("brush_sound").forGetter(dcm::c),
               kt.b.q().fieldOf("brush_comleted_sound").forGetter(dcm::d),
               u()
            )
            .apply($$0, dcm::new)
   );
   private static final dqi c = dpy.bv;
   public static final int b = 2;
   private final dch d;
   private final aun e;
   private final aun f;

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public dcm(dch $$0, aun $$1, aun $$2, dph.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   public dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   public void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.c_($$2) instanceof dms $$4) {
         $$4.b();
      }

      if (dfd.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgj $$5 = cgj.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(czg $$0, id $$1, cgj $$2) {
      esj $$3 = $$2.cH().f();
      $$0.c(2001, id.a($$3), dch.i($$2.u()));
      $$0.a($$2, dub.f, $$3);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$3.a(16) == 0) {
         id $$4 = $$2.d();
         if (dfd.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new kf(kn.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dms($$0, $$1);
   }

   public dch b() {
      return this.d;
   }

   public aun c() {
      return this.e;
   }

   public aun d() {
      return this.f;
   }
}
