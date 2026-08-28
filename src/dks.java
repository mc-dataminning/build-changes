import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dks extends dra {
   public static final MapCodec<dks> a = b(dks::new);
   public static final dyk<jm> b = dyd.S;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return !$$0.C ? a($$2, dur.K, ($$0x, $$1x, $$2x, $$3) -> ecs.c.a($$0x, $$3.gn(), $$3.go())) : null;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
