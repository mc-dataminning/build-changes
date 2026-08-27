import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class die extends djc {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, die::new)
   );
   public static final dtt b = dts.u;
   public static final dtt c = dts.w;
   public static final dtt d = dts.q;
   protected static final exn e = dfc.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exn f = dfc.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final exn g = dfc.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final exn h = dfc.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final exn i = dfc.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exn j = dfc.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exn k = dfc.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final exn l = dfc.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final exn m = exk.a(dfc.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dfc.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final exn n = exk.a(dfc.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dfc.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final exn o = exk.a(dfc.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dfc.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final exn F = exk.a(dfc.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dfc.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dup G;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dup $$0, dtb.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == iw.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == iw.a.a ? f : e;
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      iw.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      if ($$0.c(b)) {
         return exk.a();
      } else {
         return $$0.c(aE).o() == iw.a.c ? k : l;
      }
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if ($$0.c(b)) {
         return exk.a();
      } else {
         return $$0.c(aE).o() == iw.a.c ? i : j;
      }
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == iw.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == iw.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dtc a(cyd $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      iw $$4 = $$0.g();
      iw.a $$5 = $$4.o();
      boolean $$6 = $$5 == iw.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == iw.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dtc $$0) {
      return $$0.a(awe.L);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         iw $$5 = $$3.cM();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dxv.h : dxv.d, $$2);
      return bqa.a($$1.C);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dxv.d : dxv.h, $$2, dxv.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avq.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dxv.h : dxv.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dtc $$0, iw $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
