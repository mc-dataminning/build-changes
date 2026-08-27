import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgr extends czm {
   public static final MapCodec<dgr> a = b(dgr::new);
   public static final dnq b = dnp.E;
   private final bmh c = bme.a(5);

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dll($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0.B ? null : a($$2, dki.K, dll::a);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
