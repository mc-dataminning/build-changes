import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlo extends dml {
   public static final MapCodec<dlo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxh.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dlo::new)
   );
   public static final dwm b = dwl.u;
   public static final dwm c = dwl.w;
   public static final dwm d = dwl.q;
   protected static final fas e = diq.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fas f = diq.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fas g = diq.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fas h = diq.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fas i = diq.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fas j = diq.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fas k = diq.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fas l = diq.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fas m = fap.a(diq.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), diq.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fas n = fap.a(diq.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), diq.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fas o = fap.a(diq.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), diq.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fas G = fap.a(diq.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), diq.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dxh H;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(dxh $$0, dvu.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jm.a.a ? f : e;
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      jm.a $$8 = $$4.o();
      if ($$0.c(aF).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      if ($$0.c(b)) {
         return fap.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? k : l;
      }
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$0.c(b)) {
         return fap.a();
      } else {
         return $$0.c(aF).o() == jm.a.c ? i : j;
      }
   }

   @Override
   protected fas d_(dvv $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jm.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jm.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
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
   public dvv a(dad $$0) {
      dfm $$1 = $$0.q();
      jh $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jm $$4 = $$0.g();
      jm.a $$5 = $$4.o();
      boolean $$6 = $$5 == jm.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jm.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dvv $$0) {
      return $$0.a(axc.M);
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awo.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? ear.h : ear.d, $$2);
      return bsk.a;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awo.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? ear.d : ear.h, $$2, ear.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awo.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? ear.h : ear.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dvv $$0, jm $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
