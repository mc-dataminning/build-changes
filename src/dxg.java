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

public class dxg extends dxh {
   private static final Codec<Either<afw, dzt>> a = Codec.of(dxg::a, afw.a.map(Either::left));
   public static final Codec<dxg> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dxg::new));
   protected final Either<afw, dzt> c;
   protected final ib<dzr> d;

   private static <T> DataResult<T> a(Either<afw, dzt> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<afw> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : afw.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dxg> RecordCodecBuilder<E, ib<dzr>> b() {
      return dzs.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dxg> RecordCodecBuilder<E, Either<afw, dzt>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dxg(Either<afw, dzt> $$0, ib<dzr> $$1, dxj.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public iw a(dzu $$0, dal $$1) {
      dzt $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dzt a(dzu $$0) {
      return (dzt)this.c.map($$0::a, Function.identity());
   }

   public List<dzt.c> a(dzu $$0, ht $$1, dal $$2, boolean $$3) {
      dzt $$4 = this.a($$0);
      List<dzt.c> $$5 = $$4.a($$1, new dzp().a($$2), cuc.pa, $$3);
      List<dzt.c> $$6 = Lists.newArrayList();

      for (dzt.c $$7 : $$5) {
         rt $$8 = $$7.c();
         if ($$8 != null) {
            dhl $$9 = dhl.valueOf($$8.l("mode"));
            if ($$9 == dhl.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dzt.c> a(dzu $$0, ht $$1, dal $$2, ate $$3) {
      dzt $$4 = this.a($$0);
      ObjectArrayList<dzt.c> $$5 = $$4.a($$1, new dzp().a($$2), cuc.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dvs a(dzu $$0, ht $$1, dal $$2) {
      dzt $$3 = this.a($$0);
      return $$3.b(new dzp().a($$2), $$1);
   }

   @Override
   public boolean a(dzu $$0, crt $$1, crr $$2, dhy $$3, ht $$4, ht $$5, dal $$6, dvs $$7, ate $$8, boolean $$9) {
      dzt $$10 = this.a($$0);
      dzp $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dzt.c $$13 : dzt.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dzp a(dal $$0, dvs $$1, boolean $$2) {
      dzp $$3 = new dzp();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dyv.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dzb.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dxi<?> a() {
      return dxi.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
