import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duz extends dlg {
   public static final MapCodec<duz> a = b(duz::new);
   public static final ear<dzb> b = eae.bC;
   public static final eam<ja> c = dpt.e;
   public static final eaf d = eae.bE;

   @Override
   public MapCodec<duz> a() {
      return a;
   }

   public duz(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, ja.c).b(b, dzb.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      if (!$$0.f() && $$1.c(b) == dzb.b) {
         if ($$2 instanceof aro $$7) {
            if (!($$7.c_($$3) instanceof dyw $$8)) {
               return bty.f;
            }

            dyw.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bty.b;
      } else {
         return bty.f;
      }
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyw($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0 instanceof aro $$3
         ? a($$2, dwp.S, ($$1x, $$2x, $$3x, $$4) -> dyw.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dwp.S, ($$0x, $$1x, $$2x, $$3x) -> dyw.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public dzo a(dzo $$0, dsm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
