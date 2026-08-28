import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dse extends dnk implements dqs {
   public static final MapCodec<dse> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dse::new)
   );
   public static final dxo b = dxn.z;
   public static final dxu<dxv> c = dxn.ai;
   public static final dxo d = dxn.B;
   public static final dxo e = dxn.J;
   protected static final int f = 3;
   protected static final fbu g = djm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbu h = djm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbu i = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbu j = djm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbu k = djm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fbu l = djm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dxm m;

   @Override
   public MapCodec<? extends dse> a() {
      return a;
   }

   protected dse(dxm $$0, dww.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(c, dxv.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dxv.a ? l : k;
      } else {
         switch ((jn)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!this.m.c()) {
         return bsk.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsk.a;
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dwx $$0, dgi $$1, ji $$2, @Nullable cox $$3) {
      dwx $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eta.c, eta.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cox $$0, dgi $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ebt.h : ebt.d, $$2);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eta.c, eta.c.a($$1));
            }
         }
      }
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = this.m();
      esz $$2 = $$0.q().b_($$0.a());
      jn $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dxv.a : dxv.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jn.b ? dxv.b : dxv.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == eta.c));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dxm q() {
      return this.m;
   }
}
