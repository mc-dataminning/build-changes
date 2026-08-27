import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dio extends ddx implements dhc {
   public static final MapCodec<dio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dio::new)
   );
   public static final dns b = dnr.u;
   public static final dnz<doa> c = dnr.af;
   public static final dns d = dnr.w;
   public static final dns e = dnr.C;
   protected static final int f = 3;
   protected static final eqm g = dac.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eqm h = dac.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm i = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eqm j = dac.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eqm k = dac.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eqm l = dac.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dnq m;

   @Override
   public MapCodec<? extends dio> a() {
      return a;
   }

   protected dio(dnq $$0, dna.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(c, doa.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == doa.a ? l : k;
      } else {
         switch ((ih)$$0.c(aE)) {
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
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      switch ($$3) {
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
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!this.m.c()) {
         return bnd.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bnd.a($$1.B);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if ($$3.j() == cwt.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dnb $$0, cxb $$1, ib $$2, @Nullable ciu $$3) {
      dnb $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eiq.c, eiq.c.a((cxe)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable ciu $$0, cxb $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), atz.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? drp.h : drp.d, $$2);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eiq.c, eiq.c.a((cxe)$$1));
            }
         }
      }
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = this.o();
      eip $$2 = $$0.q().b_($$0.a());
      ih $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? doa.a : doa.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ih.b ? doa.b : doa.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eiq.c));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(e) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dnq i() {
      return this.m;
   }
}
