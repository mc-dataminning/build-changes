import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddj extends cyo implements dfo {
   public static final MapCodec<ddj> a = b(ddj::new);
   public static final dlw b = dlv.C;

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   protected ddj(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dlf $$0, dlf $$1, ie $$2) {
      return $$1.a(cyq.ac) && $$2.o() == ie.a.b;
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egq.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(b) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }
}
