import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czo extends cut implements dbt {
   public static final MapCodec<czo> a = b(czo::new);
   public static final dhn b = dhm.C;

   @Override
   public MapCodec<czo> a() {
      return a;
   }

   protected czo(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
      return $$1.a(cuv.ac) && $$2.o() == hx.a.b;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ech.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(b) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }
}
