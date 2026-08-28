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

public class eot extends eou {
   private static final Comparator<ero.a> a = Comparator.comparingInt(ero.a::g).reversed();
   private static final Codec<Either<akv, ero>> g = Codec.of(eot::a, akv.a.map(Either::left));
   public static final MapCodec<eot> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eot::new));
   protected final Either<akv, ero> c;
   protected final jr<erm> d;
   protected final Optional<eqy> e;

   private static <T> DataResult<T> a(Either<akv, ero> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akv> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akv.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eot> RecordCodecBuilder<E, jr<erm>> b() {
      return ern.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eot> RecordCodecBuilder<E, Optional<eqy>> c() {
      return eqy.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eot> RecordCodecBuilder<E, Either<akv, ero>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eot(Either<akv, ero> $$0, jr<erm> $$1, eow.a $$2, Optional<eqy> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public km a(erp $$0, dqe $$1) {
      ero $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ero a(erp $$0) {
      return (ero)this.c.map($$0::a, Function.identity());
   }

   public List<ero.d> a(erp $$0, ji $$1, dqe $$2, boolean $$3) {
      ero $$4 = this.a($$0);
      List<ero.d> $$5 = $$4.a($$1, new erk().a($$2), djo.pC, $$3);
      List<ero.d> $$6 = Lists.newArrayList();

      for (ero.d $$7 : $$5) {
         tq $$8 = $$7.c();
         if ($$8 != null) {
            dyg $$9 = dyg.valueOf($$8.l("mode"));
            if ($$9 == dyg.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ero.a> a(erp $$0, ji $$1, dqe $$2, azh $$3) {
      List<ero.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ero.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public ene a(erp $$0, ji $$1, dqe $$2) {
      ero $$3 = this.a($$0);
      return $$3.b(new erk().a($$2), $$1);
   }

   @Override
   public boolean a(erp $$0, dhg $$1, dhe $$2, dyt $$3, ji $$4, ji $$5, dqe $$6, ene $$7, azh $$8, eqy $$9, boolean $$10) {
      ero $$11 = this.a($$0);
      erk $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ero.d $$14 : ero.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected erk a(dqe $$0, ene $$1, eqy $$2, boolean $$3) {
      erk $$4 = new erk();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eqp.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eqv.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eov<?> a() {
      return eov.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
