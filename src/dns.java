import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dna implements doe {
   public static final MapCodec<dns> c = b(dns::new);

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   protected dns(dwv.d $$0) {
      super($$0, jn.b, fbq.b(), true);
   }

   @Override
   protected dnb c() {
      return (dnb)djn.mE;
   }

   @Override
   protected esy b_(dww $$0) {
      return esz.c.a(false);
   }

   @Override
   protected boolean o(dww $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return false;
   }

   @Override
   public boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      return false;
   }
}
