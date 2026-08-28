import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dni extends dlu {
   public static final MapCodec<dni> a = b(dni::new);
   public static final eaf b = eae.A;
   public static final eaf c = eae.u;

   @Override
   protected MapCodec<? extends dni> a() {
      return a;
   }

   public dni(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aro $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$1 instanceof aro $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dzo $$0, aro $$1, iu $$2) {
      boolean $$3 = $$1.D($$2);
      if ($$3 != $$0.c(b)) {
         dzo $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awl.fI : awl.fJ, awm.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
