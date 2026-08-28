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

public class elv extends elw {
   private static final Codec<Either<alb, eoq>> a = Codec.of(elv::a, alb.a.map(Either::left));
   public static final MapCodec<elv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, elv::new));
   protected final Either<alb, eoq> c;
   protected final jn<eoo> d;
   protected final Optional<eoa> e;

   private static <T> DataResult<T> a(Either<alb, eoq> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<alb> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : alb.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends elv> RecordCodecBuilder<E, jn<eoo>> b() {
      return eop.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends elv> RecordCodecBuilder<E, Optional<eoa>> c() {
      return eoa.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends elv> RecordCodecBuilder<E, Either<alb, eoq>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected elv(Either<alb, eoq> $$0, jn<eoo> $$1, ely.a $$2, Optional<eoa> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public ki a(eor $$0, dnj $$1) {
      eoq $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private eoq a(eor $$0) {
      return (eoq)this.c.map($$0::a, Function.identity());
   }

   public List<eoq.c> a(eor $$0, je $$1, dnj $$2, boolean $$3) {
      eoq $$4 = this.a($$0);
      List<eoq.c> $$5 = $$4.a($$1, new eom().a($$2), dgx.pa, $$3);
      List<eoq.c> $$6 = Lists.newArrayList();

      for (eoq.c $$7 : $$5) {
         uf $$8 = $$7.c();
         if ($$8 != null) {
            dvk $$9 = dvk.valueOf($$8.l("mode"));
            if ($$9 == dvk.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<eoq.c> a(eor $$0, je $$1, dnj $$2, azk $$3) {
      eoq $$4 = this.a($$0);
      ObjectArrayList<eoq.c> $$5 = $$4.a($$1, new eom().a($$2), dgx.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<eoq.c> $$0) {
      $$0.sort(Comparator.<eoq.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ekg a(eor $$0, je $$1, dnj $$2) {
      eoq $$3 = this.a($$0);
      return $$3.b(new eom().a($$2), $$1);
   }

   @Override
   public boolean a(eor $$0, dep $$1, den $$2, dvx $$3, je $$4, je $$5, dnj $$6, ekg $$7, azk $$8, eoa $$9, boolean $$10) {
      eoq $$11 = this.a($$0);
      eom $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (eoq.c $$14 : eoq.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected eom a(dnj $$0, ekg $$1, eoa $$2, boolean $$3) {
      eom $$4 = new eom();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(enr.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(enx.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public elx<?> a() {
      return elx.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
