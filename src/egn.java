import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egn {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egn> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egk.a.listOf().fieldOf("layers").forGetter(egn::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcx.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ald.d(dde.b),
                  ald.d(su.g),
                  ald.d(su.h)
               )
               .apply($$0, egn::new)
      )
      .comapFlatMap(egn::a, Function.identity())
      .stable();
   private final Optional<jm<eiq>> c;
   private final List<egk> d = Lists.newArrayList();
   private final ji<dcx> e;
   private final List<dsc> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<eho>> j;

   private static DataResult<egn> a(egn $$0) {
      int $$1 = $$0.d.stream().mapToInt(egk::a).sum();
      return $$1 > dvu.c ? DataResult.error(() -> "Sum of layer heights is > " + dvu.c, $$0) : DataResult.success($$0);
   }

   private egn(Optional<jm<eiq>> $$0, List<egk> $$1, boolean $$2, boolean $$3, Optional<ji<dcx>> $$4, ji.c<dcx> $$5, ji<eho> $$6, ji<eho> $$7) {
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

   private static ji<dcx> a(Optional<? extends ji<dcx>> $$0, ji<dcx> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcx>)$$0.get();
      }
   }

   public egn(Optional<jm<eiq>> $$0, ji<dcx> $$1, List<ji<eho>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egn a(List<egk> $$0, Optional<jm<eiq>> $$1, ji<dcx> $$2) {
      egn $$3 = new egn($$1, $$2, this.j);

      for (egk $$4 : $$0) {
         $$3.d.add(new egk($$4.a(), $$4.b().b()));
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

   public dcy a(ji<dcx> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dcy $$1 = this.d().a().d();
         dcy.b $$2 = new dcy.b();
         if (this.i) {
            for (ji<eho> $$3 : this.j) {
               $$2.a(dxq.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dde.a)) && this.h;
         if ($$4) {
            List<jm<eho>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxq.b.d.ordinal() && $$6 != dxq.b.e.ordinal() && (!this.i || $$6 != dxq.b.b.ordinal())) {
                  for (ji<eho> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsc> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsc $$11 = $$9.get($$10);
            if (!dxu.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxq.b.k, sx.a(eay.ab, new edg($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eiq>> c() {
      return this.c;
   }

   public ji<dcx> d() {
      return this.e;
   }

   public List<egk> e() {
      return this.d;
   }

   public List<dsc> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egk $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfb.a));
   }

   public static egn a(jj<dcx> $$0, jj<eiq> $$1, jj<eho> $$2) {
      jm<eiq> $$3 = jm.a($$1.b(eid.r), $$1.b(eid.a));
      egn $$4 = new egn(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egk(1, dfb.F));
      $$4.e().add(new egk(2, dfb.j));
      $$4.e().add(new egk(1, dfb.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcx> a(jj<dcx> $$0) {
      return $$0.b(dde.b);
   }

   public static List<ji<eho>> b(jj<eho> $$0) {
      return List.of($$0.b(su.g), $$0.b(su.h));
   }
}
