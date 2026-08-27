import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dby extends ddn implements cyr, dfo {
   public static final MapCodec<dby> a = b(dby::new);
   private static final dlw c = dlv.C;
   private final ddo d = new ddo(this);

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(dle.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dlf> b(int $$0) {
      return $$1 -> ddn.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return !$$1.n().a(cpc.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return ie.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return $$0.u().c();
   }

   @Override
   public ddo c() {
      return this.d;
   }
}
