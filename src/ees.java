import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ees {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ees> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jl.a(le.aL).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eep.a.listOf().fieldOf("layers").forGetter(ees::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dbc.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akf.d(dbj.b),
                  akf.d(sc.g),
                  akf.d(sc.h)
               )
               .apply($$0, ees::new)
      )
      .comapFlatMap(ees::a, Function.identity())
      .stable();
   private final Optional<ja<egv>> c;
   private final List<eep> d = Lists.newArrayList();
   private final iw<dbc> e;
   private final List<dqh> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<iw<eft>> j;

   private static DataResult<ees> a(ees $$0) {
      int $$1 = $$0.d.stream().mapToInt(eep::a).sum();
      return $$1 > dtz.c ? DataResult.error(() -> "Sum of layer heights is > " + dtz.c, $$0) : DataResult.success($$0);
   }

   private ees(Optional<ja<egv>> $$0, List<eep> $$1, boolean $$2, boolean $$3, Optional<iw<dbc>> $$4, iw.c<dbc> $$5, iw<eft> $$6, iw<eft> $$7) {
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

   private static iw<dbc> a(Optional<? extends iw<dbc>> $$0, iw<dbc> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (iw<dbc>)$$0.get();
      }
   }

   public ees(Optional<ja<egv>> $$0, iw<dbc> $$1, List<iw<eft>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ees a(List<eep> $$0, Optional<ja<egv>> $$1, iw<dbc> $$2) {
      ees $$3 = new ees($$1, $$2, this.j);

      for (eep $$4 : $$0) {
         $$3.d.add(new eep($$4.a(), $$4.b().b()));
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

   public dbd a(iw<dbc> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dbd $$1 = this.d().a().d();
         dbd.b $$2 = new dbd.b();
         if (this.i) {
            for (iw<eft> $$3 : this.j) {
               $$2.a(dvv.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dbj.a)) && this.h;
         if ($$4) {
            List<ja<eft>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dvv.b.d.ordinal() && $$6 != dvv.b.e.ordinal() && (!this.i || $$6 != dvv.b.b.ordinal())) {
                  for (iw<eft> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dqh> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dqh $$11 = $$9.get($$10);
            if (!dvz.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dvv.b.k, sf.a(dzd.ab, new ebl($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ja<egv>> c() {
      return this.c;
   }

   public iw<dbc> d() {
      return this.e;
   }

   public List<eep> e() {
      return this.d;
   }

   public List<dqh> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eep $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(ddg.a));
   }

   public static ees a(ix<dbc> $$0, ix<egv> $$1, ix<eft> $$2) {
      ja<egv> $$3 = ja.a($$1.b(egi.r), $$1.b(egi.a));
      ees $$4 = new ees(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eep(1, ddg.F));
      $$4.e().add(new eep(2, ddg.j));
      $$4.e().add(new eep(1, ddg.i));
      $$4.g();
      return $$4;
   }

   public static iw<dbc> a(ix<dbc> $$0) {
      return $$0.b(dbj.b);
   }

   public static List<iw<eft>> b(ix<eft> $$0) {
      return List.of($$0.b(sc.g), $$0.b(sc.h));
   }
}
