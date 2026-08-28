import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class doc extends djm implements dqs {
   public static final MapCodec<doc> a = b(doc::new);
   public static final int b = 15;
   public static final dxw c = dxn.aS;
   public static final dxo d = dxn.J;
   public static final ToIntFunction<dwx> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsj.b;
      } else {
         return bsj.c;
      }
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$3.a(cwt.hZ) ? fbr.b() : fbr.a();
   }

   @Override
   protected boolean e_(dwx $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected float c(dwx $$0, dfn $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(d) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cwp a(cwp $$0, int $$1) {
      $$0.b(kv.am, cyr.a.a(c, $$1));
      return $$0;
   }
}
