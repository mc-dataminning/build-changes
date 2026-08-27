import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ebh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ebh> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ja.a(kj.aG).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ebe.a.listOf().fieldOf("layers").forGetter(ebh::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cya.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  ajf.d(cyh.b),
                  ajf.d(rc.g),
                  ajf.d(rc.h)
               )
               .apply($$0, ebh::new)
      )
      .comapFlatMap(ebh::a, Function.identity())
      .stable();
   private final Optional<ip<edk>> c;
   private final List<ebe> d = Lists.newArrayList();
   private final il<cya> e;
   private final List<dnb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<il<eci>> j;

   private static DataResult<ebh> a(ebh $$0) {
      int $$1 = $$0.d.stream().mapToInt(ebe::a).sum();
      return $$1 > dqo.c ? DataResult.error(() -> "Sum of layer heights is > " + dqo.c, $$0) : DataResult.success($$0);
   }

   private ebh(Optional<ip<edk>> $$0, List<ebe> $$1, boolean $$2, boolean $$3, Optional<il<cya>> $$4, il.c<cya> $$5, il<eci> $$6, il<eci> $$7) {
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

   private static il<cya> a(Optional<? extends il<cya>> $$0, il<cya> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (il<cya>)$$0.get();
      }
   }

   public ebh(Optional<ip<edk>> $$0, il<cya> $$1, List<il<eci>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ebh a(List<ebe> $$0, Optional<ip<edk>> $$1, il<cya> $$2) {
      ebh $$3 = new ebh($$1, $$2, this.j);

      for (ebe $$4 : $$0) {
         $$3.d.add(new ebe($$4.a(), $$4.b().b()));
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

   public cyb a(il<cya> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cyb $$1 = this.d().a().d();
         cyb.b $$2 = new cyb.b();
         if (this.i) {
            for (il<eci> $$3 : this.j) {
               $$2.a(dsk.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cyh.a)) && this.h;
         if ($$4) {
            List<ip<eci>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dsk.b.d.ordinal() && $$6 != dsk.b.e.ordinal() && (!this.i || $$6 != dsk.b.b.ordinal())) {
                  for (il<eci> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dnb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dnb $$11 = $$9.get($$10);
            if (!dso.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dsk.b.k, rf.a(dvs.ab, new dya($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ip<edk>> c() {
      return this.c;
   }

   public il<cya> d() {
      return this.e;
   }

   public List<ebe> e() {
      return this.d;
   }

   public List<dnb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ebe $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dae.a));
   }

   public static ebh a(im<cya> $$0, im<edk> $$1, im<eci> $$2) {
      ip<edk> $$3 = ip.a($$1.b(ecx.r), $$1.b(ecx.a));
      ebh $$4 = new ebh(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ebe(1, dae.F));
      $$4.e().add(new ebe(2, dae.j));
      $$4.e().add(new ebe(1, dae.i));
      $$4.g();
      return $$4;
   }

   public static il<cya> a(im<cya> $$0) {
      return $$0.b(cyh.b);
   }

   public static List<il<eci>> b(im<eci> $$0) {
      return List.of($$0.b(rc.g), $$0.b(rc.h));
   }
}
