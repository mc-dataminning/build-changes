import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dhy {
   public static final MapCodec<djm> a = b(djm::new);
   public static final dvu b = dvt.w;
   public static final dvu c = dvt.r;

   @Override
   protected MapCodec<? extends djm> a() {
      return a;
   }

   public djm(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arm $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$1 instanceof arm $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dvd $$0, arm $$1, jg $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dvd $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awk.fH : awk.fI, awl.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
