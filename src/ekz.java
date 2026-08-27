import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ekz extends ela {
   private static final Codec<Either<akt, ent>> a = Codec.of(ekz::a, akt.a.map(Either::left));
   public static final Codec<ekz> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ekz::new));
   protected final Either<akt, ent> c;
   protected final ja<enr> d;

   private static <T> DataResult<T> a(Either<akt, ent> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akt> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akt.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ekz> RecordCodecBuilder<E, ja<enr>> b() {
      return ens.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ekz> RecordCodecBuilder<E, Either<akt, ent>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ekz(Either<akt, ent> $$0, ja<enr> $$1, elc.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public jv a(enu $$0, dmd $$1) {
      ent $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ent a(enu $$0) {
      return (ent)this.c.map($$0::a, Function.identity());
   }

   public List<ent.c> a(enu $$0, ir $$1, dmd $$2, boolean $$3) {
      ent $$4 = this.a($$0);
      List<ent.c> $$5 = $$4.a($$1, new enp().a($$2), dfe.ql, $$3);
      List<ent.c> $$6 = Lists.newArrayList();

      for (ent.c $$7 : $$5) {
         uk $$8 = $$7.c();
         if ($$8 != null) {
            dum $$9 = dum.valueOf($$8.l("mode"));
            if ($$9 == dum.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<ent.c> a(enu $$0, ir $$1, dmd $$2, ayt $$3) {
      ent $$4 = this.a($$0);
      ObjectArrayList<ent.c> $$5 = $$4.a($$1, new enp().a($$2), dfe.qm, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ent.c> $$0) {
      $$0.sort(Comparator.<ent.c>comparingInt($$0x -> y.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ejl a(enu $$0, ir $$1, dmd $$2) {
      ent $$3 = this.a($$0);
      return $$3.b(new enp().a($$2), $$1);
   }

   @Override
   public boolean a(enu $$0, dcv $$1, dct $$2, duz $$3, ir $$4, ir $$5, dmd $$6, ejl $$7, ayt $$8, boolean $$9) {
      ent $$10 = this.a($$0);
      enp $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (ent.c $$13 : ent.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected enp a(dmd $$0, ejl $$1, boolean $$2) {
      enp $$3 = new enp();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(emv.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(enb.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public elb<?> a() {
      return elb.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
