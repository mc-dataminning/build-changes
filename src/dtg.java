import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dtg {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dtg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  hv.a(je.aB).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dtd.a.listOf().fieldOf("layers").forGetter(dtg::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cqo.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aes.d(cqv.b),
                  aes.d(pb.g),
                  aes.d(pb.h)
               )
               .apply($$0, dtg::new)
      )
      .comapFlatMap(dtg::a, Function.identity())
      .stable();
   private final Optional<hk<dvj>> c;
   private final List<dtd> d = Lists.newArrayList();
   private final hg<cqo> e;
   private final List<dfe> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<hg<duh>> j;

   private static DataResult<dtg> a(dtg $$0) {
      int $$1 = $$0.d.stream().mapToInt(dtd::a).sum();
      return $$1 > din.c ? DataResult.error(() -> "Sum of layer heights is > " + din.c, $$0) : DataResult.success($$0);
   }

   private dtg(Optional<hk<dvj>> $$0, List<dtd> $$1, boolean $$2, boolean $$3, Optional<hg<cqo>> $$4, hg.c<cqo> $$5, hg<duh> $$6, hg<duh> $$7) {
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

   private static hg<cqo> a(Optional<? extends hg<cqo>> $$0, hg<cqo> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (hg<cqo>)$$0.get();
      }
   }

   public dtg(Optional<hk<dvj>> $$0, hg<cqo> $$1, List<hg<duh>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dtg a(List<dtd> $$0, Optional<hk<dvj>> $$1, hg<cqo> $$2) {
      dtg $$3 = new dtg($$1, $$2, this.j);

      for (dtd $$4 : $$0) {
         $$3.d.add(new dtd($$4.a(), $$4.b().b()));
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

   public cqp a(hg<cqo> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cqp $$1 = this.d().a().d();
         cqp.b $$2 = new cqp.b();
         if (this.i) {
            for (hg<duh> $$3 : this.j) {
               $$2.a(dkj.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cqv.a)) && this.h;
         if ($$4) {
            List<hk<duh>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dkj.b.d.ordinal() && $$6 != dkj.b.e.ordinal() && (!this.i || $$6 != dkj.b.b.ordinal())) {
                  for (hg<duh> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dfe> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dfe $$11 = $$9.get($$10);
            if (!dkn.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dkj.b.k, pe.a(dnr.ab, new dpz($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<hk<dvj>> c() {
      return this.c;
   }

   public hg<cqo> d() {
      return this.e;
   }

   public List<dtd> e() {
      return this.d;
   }

   public List<dfe> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dtd $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(csr.a));
   }

   public static dtg a(hh<cqo> $$0, hh<dvj> $$1, hh<duh> $$2) {
      hk<dvj> $$3 = hk.a($$1.b(duw.r), $$1.b(duw.a));
      dtg $$4 = new dtg(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dtd(1, csr.F));
      $$4.e().add(new dtd(2, csr.j));
      $$4.e().add(new dtd(1, csr.i));
      $$4.g();
      return $$4;
   }

   public static hg<cqo> a(hh<cqo> $$0) {
      return $$0.b(cqv.b);
   }

   public static List<hg<duh>> b(hh<duh> $$0) {
      return List.of($$0.b(pb.g), $$0.b(pb.h));
   }
}
