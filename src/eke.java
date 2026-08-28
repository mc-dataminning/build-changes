import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eke {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eke> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.aU).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ekb.a.listOf().fieldOf("layers").forGetter(eke::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dgh.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alj.d(dgo.b),
                  alj.d(so.g),
                  alj.d(so.h)
               )
               .apply($$0, eke::new)
      )
      .comapFlatMap(eke::a, Function.identity())
      .stable();
   private final Optional<ju<emh>> c;
   private final List<ekb> d = Lists.newArrayList();
   private final jq<dgh> e;
   private final List<dvo> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<elf>> j;

   private static DataResult<eke> a(eke $$0) {
      int $$1 = $$0.d.stream().mapToInt(ekb::a).sum();
      return $$1 > dzj.c ? DataResult.error(() -> "Sum of layer heights is > " + dzj.c, $$0) : DataResult.success($$0);
   }

   private eke(Optional<ju<emh>> $$0, List<ekb> $$1, boolean $$2, boolean $$3, Optional<jq<dgh>> $$4, jq.c<dgh> $$5, jq<elf> $$6, jq<elf> $$7) {
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

   private static jq<dgh> a(Optional<? extends jq<dgh>> $$0, jq<dgh> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dgh>)$$0.get();
      }
   }

   public eke(Optional<ju<emh>> $$0, jq<dgh> $$1, List<jq<elf>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eke a(List<ekb> $$0, Optional<ju<emh>> $$1, jq<dgh> $$2) {
      eke $$3 = new eke($$1, $$2, this.j);

      for (ekb $$4 : $$0) {
         $$3.d.add(new ekb($$4.a(), $$4.b().b()));
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

   public dgi a(jq<dgh> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dgi $$1 = this.d().a().d();
         dgi.b $$2 = new dgi.b();
         if (this.i) {
            for (jq<elf> $$3 : this.j) {
               $$2.a(ebf.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dgo.a)) && this.h;
         if ($$4) {
            List<ju<elf>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ebf.a.d.ordinal() && $$6 != ebf.a.e.ordinal() && (!this.i || $$6 != ebf.a.b.ordinal())) {
                  for (jq<elf> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dvo> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dvo $$11 = $$9.get($$10);
            if (!ebj.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ebf.a.k, sr.a(eep.ac, new egx($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<emh>> c() {
      return this.c;
   }

   public jq<dgh> d() {
      return this.e;
   }

   public List<ekb> e() {
      return this.d;
   }

   public List<dvo> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ekb $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dil.a));
   }

   public static eke a(jr<dgh> $$0, jr<emh> $$1, jr<elf> $$2) {
      ju<emh> $$3 = ju.a($$1.b(elu.r), $$1.b(elu.a));
      eke $$4 = new eke(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ekb(1, dil.F));
      $$4.e().add(new ekb(2, dil.j));
      $$4.e().add(new ekb(1, dil.i));
      $$4.g();
      return $$4;
   }

   public static jq<dgh> a(jr<dgh> $$0) {
      return $$0.b(dgo.b);
   }

   public static List<jq<elf>> b(jr<elf> $$0) {
      return List.of($$0.b(so.g), $$0.b(so.h));
   }
}
