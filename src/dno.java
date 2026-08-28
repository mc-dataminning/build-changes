import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dno extends dix implements dmc {
   public static final MapCodec<dno> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dst.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dno::new)
   );
   public static final dsv b = dsu.u;
   public static final dtc<dtd> c = dsu.af;
   public static final dsv d = dsu.w;
   public static final dsv e = dsu.C;
   protected static final int f = 3;
   protected static final ewm g = dfb.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewm h = dfb.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm i = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewm j = dfb.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewm k = dfb.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewm l = dfb.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dst m;

   @Override
   public MapCodec<? extends dno> a() {
      return a;
   }

   protected dno(dst $$0, dsd.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dtd.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtd.a ? l : k;
      } else {
         switch ((je)$$0.c(aE)) {
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
   protected boolean a(dse $$0, eom $$1) {
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
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if (!this.m.c()) {
         return bqw.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqw.a($$1.B);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dse $$0, dca $$1, iz $$2, @Nullable cmz $$3) {
      dse $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eny.c, eny.c.a((dcd)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmz $$0, dca $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dwx.h : dwx.d, $$2);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eny.c, eny.c.a((dcd)$$1));
            }
         }
      }
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = this.o();
      enx $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtd.a : dtd.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dtd.b : dtd.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eny.c));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(e) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dst m() {
      return this.m;
   }
}
