import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvt extends dbe implements dbt {
   public static final MapCodec<cvt> a = b(cvt::new);
   public static final dhn b = dhm.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ekb e = cut.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ekb f = cut.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ekb g = cut.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cvt> a() {
      return a;
   }

   public cvt(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, hx.a.b));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ech.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(b) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
