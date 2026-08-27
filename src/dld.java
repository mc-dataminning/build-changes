import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dld extends dgg implements deb, dkz {
   public static final MapCodec<dld> c = b(dld::new);
   private static final drs g = drr.C;
   public static final drv d = drr.R;
   protected static final float e = 6.0F;
   protected static final evd f = ddy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dld> a() {
      return c;
   }

   public dld(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drx.b).a(g, Boolean.valueOf(false)).a(d, it.c));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return f;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.bx) || $$1.b_($$2.c()).a(emv.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      if (!$$0.x_()) {
         io $$5 = $$1.c();
         drb $$6 = dgg.c($$0, $$5, this.n().a(b, drx.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(g) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      if ($$0.c(b) == drx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         io $$3 = $$2.d();
         drb $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      if ($$3.c(dgg.b) == drx.b) {
         io $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         ddv.a($$0, $$1, $$2, $$3.c(d));
      } else {
         io $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
