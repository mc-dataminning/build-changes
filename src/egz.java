import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egz {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egz> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jy.a(lr.aS).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egw.a.listOf().fieldOf("layers").forGetter(egz::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ddf.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aki.d(ddm.b),
                  aki.d(rz.g),
                  aki.d(rz.h)
               )
               .apply($$0, egz::new)
      )
      .comapFlatMap(egz::a, Function.identity())
      .stable();
   private final Optional<jn<ejc>> c;
   private final List<egw> d = Lists.newArrayList();
   private final jj<ddf> e;
   private final List<dsk> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jj<eia>> j;

   private static DataResult<egz> a(egz $$0) {
      int $$1 = $$0.d.stream().mapToInt(egw::a).sum();
      return $$1 > dwf.c ? DataResult.error(() -> "Sum of layer heights is > " + dwf.c, $$0) : DataResult.success($$0);
   }

   private egz(Optional<jn<ejc>> $$0, List<egw> $$1, boolean $$2, boolean $$3, Optional<jj<ddf>> $$4, jj.c<ddf> $$5, jj<eia> $$6, jj<eia> $$7) {
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

   private static jj<ddf> a(Optional<? extends jj<ddf>> $$0, jj<ddf> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jj<ddf>)$$0.get();
      }
   }

   public egz(Optional<jn<ejc>> $$0, jj<ddf> $$1, List<jj<eia>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egz a(List<egw> $$0, Optional<jn<ejc>> $$1, jj<ddf> $$2) {
      egz $$3 = new egz($$1, $$2, this.j);

      for (egw $$4 : $$0) {
         $$3.d.add(new egw($$4.a(), $$4.b().b()));
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

   public ddg a(jj<ddf> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         ddg $$1 = this.d().a().d();
         ddg.b $$2 = new ddg.b();
         if (this.i) {
            for (jj<eia> $$3 : this.j) {
               $$2.a(dyb.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddm.a)) && this.h;
         if ($$4) {
            List<jn<eia>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dyb.b.d.ordinal() && $$6 != dyb.b.e.ordinal() && (!this.i || $$6 != dyb.b.b.ordinal())) {
                  for (jj<eia> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsk> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsk $$11 = $$9.get($$10);
            if (!dyf.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dyb.b.k, sc.a(ebk.ab, new eds($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jn<ejc>> c() {
      return this.c;
   }

   public jj<ddf> d() {
      return this.e;
   }

   public List<egw> e() {
      return this.d;
   }

   public List<dsk> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egw $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfj.a));
   }

   public static egz a(jk<ddf> $$0, jk<ejc> $$1, jk<eia> $$2) {
      jn<ejc> $$3 = jn.a($$1.b(eip.r), $$1.b(eip.a));
      egz $$4 = new egz(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egw(1, dfj.F));
      $$4.e().add(new egw(2, dfj.j));
      $$4.e().add(new egw(1, dfj.i));
      $$4.g();
      return $$4;
   }

   public static jj<ddf> a(jk<ddf> $$0) {
      return $$0.b(ddm.b);
   }

   public static List<jj<eia>> b(jk<eia> $$0) {
      return List.of($$0.b(rz.g), $$0.b(rz.h));
   }
}
