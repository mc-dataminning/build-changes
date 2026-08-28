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

public class eor extends eos {
   private static final Comparator<erm.a> a = Comparator.comparingInt(erm.a::g).reversed();
   private static final Codec<Either<aku, erm>> g = Codec.of(eor::a, aku.a.map(Either::left));
   public static final MapCodec<eor> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eor::new));
   protected final Either<aku, erm> c;
   protected final jr<erk> d;
   protected final Optional<eqw> e;

   private static <T> DataResult<T> a(Either<aku, erm> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aku> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aku.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eor> RecordCodecBuilder<E, jr<erk>> b() {
      return erl.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eor> RecordCodecBuilder<E, Optional<eqw>> c() {
      return eqw.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eor> RecordCodecBuilder<E, Either<aku, erm>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eor(Either<aku, erm> $$0, jr<erk> $$1, eou.a $$2, Optional<eqw> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public km a(ern $$0, dqc $$1) {
      erm $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private erm a(ern $$0) {
      return (erm)this.c.map($$0::a, Function.identity());
   }

   public List<erm.d> a(ern $$0, ji $$1, dqc $$2, boolean $$3) {
      erm $$4 = this.a($$0);
      List<erm.d> $$5 = $$4.a($$1, new eri().a($$2), djm.pC, $$3);
      List<erm.d> $$6 = Lists.newArrayList();

      for (erm.d $$7 : $$5) {
         tq $$8 = $$7.c();
         if ($$8 != null) {
            dye $$9 = dye.valueOf($$8.l("mode"));
            if ($$9 == dye.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<erm.a> a(ern $$0, ji $$1, dqc $$2, azg $$3) {
      List<erm.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<erm.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public enc a(ern $$0, ji $$1, dqc $$2) {
      erm $$3 = this.a($$0);
      return $$3.b(new eri().a($$2), $$1);
   }

   @Override
   public boolean a(ern $$0, dhe $$1, dhc $$2, dyr $$3, ji $$4, ji $$5, dqc $$6, enc $$7, azg $$8, eqw $$9, boolean $$10) {
      erm $$11 = this.a($$0);
      eri $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (erm.d $$14 : erm.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eri a(dqc $$0, enc $$1, eqw $$2, boolean $$3) {
      eri $$4 = new eri();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eqn.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eqt.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eot<?> a() {
      return eot.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
