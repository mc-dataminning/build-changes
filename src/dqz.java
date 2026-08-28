import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqz extends djq {
   public static final MapCodec<dqz> a = b(dqz::new);
   public static final dye b = dyd.F;
   private final bsj c = bsg.a(5);

   @Override
   public MapCodec<dqz> a() {
      return a;
   }

   public dqz(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? null : a($$2, dur.L, dvy::a);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, cxk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
