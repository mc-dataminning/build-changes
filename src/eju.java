import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eju {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eju> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ke.a(ly.aU).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ejr.a.listOf().fieldOf("layers").forGetter(eju::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dfw.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alf.d(dgd.b),
                  alf.d(sk.g),
                  alf.d(sk.h)
               )
               .apply($$0, eju::new)
      )
      .comapFlatMap(eju::a, Function.identity())
      .stable();
   private final Optional<jt<elx>> c;
   private final List<ejr> d = Lists.newArrayList();
   private final jp<dfw> e;
   private final List<dvd> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jp<ekv>> j;

   private static DataResult<eju> a(eju $$0) {
      int $$1 = $$0.d.stream().mapToInt(ejr::a).sum();
      return $$1 > dyz.c ? DataResult.error(() -> "Sum of layer heights is > " + dyz.c, $$0) : DataResult.success($$0);
   }

   private eju(Optional<jt<elx>> $$0, List<ejr> $$1, boolean $$2, boolean $$3, Optional<jp<dfw>> $$4, jp.c<dfw> $$5, jp<ekv> $$6, jp<ekv> $$7) {
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

   private static jp<dfw> a(Optional<? extends jp<dfw>> $$0, jp<dfw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jp<dfw>)$$0.get();
      }
   }

   public eju(Optional<jt<elx>> $$0, jp<dfw> $$1, List<jp<ekv>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eju a(List<ejr> $$0, Optional<jt<elx>> $$1, jp<dfw> $$2) {
      eju $$3 = new eju($$1, $$2, this.j);

      for (ejr $$4 : $$0) {
         $$3.d.add(new ejr($$4.a(), $$4.b().b()));
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

   public dfx a(jp<dfw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dfx $$1 = this.d().a().d();
         dfx.b $$2 = new dfx.b();
         if (this.i) {
            for (jp<ekv> $$3 : this.j) {
               $$2.a(eav.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dgd.a)) && this.h;
         if ($$4) {
            List<jt<ekv>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != eav.a.d.ordinal() && $$6 != eav.a.e.ordinal() && (!this.i || $$6 != eav.a.b.ordinal())) {
                  for (jp<ekv> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dvd> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dvd $$11 = $$9.get($$10);
            if (!eaz.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(eav.a.k, sn.a(eef.ac, new egn($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jt<elx>> c() {
      return this.c;
   }

   public jp<dfw> d() {
      return this.e;
   }

   public List<ejr> e() {
      return this.d;
   }

   public List<dvd> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ejr $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dia.a));
   }

   public static eju a(jq<dfw> $$0, jq<elx> $$1, jq<ekv> $$2) {
      jt<elx> $$3 = jt.a($$1.b(elk.r), $$1.b(elk.a));
      eju $$4 = new eju(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ejr(1, dia.F));
      $$4.e().add(new ejr(2, dia.j));
      $$4.e().add(new ejr(1, dia.i));
      $$4.g();
      return $$4;
   }

   public static jp<dfw> a(jq<dfw> $$0) {
      return $$0.b(dgd.b);
   }

   public static List<jp<ekv>> b(jq<ekv> $$0) {
      return List.of($$0.b(sk.g), $$0.b(sk.h));
   }
}
