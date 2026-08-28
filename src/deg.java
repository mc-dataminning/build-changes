import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends dem {
   public static final MapCodec<deg> a = b(deg::new);
   public static final dsx b = dst.P;
   public static final dsu c = dst.u;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         dpi $$5 = $$1.c_($$2);
         if ($$5 instanceof dpb) {
            $$3.a((dpb)$$5);
            $$3.a(awk.ar);
            clp.a($$3, true);
         }

         return bqv.c;
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dpi $$4 = $$1.c_($$2);
      if ($$4 instanceof dpb) {
         ((dpb)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpb($$0, $$1);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
