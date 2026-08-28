import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dix extends dhj {
   public static final MapCodec<dix> a = b(dix::new);
   public static final dvf b = dve.w;
   public static final dvf c = dve.r;

   @Override
   protected MapCodec<? extends dix> a() {
      return a;
   }

   public dix(dun.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arh $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$1 instanceof arh $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(duo $$0, arh $$1, je $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         duo $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awe.fH : awe.fI, awf.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
