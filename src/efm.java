import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class efm {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efm> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jm.a(lf.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  efj.a.listOf().fieldOf("layers").forGetter(efm::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dbw.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akk.d(dcd.b),
                  akk.d(sf.g),
                  akk.d(sf.h)
               )
               .apply($$0, efm::new)
      )
      .comapFlatMap(efm::a, Function.identity())
      .stable();
   private final Optional<jb<ehp>> c;
   private final List<efj> d = Lists.newArrayList();
   private final ix<dbw> e;
   private final List<drb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ix<egn>> j;

   private static DataResult<efm> a(efm $$0) {
      int $$1 = $$0.d.stream().mapToInt(efj::a).sum();
      return $$1 > dut.c ? DataResult.error(() -> "Sum of layer heights is > " + dut.c, $$0) : DataResult.success($$0);
   }

   private efm(Optional<jb<ehp>> $$0, List<efj> $$1, boolean $$2, boolean $$3, Optional<ix<dbw>> $$4, ix.c<dbw> $$5, ix<egn> $$6, ix<egn> $$7) {
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

   private static ix<dbw> a(Optional<? extends ix<dbw>> $$0, ix<dbw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ix<dbw>)$$0.get();
      }
   }

   public efm(Optional<jb<ehp>> $$0, ix<dbw> $$1, List<ix<egn>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public efm a(List<efj> $$0, Optional<jb<ehp>> $$1, ix<dbw> $$2) {
      efm $$3 = new efm($$1, $$2, this.j);

      for (efj $$4 : $$0) {
         $$3.d.add(new efj($$4.a(), $$4.b().b()));
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

   public dbx a(ix<dbw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dbx $$1 = this.d().a().d();
         dbx.b $$2 = new dbx.b();
         if (this.i) {
            for (ix<egn> $$3 : this.j) {
               $$2.a(dwp.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dcd.a)) && this.h;
         if ($$4) {
            List<jb<egn>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dwp.b.d.ordinal() && $$6 != dwp.b.e.ordinal() && (!this.i || $$6 != dwp.b.b.ordinal())) {
                  for (ix<egn> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<drb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            drb $$11 = $$9.get($$10);
            if (!dwt.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dwp.b.k, si.a(dzx.ab, new ecf($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jb<ehp>> c() {
      return this.c;
   }

   public ix<dbw> d() {
      return this.e;
   }

   public List<efj> e() {
      return this.d;
   }

   public List<drb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (efj $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dea.a));
   }

   public static efm a(iy<dbw> $$0, iy<ehp> $$1, iy<egn> $$2) {
      jb<ehp> $$3 = jb.a($$1.b(ehc.r), $$1.b(ehc.a));
      efm $$4 = new efm(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new efj(1, dea.F));
      $$4.e().add(new efj(2, dea.j));
      $$4.e().add(new efj(1, dea.i));
      $$4.g();
      return $$4;
   }

   public static ix<dbw> a(iy<dbw> $$0) {
      return $$0.b(dcd.b);
   }

   public static List<ix<egn>> b(iy<egn> $$0) {
      return List.of($$0.b(sf.g), $$0.b(sf.h));
   }
}
