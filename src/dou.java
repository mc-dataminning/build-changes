import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dou extends dpt {
   public static final MapCodec<dou> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter($$0x -> $$0x.R), t()).apply($$0, dou::new)
   );
   public static final eaf b = eae.y;
   public static final eaf c = eae.A;
   public static final eaf d = eae.t;
   private static final Map<ja.a, feq> f = fen.a(dlu.a(16.0, 16.0, 4.0));
   private static final Map<ja.a, feq> g = Maps.newEnumMap(af.a(f, (Function<? super feq, feq>)($$0 -> fen.a($$0, dlu.b(16.0, 13.0, 16.0), fea.e))));
   private static final Map<ja.a, feq> h = fen.a(dlu.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<ja.a, feq> i = fen.a(dlu.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<ja.a, feq> C = fen.a(fen.a(dlu.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dlu.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<ja.a, feq> Q = Maps.newEnumMap(af.a(C, (Function<? super feq, feq>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final ebc R;

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(ebc $$0, dzn.d $$1) {
      super($$1.a($$0.d()));
      this.R = $$0;
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      ja.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      ja.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      ja.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fen.a() : i.get($$3);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      ja.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fen.a() : h.get($$4);
   }

   @Override
   protected feq d_(dzo $$0) {
      ja.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? Q : C).get($$1);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
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
   public dzo a(dcl $$0) {
      dip $$1 = $$0.q();
      iu $$2 = $$0.a();
      boolean $$3 = $$1.D($$2);
      ja $$4 = $$0.g();
      ja.a $$5 = $$4.o();
      boolean $$6 = $$5 == ja.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == ja.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dzo $$0) {
      return $$0.a(axa.N);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
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
      $$1.a($$3, $$2, $$6 ? this.R.g() : this.R.f(), awm.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eeo.h : eeo.d, $$2);
      return bty.a;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.R.f() : this.R.g(), awm.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eeo.d : eeo.h, $$2, eeo.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.R.g() : this.R.f(), awm.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eeo.h : eeo.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(dzo $$0, ja $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
