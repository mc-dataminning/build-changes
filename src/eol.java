import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class eol {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eol> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.bb).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eoi.a.listOf().fieldOf("layers").forGetter(eol::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  djs.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alc.d(djz.b),
                  alc.d(ru.g),
                  alc.d(ru.h)
               )
               .apply($$0, eol::new)
      )
      .comapFlatMap(eol::a, Function.identity())
      .stable();
   private final Optional<ji<eqo>> c;
   private final List<eoi> d = Lists.newArrayList();
   private final je<djs> e;
   private final List<dzo> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<je<epm>> j;

   private static DataResult<eol> a(eol $$0) {
      int $$1 = $$0.d.stream().mapToInt(eoi::a).sum();
      return $$1 > edl.c ? DataResult.error(() -> "Sum of layer heights is > " + edl.c, $$0) : DataResult.success($$0);
   }

   private eol(Optional<ji<eqo>> $$0, List<eoi> $$1, boolean $$2, boolean $$3, Optional<je<djs>> $$4, je.c<djs> $$5, je<epm> $$6, je<epm> $$7) {
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

   private static je<djs> a(Optional<? extends je<djs>> $$0, je<djs> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (je<djs>)$$0.get();
      }
   }

   public eol(Optional<ji<eqo>> $$0, je<djs> $$1, List<je<epm>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public eol a(List<eoi> $$0, Optional<ji<eqo>> $$1, je<djs> $$2) {
      eol $$3 = new eol($$1, $$2, this.j);

      for (eoi $$4 : $$0) {
         $$3.d.add(new eoi($$4.a(), $$4.b().b()));
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

   public djt a(je<djs> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         djt $$1 = this.d().a().d();
         djt.b $$2 = new djt.b();
         if (this.i) {
            for (je<epm> $$3 : this.j) {
               $$2.a(efj.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(djz.a)) && this.h;
         if ($$4) {
            List<ji<epm>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != efj.a.d.ordinal() && $$6 != efj.a.e.ordinal() && (!this.i || $$6 != efj.a.b.ordinal())) {
                  for (je<epm> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dzo> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dzo $$11 = $$9.get($$10);
            if (!efn.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(efj.a.k, rx.a(eit.ac, new elb($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ji<eqo>> c() {
      return this.c;
   }

   public je<djs> d() {
      return this.e;
   }

   public List<eoi> e() {
      return this.d;
   }

   public List<dzo> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eoi $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dlw.a));
   }

   public static eol a(jf<djs> $$0, jf<eqo> $$1, jf<epm> $$2) {
      ji<eqo> $$3 = ji.a($$1.b(eqb.r), $$1.b(eqb.a));
      eol $$4 = new eol(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eoi(1, dlw.I));
      $$4.e().add(new eoi(2, dlw.j));
      $$4.e().add(new eoi(1, dlw.i));
      $$4.g();
      return $$4;
   }

   public static je<djs> a(jf<djs> $$0) {
      return $$0.b(djz.b);
   }

   public static List<je<epm>> b(jf<epm> $$0) {
      return List.of($$0.b(ru.g), $$0.b(ru.h));
   }
}
