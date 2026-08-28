import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmm extends dnk {
   public static final MapCodec<dmm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dmm::new)
   );
   public static final dxo b = dxn.z;
   public static final dxo c = dxn.B;
   public static final dxo d = dxn.u;
   protected static final fbu e = djm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbu f = djm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fbu g = djm.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fbu h = djm.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fbu i = djm.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbu j = djm.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbu k = djm.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fbu l = djm.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fbu m = fbr.a(djm.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), djm.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fbu n = fbr.a(djm.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), djm.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fbu o = fbr.a(djm.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), djm.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fbu G = fbr.a(djm.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), djm.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dyj H;

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(dyj $$0, dww.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jn.a.a ? f : e;
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fbu b_(dwx $$0, dfn $$1, ji $$2) {
      if ($$0.c(b)) {
         return fbr.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? k : l;
      }
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      if ($$0.c(b)) {
         return fbr.a();
      } else {
         return $$0.c(aF).o() == jn.a.c ? i : j;
      }
   }

   @Override
   protected fbu d_(dwx $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jn.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jn.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
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
   public dwx a(dag $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jn $$4 = $$0.g();
      jn.a $$5 = $$4.o();
      boolean $$6 = $$5 == jn.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jn.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dwx $$0) {
      return $$0.a(awp.N);
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jn $$5 = $$3.cO();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ebt.h : ebt.d, $$2);
      return bsk.a;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ebt.d : ebt.h, $$2, ebt.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ebt.h : ebt.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dwx $$0, jn $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
