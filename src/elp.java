import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class elp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elp> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  elm.a.listOf().fieldOf("layers").forGetter(elp::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dhk.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aks.d(dhr.b),
                  aks.d(rr.g),
                  aks.d(rr.h)
               )
               .apply($$0, elp::new)
      )
      .comapFlatMap(elp::a, Function.identity())
      .stable();
   private final Optional<jv<ens>> c;
   private final List<elm> d = Lists.newArrayList();
   private final jr<dhk> e;
   private final List<dwx> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jr<emq>> j;

   private static DataResult<elp> a(elp $$0) {
      int $$1 = $$0.d.stream().mapToInt(elm::a).sum();
      return $$1 > eas.c ? DataResult.error(() -> "Sum of layer heights is > " + eas.c, $$0) : DataResult.success($$0);
   }

   private elp(Optional<jv<ens>> $$0, List<elm> $$1, boolean $$2, boolean $$3, Optional<jr<dhk>> $$4, jr.c<dhk> $$5, jr<emq> $$6, jr<emq> $$7) {
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

   private static jr<dhk> a(Optional<? extends jr<dhk>> $$0, jr<dhk> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jr<dhk>)$$0.get();
      }
   }

   public elp(Optional<jv<ens>> $$0, jr<dhk> $$1, List<jr<emq>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public elp a(List<elm> $$0, Optional<jv<ens>> $$1, jr<dhk> $$2) {
      elp $$3 = new elp($$1, $$2, this.j);

      for (elm $$4 : $$0) {
         $$3.d.add(new elm($$4.a(), $$4.b().b()));
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

   public dhl a(jr<dhk> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dhl $$1 = this.d().a().d();
         dhl.b $$2 = new dhl.b();
         if (this.i) {
            for (jr<emq> $$3 : this.j) {
               $$2.a(eco.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dhr.a)) && this.h;
         if ($$4) {
            List<jv<emq>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != eco.a.d.ordinal() && $$6 != eco.a.e.ordinal() && (!this.i || $$6 != eco.a.b.ordinal())) {
                  for (jr<emq> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dwx> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dwx $$11 = $$9.get($$10);
            if (!ecs.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(eco.a.k, ru.a(efy.ac, new eig($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jv<ens>> c() {
      return this.c;
   }

   public jr<dhk> d() {
      return this.e;
   }

   public List<elm> e() {
      return this.d;
   }

   public List<dwx> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (elm $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(djo.a));
   }

   public static elp a(js<dhk> $$0, js<ens> $$1, js<emq> $$2) {
      jv<ens> $$3 = jv.a($$1.b(enf.r), $$1.b(enf.a));
      elp $$4 = new elp(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new elm(1, djo.I));
      $$4.e().add(new elm(2, djo.j));
      $$4.e().add(new elm(1, djo.i));
      $$4.g();
      return $$4;
   }

   public static jr<dhk> a(js<dhk> $$0) {
      return $$0.b(dhr.b);
   }

   public static List<jr<emq>> b(js<emq> $$0) {
      return List.of($$0.b(rr.g), $$0.b(rr.h));
   }
}
