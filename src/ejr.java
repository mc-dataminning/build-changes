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

public class ejr extends ejs {
   private static final Codec<Either<alf, eml>> a = Codec.of(ejr::a, alf.a.map(Either::left));
   public static final MapCodec<ejr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejr::new));
   protected final Either<alf, eml> c;
   protected final ji<emj> d;

   private static <T> DataResult<T> a(Either<alf, eml> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alf> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alf.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ejr> RecordCodecBuilder<E, ji<emj>> b() {
      return emk.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ejr> RecordCodecBuilder<E, Either<alf, eml>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ejr(Either<alf, eml> $$0, ji<emj> $$1, eju.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public kd a(emm $$0, dln $$1) {
      eml $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eml a(emm $$0) {
      return (eml)this.c.map($$0::a, Function.identity());
   }

   public List<eml.c> a(emm $$0, iz $$1, dln $$2, boolean $$3) {
      eml $$4 = this.a($$0);
      List<eml.c> $$5 = $$4.a($$1, new emh().a($$2), dfc.pa, $$3);
      List<eml.c> $$6 = Lists.newArrayList();

      for (eml.c $$7 : $$5) {
         us $$8 = $$7.c();
         if ($$8 != null) {
            dtn $$9 = dtn.valueOf($$8.l("mode"));
            if ($$9 == dtn.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eml.c> a(emm $$0, iz $$1, dln $$2, azh $$3) {
      eml $$4 = this.a($$0);
      ObjectArrayList<eml.c> $$5 = $$4.a($$1, new emh().a($$2), dfc.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<eml.c> $$0) {
      $$0.sort(Comparator.<eml.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public eid a(emm $$0, iz $$1, dln $$2) {
      eml $$3 = this.a($$0);
      return $$3.b(new emh().a($$2), $$1);
   }

   @Override
   public boolean a(emm $$0, dcu $$1, dcs $$2, dua $$3, iz $$4, iz $$5, dln $$6, eid $$7, azh $$8, boolean $$9) {
      eml $$10 = this.a($$0);
      emh $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (eml.c $$13 : eml.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected emh a(dln $$0, eid $$1, boolean $$2) {
      emh $$3 = new emh();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(eln.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(elt.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public ejt<?> a() {
      return ejt.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
