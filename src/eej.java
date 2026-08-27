import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eej {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eej> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jk.a(ld.aK).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eeg.a.listOf().fieldOf("layers").forGetter(eej::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dat.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akd.d(dba.b),
                  akd.d(sa.g),
                  akd.d(sa.h)
               )
               .apply($$0, eej::new)
      )
      .comapFlatMap(eej::a, Function.identity())
      .stable();
   private final Optional<iz<egm>> c;
   private final List<eeg> d = Lists.newArrayList();
   private final iv<dat> e;
   private final List<dpy> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<iv<efk>> j;

   private static DataResult<eej> a(eej $$0) {
      int $$1 = $$0.d.stream().mapToInt(eeg::a).sum();
      return $$1 > dtq.c ? DataResult.error(() -> "Sum of layer heights is > " + dtq.c, $$0) : DataResult.success($$0);
   }

   private eej(Optional<iz<egm>> $$0, List<eeg> $$1, boolean $$2, boolean $$3, Optional<iv<dat>> $$4, iv.c<dat> $$5, iv<efk> $$6, iv<efk> $$7) {
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

   private static iv<dat> a(Optional<? extends iv<dat>> $$0, iv<dat> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (iv<dat>)$$0.get();
      }
   }

   public eej(Optional<iz<egm>> $$0, iv<dat> $$1, List<iv<efk>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eej a(List<eeg> $$0, Optional<iz<egm>> $$1, iv<dat> $$2) {
      eej $$3 = new eej($$1, $$2, this.j);

      for (eeg $$4 : $$0) {
         $$3.d.add(new eeg($$4.a(), $$4.b().b()));
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

   public dau a(iv<dat> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dau $$1 = this.d().a().d();
         dau.b $$2 = new dau.b();
         if (this.i) {
            for (iv<efk> $$3 : this.j) {
               $$2.a(dvm.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dba.a)) && this.h;
         if ($$4) {
            List<iz<efk>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dvm.b.d.ordinal() && $$6 != dvm.b.e.ordinal() && (!this.i || $$6 != dvm.b.b.ordinal())) {
                  for (iv<efk> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dpy> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dpy $$11 = $$9.get($$10);
            if (!dvq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dvm.b.k, sd.a(dyu.ab, new ebc($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<iz<egm>> c() {
      return this.c;
   }

   public iv<dat> d() {
      return this.e;
   }

   public List<eeg> e() {
      return this.d;
   }

   public List<dpy> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eeg $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dcx.a));
   }

   public static eej a(iw<dat> $$0, iw<egm> $$1, iw<efk> $$2) {
      iz<egm> $$3 = iz.a($$1.b(efz.r), $$1.b(efz.a));
      eej $$4 = new eej(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eeg(1, dcx.F));
      $$4.e().add(new eeg(2, dcx.j));
      $$4.e().add(new eeg(1, dcx.i));
      $$4.g();
      return $$4;
   }

   public static iv<dat> a(iw<dat> $$0) {
      return $$0.b(dba.b);
   }

   public static List<iv<efk>> b(iw<efk> $$0) {
      return List.of($$0.b(sa.g), $$0.b(sa.h));
   }
}
