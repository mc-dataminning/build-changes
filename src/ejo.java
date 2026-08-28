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

public class ejo extends ejp {
   private static final Codec<Either<ale, emi>> a = Codec.of(ejo::a, ale.a.map(Either::left));
   public static final MapCodec<ejo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejo::new));
   protected final Either<ale, emi> c;
   protected final ji<emg> d;

   private static <T> DataResult<T> a(Either<ale, emi> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<ale> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : ale.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejo> RecordCodecBuilder<E, ji<emg>> b() {
      return emh.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejo> RecordCodecBuilder<E, Either<ale, emi>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejo(Either<ale, emi> $$0, ji<emg> $$1, ejr.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(emj $$0, dlk $$1) {
      emi $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emi a(emj $$0) {
      return (emi)this.c.map($$0::a, Function.identity());
   }

   public List<emi.c> a(emj $$0, iz $$1, dlk $$2, boolean $$3) {
      emi $$4 = this.a($$0);
      List<emi.c> $$5 = $$4.a($$1, new eme().a($$2), dez.pa, $$3);
      List<emi.c> $$6 = Lists.newArrayList();

      for (emi.c $$7 : $$5) {
         ur $$8 = $$7.c();
         if ($$8 != null) {
            dtk $$9 = dtk.valueOf($$8.l("mode"));
            if ($$9 == dtk.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emi.c> a(emj $$0, iz $$1, dlk $$2, azf $$3) {
      emi $$4 = this.a($$0);
      ObjectArrayList<emi.c> $$5 = $$4.a($$1, new eme().a($$2), dez.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emi.c> $$0) {
      $$0.sort(Comparator.<emi.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eia a(emj $$0, iz $$1, dlk $$2) {
      emi $$3 = this.a($$0);
      return $$3.b(new eme().a($$2), $$1);
   }

   @Override
   public boolean a(emj $$0, dcr $$1, dcp $$2, dtx $$3, iz $$4, iz $$5, dlk $$6, eia $$7, azf $$8, boolean $$9) {
      emi $$10 = this.a($$0);
      eme $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emi.c $$13 : emi.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eme a(dlk $$0, eia $$1, boolean $$2) {
      eme $$3 = new eme();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(elk.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(elq.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejq<?> a() {
      return ejq.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
