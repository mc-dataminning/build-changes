import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnv extends dje implements dmj {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnv::new)
   );
   public static final dtc b = dtb.u;
   public static final dtj<dtk> c = dtb.af;
   public static final dtc d = dtb.w;
   public static final dtc e = dtb.C;
   protected static final int f = 3;
   protected static final exa g = dfi.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exa h = dfi.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa i = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exa j = dfi.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exa k = dfi.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final exa l = dfi.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dta m;

   @Override
   public MapCodec<? extends dnv> a() {
      return a;
   }

   protected dnv(dta $$0, dsk.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(c, dtk.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtk.a ? l : k;
      } else {
         switch ((jf)$$0.c(aE)) {
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
   protected boolean a(dsl $$0, eoy $$1) {
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
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (!this.m.c()) {
         return bqh.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqh.a($$1.B);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsl $$0, dcg $$1, ja $$2, @Nullable cml $$3) {
      dsl $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eok.c, eok.c.a((dcj)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cml $$0, dcg $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxh.h : dxh.d, $$2);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eok.c, eok.c.a((dcj)$$1));
            }
         }
      }
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      eoj $$2 = $$0.q().b_($$0.a());
      jf $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtk.a : dtk.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == jf.b ? dtk.b : dtk.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eok.c));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(e) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dta m() {
      return this.m;
   }
}
