import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwa extends dbl implements dca {
   public static final MapCodec<cwa> a = b(cwa::new);
   public static final dhz b = dhy.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final ekn e = cva.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ekn f = cva.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ekn g = cva.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<cwa> a() {
      return a;
   }

   public cwa(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, hx.a.b));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
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
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ect.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(b) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
