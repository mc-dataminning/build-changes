import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class edt {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edt> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jc.a(ku.aI).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  edq.a.listOf().fieldOf("layers").forGetter(edt::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  daf.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ajt.d(dam.b),
                  ajt.d(rq.g),
                  ajt.d(rq.h)
               )
               .apply($$0, edt::new)
      )
      .comapFlatMap(edt::a, Function.identity())
      .stable();
   private final Optional<ir<efw>> c;
   private final List<edq> d = Lists.newArrayList();
   private final in<daf> e;
   private final List<dpi> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<in<eeu>> j;

   private static DataResult<edt> a(edt $$0) {
      int $$1 = $$0.d.stream().mapToInt(edq::a).sum();
      return $$1 > dta.c ? DataResult.error(() -> "Sum of layer heights is > " + dta.c, $$0) : DataResult.success($$0);
   }

   private edt(Optional<ir<efw>> $$0, List<edq> $$1, boolean $$2, boolean $$3, Optional<in<daf>> $$4, in.c<daf> $$5, in<eeu> $$6, in<eeu> $$7) {
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

   private static in<daf> a(Optional<? extends in<daf>> $$0, in<daf> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (in<daf>)$$0.get();
      }
   }

   public edt(Optional<ir<efw>> $$0, in<daf> $$1, List<in<eeu>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public edt a(List<edq> $$0, Optional<ir<efw>> $$1, in<daf> $$2) {
      edt $$3 = new edt($$1, $$2, this.j);

      for (edq $$4 : $$0) {
         $$3.d.add(new edq($$4.a(), $$4.b().b()));
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

   public dag a(in<daf> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dag $$1 = this.d().a().d();
         dag.b $$2 = new dag.b();
         if (this.i) {
            for (in<eeu> $$3 : this.j) {
               $$2.a(duw.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dam.a)) && this.h;
         if ($$4) {
            List<ir<eeu>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != duw.b.d.ordinal() && $$6 != duw.b.e.ordinal() && (!this.i || $$6 != duw.b.b.ordinal())) {
                  for (in<eeu> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dpi> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dpi $$11 = $$9.get($$10);
            if (!dva.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(duw.b.k, rt.a(dye.ab, new eam($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ir<efw>> c() {
      return this.c;
   }

   public in<daf> d() {
      return this.e;
   }

   public List<edq> e() {
      return this.d;
   }

   public List<dpi> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (edq $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dcj.a));
   }

   public static edt a(io<daf> $$0, io<efw> $$1, io<eeu> $$2) {
      ir<efw> $$3 = ir.a($$1.b(efj.r), $$1.b(efj.a));
      edt $$4 = new edt(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new edq(1, dcj.F));
      $$4.e().add(new edq(2, dcj.j));
      $$4.e().add(new edq(1, dcj.i));
      $$4.g();
      return $$4;
   }

   public static in<daf> a(io<daf> $$0) {
      return $$0.b(dam.b);
   }

   public static List<in<eeu>> b(io<eeu> $$0) {
      return List.of($$0.b(rq.g), $$0.b(rq.h));
   }
}
