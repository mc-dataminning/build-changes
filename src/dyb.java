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

public class dyb extends dyc {
   private static final Codec<Either<agg, eav>> a = Codec.of(dyb::a, agg.a.map(Either::left));
   public static final Codec<dyb> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dyb::new));
   protected final Either<agg, eav> c;
   protected final ib<eat> d;

   private static <T> DataResult<T> a(Either<agg, eav> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<agg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : agg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dyb> RecordCodecBuilder<E, ib<eat>> b() {
      return eau.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dyb> RecordCodecBuilder<E, Either<agg, eav>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dyb(Either<agg, eav> $$0, ib<eat> $$1, dye.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public iw a(eaw $$0, dbf $$1) {
      eav $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eav a(eaw $$0) {
      return (eav)this.c.map($$0::a, Function.identity());
   }

   public List<eav.c> a(eaw $$0, ht $$1, dbf $$2, boolean $$3) {
      eav $$4 = this.a($$0);
      List<eav.c> $$5 = $$4.a($$1, new ear().a($$2), cuv.pa, $$3);
      List<eav.c> $$6 = Lists.newArrayList();

      for (eav.c $$7 : $$5) {
         rz $$8 = $$7.c();
         if ($$8 != null) {
            dig $$9 = dig.valueOf($$8.l("mode"));
            if ($$9 == dig.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eav.c> a(eaw $$0, ht $$1, dbf $$2, ato $$3) {
      eav $$4 = this.a($$0);
      ObjectArrayList<eav.c> $$5 = $$4.a($$1, new ear().a($$2), cuv.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dwn a(eaw $$0, ht $$1, dbf $$2) {
      eav $$3 = this.a($$0);
      return $$3.b(new ear().a($$2), $$1);
   }

   @Override
   public boolean a(eaw $$0, csm $$1, csk $$2, dit $$3, ht $$4, ht $$5, dbf $$6, dwn $$7, ato $$8, boolean $$9) {
      eav $$10 = this.a($$0);
      ear $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (eav.c $$13 : eav.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected ear a(dbf $$0, dwn $$1, boolean $$2) {
      ear $$3 = new ear();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dzx.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ead.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dyd<?> a() {
      return dyd.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
