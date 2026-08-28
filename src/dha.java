import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dha extends dhq {
   public static final dwa a = dvz.w;
   private final dpg.a b;

   public dha(dpg.a $$0, dvi.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dha> a();

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dua($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dig.gO) || $$1.a(dig.gP) || $$1.a(dig.gQ) || $$1.a(dig.gR);
         if ($$3) {
            return a($$2, dso.p, dua::a);
         }
      }

      return null;
   }

   public dpg.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
