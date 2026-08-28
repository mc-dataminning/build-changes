import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends dgv {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final dvi b = dve.P;
   public static final dvf c = dve.u;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof drl $$5) {
         $$3.a($$5);
         $$3.a(awo.ar);
         cml.a($$3, true);
      }

      return brp.a;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      drs $$4 = $$1.c_($$2);
      if ($$4 instanceof drl) {
         ((drl)$$4).k();
      }
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new drl($$0, $$1);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.d().g());
   }
}
