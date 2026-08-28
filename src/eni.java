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

public class eni extends enj {
   private static final Codec<Either<all, eqd>> a = Codec.of(eni::a, all.a.map(Either::left));
   public static final MapCodec<eni> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eni::new));
   protected final Either<all, eqd> c;
   protected final jq<eqb> d;
   protected final Optional<epn> e;

   private static <T> DataResult<T> a(Either<all, eqd> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<all> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : all.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eni> RecordCodecBuilder<E, jq<eqb>> b() {
      return eqc.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eni> RecordCodecBuilder<E, Optional<epn>> c() {
      return epn.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eni> RecordCodecBuilder<E, Either<all, eqd>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eni(Either<all, eqd> $$0, jq<eqb> $$1, enl.a $$2, Optional<epn> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kl a(eqe $$0, dow $$1) {
      eqd $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eqd a(eqe $$0) {
      return (eqd)this.c.map($$0::a, Function.identity());
   }

   public List<eqd.c> a(eqe $$0, jh $$1, dow $$2, boolean $$3) {
      eqd $$4 = this.a($$0);
      List<eqd.c> $$5 = $$4.a($$1, new epz().a($$2), dil.pa, $$3);
      List<eqd.c> $$6 = Lists.newArrayList();

      for (eqd.c $$7 : $$5) {
         un $$8 = $$7.c();
         if ($$8 != null) {
            dwx $$9 = dwx.valueOf($$8.l("mode"));
            if ($$9 == dwx.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eqd.c> a(eqe $$0, jh $$1, dow $$2, azv $$3) {
      eqd $$4 = this.a($$0);
      ObjectArrayList<eqd.c> $$5 = $$4.a($$1, new epz().a($$2), dil.pb, true);
      ae.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<eqd.c> $$0) {
      $$0.sort(Comparator.<eqd.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public elt a(eqe $$0, jh $$1, dow $$2) {
      eqd $$3 = this.a($$0);
      return $$3.b(new epz().a($$2), $$1);
   }

   @Override
   public boolean a(eqe $$0, dgd $$1, dgb $$2, dxk $$3, jh $$4, jh $$5, dow $$6, elt $$7, azv $$8, epn $$9, boolean $$10) {
      eqd $$11 = this.a($$0);
      epz $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (eqd.c $$14 : eqd.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected epz a(dow $$0, elt $$1, epn $$2, boolean $$3) {
      epz $$4 = new epz();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(epe.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(epk.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public enk<?> a() {
      return enk.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
