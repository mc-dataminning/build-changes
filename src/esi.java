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

public class esi extends esj {
   private static final Comparator<evd.a> a = Comparator.comparingInt(evd.a::g).reversed();
   private static final Codec<Either<alg, evd>> g = Codec.of(esi::a, alg.a.map(Either::left));
   public static final MapCodec<esi> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, esi::new));
   protected final Either<alg, evd> c;
   protected final je<evb> d;
   protected final Optional<eun> e;

   private static <T> DataResult<T> a(Either<alg, evd> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends esi> RecordCodecBuilder<E, je<evb>> b() {
      return evc.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends esi> RecordCodecBuilder<E, Optional<eun>> c() {
      return eun.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends esi> RecordCodecBuilder<E, Either<alg, evd>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected esi(Either<alg, evd> $$0, je<evb> $$1, esl.a $$2, Optional<eun> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public jz a(eve $$0, dsz $$1) {
      evd $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private evd a(eve $$0) {
      return (evd)this.c.map($$0::a, Function.identity());
   }

   public List<evd.d> a(eve $$0, iu $$1, dsz $$2, boolean $$3) {
      evd $$4 = this.a($$0);
      List<evd.d> $$5 = $$4.a($$1, new euz().a($$2), dmh.pG, $$3);
      List<evd.d> $$6 = Lists.newArrayList();

      for (evd.d $$7 : $$5) {
         tz $$8 = $$7.c();
         if ($$8 != null) {
            ebr $$9 = ebr.valueOf($$8.l("mode"));
            if ($$9 == ebr.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<evd.a> a(eve $$0, iu $$1, dsz $$2, azv $$3) {
      List<evd.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<evd.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eqt a(eve $$0, iu $$1, dsz $$2) {
      evd $$3 = this.a($$0);
      return $$3.b(new euz().a($$2), $$1);
   }

   @Override
   public boolean a(eve $$0, djz $$1, djw $$2, ecf $$3, iu $$4, iu $$5, dsz $$6, eqt $$7, azv $$8, eun $$9, boolean $$10) {
      evd $$11 = this.a($$0);
      euz $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (evd.d $$14 : evd.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected euz a(dsz $$0, eqt $$1, eun $$2, boolean $$3) {
      euz $$4 = new euz();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eue.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(euk.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public esk<?> a() {
      return esk.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
