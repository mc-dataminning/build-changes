import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnu extends dot {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter($$0x -> $$0x.R), t()).apply($$0, dnu::new)
   );
   public static final dzd b = dzc.y;
   public static final dzd c = dzc.A;
   public static final dzd d = dzc.t;
   private static final Map<jo.a, fdo> f = fdl.a(dku.a(16.0, 16.0, 4.0));
   private static final Map<jo.a, fdo> g = Maps.newEnumMap(af.a(f, (Function<? super fdo, fdo>)($$0 -> fdl.a($$0, dku.b(16.0, 13.0, 16.0), fcy.e))));
   private static final Map<jo.a, fdo> h = fdl.a(dku.a(16.0, 4.0, 0.0, 24.0));
   private static final Map<jo.a, fdo> i = fdl.a(dku.a(16.0, 4.0, 5.0, 24.0));
   private static final Map<jo.a, fdo> C = fdl.a(fdl.a(dku.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dku.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0)));
   private static final Map<jo.a, fdo> Q = Maps.newEnumMap(af.a(C, (Function<? super fdo, fdo>)($$0 -> $$0.a(0.0, -0.1875, 0.0).d())));
   private final eaa R;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(eaa $$0, dyl.d $$1) {
      super($$1.a($$0.d()));
      this.R = $$0;
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      jo.a $$4 = $$0.c(e).o();
      return ($$0.c(d) ? g : f).get($$4);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      jo.a $$8 = $$4.o();
      if ($$0.c(e).h().o() != $$8) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$9 = this.o($$6) || this.o($$1.a_($$3.a($$4.g())));
         return $$0.b(d, Boolean.valueOf($$9));
      }
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      jo.a $$3 = $$0.c(e).o();
      return $$0.c(b) ? fdl.a() : i.get($$3);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      jo.a $$4 = $$0.c(e).o();
      return $$0.c(b) ? fdl.a() : h.get($$4);
   }

   @Override
   protected fdo d_(dym $$0) {
      jo.a $$1 = $$0.c(e).o();
      return ($$0.c(d) ? Q : C).get($$1);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
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
   public dym a(dbn $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jo $$4 = $$0.g();
      jo.a $$5 = $$4.o();
      boolean $$6 = $$5 == jo.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jo.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(e, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dym $$0) {
      return $$0.a(awz.N);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jo $$5 = $$3.cO();
         if ($$0.c(e) == $$5.g()) {
            $$0 = $$0.b(e, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.R.g() : this.R.f(), awl.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? edm.h : edm.d, $$2);
      return btq.a;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.R.f() : this.R.g(), awl.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? edm.d : edm.h, $$2, edm.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.R.g() : this.R.f(), awl.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? edm.h : edm.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, b, c, d);
   }

   public static boolean a(dym $$0, jo $$1) {
      return $$0.c(e).o() == $$1.h().o();
   }
}
