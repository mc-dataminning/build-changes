import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ehs {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehs> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.a(lu.aT).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ehp.a.listOf().fieldOf("layers").forGetter(ehs::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  ddw.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akp.d(ded.b),
                  akp.d(sd.g),
                  akp.d(sd.h)
               )
               .apply($$0, ehs::new)
      )
      .comapFlatMap(ehs::a, Function.identity())
      .stable();
   private final Optional<jq<ejv>> c;
   private final List<ehp> d = Lists.newArrayList();
   private final jm<ddw> e;
   private final List<dtc> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jm<eit>> j;

   private static DataResult<ehs> a(ehs $$0) {
      int $$1 = $$0.d.stream().mapToInt(ehp::a).sum();
      return $$1 > dwy.c ? DataResult.error(() -> "Sum of layer heights is > " + dwy.c, $$0) : DataResult.success($$0);
   }

   private ehs(Optional<jq<ejv>> $$0, List<ehp> $$1, boolean $$2, boolean $$3, Optional<jm<ddw>> $$4, jm.c<ddw> $$5, jm<eit> $$6, jm<eit> $$7) {
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

   private static jm<ddw> a(Optional<? extends jm<ddw>> $$0, jm<ddw> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jm<ddw>)$$0.get();
      }
   }

   public ehs(Optional<jq<ejv>> $$0, jm<ddw> $$1, List<jm<eit>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ehs a(List<ehp> $$0, Optional<jq<ejv>> $$1, jm<ddw> $$2) {
      ehs $$3 = new ehs($$1, $$2, this.j);

      for (ehp $$4 : $$0) {
         $$3.d.add(new ehp($$4.a(), $$4.b().b()));
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

   public ddx a(jm<ddw> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         ddx $$1 = this.d().a().d();
         ddx.b $$2 = new ddx.b();
         if (this.i) {
            for (jm<eit> $$3 : this.j) {
               $$2.a(dyu.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ded.a)) && this.h;
         if ($$4) {
            List<jq<eit>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dyu.b.d.ordinal() && $$6 != dyu.b.e.ordinal() && (!this.i || $$6 != dyu.b.b.ordinal())) {
                  for (jm<eit> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dtc> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dtc $$11 = $$9.get($$10);
            if (!dyy.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dyu.b.k, sg.a(ecd.ab, new eel($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jq<ejv>> c() {
      return this.c;
   }

   public jm<ddw> d() {
      return this.e;
   }

   public List<ehp> e() {
      return this.d;
   }

   public List<dtc> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ehp $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dga.a));
   }

   public static ehs a(jn<ddw> $$0, jn<ejv> $$1, jn<eit> $$2) {
      jq<ejv> $$3 = jq.a($$1.b(eji.r), $$1.b(eji.a));
      ehs $$4 = new ehs(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ehp(1, dga.F));
      $$4.e().add(new ehp(2, dga.j));
      $$4.e().add(new ehp(1, dga.i));
      $$4.g();
      return $$4;
   }

   public static jm<ddw> a(jn<ddw> $$0) {
      return $$0.b(ded.b);
   }

   public static List<jm<eit>> b(jn<eit> $$0) {
      return List.of($$0.b(sd.g), $$0.b(sd.h));
   }
}
