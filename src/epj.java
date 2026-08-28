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

public class epj extends epk {
   private static final Comparator<ese.a> a = Comparator.comparingInt(ese.a::g).reversed();
   private static final Codec<Either<alz, ese>> g = Codec.of(epj::a, alz.a.map(Either::left));
   public static final MapCodec<epj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epj::new));
   protected final Either<alz, ese> c;
   protected final jq<esc> d;
   protected final Optional<ero> e;

   private static <T> DataResult<T> a(Either<alz, ese> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alz> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alz.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends epj> RecordCodecBuilder<E, jq<esc>> b() {
      return esd.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends epj> RecordCodecBuilder<E, Optional<ero>> c() {
      return ero.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends epj> RecordCodecBuilder<E, Either<alz, ese>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected epj(Either<alz, ese> $$0, jq<esc> $$1, epm.a $$2, Optional<ero> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(esf $$0, dqu $$1) {
      ese $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ese a(esf $$0) {
      return (ese)this.c.map($$0::a, Function.identity());
   }

   public List<ese.d> a(esf $$0, jh $$1, dqu $$2, boolean $$3) {
      ese $$4 = this.a($$0);
      List<ese.d> $$5 = $$4.a($$1, new esa().a($$2), dkg.pv, $$3);
      List<ese.d> $$6 = Lists.newArrayList();

      for (ese.d $$7 : $$5) {
         ux $$8 = $$7.c();
         if ($$8 != null) {
            dyw $$9 = dyw.valueOf($$8.l("mode"));
            if ($$9 == dyw.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ese.a> a(esf $$0, jh $$1, dqu $$2, bam $$3) {
      List<ese.a> $$4 = this.a($$0).a($$1, $$2);
      ae.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<ese.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public enu a(esf $$0, jh $$1, dqu $$2) {
      ese $$3 = this.a($$0);
      return $$3.b(new esa().a($$2), $$1);
   }

   @Override
   public boolean a(esf $$0, dhy $$1, dhw $$2, dzj $$3, jh $$4, jh $$5, dqu $$6, enu $$7, bam $$8, ero $$9, boolean $$10) {
      ese $$11 = this.a($$0);
      esa $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ese.d $$14 : ese.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected esa a(dqu $$0, enu $$1, ero $$2, boolean $$3) {
      esa $$4 = new esa();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(erf.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(erl.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public epl<?> a() {
      return epl.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
