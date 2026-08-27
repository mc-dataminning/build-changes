import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dwq extends dwr {
   private static final Codec<Either<aey, dzd>> a = Codec.of(dwq::a, aey.a.map(Either::left));
   public static final Codec<dwq> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwq::new));
   protected final Either<aey, dzd> c;
   protected final hg<dzb> d;

   private static <T> DataResult<T> a(Either<aey, dzd> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aey> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aey.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwq> RecordCodecBuilder<E, hg<dzb>> b() {
      return dzc.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwq> RecordCodecBuilder<E, Either<aey, dzd>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwq(Either<aey, dzd> $$0, hg<dzb> $$1, dwt.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ib a(dze $$0, czj $$1) {
      dzd $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dzd a(dze $$0) {
      return (dzd)this.c.map($$0::a, Function.identity());
   }

   public List<dzd.c> a(dze $$0, gw $$1, czj $$2, boolean $$3) {
      dzd $$4 = this.a($$0);
      List<dzd.c> $$5 = $$4.a($$1, new dyz().a($$2), csy.pa, $$3);
      List<dzd.c> $$6 = Lists.newArrayList();

      for (dzd.c $$7 : $$5) {
         qy $$8 = $$7.c();
         if ($$8 != null) {
            dgv $$9 = dgv.valueOf($$8.l("mode"));
            if ($$9 == dgv.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dzd.c> a(dze $$0, gw $$1, czj $$2, ase $$3) {
      dzd $$4 = this.a($$0);
      ObjectArrayList<dzd.c> $$5 = $$4.a($$1, new dyz().a($$2), csy.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dvc a(dze $$0, gw $$1, czj $$2) {
      dzd $$3 = this.a($$0);
      return $$3.b(new dyz().a($$2), $$1);
   }

   @Override
   public boolean a(dze $$0, cqr $$1, cqp $$2, dhi $$3, gw $$4, gw $$5, czj $$6, dvc $$7, ase $$8, boolean $$9) {
      dzd $$10 = this.a($$0);
      dyz $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dzd.c $$13 : dzd.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dyz a(czj $$0, dvc $$1, boolean $$2) {
      dyz $$3 = new dyz();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dyf.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dyl.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dws<?> a() {
      return dws.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
