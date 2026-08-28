import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ejf {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejf> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.a(lv.aU).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ejc.a.listOf().fieldOf("layers").forGetter(ejf::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dfh.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ala.d(dfo.b),
                  ala.d(sg.g),
                  ala.d(sg.h)
               )
               .apply($$0, ejf::new)
      )
      .comapFlatMap(ejf::a, Function.identity())
      .stable();
   private final Optional<jr<eli>> c;
   private final List<ejc> d = Lists.newArrayList();
   private final jn<dfh> e;
   private final List<duo> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jn<ekg>> j;

   private static DataResult<ejf> a(ejf $$0) {
      int $$1 = $$0.d.stream().mapToInt(ejc::a).sum();
      return $$1 > dyk.c ? DataResult.error(() -> "Sum of layer heights is > " + dyk.c, $$0) : DataResult.success($$0);
   }

   private ejf(Optional<jr<eli>> $$0, List<ejc> $$1, boolean $$2, boolean $$3, Optional<jn<dfh>> $$4, jn.c<dfh> $$5, jn<ekg> $$6, jn<ekg> $$7) {
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

   private static jn<dfh> a(Optional<? extends jn<dfh>> $$0, jn<dfh> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jn<dfh>)$$0.get();
      }
   }

   public ejf(Optional<jr<eli>> $$0, jn<dfh> $$1, List<jn<ekg>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ejf a(List<ejc> $$0, Optional<jr<eli>> $$1, jn<dfh> $$2) {
      ejf $$3 = new ejf($$1, $$2, this.j);

      for (ejc $$4 : $$0) {
         $$3.d.add(new ejc($$4.a(), $$4.b().b()));
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

   public dfi a(jn<dfh> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dfi $$1 = this.d().a().d();
         dfi.b $$2 = new dfi.b();
         if (this.i) {
            for (jn<ekg> $$3 : this.j) {
               $$2.a(eag.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dfo.a)) && this.h;
         if ($$4) {
            List<jr<ekg>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != eag.a.d.ordinal() && $$6 != eag.a.e.ordinal() && (!this.i || $$6 != eag.a.b.ordinal())) {
                  for (jn<ekg> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<duo> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            duo $$11 = $$9.get($$10);
            if (!eak.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(eag.a.k, sj.a(edq.ac, new efy($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jr<eli>> c() {
      return this.c;
   }

   public jn<dfh> d() {
      return this.e;
   }

   public List<ejc> e() {
      return this.d;
   }

   public List<duo> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ejc $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dhl.a));
   }

   public static ejf a(jo<dfh> $$0, jo<eli> $$1, jo<ekg> $$2) {
      jr<eli> $$3 = jr.a($$1.b(ekv.r), $$1.b(ekv.a));
      ejf $$4 = new ejf(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ejc(1, dhl.F));
      $$4.e().add(new ejc(2, dhl.j));
      $$4.e().add(new ejc(1, dhl.i));
      $$4.g();
      return $$4;
   }

   public static jn<dfh> a(jo<dfh> $$0) {
      return $$0.b(dfo.b);
   }

   public static List<jn<ekg>> b(jo<ekg> $$0) {
      return List.of($$0.b(sg.g), $$0.b(sg.h));
   }
}
