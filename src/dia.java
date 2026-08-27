import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dia extends dde implements dkf {
   public static final MapCodec<dia> a = b(dia::new);
   public static final dqy b = dqx.C;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dqh $$0, dqh $$1, is $$2) {
      return $$1.a(ddg.ac) && $$2.o() == is.a.b;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emb.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(b) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
