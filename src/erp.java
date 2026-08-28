import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class erp extends erq {
   private static final Comparator<euk.a> a = Comparator.comparingInt(euk.a::g).reversed();
   private static final Codec<Either<ale, euk>> g = Codec.of(erp::a, ale.a.map(Either::left));
   public static final MapCodec<erp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, erp::new));
   protected final Either<ale, euk> c;
   protected final je<eui> d;
   protected final Optional<etu> e;

   private static <T> DataResult<T> a(Either<ale, euk> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ale> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ale.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends erp> RecordCodecBuilder<E, je<eui>> b() {
      return euj.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends erp> RecordCodecBuilder<E, Optional<etu>> c() {
      return etu.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends erp> RecordCodecBuilder<E, Either<ale, euk>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected erp(Either<ale, euk> $$0, je<eui> $$1, ers.a $$2, Optional<etu> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public jz a(eul $$0, dsm $$1) {
      euk $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private euk a(eul $$0) {
      return (euk)this.c.map($$0::a, Function.identity());
   }

   public List<euk.d> a(eul $$0, iu $$1, dsm $$2, boolean $$3) {
      euk $$4 = this.a($$0);
      List<euk.d> $$5 = $$4.a($$1, new eug().a($$2), dlw.pC, $$3);
      List<euk.d> $$6 = Lists.newArrayList();

      for (euk.d $$7 : $$5) {
         tx $$8 = $$7.c();
         if ($$8 != null) {
            eay $$9 = eay.valueOf($$8.l("mode"));
            if ($$9 == eay.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<euk.a> a(eul $$0, iu $$1, dsm $$2, azt $$3) {
      List<euk.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<euk.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eqa a(eul $$0, iu $$1, dsm $$2) {
      euk $$3 = this.a($$0);
      return $$3.b(new eug().a($$2), $$1);
   }

   @Override
   public boolean a(eul $$0, djo $$1, djl $$2, ebm $$3, iu $$4, iu $$5, dsm $$6, eqa $$7, azt $$8, etu $$9, boolean $$10) {
      euk $$11 = this.a($$0);
      eug $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (euk.d $$14 : euk.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eug a(dsm $$0, eqa $$1, etu $$2, boolean $$3) {
      eug $$4 = new eug();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(etl.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(etr.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public err<?> a() {
      return err.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
