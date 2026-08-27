import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dio extends dea implements dlb {
   public static final MapCodec<dio> a = b(dio::new);
   public static final int b = 15;
   public static final dsd c = drt.aP;
   public static final dru d = drt.C;
   public static final ToIntFunction<drd> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!$$1.B && $$3.gz()) {
         $$1.a($$2, $$0.a(c), 2);
         return bpw.a;
      } else {
         return bpw.b;
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$3.a(ctt.hC) ? evc.b() : evc.a();
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return true;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return 1.0F;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static ctq a(ctq $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kb.aa, cwb.a.a(c, $$1));
      }

      return $$0;
   }
}
