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

public class eky extends ekz {
   private static final Codec<Either<akr, ent>> a = Codec.of(eky::a, akr.a.map(Either::left));
   public static final MapCodec<eky> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eky::new));
   protected final Either<akr, ent> c;
   protected final jm<enr> d;
   protected final Optional<end> e;

   private static <T> DataResult<T> a(Either<akr, ent> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akr> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akr.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends eky> RecordCodecBuilder<E, jm<enr>> b() {
      return ens.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends eky> RecordCodecBuilder<E, Optional<end>> c() {
      return end.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends eky> RecordCodecBuilder<E, Either<akr, ent>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected eky(Either<akr, ent> $$0, jm<enr> $$1, elb.a $$2, Optional<end> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kh a(enu $$0, dmm $$1) {
      ent $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private ent a(enu $$0) {
      return (ent)this.c.map($$0::a, Function.identity());
   }

   public List<ent.c> a(enu $$0, jd $$1, dmm $$2, boolean $$3) {
      ent $$4 = this.a($$0);
      List<ent.c> $$5 = $$4.a($$1, new enp().a($$2), dga.pa, $$3);
      List<ent.c> $$6 = Lists.newArrayList();

      for (ent.c $$7 : $$5) {
         ub $$8 = $$7.c();
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
   public List<ent.c> a(enu $$0, jd $$1, dmm $$2, ayw $$3) {
      ent $$4 = this.a($$0);
      ObjectArrayList<ent.c> $$5 = $$4.a($$1, new enp().a($$2), dga.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<ent.c> $$0) {
      $$0.sort(Comparator.<ent.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ejj a(enu $$0, jd $$1, dmm $$2) {
      ent $$3 = this.a($$0);
      return $$3.b(new enp().a($$2), $$1);
   }

   @Override
   public boolean a(enu $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejj $$7, ayw $$8, end $$9, boolean $$10) {
      ent $$11 = this.a($$0);
      enp $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (ent.c $$14 : ent.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected enp a(dmm $$0, ejj $$1, end $$2, boolean $$3) {
      enp $$4 = new enp();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(emu.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(ena.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public ela<?> a() {
      return ela.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
