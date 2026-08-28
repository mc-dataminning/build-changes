import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eln {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eln> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kg.a(mc.aW).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  elk.a.listOf().fieldOf("layers").forGetter(eln::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dhi.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aks.d(dhp.b),
                  aks.d(rr.g),
                  aks.d(rr.h)
               )
               .apply($$0, eln::new)
      )
      .comapFlatMap(eln::a, Function.identity())
      .stable();
   private final Optional<jv<enq>> c;
   private final List<elk> d = Lists.newArrayList();
   private final jr<dhi> e;
   private final List<dwv> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jr<emo>> j;

   private static DataResult<eln> a(eln $$0) {
      int $$1 = $$0.d.stream().mapToInt(elk::a).sum();
      return $$1 > eaq.c ? DataResult.error(() -> "Sum of layer heights is > " + eaq.c, $$0) : DataResult.success($$0);
   }

   private eln(Optional<jv<enq>> $$0, List<elk> $$1, boolean $$2, boolean $$3, Optional<jr<dhi>> $$4, jr.c<dhi> $$5, jr<emo> $$6, jr<emo> $$7) {
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

   private static jr<dhi> a(Optional<? extends jr<dhi>> $$0, jr<dhi> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jr<dhi>)$$0.get();
      }
   }

   public eln(Optional<jv<enq>> $$0, jr<dhi> $$1, List<jr<emo>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eln a(List<elk> $$0, Optional<jv<enq>> $$1, jr<dhi> $$2) {
      eln $$3 = new eln($$1, $$2, this.j);

      for (elk $$4 : $$0) {
         $$3.d.add(new elk($$4.a(), $$4.b().b()));
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

   public dhj a(jr<dhi> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dhj $$1 = this.d().a().d();
         dhj.b $$2 = new dhj.b();
         if (this.i) {
            for (jr<emo> $$3 : this.j) {
               $$2.a(ecm.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dhp.a)) && this.h;
         if ($$4) {
            List<jv<emo>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ecm.a.d.ordinal() && $$6 != ecm.a.e.ordinal() && (!this.i || $$6 != ecm.a.b.ordinal())) {
                  for (jr<emo> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dwv> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dwv $$11 = $$9.get($$10);
            if (!ecq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ecm.a.k, ru.a(efw.ac, new eie($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jv<enq>> c() {
      return this.c;
   }

   public jr<dhi> d() {
      return this.e;
   }

   public List<elk> e() {
      return this.d;
   }

   public List<dwv> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (elk $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(djm.a));
   }

   public static eln a(js<dhi> $$0, js<enq> $$1, js<emo> $$2) {
      jv<enq> $$3 = jv.a($$1.b(end.r), $$1.b(end.a));
      eln $$4 = new eln(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new elk(1, djm.I));
      $$4.e().add(new elk(2, djm.j));
      $$4.e().add(new elk(1, djm.i));
      $$4.g();
      return $$4;
   }

   public static jr<dhi> a(js<dhi> $$0) {
      return $$0.b(dhp.b);
   }

   public static List<jr<emo>> b(js<emo> $$0) {
      return List.of($$0.b(rr.g), $$0.b(rr.h));
   }
}
