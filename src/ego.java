import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ego> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egl.a.listOf().fieldOf("layers").forGetter(ego::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcy.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ald.d(ddf.b),
                  ald.d(su.g),
                  ald.d(su.h)
               )
               .apply($$0, ego::new)
      )
      .comapFlatMap(ego::a, Function.identity())
      .stable();
   private final Optional<jm<eir>> c;
   private final List<egl> d = Lists.newArrayList();
   private final ji<dcy> e;
   private final List<dsd> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<ehp>> j;

   private static DataResult<ego> a(ego $$0) {
      int $$1 = $$0.d.stream().mapToInt(egl::a).sum();
      return $$1 > dvv.c ? DataResult.error(() -> "Sum of layer heights is > " + dvv.c, $$0) : DataResult.success($$0);
   }

   private ego(Optional<jm<eir>> $$0, List<egl> $$1, boolean $$2, boolean $$3, Optional<ji<dcy>> $$4, ji.c<dcy> $$5, ji<ehp> $$6, ji<ehp> $$7) {
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

   private static ji<dcy> a(Optional<? extends ji<dcy>> $$0, ji<dcy> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcy>)$$0.get();
      }
   }

   public ego(Optional<jm<eir>> $$0, ji<dcy> $$1, List<ji<ehp>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ego a(List<egl> $$0, Optional<jm<eir>> $$1, ji<dcy> $$2) {
      ego $$3 = new ego($$1, $$2, this.j);

      for (egl $$4 : $$0) {
         $$3.d.add(new egl($$4.a(), $$4.b().b()));
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

   public dcz a(ji<dcy> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dcz $$1 = this.d().a().d();
         dcz.b $$2 = new dcz.b();
         if (this.i) {
            for (ji<ehp> $$3 : this.j) {
               $$2.a(dxr.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddf.a)) && this.h;
         if ($$4) {
            List<jm<ehp>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxr.b.d.ordinal() && $$6 != dxr.b.e.ordinal() && (!this.i || $$6 != dxr.b.b.ordinal())) {
                  for (ji<ehp> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsd> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsd $$11 = $$9.get($$10);
            if (!dxv.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxr.b.k, sx.a(eaz.ab, new edh($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eir>> c() {
      return this.c;
   }

   public ji<dcy> d() {
      return this.e;
   }

   public List<egl> e() {
      return this.d;
   }

   public List<dsd> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egl $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfc.a));
   }

   public static ego a(jj<dcy> $$0, jj<eir> $$1, jj<ehp> $$2) {
      jm<eir> $$3 = jm.a($$1.b(eie.r), $$1.b(eie.a));
      ego $$4 = new ego(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egl(1, dfc.F));
      $$4.e().add(new egl(2, dfc.j));
      $$4.e().add(new egl(1, dfc.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcy> a(jj<dcy> $$0) {
      return $$0.b(ddf.b);
   }

   public static List<ji<ehp>> b(jj<ehp> $$0) {
      return List.of($$0.b(su.g), $$0.b(su.h));
   }
}
