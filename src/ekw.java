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

public class ekw extends ekx {
   private static final Codec<Either<akr, enr>> a = Codec.of(ekw::a, akr.a.map(Either::left));
   public static final MapCodec<ekw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, ekw::new));
   protected final Either<akr, enr> c;
   protected final jm<enp> d;
   protected final Optional<enb> e;

   private static <T> DataResult<T> a(Either<akr, enr> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<akr> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : akr.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends ekw> RecordCodecBuilder<E, jm<enp>> b() {
      return enq.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends ekw> RecordCodecBuilder<E, Optional<enb>> c() {
      return enb.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
   }

   protected static <E extends ekw> RecordCodecBuilder<E, Either<akr, enr>> d() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected ekw(Either<akr, enr> $$0, jm<enp> $$1, ekz.a $$2, Optional<enb> $$3) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
      this.e = $$3;
   }

   @Override
   public kh a(ens $$0, dmm $$1) {
      enr $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private enr a(ens $$0) {
      return (enr)this.c.map($$0::a, Function.identity());
   }

   public List<enr.c> a(ens $$0, jd $$1, dmm $$2, boolean $$3) {
      enr $$4 = this.a($$0);
      List<enr.c> $$5 = $$4.a($$1, new enn().a($$2), dga.pa, $$3);
      List<enr.c> $$6 = Lists.newArrayList();

      for (enr.c $$7 : $$5) {
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
   public List<enr.c> a(ens $$0, jd $$1, dmm $$2, ayw $$3) {
      enr $$4 = this.a($$0);
      ObjectArrayList<enr.c> $$5 = $$4.a($$1, new enn().a($$2), dga.pb, true);
      ad.c($$5, $$3);
      a($$5);
      return $$5;
   }

   @VisibleForTesting
   static void a(List<enr.c> $$0) {
      $$0.sort(Comparator.<enr.c>comparingInt($$0x -> x.a($$0x.c(), $$0xx -> $$0xx.h("selection_priority"), 0)).reversed());
   }

   @Override
   public ejh a(ens $$0, jd $$1, dmm $$2) {
      enr $$3 = this.a($$0);
      return $$3.b(new enn().a($$2), $$1);
   }

   @Override
   public boolean a(ens $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejh $$7, ayw $$8, enb $$9, boolean $$10) {
      enr $$11 = this.a($$0);
      enn $$12 = this.a($$6, $$7, $$9, $$10);
      if (!$$11.a($$1, $$4, $$5, $$12, $$8, 18)) {
         return false;
      } else {
         for (enr.c $$14 : enr.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$14, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected enn a(dmm $$0, ejh $$1, enb $$2, boolean $$3) {
      enn $$4 = new enn();
      $$4.a($$1);
      $$4.a($$0);
      $$4.b(true);
      $$4.a(false);
      $$4.a(ems.b);
      $$4.c(true);
      $$4.a(this.e.orElse($$2));
      if (!$$3) {
         $$4.a(emy.b);
      }

      this.d.a().a().forEach($$4::a);
      this.f().b().forEach($$4::a);
      return $$4;
   }

   @Override
   public eky<?> a() {
      return eky.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
