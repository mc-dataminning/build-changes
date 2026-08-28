import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class enj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<enj> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kh.a(me.bb).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eng.a.listOf().fieldOf("layers").forGetter(enj::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dis.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alb.d(diz.b),
                  alb.d(rt.g),
                  alb.d(rt.h)
               )
               .apply($$0, enj::new)
      )
      .comapFlatMap(enj::a, Function.identity())
      .stable();
   private final Optional<jw<epm>> c;
   private final List<eng> d = Lists.newArrayList();
   private final js<dis> e;
   private final List<dym> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<js<eok>> j;

   private static DataResult<enj> a(enj $$0) {
      int $$1 = $$0.d.stream().mapToInt(eng::a).sum();
      return $$1 > ecj.c ? DataResult.error(() -> "Sum of layer heights is > " + ecj.c, $$0) : DataResult.success($$0);
   }

   private enj(Optional<jw<epm>> $$0, List<eng> $$1, boolean $$2, boolean $$3, Optional<js<dis>> $$4, js.c<dis> $$5, js<eok> $$6, js<eok> $$7) {
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

   private static js<dis> a(Optional<? extends js<dis>> $$0, js<dis> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (js<dis>)$$0.get();
      }
   }

   public enj(Optional<jw<epm>> $$0, js<dis> $$1, List<js<eok>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public enj a(List<eng> $$0, Optional<jw<epm>> $$1, js<dis> $$2) {
      enj $$3 = new enj($$1, $$2, this.j);

      for (eng $$4 : $$0) {
         $$3.d.add(new eng($$4.a(), $$4.b().b()));
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

   public dit a(js<dis> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dit $$1 = this.d().a().d();
         dit.b $$2 = new dit.b();
         if (this.i) {
            for (js<eok> $$3 : this.j) {
               $$2.a(eeh.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(diz.a)) && this.h;
         if ($$4) {
            List<jw<eok>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != eeh.a.d.ordinal() && $$6 != eeh.a.e.ordinal() && (!this.i || $$6 != eeh.a.b.ordinal())) {
                  for (js<eok> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dym> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dym $$11 = $$9.get($$10);
            if (!eel.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(eeh.a.k, rw.a(ehr.ac, new ejz($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<jw<epm>> c() {
      return this.c;
   }

   public js<dis> d() {
      return this.e;
   }

   public List<eng> e() {
      return this.d;
   }

   public List<dym> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eng $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dkw.a));
   }

   public static enj a(jt<dis> $$0, jt<epm> $$1, jt<eok> $$2) {
      jw<epm> $$3 = jw.a($$1.b(eoz.r), $$1.b(eoz.a));
      enj $$4 = new enj(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eng(1, dkw.I));
      $$4.e().add(new eng(2, dkw.j));
      $$4.e().add(new eng(1, dkw.i));
      $$4.g();
      return $$4;
   }

   public static js<dis> a(jt<dis> $$0) {
      return $$0.b(diz.b);
   }

   public static List<js<eok>> b(jt<eok> $$0) {
      return List.of($$0.b(rt.g), $$0.b(rt.h));
   }
}
