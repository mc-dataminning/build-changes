import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dek {
   public static final MapCodec<dlq> a = b(dlq::new);
   public static final dss b = dsr.E;
   private final bpy c = bpv.a(5);

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? null : a($$2, dpi.K, dqm::a);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
