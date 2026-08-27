import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class edk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edk> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ja.a(ks.aH).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  edh.a.listOf().fieldOf("layers").forGetter(edk::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  czw.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ajr.d(dad.b),
                  ajr.d(ro.g),
                  ajr.d(ro.h)
               )
               .apply($$0, edk::new)
      )
      .comapFlatMap(edk::a, Function.identity())
      .stable();
   private final Optional<ip<efn>> c;
   private final List<edh> d = Lists.newArrayList();
   private final il<czw> e;
   private final List<doz> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<il<eel>> j;

   private static DataResult<edk> a(edk $$0) {
      int $$1 = $$0.d.stream().mapToInt(edh::a).sum();
      return $$1 > dsr.c ? DataResult.error(() -> "Sum of layer heights is > " + dsr.c, $$0) : DataResult.success($$0);
   }

   private edk(Optional<ip<efn>> $$0, List<edh> $$1, boolean $$2, boolean $$3, Optional<il<czw>> $$4, il.c<czw> $$5, il<eel> $$6, il<eel> $$7) {
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

   private static il<czw> a(Optional<? extends il<czw>> $$0, il<czw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (il<czw>)$$0.get();
      }
   }

   public edk(Optional<ip<efn>> $$0, il<czw> $$1, List<il<eel>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public edk a(List<edh> $$0, Optional<ip<efn>> $$1, il<czw> $$2) {
      edk $$3 = new edk($$1, $$2, this.j);

      for (edh $$4 : $$0) {
         $$3.d.add(new edh($$4.a(), $$4.b().b()));
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

   public czx a(il<czw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         czx $$1 = this.d().a().d();
         czx.b $$2 = new czx.b();
         if (this.i) {
            for (il<eel> $$3 : this.j) {
               $$2.a(dun.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dad.a)) && this.h;
         if ($$4) {
            List<ip<eel>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dun.b.d.ordinal() && $$6 != dun.b.e.ordinal() && (!this.i || $$6 != dun.b.b.ordinal())) {
                  for (il<eel> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<doz> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            doz $$11 = $$9.get($$10);
            if (!dur.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dun.b.k, rr.a(dxv.ab, new ead($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ip<efn>> c() {
      return this.c;
   }

   public il<czw> d() {
      return this.e;
   }

   public List<edh> e() {
      return this.d;
   }

   public List<doz> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (edh $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dca.a));
   }

   public static edk a(im<czw> $$0, im<efn> $$1, im<eel> $$2) {
      ip<efn> $$3 = ip.a($$1.b(efa.r), $$1.b(efa.a));
      edk $$4 = new edk(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new edh(1, dca.F));
      $$4.e().add(new edh(2, dca.j));
      $$4.e().add(new edh(1, dca.i));
      $$4.g();
      return $$4;
   }

   public static il<czw> a(im<czw> $$0) {
      return $$0.b(dad.b);
   }

   public static List<il<eel>> b(im<eel> $$0) {
      return List.of($$0.b(ro.g), $$0.b(ro.h));
   }
}
