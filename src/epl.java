import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class epl {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epl> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.bd).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  epi.a.listOf().fieldOf("layers").forGetter(epl::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dkk.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ale.d(dkr.b),
                  ale.d(ru.g),
                  ale.d(ru.h)
               )
               .apply($$0, epl::new)
      )
      .comapFlatMap(epl::a, Function.identity())
      .stable();
   private final Optional<jj<ero>> c;
   private final List<epi> d = Lists.newArrayList();
   private final jf<dkk> e;
   private final List<eao> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jf<eqm>> j;

   private static DataResult<epl> a(epl $$0) {
      int $$1 = $$0.d.stream().mapToInt(epi::a).sum();
      return $$1 > eel.c ? DataResult.error(() -> "Sum of layer heights is > " + eel.c, $$0) : DataResult.success($$0);
   }

   private epl(Optional<jj<ero>> $$0, List<epi> $$1, boolean $$2, boolean $$3, Optional<jf<dkk>> $$4, jf.c<dkk> $$5, jf<eqm> $$6, jf<eqm> $$7) {
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

   private static jf<dkk> a(Optional<? extends jf<dkk>> $$0, jf<dkk> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jf<dkk>)$$0.get();
      }
   }

   public epl(Optional<jj<ero>> $$0, jf<dkk> $$1, List<jf<eqm>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public epl a(List<epi> $$0, Optional<jj<ero>> $$1, jf<dkk> $$2) {
      epl $$3 = new epl($$1, $$2, this.j);

      for (epi $$4 : $$0) {
         $$3.d.add(new epi($$4.a(), $$4.b().b()));
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

   public dkl a(jf<dkk> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dkl $$1 = this.d().a().d();
         dkl.b $$2 = new dkl.b();
         if (this.i) {
            for (jf<eqm> $$3 : this.j) {
               $$2.a(egj.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dkr.a)) && this.h;
         if ($$4) {
            List<jj<eqm>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != egj.a.d.ordinal() && $$6 != egj.a.e.ordinal() && (!this.i || $$6 != egj.a.b.ordinal())) {
                  for (jf<eqm> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<eao> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            eao $$11 = $$9.get($$10);
            if (!egn.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(egj.a.k, rx.a(ejt.ac, new emb($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jj<ero>> c() {
      return this.c;
   }

   public jf<dkk> d() {
      return this.e;
   }

   public List<epi> e() {
      return this.d;
   }

   public List<eao> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (epi $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dmo.a));
   }

   public static epl a(jg<dkk> $$0, jg<ero> $$1, jg<eqm> $$2) {
      jj<ero> $$3 = jj.a($$1.b(erb.r), $$1.b(erb.a));
      epl $$4 = new epl(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new epi(1, dmo.I));
      $$4.e().add(new epi(2, dmo.j));
      $$4.e().add(new epi(1, dmo.i));
      $$4.g();
      return $$4;
   }

   public static jf<dkk> a(jg<dkk> $$0) {
      return $$0.b(dkr.b);
   }

   public static List<jf<eqm>> b(jg<eqm> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
