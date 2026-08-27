import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dud {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dud> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iq.a(jz.aC).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dua.a.listOf().fieldOf("layers").forGetter(dud::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  crx.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  afu.d(cse.b),
                  afu.d(qa.g),
                  afu.d(qa.h)
               )
               .apply($$0, dud::new)
      )
      .comapFlatMap(dud::a, Function.identity())
      .stable();
   private final Optional<ig<dwg>> c;
   private final List<dua> d = Lists.newArrayList();
   private final ib<crx> e;
   private final List<dgb> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ib<dve>> j;

   private static DataResult<dud> a(dud $$0) {
      int $$1 = $$0.d.stream().mapToInt(dua::a).sum();
      return $$1 > djk.c ? DataResult.error(() -> "Sum of layer heights is > " + djk.c, $$0) : DataResult.success($$0);
   }

   private dud(Optional<ig<dwg>> $$0, List<dua> $$1, boolean $$2, boolean $$3, Optional<ib<crx>> $$4, ib.c<crx> $$5, ib<dve> $$6, ib<dve> $$7) {
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

   private static ib<crx> a(Optional<? extends ib<crx>> $$0, ib<crx> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ib<crx>)$$0.get();
      }
   }

   public dud(Optional<ig<dwg>> $$0, ib<crx> $$1, List<ib<dve>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dud a(List<dua> $$0, Optional<ig<dwg>> $$1, ib<crx> $$2) {
      dud $$3 = new dud($$1, $$2, this.j);

      for (dua $$4 : $$0) {
         $$3.d.add(new dua($$4.a(), $$4.b().b()));
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

   public cry a(ib<crx> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cry $$1 = this.d().a().d();
         cry.b $$2 = new cry.b();
         if (this.i) {
            for (ib<dve> $$3 : this.j) {
               $$2.a(dlg.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cse.a)) && this.h;
         if ($$4) {
            List<ig<dve>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dlg.b.d.ordinal() && $$6 != dlg.b.e.ordinal() && (!this.i || $$6 != dlg.b.b.ordinal())) {
                  for (ib<dve> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dgb> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dgb $$11 = $$9.get($$10);
            if (!dlk.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dlg.b.k, qd.a(doo.ab, new dqw($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ig<dwg>> c() {
      return this.c;
   }

   public ib<crx> d() {
      return this.e;
   }

   public List<dua> e() {
      return this.d;
   }

   public List<dgb> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dua $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cuc.a));
   }

   public static dud a(ic<crx> $$0, ic<dwg> $$1, ic<dve> $$2) {
      ig<dwg> $$3 = ig.a($$1.b(dvt.r), $$1.b(dvt.a));
      dud $$4 = new dud(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dua(1, cuc.F));
      $$4.e().add(new dua(2, cuc.j));
      $$4.e().add(new dua(1, cuc.i));
      $$4.g();
      return $$4;
   }

   public static ib<crx> a(ic<crx> $$0) {
      return $$0.b(cse.b);
   }

   public static List<ib<dve>> b(ic<dve> $$0) {
      return List.of($$0.b(qa.g), $$0.b(qa.h));
   }
}
