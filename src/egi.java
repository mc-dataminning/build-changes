import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egi {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egi> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egf.a.listOf().fieldOf("layers").forGetter(egi::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcs.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akz.d(dcz.b),
                  akz.d(st.g),
                  akz.d(st.h)
               )
               .apply($$0, egi::new)
      )
      .comapFlatMap(egi::a, Function.identity())
      .stable();
   private final Optional<jm<eil>> c;
   private final List<egf> d = Lists.newArrayList();
   private final ji<dcs> e;
   private final List<drx> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<ehj>> j;

   private static DataResult<egi> a(egi $$0) {
      int $$1 = $$0.d.stream().mapToInt(egf::a).sum();
      return $$1 > dvp.c ? DataResult.error(() -> "Sum of layer heights is > " + dvp.c, $$0) : DataResult.success($$0);
   }

   private egi(Optional<jm<eil>> $$0, List<egf> $$1, boolean $$2, boolean $$3, Optional<ji<dcs>> $$4, ji.c<dcs> $$5, ji<ehj> $$6, ji<ehj> $$7) {
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

   private static ji<dcs> a(Optional<? extends ji<dcs>> $$0, ji<dcs> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcs>)$$0.get();
      }
   }

   public egi(Optional<jm<eil>> $$0, ji<dcs> $$1, List<ji<ehj>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egi a(List<egf> $$0, Optional<jm<eil>> $$1, ji<dcs> $$2) {
      egi $$3 = new egi($$1, $$2, this.j);

      for (egf $$4 : $$0) {
         $$3.d.add(new egf($$4.a(), $$4.b().b()));
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

   public dct a(ji<dcs> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dct $$1 = this.d().a().d();
         dct.b $$2 = new dct.b();
         if (this.i) {
            for (ji<ehj> $$3 : this.j) {
               $$2.a(dxl.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dcz.a)) && this.h;
         if ($$4) {
            List<jm<ehj>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxl.b.d.ordinal() && $$6 != dxl.b.e.ordinal() && (!this.i || $$6 != dxl.b.b.ordinal())) {
                  for (ji<ehj> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<drx> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            drx $$11 = $$9.get($$10);
            if (!dxp.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxl.b.k, sw.a(eat.ab, new edb($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eil>> c() {
      return this.c;
   }

   public ji<dcs> d() {
      return this.e;
   }

   public List<egf> e() {
      return this.d;
   }

   public List<drx> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egf $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dew.a));
   }

   public static egi a(jj<dcs> $$0, jj<eil> $$1, jj<ehj> $$2) {
      jm<eil> $$3 = jm.a($$1.b(ehy.r), $$1.b(ehy.a));
      egi $$4 = new egi(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egf(1, dew.F));
      $$4.e().add(new egf(2, dew.j));
      $$4.e().add(new egf(1, dew.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcs> a(jj<dcs> $$0) {
      return $$0.b(dcz.b);
   }

   public static List<ji<ehj>> b(jj<ehj> $$0) {
      return List.of($$0.b(st.g), $$0.b(st.h));
   }
}
