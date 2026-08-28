import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egt {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egt> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.aS).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egq.a.listOf().fieldOf("layers").forGetter(egt::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ddd.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aki.d(ddk.b),
                  aki.d(rz.g),
                  aki.d(rz.h)
               )
               .apply($$0, egt::new)
      )
      .comapFlatMap(egt::a, Function.identity())
      .stable();
   private final Optional<jn<eiw>> c;
   private final List<egq> d = Lists.newArrayList();
   private final jj<ddd> e;
   private final List<dsh> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jj<ehu>> j;

   private static DataResult<egt> a(egt $$0) {
      int $$1 = $$0.d.stream().mapToInt(egq::a).sum();
      return $$1 > dvz.c ? DataResult.error(() -> "Sum of layer heights is > " + dvz.c, $$0) : DataResult.success($$0);
   }

   private egt(Optional<jn<eiw>> $$0, List<egq> $$1, boolean $$2, boolean $$3, Optional<jj<ddd>> $$4, jj.c<ddd> $$5, jj<ehu> $$6, jj<ehu> $$7) {
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

   private static jj<ddd> a(Optional<? extends jj<ddd>> $$0, jj<ddd> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jj<ddd>)$$0.get();
      }
   }

   public egt(Optional<jn<eiw>> $$0, jj<ddd> $$1, List<jj<ehu>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egt a(List<egq> $$0, Optional<jn<eiw>> $$1, jj<ddd> $$2) {
      egt $$3 = new egt($$1, $$2, this.j);

      for (egq $$4 : $$0) {
         $$3.d.add(new egq($$4.a(), $$4.b().b()));
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

   public dde a(jj<ddd> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dde $$1 = this.d().a().d();
         dde.b $$2 = new dde.b();
         if (this.i) {
            for (jj<ehu> $$3 : this.j) {
               $$2.a(dxv.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddk.a)) && this.h;
         if ($$4) {
            List<jn<ehu>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxv.b.d.ordinal() && $$6 != dxv.b.e.ordinal() && (!this.i || $$6 != dxv.b.b.ordinal())) {
                  for (jj<ehu> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsh> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsh $$11 = $$9.get($$10);
            if (!dxz.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxv.b.k, sc.a(ebe.ab, new edm($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jn<eiw>> c() {
      return this.c;
   }

   public jj<ddd> d() {
      return this.e;
   }

   public List<egq> e() {
      return this.d;
   }

   public List<dsh> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egq $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfh.a));
   }

   public static egt a(jk<ddd> $$0, jk<eiw> $$1, jk<ehu> $$2) {
      jn<eiw> $$3 = jn.a($$1.b(eij.r), $$1.b(eij.a));
      egt $$4 = new egt(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egq(1, dfh.F));
      $$4.e().add(new egq(2, dfh.j));
      $$4.e().add(new egq(1, dfh.i));
      $$4.g();
      return $$4;
   }

   public static jj<ddd> a(jk<ddd> $$0) {
      return $$0.b(ddk.b);
   }

   public static List<jj<ehu>> b(jk<ehu> $$0) {
      return List.of($$0.b(rz.g), $$0.b(rz.h));
   }
}
