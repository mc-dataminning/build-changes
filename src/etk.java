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

public class etk extends etl {
   private static final Comparator<ewf.a> a = Comparator.comparingInt(ewf.a::g).reversed();
   private static final Codec<Either<alk, ewf>> g = Codec.of(etk::a, alk.a.map(Either::left));
   public static final MapCodec<etk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, etk::new));
   protected final Either<alk, ewf> c;
   protected final jg<ewd> d;
   protected final Optional<evp> e;

   private static <T> DataResult<T> a(Either<alk, ewf> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alk> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alk.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends etk> RecordCodecBuilder<E, jg<ewd>> b() {
      return ewe.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends etk> RecordCodecBuilder<E, Optional<evp>> c() {
      return evp.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends etk> RecordCodecBuilder<E, Either<alk, ewf>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected etk(Either<alk, ewf> $$0, jg<ewd> $$1, etn.a $$2, Optional<evp> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kb a(ewg $$0, dty $$1) {
      ewf $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ewf a(ewg $$0) {
      return (ewf)this.c.map($$0::a, Function.identity());
   }

   public List<ewf.d> a(ewg $$0, iw $$1, dty $$2, boolean $$3) {
      ewf $$4 = this.a($$0);
      List<ewf.d> $$5 = $$4.a($$1, new ewb().a($$2), dng.pG, $$3);
      List<ewf.d> $$6 = Lists.newArrayList();

      for (ewf.d $$7 : $$5) {
         ua $$8 = $$7.c();
         if ($$8 != null) {
            ecq $$9 = $$8.<ecq>a("mode", ecq.e).orElseThrow();
            if ($$9 == ecq.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ewf.a> a(ewg $$0, iw $$1, dty $$2, azz $$3) {
      List<ewf.a> $$4 = this.a($$0).a($$1, $$2);
      ag.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ewf.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public erv a(ewg $$0, iw $$1, dty $$2) {
      ewf $$3 = this.a($$0);
      return $$3.b(new ewb().a($$2), $$1);
   }

   @Override
   public boolean a(ewg $$0, dky $$1, dkv $$2, ede $$3, iw $$4, iw $$5, dty $$6, erv $$7, azz $$8, evp $$9, boolean $$10) {
      ewf $$11 = this.a($$0);
      ewb $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ewf.d $$14 : ewf.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ewb a(dty $$0, erv $$1, evp $$2, boolean $$3) {
      ewb $$4 = new ewb();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(evg.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(evm.b);
      }

      this.d.a().a().forEach($$4::a);
      this.g().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public etm<?> a() {
      return etm.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }

   @VisibleForTesting
   public alk e() {
      return (alk)this.c.orThrow();
   }
}
