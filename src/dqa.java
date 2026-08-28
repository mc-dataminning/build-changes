import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqa extends dpi implements dnx {
   public static final MapCodec<dqa> a = b(dqa::new);
   public static final dur c = duq.C;

   @Override
   protected MapCodec<? extends dqa> a() {
      return a;
   }

   protected dqa(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, Boolean.valueOf($$1.b(eqc.c)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }
}
