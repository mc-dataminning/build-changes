import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqp extends drp {
   public static final MapCodec<dqp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dqp::new)
   );
   public static final ech b = ecg.y;
   public static final ech c = ecg.A;
   public static final ech d = ecg.t;
   private static final Map<jc.a, fgw> f = fgt.a(dno.a(16.0, 16.0, 4.0));
   private static final Map<jc.a, fgw> g = Maps.newEnumMap(ag.a(f, (Function<? super fgw, fgw>)($$0 -> fgt.a($$0, dno.b(16.0, 13.0, 16.0), fgg.e))));
   private static final Map<jc.a, fgw> h = fgt.a(dno.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jc.a, fgw> i = fgt.a(dno.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jc.a, fgw> D = fgt.a(fgt.a(dno.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dno.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jc.a, fgw> R = Maps.newEnumMap(ag.a(D, (Function<? super fgw, fgw>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ede S;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(ede $$0, ebp.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      jc.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      jc.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      jc.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fgt.a() : i.get($$3);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      jc.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fgt.a() : h.get($$4);
   }

   @Override
   protected fgw d_(ebq $$0) {
      jc.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
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
   public ebq a(ded $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      jc $$4 = $$0.g();
      jc.a $$5 = $$4.o();
      boolean $$6 = $$5 == jc.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jc.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(ebq $$0) {
      return $$0.a(axn.N);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jc $$5 = $$3.cO();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), awz.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? egq.h : egq.d, $$2);
      return bvc.a;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), awz.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? egq.d : egq.h, $$2, egq.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), awz.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? egq.h : egq.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(ebq $$0, jc $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
