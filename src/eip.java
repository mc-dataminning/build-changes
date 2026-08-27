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

public class eip extends eiq {
   private static final Codec<Either<akm, elj>> a = Codec.of(eip::a, akm.a.map(Either::left));
   public static final MapCodec<eip> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eip::new));
   protected final Either<akm, elj> c;
   protected final ix<elh> d;

   private static <T> DataResult<T> a(Either<akm, elj> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akm> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akm.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eip> RecordCodecBuilder<E, ix<elh>> b() {
      return eli.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eip> RecordCodecBuilder<E, Either<akm, elj>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eip(Either<akm, elj> $$0, ix<elh> $$1, eis.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public js a(elk $$0, dkl $$1) {
      elj $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private elj a(elk $$0) {
      return (elj)this.c.map($$0::a, Function.identity());
   }

   public List<elj.c> a(elk $$0, io $$1, dkl $$2, boolean $$3) {
      elj $$4 = this.a($$0);
      List<elj.c> $$5 = $$4.a($$1, new elf().a($$2), dea.pa, $$3);
      List<elj.c> $$6 = Lists.newArrayList();

      for (elj.c $$7 : $$5) {
         ud $$8 = $$7.c();
         if ($$8 != null) {
            dsl $$9 = dsl.valueOf($$8.l("mode"));
            if ($$9 == dsl.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<elj.c> a(elk $$0, io $$1, dkl $$2, ayk $$3) {
      elj $$4 = this.a($$0);
      ObjectArrayList<elj.c> $$5 = $$4.a($$1, new elf().a($$2), dea.pb, true);
      ac.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<elj.c> $$0) {
      $$0.sort(Comparator.<elj.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ehb a(elk $$0, io $$1, dkl $$2) {
      elj $$3 = this.a($$0);
      return $$3.b(new elf().a($$2), $$1);
   }

   @Override
   public boolean a(elk $$0, dbs $$1, dbq $$2, dsy $$3, io $$4, io $$5, dkl $$6, ehb $$7, ayk $$8, boolean $$9) {
      elj $$10 = this.a($$0);
      elf $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (elj.c $$13 : elj.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected elf a(dkl $$0, ehb $$1, boolean $$2) {
      elf $$3 = new elf();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(ekl.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(ekr.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public eir<?> a() {
      return eir.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
