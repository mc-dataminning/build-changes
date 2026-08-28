import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ejj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejj> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kd.a(lw.aV).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ejg.a.listOf().fieldOf("layers").forGetter(ejj::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dfk.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alc.d(dfr.b),
                  alc.d(sh.g),
                  alc.d(sh.h)
               )
               .apply($$0, ejj::new)
      )
      .comapFlatMap(ejj::a, Function.identity())
      .stable();
   private final Optional<js<elm>> c;
   private final List<ejg> d = Lists.newArrayList();
   private final jo<dfk> e;
   private final List<dus> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jo<ekk>> j;

   private static DataResult<ejj> a(ejj $$0) {
      int $$1 = $$0.d.stream().mapToInt(ejg::a).sum();
      return $$1 > dyo.c ? DataResult.error(() -> "Sum of layer heights is > " + dyo.c, $$0) : DataResult.success($$0);
   }

   private ejj(Optional<js<elm>> $$0, List<ejg> $$1, boolean $$2, boolean $$3, Optional<jo<dfk>> $$4, jo.c<dfk> $$5, jo<ekk> $$6, jo<ekk> $$7) {
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

   private static jo<dfk> a(Optional<? extends jo<dfk>> $$0, jo<dfk> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jo<dfk>)$$0.get();
      }
   }

   public ejj(Optional<js<elm>> $$0, jo<dfk> $$1, List<jo<ekk>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ejj a(List<ejg> $$0, Optional<js<elm>> $$1, jo<dfk> $$2) {
      ejj $$3 = new ejj($$1, $$2, this.j);

      for (ejg $$4 : $$0) {
         $$3.d.add(new ejg($$4.a(), $$4.b().b()));
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

   public dfl a(jo<dfk> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dfl $$1 = this.d().a().d();
         dfl.b $$2 = new dfl.b();
         if (this.i) {
            for (jo<ekk> $$3 : this.j) {
               $$2.a(eak.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dfr.a)) && this.h;
         if ($$4) {
            List<js<ekk>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != eak.a.d.ordinal() && $$6 != eak.a.e.ordinal() && (!this.i || $$6 != eak.a.b.ordinal())) {
                  for (jo<ekk> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dus> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dus $$11 = $$9.get($$10);
            if (!eao.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(eak.a.k, sk.a(edu.ac, new egc($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<js<elm>> c() {
      return this.c;
   }

   public jo<dfk> d() {
      return this.e;
   }

   public List<ejg> e() {
      return this.d;
   }

   public List<dus> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ejg $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dho.a));
   }

   public static ejj a(jp<dfk> $$0, jp<elm> $$1, jp<ekk> $$2) {
      js<elm> $$3 = js.a($$1.b(ekz.r), $$1.b(ekz.a));
      ejj $$4 = new ejj(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ejg(1, dho.F));
      $$4.e().add(new ejg(2, dho.j));
      $$4.e().add(new ejg(1, dho.i));
      $$4.g();
      return $$4;
   }

   public static jo<dfk> a(jp<dfk> $$0) {
      return $$0.b(dfr.b);
   }

   public static List<jo<ekk>> b(jp<ekk> $$0) {
      return List.of($$0.b(sh.g), $$0.b(sh.h));
   }
}
