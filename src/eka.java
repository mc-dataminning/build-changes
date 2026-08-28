import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eka {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eka> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(lz.aU).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ejx.a.listOf().fieldOf("layers").forGetter(eka::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dgc.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alg.d(dgj.b),
                  alg.d(sl.g),
                  alg.d(sl.h)
               )
               .apply($$0, eka::new)
      )
      .comapFlatMap(eka::a, Function.identity())
      .stable();
   private final Optional<ju<emd>> c;
   private final List<ejx> d = Lists.newArrayList();
   private final jq<dgc> e;
   private final List<dvj> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<elb>> j;

   private static DataResult<eka> a(eka $$0) {
      int $$1 = $$0.d.stream().mapToInt(ejx::a).sum();
      return $$1 > dzf.c ? DataResult.error(() -> "Sum of layer heights is > " + dzf.c, $$0) : DataResult.success($$0);
   }

   private eka(Optional<ju<emd>> $$0, List<ejx> $$1, boolean $$2, boolean $$3, Optional<jq<dgc>> $$4, jq.c<dgc> $$5, jq<elb> $$6, jq<elb> $$7) {
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

   private static jq<dgc> a(Optional<? extends jq<dgc>> $$0, jq<dgc> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dgc>)$$0.get();
      }
   }

   public eka(Optional<ju<emd>> $$0, jq<dgc> $$1, List<jq<elb>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eka a(List<ejx> $$0, Optional<ju<emd>> $$1, jq<dgc> $$2) {
      eka $$3 = new eka($$1, $$2, this.j);

      for (ejx $$4 : $$0) {
         $$3.d.add(new ejx($$4.a(), $$4.b().b()));
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

   public dgd a(jq<dgc> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dgd $$1 = this.d().a().d();
         dgd.b $$2 = new dgd.b();
         if (this.i) {
            for (jq<elb> $$3 : this.j) {
               $$2.a(ebb.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dgj.a)) && this.h;
         if ($$4) {
            List<ju<elb>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ebb.a.d.ordinal() && $$6 != ebb.a.e.ordinal() && (!this.i || $$6 != ebb.a.b.ordinal())) {
                  for (jq<elb> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dvj> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dvj $$11 = $$9.get($$10);
            if (!ebf.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ebb.a.k, so.a(eel.ac, new egt($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<emd>> c() {
      return this.c;
   }

   public jq<dgc> d() {
      return this.e;
   }

   public List<ejx> e() {
      return this.d;
   }

   public List<dvj> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ejx $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dig.a));
   }

   public static eka a(jr<dgc> $$0, jr<emd> $$1, jr<elb> $$2) {
      ju<emd> $$3 = ju.a($$1.b(elq.r), $$1.b(elq.a));
      eka $$4 = new eka(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ejx(1, dig.F));
      $$4.e().add(new ejx(2, dig.j));
      $$4.e().add(new ejx(1, dig.i));
      $$4.g();
      return $$4;
   }

   public static jq<dgc> a(jr<dgc> $$0) {
      return $$0.b(dgj.b);
   }

   public static List<jq<elb>> b(jr<elb> $$0) {
      return List.of($$0.b(sl.g), $$0.b(sl.h));
   }
}
