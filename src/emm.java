import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class emm {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emm> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  emj.a.listOf().fieldOf("layers").forGetter(emm::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dij.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alx.d(diq.b),
                  alx.d(sy.g),
                  alx.d(sy.h)
               )
               .apply($$0, emm::new)
      )
      .comapFlatMap(emm::a, Function.identity())
      .stable();
   private final Optional<ju<eop>> c;
   private final List<emj> d = Lists.newArrayList();
   private final jq<dij> e;
   private final List<dxu> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<enn>> j;

   private static DataResult<emm> a(emm $$0) {
      int $$1 = $$0.d.stream().mapToInt(emj::a).sum();
      return $$1 > ebp.c ? DataResult.error(() -> "Sum of layer heights is > " + ebp.c, $$0) : DataResult.success($$0);
   }

   private emm(Optional<ju<eop>> $$0, List<emj> $$1, boolean $$2, boolean $$3, Optional<jq<dij>> $$4, jq.c<dij> $$5, jq<enn> $$6, jq<enn> $$7) {
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

   private static jq<dij> a(Optional<? extends jq<dij>> $$0, jq<dij> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dij>)$$0.get();
      }
   }

   public emm(Optional<ju<eop>> $$0, jq<dij> $$1, List<jq<enn>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public emm a(List<emj> $$0, Optional<ju<eop>> $$1, jq<dij> $$2) {
      emm $$3 = new emm($$1, $$2, this.j);

      for (emj $$4 : $$0) {
         $$3.d.add(new emj($$4.a(), $$4.b().b()));
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

   public dik a(jq<dij> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dik $$1 = this.d().a().d();
         dik.b $$2 = new dik.b();
         if (this.i) {
            for (jq<enn> $$3 : this.j) {
               $$2.a(edl.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(diq.a)) && this.h;
         if ($$4) {
            List<ju<enn>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != edl.a.d.ordinal() && $$6 != edl.a.e.ordinal() && (!this.i || $$6 != edl.a.b.ordinal())) {
                  for (jq<enn> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dxu> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dxu $$11 = $$9.get($$10);
            if (!edp.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(edl.a.k, tb.a(egv.ac, new ejd($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<eop>> c() {
      return this.c;
   }

   public jq<dij> d() {
      return this.e;
   }

   public List<emj> e() {
      return this.d;
   }

   public List<dxu> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (emj $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dkn.a));
   }

   public static emm a(jr<dij> $$0, jr<eop> $$1, jr<enn> $$2) {
      ju<eop> $$3 = ju.a($$1.b(eoc.r), $$1.b(eoc.a));
      emm $$4 = new emm(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new emj(1, dkn.I));
      $$4.e().add(new emj(2, dkn.j));
      $$4.e().add(new emj(1, dkn.i));
      $$4.g();
      return $$4;
   }

   public static jq<dij> a(jr<dij> $$0) {
      return $$0.b(diq.b);
   }

   public static List<jq<enn>> b(jr<enn> $$0) {
      return List.of($$0.b(sy.g), $$0.b(sy.h));
   }
}
