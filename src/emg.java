import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class emg {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emg> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(mb.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  emd.a.listOf().fieldOf("layers").forGetter(emg::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dib.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aln.d(dii.b),
                  aln.d(sn.g),
                  aln.d(sn.h)
               )
               .apply($$0, emg::new)
      )
      .comapFlatMap(emg::a, Function.identity())
      .stable();
   private final Optional<ju<eoj>> c;
   private final List<emd> d = Lists.newArrayList();
   private final jq<dib> e;
   private final List<dxo> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<enh>> j;

   private static DataResult<emg> a(emg $$0) {
      int $$1 = $$0.d.stream().mapToInt(emd::a).sum();
      return $$1 > ebj.c ? DataResult.error(() -> "Sum of layer heights is > " + ebj.c, $$0) : DataResult.success($$0);
   }

   private emg(Optional<ju<eoj>> $$0, List<emd> $$1, boolean $$2, boolean $$3, Optional<jq<dib>> $$4, jq.c<dib> $$5, jq<enh> $$6, jq<enh> $$7) {
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

   private static jq<dib> a(Optional<? extends jq<dib>> $$0, jq<dib> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dib>)$$0.get();
      }
   }

   public emg(Optional<ju<eoj>> $$0, jq<dib> $$1, List<jq<enh>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public emg a(List<emd> $$0, Optional<ju<eoj>> $$1, jq<dib> $$2) {
      emg $$3 = new emg($$1, $$2, this.j);

      for (emd $$4 : $$0) {
         $$3.d.add(new emd($$4.a(), $$4.b().b()));
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

   public dic a(jq<dib> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dic $$1 = this.d().a().d();
         dic.b $$2 = new dic.b();
         if (this.i) {
            for (jq<enh> $$3 : this.j) {
               $$2.a(edf.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dii.a)) && this.h;
         if ($$4) {
            List<ju<enh>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != edf.a.d.ordinal() && $$6 != edf.a.e.ordinal() && (!this.i || $$6 != edf.a.b.ordinal())) {
                  for (jq<enh> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dxo> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dxo $$11 = $$9.get($$10);
            if (!edj.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(edf.a.k, sq.a(egp.ac, new eix($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<eoj>> c() {
      return this.c;
   }

   public jq<dib> d() {
      return this.e;
   }

   public List<emd> e() {
      return this.d;
   }

   public List<dxo> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (emd $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dkf.a));
   }

   public static emg a(jr<dib> $$0, jr<eoj> $$1, jr<enh> $$2) {
      ju<eoj> $$3 = ju.a($$1.b(enw.r), $$1.b(enw.a));
      emg $$4 = new emg(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new emd(1, dkf.I));
      $$4.e().add(new emd(2, dkf.j));
      $$4.e().add(new emd(1, dkf.i));
      $$4.g();
      return $$4;
   }

   public static jq<dib> a(jr<dib> $$0) {
      return $$0.b(dii.b);
   }

   public static List<jq<enh>> b(jr<enh> $$0) {
      return List.of($$0.b(sn.g), $$0.b(sn.h));
   }
}
