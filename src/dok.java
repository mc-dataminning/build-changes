import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dok extends djm implements dqs {
   public static final MapCodec<dok> a = b(dok::new);
   public static final dxo b = dxn.J;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dwx $$0, dwx $$1, jn $$2) {
      return $$1.a(djo.ag) && $$2.o() == jn.a.b;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eta.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(b) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }
}
