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

public class dwj extends dwk {
   private static final Codec<Either<aeu, dyw>> a = Codec.of(dwj::a, aeu.a.map(Either::left));
   public static final Codec<dwj> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwj::new));
   protected final Either<aeu, dyw> c;
   protected final hg<dyu> d;

   private static <T> DataResult<T> a(Either<aeu, dyw> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<aeu> $$3 = $$0.left();
      return $$3.isEmpty() ? DataResult.error(() -> "Can not serialize a runtime pool element") : aeu.a.encode($$3.get(), $$1, $$2);
   }

   protected static <E extends dwj> RecordCodecBuilder<E, hg<dyu>> b() {
      return dyv.d.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dwj> RecordCodecBuilder<E, Either<aeu, dyw>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dwj(Either<aeu, dyw> $$0, hg<dyu> $$1, dwm.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public ib a(dyx $$0, czc $$1) {
      dyw $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dyw a(dyx $$0) {
      return (dyw)this.c.map($$0::a, Function.identity());
   }

   public List<dyw.c> a(dyx $$0, gw $$1, czc $$2, boolean $$3) {
      dyw $$4 = this.a($$0);
      List<dyw.c> $$5 = $$4.a($$1, new dys().a($$2), csr.pa, $$3);
      List<dyw.c> $$6 = Lists.newArrayList();

      for (dyw.c $$7 : $$5) {
         qu $$8 = $$7.c();
         if ($$8 != null) {
            dgo $$9 = dgo.valueOf($$8.l("mode"));
            if ($$9 == dgo.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dyw.c> a(dyx $$0, gw $$1, czc $$2, arx $$3) {
      dyw $$4 = this.a($$0);
      ObjectArrayList<dyw.c> $$5 = $$4.a($$1, new dys().a($$2), csr.pb, true);
      ac.b($$5, $$3);
      return $$5;
   }

   @Override
   public duv a(dyx $$0, gw $$1, czc $$2) {
      dyw $$3 = this.a($$0);
      return $$3.b(new dys().a($$2), $$1);
   }

   @Override
   public boolean a(dyx $$0, cqk $$1, cqi $$2, dhb $$3, gw $$4, gw $$5, czc $$6, duv $$7, arx $$8, boolean $$9) {
      dyw $$10 = this.a($$0);
      dys $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for (dyw.c $$13 : dyw.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dys a(czc $$0, duv $$1, boolean $$2) {
      dys $$3 = new dys();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dxy.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dye.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dwl<?> a() {
      return dwl.a;
   }

   @Override
   public String toString() {
      return "Single[" + this.c + "]";
   }
}
