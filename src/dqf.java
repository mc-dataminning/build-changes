import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqf extends dgv {
   public static final MapCodec<dqf> a = b(dqf::new);
   public static final dvr<dub> b = dve.bz;
   public static final dvi c = dlf.aF;
   public static final dvf d = dve.bA;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jj.c).b(b, dub.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if (!$$0.f() && $$1.c(b) == dub.b) {
         if ($$2 instanceof arh $$7) {
            if (!($$7.c_($$3) instanceof dtw $$8)) {
               return brp.f;
            }

            dtw.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return brp.b;
      } else {
         return brp.f;
      }
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dtw($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0 instanceof arh $$3
         ? a($$2, dru.R, ($$1x, $$2x, $$3x, $$4) -> dtw.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, dru.R, ($$0x, $$1x, $$2x, $$3x) -> dtw.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(c, $$0.g().g());
   }

   @Override
   public duo a(duo $$0, dnx $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dnq a_(duo $$0) {
      return dnq.c;
   }
}
