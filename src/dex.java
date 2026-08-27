import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dex extends dac implements dhc {
   public static final MapCodec<dex> a = b(dex::new);
   public static final dns b = dnr.C;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   protected dex(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      return $$1.a(dae.ac) && $$2.o() == ih.a.b;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eiq.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(b) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
