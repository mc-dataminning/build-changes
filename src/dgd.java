import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dgd extends dha {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dru.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dgd::new)
   );
   public static final dqy b = dqx.u;
   public static final dqy c = dqx.w;
   public static final dqy d = dqx.q;
   protected static final eui e = dde.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eui f = dde.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eui g = dde.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eui h = dde.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eui i = dde.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eui j = dde.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eui k = dde.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eui l = dde.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eui m = euf.a(dde.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dde.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eui n = euf.a(dde.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dde.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eui o = euf.a(dde.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dde.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eui F = euf.a(dde.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dde.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dru G;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(dru $$0, dqg.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == is.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == is.a.a ? f : e;
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      is.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      if ($$0.c(b)) {
         return euf.a();
      } else {
         return $$0.c(aE).o() == is.a.c ? k : l;
      }
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$0.c(b)) {
         return euf.a();
      } else {
         return $$0.c(aE).o() == is.a.c ? i : j;
      }
   }

   @Override
   protected eui f(dqh $$0, czj $$1, in $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == is.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == is.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
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
   public dqh a(cwi $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      is $$4 = $$0.g();
      is.a $$5 = $$4.o();
      boolean $$6 = $$5 == is.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == is.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dqh $$0) {
      return $$0.a(avr.L);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         is $$5 = $$3.cF();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), avd.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dva.h : dva.d, $$2);
      return bpm.a($$1.B);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), avd.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dva.d : dva.h, $$2, dva.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), avd.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dva.h : dva.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dqh $$0, is $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
