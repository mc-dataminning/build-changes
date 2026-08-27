import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cyx extends cye implements dbn {
   public static final MapCodec<cyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.e.q().fieldOf("turns_into").forGetter(cyx::b),
               kf.b.q().fieldOf("brush_sound").forGetter(cyx::c),
               kf.b.q().fieldOf("brush_comleted_sound").forGetter(cyx::d),
               u()
            )
            .apply($$0, cyx::new)
   );
   private static final dmj c = dlz.bv;
   public static final int b = 2;
   private final cys d;
   private final atk e;
   private final atk f;

   @Override
   public MapCodec<cyx> a() {
      return a;
   }

   public cyx(cys $$0, atk $$1, atk $$2, dli.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   public dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   public void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.c_($$2) instanceof djb $$4) {
         $$4.c();
      }

      if (dbo.m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cdv $$5 = cdv.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, cdv $$2) {
      enz $$3 = $$2.cH().f();
      $$0.c(2001, hz.a($$3), cys.i($$2.u()));
      $$0.a($$2, dpw.f, $$3);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$3.a(16) == 0) {
         hz $$4 = $$2.d();
         if (dbo.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jr(jz.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djb($$0, $$1);
   }

   public cys b() {
      return this.d;
   }

   public atk c() {
      return this.e;
   }

   public atk d() {
      return this.f;
   }
}
