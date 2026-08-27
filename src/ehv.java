import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ehv {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehv> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jp.a(li.aL).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  ehs.a.listOf().fieldOf("layers").forGetter(ehv::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dcz.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  akr.d(ddg.b),
                  akr.d(sm.h),
                  akr.d(sm.i)
               )
               .apply($$0, ehv::new)
      )
      .comapFlatMap(ehv::a, Function.identity())
      .stable();
   private final Optional<je<ejz>> c;
   private final List<ehs> d = Lists.newArrayList();
   private final ja<dcz> e;
   private final List<dtc> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ja<eix>> j;

   private static DataResult<ehv> a(ehv $$0) {
      int $$1 = $$0.d.stream().mapToInt(ehs::a).sum();
      return $$1 > dwu.c ? DataResult.error(() -> "Sum of layer heights is > " + dwu.c, $$0) : DataResult.success($$0);
   }

   private ehv(Optional<je<ejz>> $$0, List<ehs> $$1, boolean $$2, boolean $$3, Optional<ja<dcz>> $$4, ja.c<dcz> $$5, ja<eix> $$6, ja<eix> $$7) {
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

   private static ja<dcz> a(Optional<? extends ja<dcz>> $$0, ja<dcz> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ja<dcz>)$$0.get();
      }
   }

   public ehv(Optional<je<ejz>> $$0, ja<dcz> $$1, List<ja<eix>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ehv a(List<ehs> $$0, Optional<je<ejz>> $$1, ja<dcz> $$2) {
      ehv $$3 = new ehv($$1, $$2, this.j);

      for (ehs $$4 : $$0) {
         $$3.d.add(new ehs($$4.a(), $$4.b().b()));
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

   public dda a(ja<dcz> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dda $$1 = this.d().a().d();
         dda.b $$2 = new dda.b();
         if (this.i) {
            for (ja<eix> $$3 : this.j) {
               $$2.a(dyq.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(ddg.a)) && this.h;
         if ($$4) {
            List<je<eix>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dyq.b.d.ordinal() && $$6 != dyq.b.e.ordinal() && (!this.i || $$6 != dyq.b.b.ordinal())) {
                  for (ja<eix> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dtc> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dtc $$11 = $$9.get($$10);
            if (!dyu.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dyq.b.k, sp.a(eca.ai, new eeo($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<je<ejz>> c() {
      return this.c;
   }

   public ja<dcz> d() {
      return this.e;
   }

   public List<ehs> e() {
      return this.d;
   }

   public List<dtc> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (ehs $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dfe.a));
   }

   public static ehv a(jb<dcz> $$0, jb<ejz> $$1, jb<eix> $$2) {
      je<ejz> $$3 = je.a($$1.b(ejm.t), $$1.b(ejm.a));
      ehv $$4 = new ehv(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new ehs(1, dfe.ak));
      $$4.e().add(new ehs(2, dfe.m));
      $$4.e().add(new ehs(1, dfe.j));
      $$4.g();
      return $$4;
   }

   public static ja<dcz> a(jb<dcz> $$0) {
      return $$0.b(ddg.b);
   }

   public static List<ja<eix>> b(jb<eix> $$0) {
      return List.of($$0.b(sm.h), $$0.b(sm.i));
   }
}
