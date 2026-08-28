import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dhx extends diu {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dto.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dhx::new)
   );
   public static final dss b = dsr.u;
   public static final dss c = dsr.w;
   public static final dss d = dsr.q;
   protected static final ewj e = dey.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ewj f = dey.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ewj g = dey.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ewj h = dey.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ewj i = dey.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewj j = dey.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewj k = dey.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ewj l = dey.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ewj m = ewg.a(dey.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dey.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ewj n = ewg.a(dey.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dey.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ewj o = ewg.a(dey.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dey.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ewj F = ewg.a(dey.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dey.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dto G;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(dto $$0, dsa.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == je.a.a ? f : e;
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      je.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      if ($$0.c(b)) {
         return ewg.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? k : l;
      }
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$0.c(b)) {
         return ewg.a();
      } else {
         return $$0.c(aE).o() == je.a.c ? i : j;
      }
   }

   @Override
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == je.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == je.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
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
   public dsb a(cxz $$0) {
      dbx $$1 = $$0.q();
      iz $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      je $$4 = $$0.g();
      je.a $$5 = $$4.o();
      boolean $$6 = $$5 == je.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == je.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dsb $$0) {
      return $$0.a(awo.L);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         je $$5 = $$3.cH();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dwu.h : dwu.d, $$2);
      return bqt.a($$1.B);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dwu.d : dwu.h, $$2, dwu.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dwu.h : dwu.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dsb $$0, je $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
