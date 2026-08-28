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

public class ejs extends ejt {
   private static final Codec<Either<alf, emm>> a = Codec.of(ejs::a, alf.a.map(Either::left));
   public static final MapCodec<ejs> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejs::new));
   protected final Either<alf, emm> c;
   protected final ji<emk> d;

   private static <T> DataResult<T> a(Either<alf, emm> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alf> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alf.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejs> RecordCodecBuilder<E, ji<emk>> b() {
      return eml.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejs> RecordCodecBuilder<E, Either<alf, emm>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejs(Either<alf, emm> $$0, ji<emk> $$1, ejv.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(emn $$0, dlo $$1) {
      emm $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emm a(emn $$0) {
      return (emm)this.c.map($$0::a, Function.identity());
   }

   public List<emm.c> a(emn $$0, iz $$1, dlo $$2, boolean $$3) {
      emm $$4 = this.a($$0);
      List<emm.c> $$5 = $$4.a($$1, new emi().a($$2), dfd.pa, $$3);
      List<emm.c> $$6 = Lists.newArrayList();

      for (emm.c $$7 : $$5) {
         us $$8 = $$7.c();
         if ($$8 != null) {
            dto $$9 = dto.valueOf($$8.l("mode"));
            if ($$9 == dto.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emm.c> a(emn $$0, iz $$1, dlo $$2, azh $$3) {
      emm $$4 = this.a($$0);
      ObjectArrayList<emm.c> $$5 = $$4.a($$1, new emi().a($$2), dfd.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emm.c> $$0) {
      $$0.sort(Comparator.<emm.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eie a(emn $$0, iz $$1, dlo $$2) {
      emm $$3 = this.a($$0);
      return $$3.b(new emi().a($$2), $$1);
   }

   @Override
   public boolean a(emn $$0, dcv $$1, dct $$2, dub $$3, iz $$4, iz $$5, dlo $$6, eie $$7, azh $$8, boolean $$9) {
      emm $$10 = this.a($$0);
      emi $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emm.c $$13 : emm.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emi a(dlo $$0, eie $$1, boolean $$2) {
      emi $$3 = new emi();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(elo.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(elu.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eju<?> a() {
      return eju.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
