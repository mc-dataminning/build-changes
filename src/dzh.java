import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dzh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dzh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ix.a(kg.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dze.a.listOf().fieldOf("layers").forGetter(dzh::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cwm.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aiw.d(cwt.b),
                  aiw.d(qy.g),
                  aiw.d(qy.h)
               )
               .apply($$0, dzh::new)
      )
      .comapFlatMap(dzh::a, Function.identity())
      .stable();
   private final Optional<in<ebk>> c;
   private final List<dze> d = Lists.newArrayList();
   private final ij<cwm> e;
   private final List<dlf> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ij<eai>> j;

   private static DataResult<dzh> a(dzh $$0) {
      int $$1 = $$0.d.stream().mapToInt(dze::a).sum();
      return $$1 > doo.c ? DataResult.error(() -> "Sum of layer heights is > " + doo.c, $$0) : DataResult.success($$0);
   }

   private dzh(Optional<in<ebk>> $$0, List<dze> $$1, boolean $$2, boolean $$3, Optional<ij<cwm>> $$4, ij.c<cwm> $$5, ij<eai> $$6, ij<eai> $$7) {
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

   private static ij<cwm> a(Optional<? extends ij<cwm>> $$0, ij<cwm> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ij<cwm>)$$0.get();
      }
   }

   public dzh(Optional<in<ebk>> $$0, ij<cwm> $$1, List<ij<eai>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dzh a(List<dze> $$0, Optional<in<ebk>> $$1, ij<cwm> $$2) {
      dzh $$3 = new dzh($$1, $$2, this.j);

      for (dze $$4 : $$0) {
         $$3.d.add(new dze($$4.a(), $$4.b().b()));
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

   public cwn a(ij<cwm> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cwn $$1 = this.d().a().d();
         cwn.b $$2 = new cwn.b();
         if (this.i) {
            for (ij<eai> $$3 : this.j) {
               $$2.a(dqk.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cwt.a)) && this.h;
         if ($$4) {
            List<in<eai>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dqk.b.d.ordinal() && $$6 != dqk.b.e.ordinal() && (!this.i || $$6 != dqk.b.b.ordinal())) {
                  for (ij<eai> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dlf> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dlf $$11 = $$9.get($$10);
            if (!dqo.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dqk.b.k, rb.a(dts.ab, new dwa($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<in<ebk>> c() {
      return this.c;
   }

   public ij<cwm> d() {
      return this.e;
   }

   public List<dze> e() {
      return this.d;
   }

   public List<dlf> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dze $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cyq.a));
   }

   public static dzh a(ik<cwm> $$0, ik<ebk> $$1, ik<eai> $$2) {
      in<ebk> $$3 = in.a($$1.b(eax.r), $$1.b(eax.a));
      dzh $$4 = new dzh(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dze(1, cyq.F));
      $$4.e().add(new dze(2, cyq.j));
      $$4.e().add(new dze(1, cyq.i));
      $$4.g();
      return $$4;
   }

   public static ij<cwm> a(ik<cwm> $$0) {
      return $$0.b(cwt.b);
   }

   public static List<ij<eai>> b(ik<eai> $$0) {
      return List.of($$0.b(qy.g), $$0.b(qy.h));
   }
}
