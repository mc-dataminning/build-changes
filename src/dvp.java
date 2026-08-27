import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dvp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dvp> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iu.a(kd.aD).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dvm.a.listOf().fieldOf("layers").forGetter(dvp::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ctd.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  agk.d(ctk.b),
                  agk.d(ql.g),
                  agk.d(ql.h)
               )
               .apply($$0, dvp::new)
      )
      .comapFlatMap(dvp::a, Function.identity())
      .stable();
   private final Optional<ik<dxs>> c;
   private final List<dvm> d = Lists.newArrayList();
   private final ig<ctd> e;
   private final List<dhn> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ig<dwq>> j;

   private static DataResult<dvp> a(dvp $$0) {
      int $$1 = $$0.d.stream().mapToInt(dvm::a).sum();
      return $$1 > dkw.c ? DataResult.error(() -> "Sum of layer heights is > " + dkw.c, $$0) : DataResult.success($$0);
   }

   private dvp(Optional<ik<dxs>> $$0, List<dvm> $$1, boolean $$2, boolean $$3, Optional<ig<ctd>> $$4, ig.c<ctd> $$5, ig<dwq> $$6, ig<dwq> $$7) {
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

   private static ig<ctd> a(Optional<? extends ig<ctd>> $$0, ig<ctd> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ig<ctd>)$$0.get();
      }
   }

   public dvp(Optional<ik<dxs>> $$0, ig<ctd> $$1, List<ig<dwq>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dvp a(List<dvm> $$0, Optional<ik<dxs>> $$1, ig<ctd> $$2) {
      dvp $$3 = new dvp($$1, $$2, this.j);

      for (dvm $$4 : $$0) {
         $$3.d.add(new dvm($$4.a(), $$4.b().b()));
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

   public cte a(ig<ctd> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cte $$1 = this.d().a().d();
         cte.b $$2 = new cte.b();
         if (this.i) {
            for (ig<dwq> $$3 : this.j) {
               $$2.a(dms.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ctk.a)) && this.h;
         if ($$4) {
            List<ik<dwq>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dms.b.d.ordinal() && $$6 != dms.b.e.ordinal() && (!this.i || $$6 != dms.b.b.ordinal())) {
                  for (ig<dwq> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dhn> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dhn $$11 = $$9.get($$10);
            if (!dmw.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dms.b.k, qo.a(dqa.ab, new dsi($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ik<dxs>> c() {
      return this.c;
   }

   public ig<ctd> d() {
      return this.e;
   }

   public List<dvm> e() {
      return this.d;
   }

   public List<dhn> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dvm $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cvh.a));
   }

   public static dvp a(ih<ctd> $$0, ih<dxs> $$1, ih<dwq> $$2) {
      ik<dxs> $$3 = ik.a($$1.b(dxf.r), $$1.b(dxf.a));
      dvp $$4 = new dvp(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dvm(1, cvh.F));
      $$4.e().add(new dvm(2, cvh.j));
      $$4.e().add(new dvm(1, cvh.i));
      $$4.g();
      return $$4;
   }

   public static ig<ctd> a(ih<ctd> $$0) {
      return $$0.b(ctk.b);
   }

   public static List<ig<dwq>> b(ih<dwq> $$0) {
      return List.of($$0.b(ql.g), $$0.b(ql.h));
   }
}
