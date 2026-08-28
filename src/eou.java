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

public class eou extends eov {
   private static final Comparator<erp.a> a = Comparator.comparingInt(erp.a::g).reversed();
   private static final Codec<Either<akv, erp>> g = Codec.of(eou::a, akv.a.map(Either::left));
   public static final MapCodec<eou> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eou::new));
   protected final Either<akv, erp> c;
   protected final jr<ern> d;
   protected final Optional<eqz> e;

   private static <T> DataResult<T> a(Either<akv, erp> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akv> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akv.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eou> RecordCodecBuilder<E, jr<ern>> b() {
      return ero.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eou> RecordCodecBuilder<E, Optional<eqz>> c() {
      return eqz.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eou> RecordCodecBuilder<E, Either<akv, erp>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eou(Either<akv, erp> $$0, jr<ern> $$1, eox.a $$2, Optional<eqz> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public km a(erq $$0, dqf $$1) {
      erp $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private erp a(erq $$0) {
      return (erp)this.c.map($$0::a, Function.identity());
   }

   public List<erp.d> a(erq $$0, ji $$1, dqf $$2, boolean $$3) {
      erp $$4 = this.a($$0);
      List<erp.d> $$5 = $$4.a($$1, new erl().a($$2), djp.pC, $$3);
      List<erp.d> $$6 = Lists.newArrayList();

      for (erp.d $$7 : $$5) {
         tq $$8 = $$7.c();
         if ($$8 != null) {
            dyh $$9 = dyh.valueOf($$8.l("mode"));
            if ($$9 == dyh.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<erp.a> a(erq $$0, ji $$1, dqf $$2, azh $$3) {
      List<erp.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<erp.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public enf a(erq $$0, ji $$1, dqf $$2) {
      erp $$3 = this.a($$0);
      return $$3.b(new erl().a($$2), $$1);
   }

   @Override
   public boolean a(erq $$0, dhh $$1, dhf $$2, dyu $$3, ji $$4, ji $$5, dqf $$6, enf $$7, azh $$8, eqz $$9, boolean $$10) {
      erp $$11 = this.a($$0);
      erl $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (erp.d $$14 : erp.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected erl a(dqf $$0, enf $$1, eqz $$2, boolean $$3) {
      erl $$4 = new erl();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(eqq.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(eqw.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eow<?> a() {
      return eow.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
