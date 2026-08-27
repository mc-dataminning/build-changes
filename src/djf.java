import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends din implements dhc {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dns c = dnr.C;

   @Override
   protected MapCodec<? extends djf> a() {
      return a;
   }

   protected djf(dna.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(eiq.c)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }
}
