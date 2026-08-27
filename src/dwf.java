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

public class dwf extends dwg {
   private static final Codec<Either<aer, dys>> a = Codec.of(dwf::a, aer.a.map(Either::left));
   public static final Codec<dwf> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwf::new));
   protected final Either<aer, dys> c;
   protected final he<dyq> d;

   private static <T> DataResult<T> a(Either<aer, dys> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aer> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aer.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwf> RecordCodecBuilder<E, he<dyq>> b() {
      return dyr.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwf> RecordCodecBuilder<E, Either<aer, dys>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwf(Either<aer, dys> $$0, he<dyq> $$1, dwi.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public hz a(dyt $$0, cyy $$1) {
      dys $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dys a(dyt $$0) {
      return (dys)this.c.map($$0::a, Function.identity());
   }

   public List<dys.c> a(dyt $$0, gu $$1, cyy $$2, boolean $$3) {
      dys $$4 = this.a($$0);
      List<dys.c> $$5 = $$4.a($$1, new dyo().a($$2), csn.pa, $$3);
      List<dys.c> $$6 = Lists.newArrayList();

      for (dys.c $$7 : $$5) {
         qr $$8 = $$7.c();
         if ($$8 != null) {
            dgk $$9 = dgk.valueOf($$8.l("mode"));
            if ($$9 == dgk.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dys.c> a(dyt $$0, gu $$1, cyy $$2, aru $$3) {
      dys $$4 = this.a($$0);
      ObjectArrayList<dys.c> $$5 = $$4.a($$1, new dyo().a($$2), csn.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public dur a(dyt $$0, gu $$1, cyy $$2) {
      dys $$3 = this.a($$0);
      return $$3.b(new dyo().a($$2), $$1);
   }

   @Override
   public boolean a(dyt $$0, cqg $$1, cqe $$2, dgx $$3, gu $$4, gu $$5, cyy $$6, dur $$7, aru $$8, boolean $$9) {
      dys $$10 = this.a($$0);
      dyo $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dys.c $$13 : dys.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dyo a(cyy $$0, dur $$1, boolean $$2) {
      dyo $$3 = new dyo();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dxu.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dya.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwh<?> a() {
      return dwh.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
