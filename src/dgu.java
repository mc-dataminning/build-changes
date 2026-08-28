import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgu extends dhk {
   public static final dvu a = dvt.w;
   private final dpa.a b;

   public dgu(dpa.a $$0, dvc.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dgu> a();

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dia.gO) || $$1.a(dia.gP) || $$1.a(dia.gQ) || $$1.a(dia.gR);
         if ($$3) {
            return a($$2, dsi.p, dtu::a);
         }
      }

      return null;
   }

   public dpa.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(a);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
