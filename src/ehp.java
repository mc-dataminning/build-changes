import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ehp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehp> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.a(lu.aT).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ehm.a.listOf().fieldOf("layers").forGetter(ehp::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ddu.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ako.d(deb.b),
                  ako.d(sc.g),
                  ako.d(sc.h)
               )
               .apply($$0, ehp::new)
      )
      .comapFlatMap(ehp::a, Function.identity())
      .stable();
   private final Optional<jq<ejs>> c;
   private final List<ehm> d = Lists.newArrayList();
   private final jm<ddu> e;
   private final List<dta> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jm<eiq>> j;

   private static DataResult<ehp> a(ehp $$0) {
      int $$1 = $$0.d.stream().mapToInt(ehm::a).sum();
      return $$1 > dwv.c ? DataResult.error(() -> "Sum of layer heights is > " + dwv.c, $$0) : DataResult.success($$0);
   }

   private ehp(Optional<jq<ejs>> $$0, List<ehm> $$1, boolean $$2, boolean $$3, Optional<jm<ddu>> $$4, jm.c<ddu> $$5, jm<eiq> $$6, jm<eiq> $$7) {
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

   private static jm<ddu> a(Optional<? extends jm<ddu>> $$0, jm<ddu> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jm<ddu>)$$0.get();
      }
   }

   public ehp(Optional<jq<ejs>> $$0, jm<ddu> $$1, List<jm<eiq>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ehp a(List<ehm> $$0, Optional<jq<ejs>> $$1, jm<ddu> $$2) {
      ehp $$3 = new ehp($$1, $$2, this.j);

      for (ehm $$4 : $$0) {
         $$3.d.add(new ehm($$4.a(), $$4.b().b()));
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

   public ddv a(jm<ddu> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         ddv $$1 = this.d().a().d();
         ddv.b $$2 = new ddv.b();
         if (this.i) {
            for (jm<eiq> $$3 : this.j) {
               $$2.a(dyr.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(deb.a)) && this.h;
         if ($$4) {
            List<jq<eiq>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dyr.b.d.ordinal() && $$6 != dyr.b.e.ordinal() && (!this.i || $$6 != dyr.b.b.ordinal())) {
                  for (jm<eiq> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dta> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dta $$11 = $$9.get($$10);
            if (!dyv.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dyr.b.k, sf.a(eca.ab, new eei($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jq<ejs>> c() {
      return this.c;
   }

   public jm<ddu> d() {
      return this.e;
   }

   public List<ehm> e() {
      return this.d;
   }

   public List<dta> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ehm $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfy.a));
   }

   public static ehp a(jn<ddu> $$0, jn<ejs> $$1, jn<eiq> $$2) {
      jq<ejs> $$3 = jq.a($$1.b(ejf.r), $$1.b(ejf.a));
      ehp $$4 = new ehp(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ehm(1, dfy.F));
      $$4.e().add(new ehm(2, dfy.j));
      $$4.e().add(new ehm(1, dfy.i));
      $$4.g();
      return $$4;
   }

   public static jm<ddu> a(jn<ddu> $$0) {
      return $$0.b(deb.b);
   }

   public static List<jm<eiq>> b(jn<eiq> $$0) {
      return List.of($$0.b(sc.g), $$0.b(sc.h));
   }
}
