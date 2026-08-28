import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends dpw implements dol {
   public static final MapCodec<dqo> a = b(dqo::new);
   public static final dvf c = dve.C;

   @Override
   protected MapCodec<? extends dqo> a() {
      return a;
   }

   protected dqo(dun.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(eqq.c)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }
}
