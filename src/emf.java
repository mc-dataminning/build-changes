import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class emf {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emf> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.aV).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  emc.a.listOf().fieldOf("layers").forGetter(emf::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dic.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alx.d(dij.b),
                  alx.d(sy.g),
                  alx.d(sy.h)
               )
               .apply($$0, emf::new)
      )
      .comapFlatMap(emf::a, Function.identity())
      .stable();
   private final Optional<ju<eoi>> c;
   private final List<emc> d = Lists.newArrayList();
   private final jq<dic> e;
   private final List<dxn> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<eng>> j;

   private static DataResult<emf> a(emf $$0) {
      int $$1 = $$0.d.stream().mapToInt(emc::a).sum();
      return $$1 > ebi.c ? DataResult.error(() -> "Sum of layer heights is > " + ebi.c, $$0) : DataResult.success($$0);
   }

   private emf(Optional<ju<eoi>> $$0, List<emc> $$1, boolean $$2, boolean $$3, Optional<jq<dic>> $$4, jq.c<dic> $$5, jq<eng> $$6, jq<eng> $$7) {
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

   private static jq<dic> a(Optional<? extends jq<dic>> $$0, jq<dic> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dic>)$$0.get();
      }
   }

   public emf(Optional<ju<eoi>> $$0, jq<dic> $$1, List<jq<eng>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public emf a(List<emc> $$0, Optional<ju<eoi>> $$1, jq<dic> $$2) {
      emf $$3 = new emf($$1, $$2, this.j);

      for (emc $$4 : $$0) {
         $$3.d.add(new emc($$4.a(), $$4.b().b()));
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

   public did a(jq<dic> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         did $$1 = this.d().a().d();
         did.b $$2 = new did.b();
         if (this.i) {
            for (jq<eng> $$3 : this.j) {
               $$2.a(ede.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dij.a)) && this.h;
         if ($$4) {
            List<ju<eng>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ede.a.d.ordinal() && $$6 != ede.a.e.ordinal() && (!this.i || $$6 != ede.a.b.ordinal())) {
                  for (jq<eng> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dxn> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dxn $$11 = $$9.get($$10);
            if (!edi.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ede.a.k, tb.a(ego.ac, new eiw($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<eoi>> c() {
      return this.c;
   }

   public jq<dic> d() {
      return this.e;
   }

   public List<emc> e() {
      return this.d;
   }

   public List<dxn> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (emc $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dkg.a));
   }

   public static emf a(jr<dic> $$0, jr<eoi> $$1, jr<eng> $$2) {
      ju<eoi> $$3 = ju.a($$1.b(env.r), $$1.b(env.a));
      emf $$4 = new emf(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new emc(1, dkg.I));
      $$4.e().add(new emc(2, dkg.j));
      $$4.e().add(new emc(1, dkg.i));
      $$4.g();
      return $$4;
   }

   public static jq<dic> a(jr<dic> $$0) {
      return $$0.b(dij.b);
   }

   public static List<jq<eng>> b(jr<eng> $$0) {
      return List.of($$0.b(sy.g), $$0.b(sy.h));
   }
}
