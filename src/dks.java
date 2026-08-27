import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends ddm {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dru b = drt.E;
   private final bpb c = boy.a(5);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new dpo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? null : a($$2, dok.K, dpo::a);
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
