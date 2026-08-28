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

public class ekt extends eku {
   private static final Codec<Either<akq, enn>> a = Codec.of(ekt::a, akq.a.map(Either::left));
   public static final MapCodec<ekt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ekt::new));
   protected final Either<akq, enn> c;
   protected final jm<enl> d;

   private static <T> DataResult<T> a(Either<akq, enn> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akq> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akq.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ekt> RecordCodecBuilder<E, jm<enl>> b() {
      return enm.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ekt> RecordCodecBuilder<E, Either<akq, enn>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ekt(Either<akq, enn> $$0, jm<enl> $$1, ekw.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kh a(eno $$0, dmk $$1) {
      enn $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private enn a(eno $$0) {
      return (enn)this.c.map($$0::a, Function.identity());
   }

   public List<enn.c> a(eno $$0, jd $$1, dmk $$2, boolean $$3) {
      enn $$4 = this.a($$0);
      List<enn.c> $$5 = $$4.a($$1, new enj().a($$2), dfy.pa, $$3);
      List<enn.c> $$6 = Lists.newArrayList();

      for (enn.c $$7 : $$5) {
         ua $$8 = $$7.c();
         if ($$8 != null) {
            duk $$9 = duk.valueOf($$8.l("mode"));
            if ($$9 == duk.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<enn.c> a(eno $$0, jd $$1, dmk $$2, ayv $$3) {
      enn $$4 = this.a($$0);
      ObjectArrayList<enn.c> $$5 = $$4.a($$1, new enj().a($$2), dfy.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<enn.c> $$0) {
      $$0.sort(Comparator.<enn.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eje a(eno $$0, jd $$1, dmk $$2) {
      enn $$3 = this.a($$0);
      return $$3.b(new enj().a($$2), $$1);
   }

   @Override
   public boolean a(eno $$0, ddq $$1, ddo $$2, dux $$3, jd $$4, jd $$5, dmk $$6, eje $$7, ayv $$8, boolean $$9) {
      enn $$10 = this.a($$0);
      enj $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (enn.c $$13 : enn.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected enj a(dmk $$0, eje $$1, boolean $$2) {
      enj $$3 = new enj();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(emp.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(emv.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ekv<?> a() {
      return ekv.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
