import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class emn {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emn> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  emk.a.listOf().fieldOf("layers").forGetter(emn::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dik.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alx.d(dir.b),
                  alx.d(sy.g),
                  alx.d(sy.h)
               )
               .apply($$0, emn::new)
      )
      .comapFlatMap(emn::a, Function.identity())
      .stable();
   private final Optional<ju<eoq>> c;
   private final List<emk> d = Lists.newArrayList();
   private final jq<dik> e;
   private final List<dxv> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<eno>> j;

   private static DataResult<emn> a(emn $$0) {
      int $$1 = $$0.d.stream().mapToInt(emk::a).sum();
      return $$1 > ebq.c ? DataResult.error(() -> "Sum of layer heights is > " + ebq.c, $$0) : DataResult.success($$0);
   }

   private emn(Optional<ju<eoq>> $$0, List<emk> $$1, boolean $$2, boolean $$3, Optional<jq<dik>> $$4, jq.c<dik> $$5, jq<eno> $$6, jq<eno> $$7) {
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

   private static jq<dik> a(Optional<? extends jq<dik>> $$0, jq<dik> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dik>)$$0.get();
      }
   }

   public emn(Optional<ju<eoq>> $$0, jq<dik> $$1, List<jq<eno>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public emn a(List<emk> $$0, Optional<ju<eoq>> $$1, jq<dik> $$2) {
      emn $$3 = new emn($$1, $$2, this.j);

      for (emk $$4 : $$0) {
         $$3.d.add(new emk($$4.a(), $$4.b().b()));
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

   public dil a(jq<dik> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dil $$1 = this.d().a().d();
         dil.b $$2 = new dil.b();
         if (this.i) {
            for (jq<eno> $$3 : this.j) {
               $$2.a(edm.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dir.a)) && this.h;
         if ($$4) {
            List<ju<eno>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != edm.a.d.ordinal() && $$6 != edm.a.e.ordinal() && (!this.i || $$6 != edm.a.b.ordinal())) {
                  for (jq<eno> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dxv> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dxv $$11 = $$9.get($$10);
            if (!edq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(edm.a.k, tb.a(egw.ac, new eje($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<eoq>> c() {
      return this.c;
   }

   public jq<dik> d() {
      return this.e;
   }

   public List<emk> e() {
      return this.d;
   }

   public List<dxv> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (emk $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dko.a));
   }

   public static emn a(jr<dik> $$0, jr<eoq> $$1, jr<eno> $$2) {
      ju<eoq> $$3 = ju.a($$1.b(eod.r), $$1.b(eod.a));
      emn $$4 = new emn(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new emk(1, dko.I));
      $$4.e().add(new emk(2, dko.j));
      $$4.e().add(new emk(1, dko.i));
      $$4.g();
      return $$4;
   }

   public static jq<dik> a(jr<dik> $$0) {
      return $$0.b(dir.b);
   }

   public static List<jq<eno>> b(jr<eno> $$0) {
      return List.of($$0.b(sy.g), $$0.b(sy.h));
   }
}
