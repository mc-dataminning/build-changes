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

public class ejl extends ejm {
   private static final Codec<Either<alb, emf>> a = Codec.of(ejl::a, alb.a.map(Either::left));
   public static final MapCodec<ejl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejl::new));
   protected final Either<alb, emf> c;
   protected final ji<emd> d;

   private static <T> DataResult<T> a(Either<alb, emf> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alb> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alb.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejl> RecordCodecBuilder<E, ji<emd>> b() {
      return eme.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejl> RecordCodecBuilder<E, Either<alb, emf>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejl(Either<alb, emf> $$0, ji<emd> $$1, ejo.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(emg $$0, dlh $$1) {
      emf $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private emf a(emg $$0) {
      return (emf)this.c.map($$0::a, Function.identity());
   }

   public List<emf.c> a(emg $$0, iz $$1, dlh $$2, boolean $$3) {
      emf $$4 = this.a($$0);
      List<emf.c> $$5 = $$4.a($$1, new emb().a($$2), dew.pa, $$3);
      List<emf.c> $$6 = Lists.newArrayList();

      for (emf.c $$7 : $$5) {
         ur $$8 = $$7.c();
         if ($$8 != null) {
            dth $$9 = dth.valueOf($$8.l("mode"));
            if ($$9 == dth.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<emf.c> a(emg $$0, iz $$1, dlh $$2, azc $$3) {
      emf $$4 = this.a($$0);
      ObjectArrayList<emf.c> $$5 = $$4.a($$1, new emb().a($$2), dew.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<emf.c> $$0) {
      $$0.sort(Comparator.<emf.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ehx a(emg $$0, iz $$1, dlh $$2) {
      emf $$3 = this.a($$0);
      return $$3.b(new emb().a($$2), $$1);
   }

   @Override
   public boolean a(emg $$0, dco $$1, dcm $$2, dtu $$3, iz $$4, iz $$5, dlh $$6, ehx $$7, azc $$8, boolean $$9) {
      emf $$10 = this.a($$0);
      emb $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (emf.c $$13 : emf.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emb a(dlh $$0, ehx $$1, boolean $$2) {
      emb $$3 = new emb();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(elh.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(eln.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejn<?> a() {
      return ejn.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
