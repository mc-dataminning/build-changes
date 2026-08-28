import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends den {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dsv b = dsu.E;
   private final bqb c = bpy.a(5);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? null : a($$2, dpl.K, dqp::a);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
