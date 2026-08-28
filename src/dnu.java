import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnu extends djd implements dmi {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsz.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnu::new)
   );
   public static final dtb b = dta.u;
   public static final dti<dtj> c = dta.af;
   public static final dtb d = dta.w;
   public static final dtb e = dta.C;
   protected static final int f = 3;
   protected static final ewy g = dfh.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewy h = dfh.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy i = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewy j = dfh.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewy k = dfh.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewy l = dfh.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsz m;

   @Override
   public MapCodec<? extends dnu> a() {
      return a;
   }

   protected dnu(dsz $$0, dsj.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(c, dtj.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtj.a ? l : k;
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
   protected boolean a(dsk $$0, eow $$1) {
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
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if (!this.m.c()) {
         return bqg.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqg.a($$1.B);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsk $$0, dcf $$1, ja $$2, @Nullable cmk $$3) {
      dsk $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eoi.c, eoi.c.a((dci)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmk $$0, dcf $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxg.h : dxg.d, $$2);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eoi.c, eoi.c.a((dci)$$1));
            }
         }
      }
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = this.o();
      eoh $$2 = $$0.q().b_($$0.a());
      jf $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtj.a : dtj.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == jf.b ? dtj.b : dtj.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == eoi.c));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(e) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsz m() {
      return this.m;
   }
}
