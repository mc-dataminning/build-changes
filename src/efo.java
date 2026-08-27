import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class efo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efo> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jm.a(lf.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  efl.a.listOf().fieldOf("layers").forGetter(efo::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dby.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akl.d(dcf.b),
                  akl.d(sf.g),
                  akl.d(sf.h)
               )
               .apply($$0, efo::new)
      )
      .comapFlatMap(efo::a, Function.identity())
      .stable();
   private final Optional<jb<ehr>> c;
   private final List<efl> d = Lists.newArrayList();
   private final ix<dby> e;
   private final List<drd> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ix<egp>> j;

   private static DataResult<efo> a(efo $$0) {
      int $$1 = $$0.d.stream().mapToInt(efl::a).sum();
      return $$1 > duv.c ? DataResult.error(() -> "Sum of layer heights is > " + duv.c, $$0) : DataResult.success($$0);
   }

   private efo(Optional<jb<ehr>> $$0, List<efl> $$1, boolean $$2, boolean $$3, Optional<ix<dby>> $$4, ix.c<dby> $$5, ix<egp> $$6, ix<egp> $$7) {
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

   private static ix<dby> a(Optional<? extends ix<dby>> $$0, ix<dby> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ix<dby>)$$0.get();
      }
   }

   public efo(Optional<jb<ehr>> $$0, ix<dby> $$1, List<ix<egp>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public efo a(List<efl> $$0, Optional<jb<ehr>> $$1, ix<dby> $$2) {
      efo $$3 = new efo($$1, $$2, this.j);

      for (efl $$4 : $$0) {
         $$3.d.add(new efl($$4.a(), $$4.b().b()));
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

   public dbz a(ix<dby> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dbz $$1 = this.d().a().d();
         dbz.b $$2 = new dbz.b();
         if (this.i) {
            for (ix<egp> $$3 : this.j) {
               $$2.a(dwr.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dcf.a)) && this.h;
         if ($$4) {
            List<jb<egp>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dwr.b.d.ordinal() && $$6 != dwr.b.e.ordinal() && (!this.i || $$6 != dwr.b.b.ordinal())) {
                  for (ix<egp> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<drd> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            drd $$11 = $$9.get($$10);
            if (!dwv.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dwr.b.k, si.a(dzz.ab, new ech($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jb<ehr>> c() {
      return this.c;
   }

   public ix<dby> d() {
      return this.e;
   }

   public List<efl> e() {
      return this.d;
   }

   public List<drd> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (efl $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dec.a));
   }

   public static efo a(iy<dby> $$0, iy<ehr> $$1, iy<egp> $$2) {
      jb<ehr> $$3 = jb.a($$1.b(ehe.r), $$1.b(ehe.a));
      efo $$4 = new efo(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new efl(1, dec.F));
      $$4.e().add(new efl(2, dec.j));
      $$4.e().add(new efl(1, dec.i));
      $$4.g();
      return $$4;
   }

   public static ix<dby> a(iy<dby> $$0) {
      return $$0.b(dcf.b);
   }

   public static List<ix<egp>> b(iy<egp> $$0) {
      return List.of($$0.b(sf.g), $$0.b(sf.h));
   }
}
