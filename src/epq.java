import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class epq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  epn.a.listOf().fieldOf("layers").forGetter(epq::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dkp.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ale.d(dkw.b),
                  ale.d(ru.g),
                  ale.d(ru.h)
               )
               .apply($$0, epq::new)
      )
      .comapFlatMap(epq::a, Function.identity())
      .stable();
   private final Optional<jj<ert>> c;
   private final List<epn> d = Lists.newArrayList();
   private final jf<dkp> e;
   private final List<eat> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jf<eqr>> j;

   private static DataResult<epq> a(epq $$0) {
      int $$1 = $$0.d.stream().mapToInt(epn::a).sum();
      return $$1 > eeq.c ? DataResult.error(() -> "Sum of layer heights is > " + eeq.c, $$0) : DataResult.success($$0);
   }

   private epq(Optional<jj<ert>> $$0, List<epn> $$1, boolean $$2, boolean $$3, Optional<jf<dkp>> $$4, jf.c<dkp> $$5, jf<eqr> $$6, jf<eqr> $$7) {
      this($$0, a($$4, $$5), List.of($$6, $$7));
      if ($$2) {
         this.b();
      }

      if ($$3) {
         this.a();
      }

      this.d.addAll($$1);
      this.g();
   }

   private static jf<dkp> a(Optional<? extends jf<dkp>> $$0, jf<dkp> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jf<dkp>)$$0.get();
      }
   }

   public epq(Optional<jj<ert>> $$0, jf<dkp> $$1, List<jf<eqr>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public epq a(List<epn> $$0, Optional<jj<ert>> $$1, jf<dkp> $$2) {
      epq $$3 = new epq($$1, $$2, this.j);

      for (epn $$4 : $$0) {
         $$3.d.add(new epn($$4.a(), $$4.b().b()));
         $$3.g();
      }

      if (this.h) {
         $$3.a();
      }

      if (this.i) {
         $$3.b();
      }

      return $$3;
   }

   public void a() {
      this.h = true;
   }

   public void b() {
      this.i = true;
   }

   public dkq a(jf<dkp> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dkq $$1 = this.d().a().d();
         dkq.b $$2 = new dkq.b();
         if (this.i) {
            for (jf<eqr> $$3 : this.j) {
               $$2.a(ego.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dkw.a)) && this.h;
         if ($$4) {
            List<jj<eqr>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ego.a.d.ordinal() && $$6 != ego.a.e.ordinal() && (!this.i || $$6 != ego.a.b.ordinal())) {
                  for (jf<eqr> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<eat> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            eat $$11 = $$9.get($$10);
            if (!egs.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ego.a.k, rx.a(ejy.ac, new emg($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jj<ert>> c() {
      return this.c;
   }

   public jf<dkp> d() {
      return this.e;
   }

   public List<epn> e() {
      return this.d;
   }

   public List<eat> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (epn $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dmt.a));
   }

   public static epq a(jg<dkp> $$0, jg<ert> $$1, jg<eqr> $$2) {
      jj<ert> $$3 = jj.a($$1.b(erg.r), $$1.b(erg.a));
      epq $$4 = new epq(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new epn(1, dmt.I));
      $$4.e().add(new epn(2, dmt.j));
      $$4.e().add(new epn(1, dmt.i));
      $$4.g();
      return $$4;
   }

   public static jf<dkp> a(jg<dkp> $$0) {
      return $$0.b(dkw.b);
   }

   public static List<jf<eqr>> b(jg<eqr> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
