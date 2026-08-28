import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhe extends dhk {
   public static final MapCodec<dhe> a = b(dhe::new);
   public static final dvx b = dvt.P;
   public static final dvu c = dvt.u;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof drz $$5) {
         $$3.a($$5);
         $$3.a(awu.ar);
         cmx.a($$3, true);
      }

      return bry.a;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      dsg $$4 = $$1.c_($$2);
      if ($$4 instanceof drz) {
         ((drz)$$4).k();
      }
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new drz($$0, $$1);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
