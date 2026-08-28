import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class elo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elo> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ell.a.listOf().fieldOf("layers").forGetter(elo::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dhj.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akt.d(dhq.b),
                  akt.d(rr.g),
                  akt.d(rr.h)
               )
               .apply($$0, elo::new)
      )
      .comapFlatMap(elo::a, Function.identity())
      .stable();
   private final Optional<jv<enr>> c;
   private final List<ell> d = Lists.newArrayList();
   private final jr<dhj> e;
   private final List<dww> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jr<emp>> j;

   private static DataResult<elo> a(elo $$0) {
      int $$1 = $$0.d.stream().mapToInt(ell::a).sum();
      return $$1 > ear.c ? DataResult.error(() -> "Sum of layer heights is > " + ear.c, $$0) : DataResult.success($$0);
   }

   private elo(Optional<jv<enr>> $$0, List<ell> $$1, boolean $$2, boolean $$3, Optional<jr<dhj>> $$4, jr.c<dhj> $$5, jr<emp> $$6, jr<emp> $$7) {
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

   private static jr<dhj> a(Optional<? extends jr<dhj>> $$0, jr<dhj> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jr<dhj>)$$0.get();
      }
   }

   public elo(Optional<jv<enr>> $$0, jr<dhj> $$1, List<jr<emp>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public elo a(List<ell> $$0, Optional<jv<enr>> $$1, jr<dhj> $$2) {
      elo $$3 = new elo($$1, $$2, this.j);

      for (ell $$4 : $$0) {
         $$3.d.add(new ell($$4.a(), $$4.b().b()));
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

   public dhk a(jr<dhj> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dhk $$1 = this.d().a().d();
         dhk.b $$2 = new dhk.b();
         if (this.i) {
            for (jr<emp> $$3 : this.j) {
               $$2.a(ecn.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dhq.a)) && this.h;
         if ($$4) {
            List<jv<emp>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ecn.a.d.ordinal() && $$6 != ecn.a.e.ordinal() && (!this.i || $$6 != ecn.a.b.ordinal())) {
                  for (jr<emp> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dww> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dww $$11 = $$9.get($$10);
            if (!ecr.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ecn.a.k, ru.a(efx.ac, new eif($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jv<enr>> c() {
      return this.c;
   }

   public jr<dhj> d() {
      return this.e;
   }

   public List<ell> e() {
      return this.d;
   }

   public List<dww> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ell $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(djn.a));
   }

   public static elo a(js<dhj> $$0, js<enr> $$1, js<emp> $$2) {
      jv<enr> $$3 = jv.a($$1.b(ene.r), $$1.b(ene.a));
      elo $$4 = new elo(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ell(1, djn.I));
      $$4.e().add(new ell(2, djn.j));
      $$4.e().add(new ell(1, djn.i));
      $$4.g();
      return $$4;
   }

   public static jr<dhj> a(js<dhj> $$0) {
      return $$0.b(dhq.b);
   }

   public static List<jr<emp>> b(js<emp> $$0) {
      return List.of($$0.b(rr.g), $$0.b(rr.h));
   }
}
