import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpg extends dqg {
   public static final MapCodec<dpg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dpg::new)
   );
   public static final eay b = eax.y;
   public static final eay c = eax.A;
   public static final eay d = eax.t;
   private static final Map<ja.a, ffk> f = ffh.a(dmf.a(16.0, 16.0, 4.0));
   private static final Map<ja.a, ffk> g = Maps.newEnumMap(af.a(f, (Function<? super ffk, ffk>)($$0 -> ffh.a($$0, dmf.b(16.0, 13.0, 16.0), feu.e))));
   private static final Map<ja.a, ffk> h = ffh.a(dmf.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<ja.a, ffk> i = ffh.a(dmf.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<ja.a, ffk> D = ffh.a(ffh.a(dmf.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dmf.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<ja.a, ffk> R = Maps.newEnumMap(af.a(D, (Function<? super ffk, ffk>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ebv S;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(ebv $$0, eag.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      ja.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      ja.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected ffk b_(eah $$0, dig $$1, iu $$2) {
      ja.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? ffh.a() : i.get($$3);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      ja.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? ffh.a() : h.get($$4);
   }

   @Override
   protected ffk d_(eah $$0) {
      ja.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
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
   public eah a(dcw $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      ja $$4 = $$0.g();
      ja.a $$5 = $$4.o();
      boolean $$6 = $$5 == ja.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == ja.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(eah $$0) {
      return $$0.a(axc.N);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ja $$5 = $$3.cO();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? efh.h : efh.d, $$2);
      return bud.a;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? efh.d : efh.h, $$2, efh.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? efh.h : efh.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(eah $$0, ja $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
