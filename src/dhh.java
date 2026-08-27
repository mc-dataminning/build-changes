import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhh extends dcq {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final dqy b = dqx.n;

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, @Nullable bsa $$3, csz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cvm $$5 = $$4.a(ka.M, cvm.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof don $$5) {
         $$5.l();
         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof don $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new don($$0, $$1);
   }

   @Override
   public boolean e_(dqh $$0) {
      return true;
   }

   @Override
   public int a(dqh $$0, czj $$1, in $$2, is $$3) {
      if ($$1.c_($$2) instanceof don $$4 && $$4.j()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      if ($$1.c_($$2) instanceof don $$3 && $$3.f().f() instanceof cts $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$1.c(b) ? a($$2, dno.e, don::a) : null;
   }
}
