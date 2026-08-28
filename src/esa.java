import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class esa extends esb {
   private static final Comparator<euv.a> a = Comparator.comparingInt(euv.a::g).reversed();
   private static final Codec<Either<alg, euv>> g = Codec.of(esa::a, alg.a.map(Either::left));
   public static final MapCodec<esa> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, esa::new));
   protected final Either<alg, euv> c;
   protected final je<eut> d;
   protected final Optional<euf> e;

   private static <T> DataResult<T> a(Either<alg, euv> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alg> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alg.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends esa> RecordCodecBuilder<E, je<eut>> b() {
      return euu.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends esa> RecordCodecBuilder<E, Optional<euf>> c() {
      return euf.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends esa> RecordCodecBuilder<E, Either<alg, euv>> d() {
      return g.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected esa(Either<alg, euv> $$0, je<eut> $$1, esd.a $$2, Optional<euf> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public jz a(euw $$0, dst $$1) {
      euv $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private euv a(euw $$0) {
      return (euv)this.c.map($$0::a, Function.identity());
   }

   public List<euv.d> a(euw $$0, iu $$1, dst $$2, boolean $$3) {
      euv $$4 = this.a($$0);
      List<euv.d> $$5 = $$4.a($$1, new eur().a($$2), dmc.pD, $$3);
      List<euv.d> $$6 = Lists.newArrayList();

      for (euv.d $$7 : $$5) {
         tz $$8 = $$7.c();
         if ($$8 != null) {
            ebj $$9 = ebj.valueOf($$8.l("mode"));
            if ($$9 == ebj.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<euv.a> a(euw $$0, iu $$1, dst $$2, azv $$3) {
      List<euv.a> $$4 = this.a($$0).a($$1, $$2);
      af.c($$4, $$3);
      a($$4);
      return $$4;
   }

   @VisibleForTesting
   static void a(List<euv.a> $$0) {
      $$0.sort(a);
   }

   @Override
   public eql a(euw $$0, iu $$1, dst $$2) {
      euv $$3 = this.a($$0);
      return $$3.b(new eur().a($$2), $$1);
   }

   @Override
   public boolean a(euw $$0, dju $$1, djr $$2, ebx $$3, iu $$4, iu $$5, dst $$6, eql $$7, azv $$8, euf $$9, boolean $$10) {
      euv $$11 = this.a($$0);
      eur $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (euv.d $$14 : euv.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eur a(dst $$0, eql $$1, euf $$2, boolean $$3) {
      eur $$4 = new eur();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(etw.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(euc.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public esc<?> a() {
      return esc.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
