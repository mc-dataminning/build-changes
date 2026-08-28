import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dne extends dod {
   public static final MapCodec<dne> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter($$0x -> $$0x.R), t()).apply($$0, dne::new)
   );
   public static final dyh b = dyg.y;
   public static final dyh c = dyg.A;
   public static final dyh d = dyg.t;
   private static final Map<jn.a, fcr> f = fco.a(dke.a(16.0, 16.0, 4.0));
   private static final Map<jn.a, fcr> g = Maps.newEnumMap(af.a(f, (Function<? super fcr, fcr>)($$0 -> fco.a($$0, dke.b(16.0, 13.0, 16.0), fcb.e))));
   private static final Map<jn.a, fcr> h = fco.a(dke.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jn.a, fcr> i = fco.a(dke.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jn.a, fcr> C = fco.a(fco.a(dke.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dke.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jn.a, fcr> Q = Maps.newEnumMap(af.a(C, (Function<? super fcr, fcr>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final dzd R;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dzd $$0, dxp.d $$1) {
      super($$1.a($$0.d()));
      this.R = $$0;
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      jn.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      jn.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fco.a() : i.get($$3);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      jn.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fco.a() : h.get($$4);
   }

   @Override
   protected fcr d_(dxq $$0) {
      jn.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? Q : C).get($$1);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
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
   public dxq a(dax $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jn $$4 = $$0.g();
      jn.a $$5 = $$4.o();
      boolean $$6 = $$5 == jn.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jn.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dxq $$0) {
      return $$0.a(awp.N);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jn $$5 = $$3.cN();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.R.g() : this.R.f(), awb.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ecp.h : ecp.d, $$2);
      return bsy.a;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.R.f() : this.R.g(), awb.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ecp.d : ecp.h, $$2, ecp.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.R.g() : this.R.f(), awb.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ecp.h : ecp.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(dxq $$0, jn $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
