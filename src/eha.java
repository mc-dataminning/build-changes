import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eha {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eha> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.aS).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egx.a.listOf().fieldOf("layers").forGetter(eha::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ddg.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aki.d(ddn.b),
                  aki.d(rz.g),
                  aki.d(rz.h)
               )
               .apply($$0, eha::new)
      )
      .comapFlatMap(eha::a, Function.identity())
      .stable();
   private final Optional<jn<ejd>> c;
   private final List<egx> d = Lists.newArrayList();
   private final jj<ddg> e;
   private final List<dsl> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jj<eib>> j;

   private static DataResult<eha> a(eha $$0) {
      int $$1 = $$0.d.stream().mapToInt(egx::a).sum();
      return $$1 > dwg.c ? DataResult.error(() -> "Sum of layer heights is > " + dwg.c, $$0) : DataResult.success($$0);
   }

   private eha(Optional<jn<ejd>> $$0, List<egx> $$1, boolean $$2, boolean $$3, Optional<jj<ddg>> $$4, jj.c<ddg> $$5, jj<eib> $$6, jj<eib> $$7) {
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

   private static jj<ddg> a(Optional<? extends jj<ddg>> $$0, jj<ddg> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jj<ddg>)$$0.get();
      }
   }

   public eha(Optional<jn<ejd>> $$0, jj<ddg> $$1, List<jj<eib>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eha a(List<egx> $$0, Optional<jn<ejd>> $$1, jj<ddg> $$2) {
      eha $$3 = new eha($$1, $$2, this.j);

      for (egx $$4 : $$0) {
         $$3.d.add(new egx($$4.a(), $$4.b().b()));
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

   public ddh a(jj<ddg> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         ddh $$1 = this.d().a().d();
         ddh.b $$2 = new ddh.b();
         if (this.i) {
            for (jj<eib> $$3 : this.j) {
               $$2.a(dyc.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddn.a)) && this.h;
         if ($$4) {
            List<jn<eib>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dyc.b.d.ordinal() && $$6 != dyc.b.e.ordinal() && (!this.i || $$6 != dyc.b.b.ordinal())) {
                  for (jj<eib> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsl> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsl $$11 = $$9.get($$10);
            if (!dyg.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dyc.b.k, sc.a(ebl.ab, new edt($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jn<ejd>> c() {
      return this.c;
   }

   public jj<ddg> d() {
      return this.e;
   }

   public List<egx> e() {
      return this.d;
   }

   public List<dsl> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egx $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfk.a));
   }

   public static eha a(jk<ddg> $$0, jk<ejd> $$1, jk<eib> $$2) {
      jn<ejd> $$3 = jn.a($$1.b(eiq.r), $$1.b(eiq.a));
      eha $$4 = new eha(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egx(1, dfk.F));
      $$4.e().add(new egx(2, dfk.j));
      $$4.e().add(new egx(1, dfk.i));
      $$4.g();
      return $$4;
   }

   public static jj<ddg> a(jk<ddg> $$0) {
      return $$0.b(ddn.b);
   }

   public static List<jj<eib>> b(jk<eib> $$0) {
      return List.of($$0.b(rz.g), $$0.b(rz.h));
   }
}
