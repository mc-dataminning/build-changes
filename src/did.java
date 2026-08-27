import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class did extends ddm {
   public static final MapCodec<did> a = b(did::new);
   public static final dru b = drt.n;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   protected did(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, @Nullable bsq $$3, ctq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cwf $$5 = $$4.a(kb.N, cwf.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dpj $$5) {
         $$5.l();
         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dpj $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpj($$0, $$1);
   }

   @Override
   public boolean e_(drd $$0) {
      return true;
   }

   @Override
   public int a(drd $$0, daf $$1, io $$2, it $$3) {
      if ($$1.c_($$2) instanceof dpj $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpj $$3 && $$3.f().g() instanceof cul $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$1.c(b) ? a($$2, dok.e, dpj::a) : null;
   }
}
