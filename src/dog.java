import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dog extends dmr {
   public static final MapCodec<dog> a = b(dog::new);
   public static final ebk b = ebj.A;
   public static final ebk c = ebj.u;

   @Override
   protected MapCodec<? extends dog> a() {
      return a;
   }

   public dog(eas.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arq $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$1 instanceof arq $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(eat $$0, arq $$1, iv $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         eat $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awn.fK : awn.fL, awo.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
