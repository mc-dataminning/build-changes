import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqf extends drf {
   public static final MapCodec<dqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dqf::new)
   );
   public static final ebx b = ebw.y;
   public static final ebx c = ebw.A;
   public static final ebx d = ebw.t;
   private static final Map<jc.a, fgm> f = fgj.a(dne.a(16.0, 16.0, 4.0));
   private static final Map<jc.a, fgm> g = Maps.newEnumMap(ag.a(f, (Function<? super fgm, fgm>)($$0 -> fgj.a($$0, dne.b(16.0, 13.0, 16.0), ffw.e))));
   private static final Map<jc.a, fgm> h = fgj.a(dne.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jc.a, fgm> i = fgj.a(dne.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jc.a, fgm> D = fgj.a(fgj.a(dne.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dne.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jc.a, fgm> R = Maps.newEnumMap(ag.a(D, (Function<? super fgm, fgm>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ecu S;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(ecu $$0, ebf.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      jc.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      jc.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      jc.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fgj.a() : i.get($$3);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      jc.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fgj.a() : h.get($$4);
   }

   @Override
   protected fgm d_(ebg $$0) {
      jc.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
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
   public ebg a(ddt $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      jc $$4 = $$0.g();
      jc.a $$5 = $$4.o();
      boolean $$6 = $$5 == jc.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jc.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(ebg $$0) {
      return $$0.a(axg.N);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), aws.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? egg.h : egg.d, $$2);
      return but.a;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), aws.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? egg.d : egg.h, $$2, egg.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), aws.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? egg.h : egg.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(ebg $$0, jc $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
