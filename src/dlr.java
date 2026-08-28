import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dgv implements dnx {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dur b = duq.C;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   protected dlr(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dua $$0, dua $$1, jj $$2) {
      return $$1.a(dgx.ac) && $$2.o() == jj.a.b;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eqc.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
