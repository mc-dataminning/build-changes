import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dne {
   public static final MapCodec<dot> a = b(dot::new);
   public static final ebx b = ebw.A;
   public static final ebx c = ebw.u;

   @Override
   protected MapCodec<? extends dot> a() {
      return a;
   }

   public dot(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aru $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$1 instanceof aru $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(ebg $$0, aru $$1, iw $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         ebg $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awr.fK : awr.fL, aws.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
