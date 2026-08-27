import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbt extends cwy implements ddy {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final dkg b = dkf.C;

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   protected dbt(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(djp $$0, djp $$1, ic $$2) {
      return $$1.a(cxa.ac) && $$2.o() == ic.a.b;
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == efa.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(b) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
