import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dmx extends dop implements djp, dqs {
   public static final MapCodec<dmx> a = b(dmx::new);
   private static final dxo d = dxn.J;
   private final doq e = new doq(this);

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dww.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dwx> b(int $$0) {
      return $$1 -> doo.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      return !$$1.n().a(cwt.gl) || super.a($$0, $$1);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return jn.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return $$0.y().c();
   }

   @Override
   public doq c() {
      return this.e;
   }
}
