import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class elq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elq> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eln.a.listOf().fieldOf("layers").forGetter(elq::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dhl.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akt.d(dhs.b),
                  akt.d(rr.g),
                  akt.d(rr.h)
               )
               .apply($$0, elq::new)
      )
      .comapFlatMap(elq::a, Function.identity())
      .stable();
   private final Optional<jv<ent>> c;
   private final List<eln> d = Lists.newArrayList();
   private final jr<dhl> e;
   private final List<dwy> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jr<emr>> j;

   private static DataResult<elq> a(elq $$0) {
      int $$1 = $$0.d.stream().mapToInt(eln::a).sum();
      return $$1 > eat.c ? DataResult.error(() -> "Sum of layer heights is > " + eat.c, $$0) : DataResult.success($$0);
   }

   private elq(Optional<jv<ent>> $$0, List<eln> $$1, boolean $$2, boolean $$3, Optional<jr<dhl>> $$4, jr.c<dhl> $$5, jr<emr> $$6, jr<emr> $$7) {
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

   private static jr<dhl> a(Optional<? extends jr<dhl>> $$0, jr<dhl> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jr<dhl>)$$0.get();
      }
   }

   public elq(Optional<jv<ent>> $$0, jr<dhl> $$1, List<jr<emr>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public elq a(List<eln> $$0, Optional<jv<ent>> $$1, jr<dhl> $$2) {
      elq $$3 = new elq($$1, $$2, this.j);

      for (eln $$4 : $$0) {
         $$3.d.add(new eln($$4.a(), $$4.b().b()));
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

   public dhm a(jr<dhl> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dhm $$1 = this.d().a().d();
         dhm.b $$2 = new dhm.b();
         if (this.i) {
            for (jr<emr> $$3 : this.j) {
               $$2.a(ecp.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dhs.a)) && this.h;
         if ($$4) {
            List<jv<emr>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ecp.a.d.ordinal() && $$6 != ecp.a.e.ordinal() && (!this.i || $$6 != ecp.a.b.ordinal())) {
                  for (jr<emr> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dwy> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dwy $$11 = $$9.get($$10);
            if (!ect.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ecp.a.k, ru.a(efz.ac, new eih($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jv<ent>> c() {
      return this.c;
   }

   public jr<dhl> d() {
      return this.e;
   }

   public List<eln> e() {
      return this.d;
   }

   public List<dwy> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eln $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(djp.a));
   }

   public static elq a(js<dhl> $$0, js<ent> $$1, js<emr> $$2) {
      jv<ent> $$3 = jv.a($$1.b(eng.r), $$1.b(eng.a));
      elq $$4 = new elq(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eln(1, djp.I));
      $$4.e().add(new eln(2, djp.j));
      $$4.e().add(new eln(1, djp.i));
      $$4.g();
      return $$4;
   }

   public static jr<dhl> a(js<dhl> $$0) {
      return $$0.b(dhs.b);
   }

   public static List<jr<emr>> b(js<emr> $$0) {
      return List.of($$0.b(rr.g), $$0.b(rr.h));
   }
}
