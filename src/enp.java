import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class enp extends enq {
   private static final Codec<Either<alj, eqk>> a = Codec.of(enp::a, alj.a.map(Either::left));
   public static final MapCodec<enp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, enp::new));
   protected final Either<alj, eqk> c;
   protected final jq<eqi> d;
   protected final Optional<epu> e;

   private static <T> DataResult<T> a(Either<alj, eqk> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alj> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alj.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends enp> RecordCodecBuilder<E, jq<eqi>> b() {
      return eqj.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends enp> RecordCodecBuilder<E, Optional<epu>> c() {
      return epu.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends enp> RecordCodecBuilder<E, Either<alj, eqk>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected enp(Either<alj, eqk> $$0, jq<eqi> $$1, ens.a $$2, Optional<epu> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(eql $$0, dpd $$1) {
      eqk $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eqk a(eql $$0) {
      return (eqk)this.c.map($$0::a, Function.identity());
   }

   public List<eqk.c> a(eql $$0, jh $$1, dpd $$2, boolean $$3) {
      eqk $$4 = this.a($$0);
      List<eqk.c> $$5 = $$4.a($$1, new eqg().a($$2), dis.pa, $$3);
      List<eqk.c> $$6 = Lists.newArrayList();

      for (eqk.c $$7 : $$5) {
         ul $$8 = $$7.c();
         if ($$8 != null) {
            dxe $$9 = dxe.valueOf($$8.l("mode"));
            if ($$9 == dxe.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eqk.c> a(eql $$0, jh $$1, dpd $$2, azu $$3) {
      eqk $$4 = this.a($$0);
      ObjectArrayList<eqk.c> $$5 = $$4.a($$1, new eqg().a($$2), dis.pb, true);
      ae.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<eqk.c> $$0) {
      $$0.sort(Comparator.<eqk.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ema a(eql $$0, jh $$1, dpd $$2) {
      eqk $$3 = this.a($$0);
      return $$3.b(new eqg().a($$2), $$1);
   }

   @Override
   public boolean a(eql $$0, dgk $$1, dgi $$2, dxr $$3, jh $$4, jh $$5, dpd $$6, ema $$7, azu $$8, epu $$9, boolean $$10) {
      eqk $$11 = this.a($$0);
      eqg $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (eqk.c $$14 : eqk.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eqg a(dpd $$0, ema $$1, epu $$2, boolean $$3) {
      eqg $$4 = new eqg();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(epl.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(epr.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public enr<?> a() {
      return enr.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
