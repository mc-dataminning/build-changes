import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dtg extends dth {
   private static final Codec<Either<acq, dvt>> a = Codec.of(dtg::a, acq.a.map(Either::left));
   public static final Codec<dtg> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dtg::new));
   protected final Either<acq, dvt> c;
   protected final he<dvr> d;

   private static <T> DataResult<T> a(Either<acq, dvt> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<acq> $$3 = $$0.left();
      return !$$3.isPresent() ? DataResult.error(() -> "Can not serialize a runtime pool element") : acq.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dtg> RecordCodecBuilder<E, he<dvr>> b() {
      return dvs.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dtg> RecordCodecBuilder<E, Either<acq, dvt>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dtg(Either<acq, dvt> $$0, he<dvr> $$1, dtj.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public hz a(dvu $$0, cvz $$1) {
      dvt $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dvt a(dvu $$0) {
      return (dvt)this.c.map($$0::a, Function.identity());
   }

   public List<dvt.c> a(dvu $$0, gu $$1, cvz $$2, boolean $$3) {
      dvt $$4 = this.a($$0);
      List<dvt.c> $$5 = $$4.a($$1, new dvp().a($$2), cpo.pa, $$3);
      List<dvt.c> $$6 = Lists.newArrayList();

      for (dvt.c $$7 : $$5) {
         qr $$8 = $$7.c();
         if ($$8 != null) {
            ddl $$9 = ddl.valueOf($$8.l("mode"));
            if ($$9 == ddl.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dvt.c> a(dvu $$0, gu $$1, cvz $$2, apf $$3) {
      dvt $$4 = this.a($$0);
      ObjectArrayList<dvt.c> $$5 = $$4.a($$1, new dvp().a($$2), cpo.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public drs a(dvu $$0, gu $$1, cvz $$2) {
      dvt $$3 = this.a($$0);
      return $$3.b(new dvp().a($$2), $$1);
   }

   @Override
   public boolean a(dvu $$0, cng $$1, cne $$2, ddy $$3, gu $$4, gu $$5, cvz $$6, drs $$7, apf $$8, boolean $$9) {
      dvt $$10 = this.a($$0);
      dvp $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dvt.c $$13 : dvt.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dvp a(cvz $$0, drs $$1, boolean $$2) {
      dvp $$3 = new dvp();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(duv.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dvb.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dti<?> a() {
      return dti.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
