import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eqg {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eqd.a.listOf().fieldOf("layers").forGetter(eqg::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dlc.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ali.d(dlj.b),
                  ali.d(rv.g),
                  ali.d(rv.h)
               )
               .apply($$0, eqg::new)
      )
      .comapFlatMap(eqg::a, Function.identity())
      .stable();
   private final Optional<jk<esj>> c;
   private final List<eqd> d = Lists.newArrayList();
   private final jg<dlc> e;
   private final List<ebg> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jg<erh>> j;

   private static DataResult<eqg> a(eqg $$0) {
      int $$1 = $$0.d.stream().mapToInt(eqd::a).sum();
      return $$1 > efd.c ? DataResult.error(() -> "Sum of layer heights is > " + efd.c, $$0) : DataResult.success($$0);
   }

   private eqg(Optional<jk<esj>> $$0, List<eqd> $$1, boolean $$2, boolean $$3, Optional<jg<dlc>> $$4, jg.c<dlc> $$5, jg<erh> $$6, jg<erh> $$7) {
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

   private static jg<dlc> a(Optional<? extends jg<dlc>> $$0, jg<dlc> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jg<dlc>)$$0.get();
      }
   }

   public eqg(Optional<jk<esj>> $$0, jg<dlc> $$1, List<jg<erh>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eqg a(List<eqd> $$0, Optional<jk<esj>> $$1, jg<dlc> $$2) {
      eqg $$3 = new eqg($$1, $$2, this.j);

      for (eqd $$4 : $$0) {
         $$3.d.add(new eqd($$4.a(), $$4.b().b()));
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

   public dld a(jg<dlc> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dld $$1 = this.d().a().d();
         dld.b $$2 = new dld.b();
         if (this.i) {
            for (jg<erh> $$3 : this.j) {
               $$2.a(ehb.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dlj.a)) && this.h;
         if ($$4) {
            List<jk<erh>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ehb.a.d.ordinal() && $$6 != ehb.a.e.ordinal() && (!this.i || $$6 != ehb.a.b.ordinal())) {
                  for (jg<erh> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<ebg> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            ebg $$11 = $$9.get($$10);
            if (!ehf.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ehb.a.k, ry.a(ekm.ad, new emv($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jk<esj>> c() {
      return this.c;
   }

   public jg<dlc> d() {
      return this.e;
   }

   public List<eqd> e() {
      return this.d;
   }

   public List<ebg> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eqd $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dng.a));
   }

   public static eqg a(jh<dlc> $$0, jh<esj> $$1, jh<erh> $$2) {
      jk<esj> $$3 = jk.a($$1.b(erw.r), $$1.b(erw.a));
      eqg $$4 = new eqg(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eqd(1, dng.I));
      $$4.e().add(new eqd(2, dng.j));
      $$4.e().add(new eqd(1, dng.i));
      $$4.g();
      return $$4;
   }

   public static jg<dlc> a(jh<dlc> $$0) {
      return $$0.b(dlj.b);
   }

   public static List<jg<erh>> b(jh<erh> $$0) {
      return List.of($$0.b(rv.g), $$0.b(rv.h));
   }
}
