import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class doe extends djc implements dmr {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, doe::new)
   );
   public static final dtt b = dts.u;
   public static final dua<dub> c = dts.af;
   public static final dtt d = dts.w;
   public static final dtt e = dts.C;
   protected static final int f = 3;
   protected static final exn g = dfc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final exn h = dfc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exn i = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exn j = dfc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exn k = dfc.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final exn l = dfc.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dtr m;

   @Override
   public MapCodec<? extends doe> a() {
      return a;
   }

   protected doe(dtr $$0, dtb.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, iw.c).a(b, Boolean.valueOf(false)).a(c, dub.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dub.a ? l : k;
      } else {
         switch ((iw)$$0.c(aE)) {
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
   protected boolean a(dtc $$0, ept $$1) {
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
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!this.m.c()) {
         return bqa.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqa.a($$1.C);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dtc $$0, dca $$1, ir $$2, @Nullable cly $$3) {
      dtc $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, epf.c, epf.c.a((dcd)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cly $$0, dca $$1, ir $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dxv.h : dxv.d, $$2);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, epf.c, epf.c.a((dcd)$$1));
            }
         }
      }
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.n();
      epe $$2 = $$0.q().b_($$0.a());
      iw $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dub.a : dub.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == iw.b ? dub.b : dub.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == epf.c));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(e) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dtr k() {
      return this.m;
   }
}
