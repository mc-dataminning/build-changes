import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhy extends dhq {
   public static final MapCodec<dhy> e = b(dhy::new);

   @Override
   public MapCodec<? extends dhy> a() {
      return e;
   }

   public dhy(drc.d $$0) {
      super($$0);
   }

   public static drd b() {
      return dec.G.n();
   }

   @Override
   public void a(daz $$0, cly $$1, io $$2, drd $$3, @Nullable doi $$4, ctq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (czc.a(cze.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         drd $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.a(dbi.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(drd $$0, daz $$1, io $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
