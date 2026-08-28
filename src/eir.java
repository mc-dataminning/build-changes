import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eir {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eir> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.a(lv.aT).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eio.a.listOf().fieldOf("layers").forGetter(eir::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  det.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akz.d(dfa.b),
                  akz.d(sg.g),
                  akz.d(sg.h)
               )
               .apply($$0, eir::new)
      )
      .comapFlatMap(eir::a, Function.identity())
      .stable();
   private final Optional<jr<eku>> c;
   private final List<eio> d = Lists.newArrayList();
   private final jn<det> e;
   private final List<dua> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jn<ejs>> j;

   private static DataResult<eir> a(eir $$0) {
      int $$1 = $$0.d.stream().mapToInt(eio::a).sum();
      return $$1 > dxw.c ? DataResult.error(() -> "Sum of layer heights is > " + dxw.c, $$0) : DataResult.success($$0);
   }

   private eir(Optional<jr<eku>> $$0, List<eio> $$1, boolean $$2, boolean $$3, Optional<jn<det>> $$4, jn.c<det> $$5, jn<ejs> $$6, jn<ejs> $$7) {
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

   private static jn<det> a(Optional<? extends jn<det>> $$0, jn<det> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jn<det>)$$0.get();
      }
   }

   public eir(Optional<jr<eku>> $$0, jn<det> $$1, List<jn<ejs>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eir a(List<eio> $$0, Optional<jr<eku>> $$1, jn<det> $$2) {
      eir $$3 = new eir($$1, $$2, this.j);

      for (eio $$4 : $$0) {
         $$3.d.add(new eio($$4.a(), $$4.b().b()));
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

   public deu a(jn<det> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         deu $$1 = this.d().a().d();
         deu.b $$2 = new deu.b();
         if (this.i) {
            for (jn<ejs> $$3 : this.j) {
               $$2.a(dzs.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dfa.a)) && this.h;
         if ($$4) {
            List<jr<ejs>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dzs.a.d.ordinal() && $$6 != dzs.a.e.ordinal() && (!this.i || $$6 != dzs.a.b.ordinal())) {
                  for (jn<ejs> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dua> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dua $$11 = $$9.get($$10);
            if (!dzw.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dzs.a.k, sj.a(edc.ac, new efk($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jr<eku>> c() {
      return this.c;
   }

   public jn<det> d() {
      return this.e;
   }

   public List<eio> e() {
      return this.d;
   }

   public List<dua> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eio $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dgx.a));
   }

   public static eir a(jo<det> $$0, jo<eku> $$1, jo<ejs> $$2) {
      jr<eku> $$3 = jr.a($$1.b(ekh.r), $$1.b(ekh.a));
      eir $$4 = new eir(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eio(1, dgx.F));
      $$4.e().add(new eio(2, dgx.j));
      $$4.e().add(new eio(1, dgx.i));
      $$4.g();
      return $$4;
   }

   public static jn<det> a(jo<det> $$0) {
      return $$0.b(dfa.b);
   }

   public static List<jn<ejs>> b(jo<ejs> $$0) {
      return List.of($$0.b(sg.g), $$0.b(sg.h));
   }
}
