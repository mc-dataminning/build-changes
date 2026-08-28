import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpk extends dkm implements drq {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final dym b = dyl.D;

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   protected dpk(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dxv $$0, dxv $$1, jm $$2) {
      return $$1.a(dko.ag) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      etx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ety.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(b) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }
}
