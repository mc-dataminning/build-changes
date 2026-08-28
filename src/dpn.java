import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpn extends dqn {
   public static final MapCodec<dpn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dpn::new)
   );
   public static final ebf b = ebe.y;
   public static final ebf c = ebe.A;
   public static final ebf d = ebe.t;
   private static final Map<jb.a, ffr> f = ffo.a(dmm.a(16.0, 16.0, 4.0));
   private static final Map<jb.a, ffr> g = Maps.newEnumMap(ag.a(f, (Function<? super ffr, ffr>)($$0 -> ffo.a($$0, dmm.b(16.0, 13.0, 16.0), ffb.e))));
   private static final Map<jb.a, ffr> h = ffo.a(dmm.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jb.a, ffr> i = ffo.a(dmm.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jb.a, ffr> D = ffo.a(ffo.a(dmm.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dmm.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jb.a, ffr> R = Maps.newEnumMap(ag.a(D, (Function<? super ffr, ffr>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ecc S;

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(ecc $$0, ean.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      jb.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      jb.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      jb.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? ffo.a() : i.get($$3);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      jb.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? ffo.a() : h.get($$4);
   }

   @Override
   protected ffr d_(eao $$0) {
      jb.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
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
   public eao a(ddd $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      jb $$4 = $$0.g();
      jb.a $$5 = $$4.o();
      boolean $$6 = $$5 == jb.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jb.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(eao $$0) {
      return $$0.a(axc.N);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jb $$5 = $$3.cN();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? efo.h : efo.d, $$2);
      return bug.a;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? efo.d : efo.h, $$2, efo.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? efo.h : efo.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(eao $$0, jb $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
