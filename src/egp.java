import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egp> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egm.a.listOf().fieldOf("layers").forGetter(egp::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcz.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ald.d(ddg.b),
                  ald.d(su.g),
                  ald.d(su.h)
               )
               .apply($$0, egp::new)
      )
      .comapFlatMap(egp::a, Function.identity())
      .stable();
   private final Optional<jm<eis>> c;
   private final List<egm> d = Lists.newArrayList();
   private final ji<dcz> e;
   private final List<dse> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<ehq>> j;

   private static DataResult<egp> a(egp $$0) {
      int $$1 = $$0.d.stream().mapToInt(egm::a).sum();
      return $$1 > dvw.c ? DataResult.error(() -> "Sum of layer heights is > " + dvw.c, $$0) : DataResult.success($$0);
   }

   private egp(Optional<jm<eis>> $$0, List<egm> $$1, boolean $$2, boolean $$3, Optional<ji<dcz>> $$4, ji.c<dcz> $$5, ji<ehq> $$6, ji<ehq> $$7) {
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

   private static ji<dcz> a(Optional<? extends ji<dcz>> $$0, ji<dcz> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcz>)$$0.get();
      }
   }

   public egp(Optional<jm<eis>> $$0, ji<dcz> $$1, List<ji<ehq>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egp a(List<egm> $$0, Optional<jm<eis>> $$1, ji<dcz> $$2) {
      egp $$3 = new egp($$1, $$2, this.j);

      for (egm $$4 : $$0) {
         $$3.d.add(new egm($$4.a(), $$4.b().b()));
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

   public dda a(ji<dcz> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dda $$1 = this.d().a().d();
         dda.b $$2 = new dda.b();
         if (this.i) {
            for (ji<ehq> $$3 : this.j) {
               $$2.a(dxs.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddg.a)) && this.h;
         if ($$4) {
            List<jm<ehq>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxs.b.d.ordinal() && $$6 != dxs.b.e.ordinal() && (!this.i || $$6 != dxs.b.b.ordinal())) {
                  for (ji<ehq> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dse> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dse $$11 = $$9.get($$10);
            if (!dxw.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxs.b.k, sx.a(eba.ab, new edi($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eis>> c() {
      return this.c;
   }

   public ji<dcz> d() {
      return this.e;
   }

   public List<egm> e() {
      return this.d;
   }

   public List<dse> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egm $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfd.a));
   }

   public static egp a(jj<dcz> $$0, jj<eis> $$1, jj<ehq> $$2) {
      jm<eis> $$3 = jm.a($$1.b(eif.r), $$1.b(eif.a));
      egp $$4 = new egp(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egm(1, dfd.F));
      $$4.e().add(new egm(2, dfd.j));
      $$4.e().add(new egm(1, dfd.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcz> a(jj<dcz> $$0) {
      return $$0.b(ddg.b);
   }

   public static List<ji<ehq>> b(jj<ehq> $$0) {
      return List.of($$0.b(su.g), $$0.b(su.h));
   }
}
