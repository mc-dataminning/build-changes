import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dbd extends cwq implements ddq {
   public static final MapCodec<dbd> a = b(dbd::new);
   public static final int b = 15;
   public static final dkh c = djx.aP;
   public static final djy d = djx.C;
   public static final ToIntFunction<djh> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bkb.a;
      } else {
         return bkb.b;
      }
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return $$3.a(cnb.hB) ? emj.b() : emj.a();
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return true;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.a;
   }

   @Override
   public float d(djh $$0, csv $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cmy a(cmy $$0, int $$1) {
      if ($$1 != 15) {
         sn $$2 = new sn();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
