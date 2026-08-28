import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dgy {
   public static final MapCodec<dqi> a = b(dqi::new);
   public static final dvv<duf> b = dvi.bz;
   public static final dvm c = dli.aF;
   public static final dvj d = dvi.bA;

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jk.c).b(b, duf.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if (!$$0.f() && $$1.c(b) == duf.b) {
         if ($$2 instanceof arj $$7) {
            if (!($$7.c_($$3) instanceof dua $$8)) {
               return brs.f;
            }

            dua.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return brs.b;
      } else {
         return brs.f;
      }
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dua($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0 instanceof arj $$3
         ? a($$2, drx.R, ($$1x, $$2x, $$3x, $$4) -> dua.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, drx.R, ($$0x, $$1x, $$2x, $$3x) -> dua.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(c, $$0.g().g());
   }

   @Override
   public dus a(dus $$0, doa $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dnt a_(dus $$0) {
      return dnt.c;
   }
}
