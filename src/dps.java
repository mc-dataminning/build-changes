import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dps extends dqs {
   public static final MapCodec<dps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter($$0x -> $$0x.S), t()).apply($$0, dps::new)
   );
   public static final ebk b = ebj.y;
   public static final ebk c = ebj.A;
   public static final ebk d = ebj.t;
   private static final Map<jb.a, ffw> f = fft.a(dmr.a(16.0, 16.0, 4.0));
   private static final Map<jb.a, ffw> g = Maps.newEnumMap(ag.a(f, (Function<? super ffw, ffw>)($$0 -> fft.a($$0, dmr.b(16.0, 13.0, 16.0), ffg.e))));
   private static final Map<jb.a, ffw> h = fft.a(dmr.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jb.a, ffw> i = fft.a(dmr.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jb.a, ffw> D = fft.a(fft.a(dmr.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dmr.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jb.a, ffw> R = Maps.newEnumMap(ag.a(D, (Function<? super ffw, ffw>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ech S;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(ech $$0, eas.d $$1) {
      super($$1.a($$0.d()));
      this.S = $$0;
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      jb.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      jb.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      jb.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fft.a() : i.get($$3);
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      jb.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fft.a() : h.get($$4);
   }

   @Override
   protected ffw d_(eat $$0) {
      jb.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? R : D).get($$1);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
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
   public eat a(ddg $$0) {
      djm $$1 = $$0.q();
      iv $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      jb $$4 = $$0.g();
      jb.a $$5 = $$4.o();
      boolean $$6 = $$5 == jb.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jb.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(eat $$0) {
      return $$0.a(axc.N);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
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
      $$1.a($$3, $$6 ? eft.h : eft.d, $$2);
      return bug.a;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.S.f() : this.S.g(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eft.d : eft.h, $$2, eft.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.S.g() : this.S.f(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eft.h : eft.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(eat $$0, jb $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
