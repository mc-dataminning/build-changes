import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class egl {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egl> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.aL).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  egi.a.listOf().fieldOf("layers").forGetter(egl::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcv.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alc.d(ddc.b),
                  alc.d(st.g),
                  alc.d(st.h)
               )
               .apply($$0, egl::new)
      )
      .comapFlatMap(egl::a, Function.identity())
      .stable();
   private final Optional<jm<eio>> c;
   private final List<egi> d = Lists.newArrayList();
   private final ji<dcv> e;
   private final List<dsa> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ji<ehm>> j;

   private static DataResult<egl> a(egl $$0) {
      int $$1 = $$0.d.stream().mapToInt(egi::a).sum();
      return $$1 > dvs.c ? DataResult.error(() -> "Sum of layer heights is > " + dvs.c, $$0) : DataResult.success($$0);
   }

   private egl(Optional<jm<eio>> $$0, List<egi> $$1, boolean $$2, boolean $$3, Optional<ji<dcv>> $$4, ji.c<dcv> $$5, ji<ehm> $$6, ji<ehm> $$7) {
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

   private static ji<dcv> a(Optional<? extends ji<dcv>> $$0, ji<dcv> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ji<dcv>)$$0.get();
      }
   }

   public egl(Optional<jm<eio>> $$0, ji<dcv> $$1, List<ji<ehm>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public egl a(List<egi> $$0, Optional<jm<eio>> $$1, ji<dcv> $$2) {
      egl $$3 = new egl($$1, $$2, this.j);

      for (egi $$4 : $$0) {
         $$3.d.add(new egi($$4.a(), $$4.b().b()));
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

   public dcw a(ji<dcv> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dcw $$1 = this.d().a().d();
         dcw.b $$2 = new dcw.b();
         if (this.i) {
            for (ji<ehm> $$3 : this.j) {
               $$2.a(dxo.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddc.a)) && this.h;
         if ($$4) {
            List<jm<ehm>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dxo.b.d.ordinal() && $$6 != dxo.b.e.ordinal() && (!this.i || $$6 != dxo.b.b.ordinal())) {
                  for (ji<ehm> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dsa> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dsa $$11 = $$9.get($$10);
            if (!dxs.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dxo.b.k, sw.a(eaw.ab, new ede($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jm<eio>> c() {
      return this.c;
   }

   public ji<dcv> d() {
      return this.e;
   }

   public List<egi> e() {
      return this.d;
   }

   public List<dsa> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (egi $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dez.a));
   }

   public static egl a(jj<dcv> $$0, jj<eio> $$1, jj<ehm> $$2) {
      jm<eio> $$3 = jm.a($$1.b(eib.r), $$1.b(eib.a));
      egl $$4 = new egl(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new egi(1, dez.F));
      $$4.e().add(new egi(2, dez.j));
      $$4.e().add(new egi(1, dez.i));
      $$4.g();
      return $$4;
   }

   public static ji<dcv> a(jj<dcv> $$0) {
      return $$0.b(ddc.b);
   }

   public static List<ji<ehm>> b(jj<ehm> $$0) {
      return List.of($$0.b(st.g), $$0.b(st.h));
   }
}
