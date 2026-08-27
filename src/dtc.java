import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtc {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtc> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ht.a(jc.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dsz.a.listOf().fieldOf("layers").forGetter(dtc::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqk.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aep.d(cqr.b),
                  aep.d(oy.g),
                  aep.d(oy.h)
               )
               .apply($$0, dtc::new)
      )
      .comapFlatMap(dtc::a, Function.identity())
      .stable();
   private final Optional<hi<dvf>> c;
   private final List<dsz> d = Lists.newArrayList();
   private final he<cqk> e;
   private final List<dfa> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<he<dud>> j;

   private static DataResult<dtc> a(dtc $$0) {
      int $$1 = $$0.d.stream().mapToInt(dsz::a).sum();
      return $$1 > dij.c ? DataResult.error(() -> "Sum of layer heights is > " + dij.c, $$0) : DataResult.success($$0);
   }

   private dtc(Optional<hi<dvf>> $$0, List<dsz> $$1, boolean $$2, boolean $$3, Optional<he<cqk>> $$4, he.c<cqk> $$5, he<dud> $$6, he<dud> $$7) {
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

   private static he<cqk> a(Optional<? extends he<cqk>> $$0, he<cqk> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (he<cqk>)$$0.get();
      }
   }

   public dtc(Optional<hi<dvf>> $$0, he<cqk> $$1, List<he<dud>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtc a(List<dsz> $$0, Optional<hi<dvf>> $$1, he<cqk> $$2) {
      dtc $$3 = new dtc($$1, $$2, this.j);

      for (dsz $$4 : $$0) {
         $$3.d.add(new dsz($$4.a(), $$4.b().b()));
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

   public cql a(he<cqk> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cql $$1 = this.d().a().d();
         cql.b $$2 = new cql.b();
         if (this.i) {
            for (he<dud> $$3 : this.j) {
               $$2.a(dkf.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cqr.a)) && this.h;
         if ($$4) {
            List<hi<dud>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dkf.b.d.ordinal() && $$6 != dkf.b.e.ordinal() && (!this.i || $$6 != dkf.b.b.ordinal())) {
                  for (he<dud> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dfa> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dfa $$11 = $$9.get($$10);
            if (!dkj.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dkf.b.k, pb.a(dnn.ab, new dpv($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hi<dvf>> c() {
      return this.c;
   }

   public he<cqk> d() {
      return this.e;
   }

   public List<dsz> e() {
      return this.d;
   }

   public List<dfa> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dsz $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csn.a));
   }

   public static dtc a(hf<cqk> $$0, hf<dvf> $$1, hf<dud> $$2) {
      hi<dvf> $$3 = hi.a($$1.b(dus.r), $$1.b(dus.a));
      dtc $$4 = new dtc(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dsz(1, csn.F));
      $$4.e().add(new dsz(2, csn.j));
      $$4.e().add(new dsz(1, csn.i));
      $$4.g();
      return $$4;
   }

   public static he<cqk> a(hf<cqk> $$0) {
      return $$0.b(cqr.b);
   }

   public static List<he<dud>> b(hf<dud> $$0) {
      return List.of($$0.b(oy.g), $$0.b(oy.h));
   }
}
