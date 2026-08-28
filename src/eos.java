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

public class eos extends eot {
   private static final Comparator<ern.a> a = Comparator.comparingInt(ern.a::g).reversed();
   private static final Codec<Either<akv, ern>> g = Codec.of(eos::a, akv.a.map(Either::left));
   public static final MapCodec<eos> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eos::new));
   protected final Either<akv, ern> c;
   protected final jr<erl> d;
   protected final Optional<eqx> e;

   private static <T> DataResult<T> a(Either<akv, ern> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akv> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akv.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eos> RecordCodecBuilder<E, jr<erl>> b() {
      return erm.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eos> RecordCodecBuilder<E, Optional<eqx>> c() {
      return eqx.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eos> RecordCodecBuilder<E, Either<akv, ern>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eos(Either<akv, ern> $$0, jr<erl> $$1, eov.a $$2, Optional<eqx> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public km a(ero $$0, dqd $$1) {
      ern $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ern a(ero $$0) {
      return (ern)this.c.map($$0::a, Function.identity());
   }

   public List<ern.d> a(ero $$0, ji $$1, dqd $$2, boolean $$3) {
      ern $$4 = this.a($$0);
      List<ern.d> $$5 = $$4.a($$1, new erj().a($$2), djn.pC, $$3);
      List<ern.d> $$6 = Lists.newArrayList();

      for (ern.d $$7 : $$5) {
         tq $$8 = $$7.c();
         if ($$8 != null) {
            dyf $$9 = dyf.valueOf($$8.l("mode"));
            if ($$9 == dyf.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ern.a> a(ero $$0, ji $$1, dqd $$2, azh $$3) {
      List<ern.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ern.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public end a(ero $$0, ji $$1, dqd $$2) {
      ern $$3 = this.a($$0);
      return $$3.b(new erj().a($$2), $$1);
   }

   @Override
   public boolean a(ero $$0, dhf $$1, dhd $$2, dys $$3, ji $$4, ji $$5, dqd $$6, end $$7, azh $$8, eqx $$9, boolean $$10) {
      ern $$11 = this.a($$0);
      erj $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ern.d $$14 : ern.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected erj a(dqd $$0, end $$1, eqx $$2, boolean $$3) {
      erj $$4 = new erj();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eqo.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(equ.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eou<?> a() {
      return eou.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
