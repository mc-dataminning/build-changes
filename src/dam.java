import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dam extends cvz implements dcz {
   public static final MapCodec<dam> a = b(dam::new);
   public static final int b = 15;
   public static final djp c = djf.aP;
   public static final djg d = djf.C;
   public static final ToIntFunction<dip> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dam(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bjl.a;
      } else {
         return bjl.b;
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return $$3.a(cmk.hB) ? elr.b() : elr.a();
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return true;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.a;
   }

   @Override
   public float d(dip $$0, cse $$1, hv $$2) {
      return 1.0F;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cmh a(cmh $$0, int $$1) {
      if ($$1 != 15) {
         sj $$2 = new sj();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
