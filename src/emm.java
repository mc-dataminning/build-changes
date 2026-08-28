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
                  kg.a(mc.aY).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  emj.a.listOf().fieldOf("layers").forGetter(emm::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dic.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aks.d(dij.b),
                  aks.d(rr.g),
                  aks.d(rr.h)
               )
               .apply($$0, emm::new)
      )
      .comapFlatMap(emm::a, Function.identity())
      .stable();
   private final Optional<jv<eop>> c;
   private final List<emj> d = Lists.newArrayList();
   private final jr<dic> e;
   private final List<dxq> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jr<enn>> j;

   private static DataResult<emm> a(emm $$0) {
      int $$1 = $$0.d.stream().mapToInt(emj::a).sum();
      return $$1 > ebm.c ? DataResult.error(() -> "Sum of layer heights is > " + ebm.c, $$0) : DataResult.success($$0);
   }

   private emm(Optional<jv<eop>> $$0, List<emj> $$1, boolean $$2, boolean $$3, Optional<jr<dic>> $$4, jr.c<dic> $$5, jr<enn> $$6, jr<enn> $$7) {
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

   private static jr<dic> a(Optional<? extends jr<dic>> $$0, jr<dic> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jr<dic>)$$0.get();
      }
   }

   public emm(Optional<jv<eop>> $$0, jr<dic> $$1, List<jr<enn>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public emm a(List<emj> $$0, Optional<jv<eop>> $$1, jr<dic> $$2) {
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

   public did a(jr<dic> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         did $$1 = this.d().a().d();
         did.b $$2 = new did.b();
         if (this.i) {
            for (jr<enn> $$3 : this.j) {
               $$2.a(edk.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dij.a)) && this.h;
         if ($$4) {
            List<jv<enn>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != edk.a.d.ordinal() && $$6 != edk.a.e.ordinal() && (!this.i || $$6 != edk.a.b.ordinal())) {
                  for (jr<enn> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dxq> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dxq $$11 = $$9.get($$10);
            if (!edo.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(edk.a.k, ru.a(egu.ac, new ejc($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jv<eop>> c() {
      return this.c;
   }

   public jr<dic> d() {
      return this.e;
   }

   public List<emj> e() {
      return this.d;
   }

   public List<dxq> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (emj $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dkg.a));
   }

   public static emm a(js<dic> $$0, js<eop> $$1, js<enn> $$2) {
      jv<eop> $$3 = jv.a($$1.b(eoc.r), $$1.b(eoc.a));
      emm $$4 = new emm(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new emj(1, dkg.I));
      $$4.e().add(new emj(2, dkg.j));
      $$4.e().add(new emj(1, dkg.i));
      $$4.g();
      return $$4;
   }

   public static jr<dic> a(js<dic> $$0) {
      return $$0.b(dij.b);
   }

   public static List<jr<enn>> b(js<enn> $$0) {
      return List.of($$0.b(rr.g), $$0.b(rr.h));
   }
}
