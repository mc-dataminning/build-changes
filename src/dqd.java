import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqd extends drd {
   public static final MapCodec<dqd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dqd::new)
   );
   public static final ebv b = ebu.y;
   public static final ebv c = ebu.A;
   public static final ebv d = ebu.t;
   private static final Map<jb.a, fgk> f = fgh.a(dnc.a(16.0, 16.0, 4.0));
   private static final Map<jb.a, fgk> g = Maps.newEnumMap(ag.a(f, (Function<? super fgk, fgk>)($$0 -> fgh.a($$0, dnc.b(16.0, 13.0, 16.0), ffu.e))));
   private static final Map<jb.a, fgk> h = fgh.a(dnc.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jb.a, fgk> i = fgh.a(dnc.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jb.a, fgk> D = fgh.a(fgh.a(dnc.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dnc.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jb.a, fgk> R = Maps.newEnumMap(ag.a(D, (Function<? super fgk, fgk>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ecs S;

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   public dqd(ecs $$0, ebd.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      jb.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      jb.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      jb.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fgh.a() : i.get($$3);
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      jb.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fgh.a() : h.get($$4);
   }

   @Override
   protected fgk d_(ebe $$0) {
      jb.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
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
   public ebe a(ddr $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      jb $$4 = $$0.g();
      jb.a $$5 = $$4.o();
      boolean $$6 = $$5 == jb.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jb.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(ebe $$0) {
      return $$0.a(axe.N);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jb $$5 = $$3.cO();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.S.g() : this.S.f(), awq.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ege.h : ege.d, $$2);
      return bur.a;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), awq.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ege.d : ege.h, $$2, ege.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), awq.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ege.h : ege.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(ebe $$0, jb $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
