import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnm extends dok {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzh.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dnm::new)
   );
   public static final dym b = dyl.v;
   public static final dym c = dyl.x;
   public static final dym d = dyl.q;
   protected static final fcs e = dkm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcs f = dkm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fcs g = dkm.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fcs h = dkm.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fcs i = dkm.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcs j = dkm.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcs k = dkm.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fcs l = dkm.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fcs m = fcp.a(dkm.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dkm.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fcs n = fcp.a(dkm.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dkm.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fcs o = fcp.a(dkm.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dkm.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fcs G = fcp.a(dkm.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dkm.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dzh H;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   public dnm(dzh $$0, dxu.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      jm.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      if ($$0.c(b)) {
         return fcp.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$0.c(b)) {
         return fcp.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fcs d_(dxv $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
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
   public dxv a(dbg $$0) {
      dhi $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dxv $$0) {
      return $$0.a(axu.N);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jm $$5 = $$3.cO();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ecr.h : ecr.d, $$2);
      return btj.a;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ecr.d : ecr.h, $$2, ecr.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ecr.h : ecr.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dxv $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
