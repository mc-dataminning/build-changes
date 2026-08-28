import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egm {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egm> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egj.a.listOf().fieldOf("layers").forGetter(egm::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcw.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alc.d(ddd.b),
                  alc.d(st.g),
                  alc.d(st.h)
               )
               .apply($$0, egm::new)
      )
      .comapFlatMap(egm::a, Function.identity())
      .stable();
   private final Optional<jm<eip>> c;
   private final List<egj> d = Lists.newArrayList();
   private final ji<dcw> e;
   private final List<dsb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<ehn>> j;

   private static DataResult<egm> a(egm $$0) {
      int $$1 = $$0.d.stream().mapToInt(egj::a).sum();
      return $$1 > dvt.c ? DataResult.error(() -> "Sum of layer heights is > " + dvt.c, $$0) : DataResult.success($$0);
   }

   private egm(Optional<jm<eip>> $$0, List<egj> $$1, boolean $$2, boolean $$3, Optional<ji<dcw>> $$4, ji.c<dcw> $$5, ji<ehn> $$6, ji<ehn> $$7) {
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

   private static ji<dcw> a(Optional<? extends ji<dcw>> $$0, ji<dcw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcw>)$$0.get();
      }
   }

   public egm(Optional<jm<eip>> $$0, ji<dcw> $$1, List<ji<ehn>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egm a(List<egj> $$0, Optional<jm<eip>> $$1, ji<dcw> $$2) {
      egm $$3 = new egm($$1, $$2, this.j);

      for (egj $$4 : $$0) {
         $$3.d.add(new egj($$4.a(), $$4.b().b()));
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

   public dcx a(ji<dcw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dcx $$1 = this.d().a().d();
         dcx.b $$2 = new dcx.b();
         if (this.i) {
            for (ji<ehn> $$3 : this.j) {
               $$2.a(dxp.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddd.a)) && this.h;
         if ($$4) {
            List<jm<ehn>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxp.b.d.ordinal() && $$6 != dxp.b.e.ordinal() && (!this.i || $$6 != dxp.b.b.ordinal())) {
                  for (ji<ehn> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsb $$11 = $$9.get($$10);
            if (!dxt.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxp.b.k, sw.a(eax.ab, new edf($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eip>> c() {
      return this.c;
   }

   public ji<dcw> d() {
      return this.e;
   }

   public List<egj> e() {
      return this.d;
   }

   public List<dsb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egj $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfa.a));
   }

   public static egm a(jj<dcw> $$0, jj<eip> $$1, jj<ehn> $$2) {
      jm<eip> $$3 = jm.a($$1.b(eic.r), $$1.b(eic.a));
      egm $$4 = new egm(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egj(1, dfa.F));
      $$4.e().add(new egj(2, dfa.j));
      $$4.e().add(new egj(1, dfa.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcw> a(jj<dcw> $$0) {
      return $$0.b(ddd.b);
   }

   public static List<ji<ehn>> b(jj<ehn> $$0) {
      return List.of($$0.b(st.g), $$0.b(st.h));
   }
}
