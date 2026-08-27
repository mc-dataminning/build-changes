import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dwr {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dwr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  it.a(kc.aE).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dwo.a.listOf().fieldOf("layers").forGetter(dwr::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ctx.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  agr.d(cue.b),
                  agr.d(qr.g),
                  agr.d(qr.h)
               )
               .apply($$0, dwr::new)
      )
      .comapFlatMap(dwr::a, Function.identity())
      .stable();
   private final Optional<ij<dyu>> c;
   private final List<dwo> d = Lists.newArrayList();
   private final ie<ctx> e;
   private final List<dip> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ie<dxs>> j;

   private static DataResult<dwr> a(dwr $$0) {
      int $$1 = $$0.d.stream().mapToInt(dwo::a).sum();
      return $$1 > dly.c ? DataResult.error(() -> "Sum of layer heights is > " + dly.c, $$0) : DataResult.success($$0);
   }

   private dwr(Optional<ij<dyu>> $$0, List<dwo> $$1, boolean $$2, boolean $$3, Optional<ie<ctx>> $$4, ie.c<ctx> $$5, ie<dxs> $$6, ie<dxs> $$7) {
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

   private static ie<ctx> a(Optional<? extends ie<ctx>> $$0, ie<ctx> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ie<ctx>)$$0.get();
      }
   }

   public dwr(Optional<ij<dyu>> $$0, ie<ctx> $$1, List<ie<dxs>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dwr a(List<dwo> $$0, Optional<ij<dyu>> $$1, ie<ctx> $$2) {
      dwr $$3 = new dwr($$1, $$2, this.j);

      for (dwo $$4 : $$0) {
         $$3.d.add(new dwo($$4.a(), $$4.b().b()));
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

   public cty a(ie<ctx> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cty $$1 = this.d().a().d();
         cty.b $$2 = new cty.b();
         if (this.i) {
            for (ie<dxs> $$3 : this.j) {
               $$2.a(dnu.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cue.a)) && this.h;
         if ($$4) {
            List<ij<dxs>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dnu.b.d.ordinal() && $$6 != dnu.b.e.ordinal() && (!this.i || $$6 != dnu.b.b.ordinal())) {
                  for (ie<dxs> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dip> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dip $$11 = $$9.get($$10);
            if (!dny.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dnu.b.k, qu.a(drc.ab, new dtk($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ij<dyu>> c() {
      return this.c;
   }

   public ie<ctx> d() {
      return this.e;
   }

   public List<dwo> e() {
      return this.d;
   }

   public List<dip> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dwo $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cwb.a));
   }

   public static dwr a(ig<ctx> $$0, ig<dyu> $$1, ig<dxs> $$2) {
      ij<dyu> $$3 = ij.a($$1.b(dyh.r), $$1.b(dyh.a));
      dwr $$4 = new dwr(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dwo(1, cwb.F));
      $$4.e().add(new dwo(2, cwb.j));
      $$4.e().add(new dwo(1, cwb.i));
      $$4.g();
      return $$4;
   }

   public static ie<ctx> a(ig<ctx> $$0) {
      return $$0.b(cue.b);
   }

   public static List<ie<dxs>> b(ig<dxs> $$0) {
      return List.of($$0.b(qr.g), $$0.b(qr.h));
   }
}
