import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpr extends dgh {
   public static final MapCodec<dpr> a = b(dpr::new);
   public static final dvd<dtn> b = duq.bz;
   public static final duu c = dkr.aE;
   public static final dur d = duq.bA;

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, jj.c).b(b, dtn.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if (!$$0.f() && $$1.c(b) == dtn.b) {
         if ($$2 instanceof arg $$7) {
            if (!($$7.c_($$3) instanceof dti $$8)) {
               return brk.f;
            }

            dti.b.a($$7, $$3, $$1, $$8.f(), $$8.b(), $$8.c(), $$4, $$0);
         }

         return brk.b;
      } else {
         return brk.f;
      }
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dti($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0 instanceof arg $$3
         ? a($$2, drg.R, ($$1x, $$2x, $$3x, $$4) -> dti.b.a($$3, $$2x, $$3x, $$4.f(), $$4.b(), $$4.c()))
         : a($$2, drg.R, ($$0x, $$1x, $$2x, $$3x) -> dti.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(c, $$0.g().g());
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   public dnc a_(dua $$0) {
      return dnc.c;
   }
}
