import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends djk {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dxm b = dxl.B;
   public static final dxm c = dxl.v;

   @Override
   protected MapCodec<? extends dky> a() {
      return a;
   }

   public dky(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arc $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$1 instanceof arc $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dwv $$0, arc $$1, ji $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dwv $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avz.fI : avz.fJ, awa.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
