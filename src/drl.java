import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drl extends dic {
   public static final MapCodec<drl> a = b(drl::new);
   public static final dwx<dvi> b = dwl.bz;
   public static final dws<jm> c = dml.aF;
   public static final dwm d = dwl.bA;

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jm.c).b(b, dvi.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if (!$$0.f() && $$1.c(b) == dvi.b) {
         if ($$2 instanceof arp $$7) {
            if (!($$7.c_($$3) instanceof dvd $$8)) {
               return bsk.f;
            }

            dvd.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return bsk.b;
      } else {
         return bsk.f;
      }
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dvd($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0 instanceof arp $$3
         ? a($$2, dta.R, ($$1x, $$2x, $$3x, $$4) -> dvd.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dta.R, ($$0x, $$1x, $$2x, $$3x) -> dvd.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dvv a(dvv $$0, dpd $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dow a_(dvv $$0) {
      return dow.c;
   }
}
