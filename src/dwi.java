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

public class dwi extends dwj {
   private static final Codec<Either<aez, dyv>> a = Codec.of(dwi::a, aez.a.map(Either::left));
   public static final Codec<dwi> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwi::new));
   protected final Either<aez, dyv> c;
   protected final he<dyt> d;

   private static <T> DataResult<T> a(Either<aez, dyv> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aez> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aez.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwi> RecordCodecBuilder<E, he<dyt>> b() {
      return dyu.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwi> RecordCodecBuilder<E, Either<aez, dyv>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwi(Either<aez, dyv> $$0, he<dyt> $$1, dwl.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public hy a(dyw $$0, czn $$1) {
      dyv $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dyv a(dyw $$0) {
      return (dyv)this.c.map($$0::a, Function.identity());
   }

   public List<dyv.c> a(dyw $$0, gw $$1, czn $$2, boolean $$3) {
      dyv $$4 = this.a($$0);
      List<dyv.c> $$5 = $$4.a($$1, new dyr().a($$2), cte.pa, $$3);
      List<dyv.c> $$6 = Lists.newArrayList();

      for (dyv.c $$7 : $$5) {
         qw $$8 = $$7.c();
         if ($$8 != null) {
            dgn $$9 = dgn.valueOf($$8.l("mode"));
            if ($$9 == dgn.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dyv.c> a(dyw $$0, gw $$1, czn $$2, ash $$3) {
      dyv $$4 = this.a($$0);
      ObjectArrayList<dyv.c> $$5 = $$4.a($$1, new dyr().a($$2), cte.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public duu a(dyw $$0, gw $$1, czn $$2) {
      dyv $$3 = this.a($$0);
      return $$3.b(new dyr().a($$2), $$1);
   }

   @Override
   public boolean a(dyw $$0, cqv $$1, cqt $$2, dha $$3, gw $$4, gw $$5, czn $$6, duu $$7, ash $$8, boolean $$9) {
      dyv $$10 = this.a($$0);
      dyr $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dyv.c $$13 : dyv.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dyr a(czn $$0, duu $$1, boolean $$2) {
      dyr $$3 = new dyr();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dxx.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dyd.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwk<?> a() {
      return dwk.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
