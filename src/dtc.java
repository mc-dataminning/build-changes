import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dtc extends dok implements drq {
   public static final MapCodec<dtc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dtc::new)
   );
   public static final dym b = dyl.v;
   public static final dys<dyt> c = dyl.ag;
   public static final dym d = dyl.x;
   public static final dym e = dyl.D;
   protected static final int f = 3;
   protected static final fcs g = dkm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fcs h = dkm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs i = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcs j = dkm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcs k = dkm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fcs l = dkm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dyk m;

   @Override
   public MapCodec<? extends dtc> a() {
      return a;
   }

   protected dtc(dyk $$0, dxu.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dyt.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dyt.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
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
   protected boolean a(dxv $$0, eum $$1) {
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
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!this.m.c()) {
         return btj.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return btj.a;
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dxv $$0, dhi $$1, jh $$2, @Nullable cpx $$3) {
      dxv $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, ety.c, ety.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cpx $$0, dhi $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ecr.h : ecr.d, $$2);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ety.c, ety.c.a($$1));
            }
         }
      }
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = this.m();
      etx $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dyt.a : dyt.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dyt.b : dyt.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == ety.c));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(e) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dyk q() {
      return this.m;
   }
}
