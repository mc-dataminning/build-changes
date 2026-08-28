import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class ekl {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ekl> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kf.a(ma.aU).lenientOptionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  eki.a.listOf().fieldOf("layers").forGetter(ekl::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  dgo.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  alh.d(dgv.b),
                  alh.d(sm.g),
                  alh.d(sm.h)
               )
               .apply($$0, ekl::new)
      )
      .comapFlatMap(ekl::a, Function.identity())
      .stable();
   private final Optional<ju<emo>> c;
   private final List<eki> d = Lists.newArrayList();
   private final jq<dgo> e;
   private final List<dvv> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<jq<elm>> j;

   private static DataResult<ekl> a(ekl $$0) {
      int $$1 = $$0.d.stream().mapToInt(eki::a).sum();
      return $$1 > dzq.c ? DataResult.error(() -> "Sum of layer heights is > " + dzq.c, $$0) : DataResult.success($$0);
   }

   private ekl(Optional<ju<emo>> $$0, List<eki> $$1, boolean $$2, boolean $$3, Optional<jq<dgo>> $$4, jq.c<dgo> $$5, jq<elm> $$6, jq<elm> $$7) {
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

   private static jq<dgo> a(Optional<? extends jq<dgo>> $$0, jq<dgo> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (jq<dgo>)$$0.get();
      }
   }

   public ekl(Optional<ju<emo>> $$0, jq<dgo> $$1, List<jq<elm>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public ekl a(List<eki> $$0, Optional<ju<emo>> $$1, jq<dgo> $$2) {
      ekl $$3 = new ekl($$1, $$2, this.j);

      for (eki $$4 : $$0) {
         $$3.d.add(new eki($$4.a(), $$4.b().b()));
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

   public dgp a(jq<dgo> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         dgp $$1 = this.d().a().d();
         dgp.b $$2 = new dgp.b();
         if (this.i) {
            for (jq<elm> $$3 : this.j) {
               $$2.a(ebm.a.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(dgv.a)) && this.h;
         if ($$4) {
            List<ju<elm>> $$5 = $$1.c();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != ebm.a.d.ordinal() && $$6 != ebm.a.e.ordinal() && (!this.i || $$6 != ebm.a.b.ordinal())) {
                  for (jq<elm> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dvv> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dvv $$11 = $$9.get($$10);
            if (!ebq.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(ebm.a.k, sp.a(eew.ac, new ehe($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<ju<emo>> c() {
      return this.c;
   }

   public jq<dgo> d() {
      return this.e;
   }

   public List<eki> e() {
      return this.d;
   }

   public List<dvv> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (eki $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(dis.a));
   }

   public static ekl a(jr<dgo> $$0, jr<emo> $$1, jr<elm> $$2) {
      ju<emo> $$3 = ju.a($$1.b(emb.r), $$1.b(emb.a));
      ekl $$4 = new ekl(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new eki(1, dis.F));
      $$4.e().add(new eki(2, dis.j));
      $$4.e().add(new eki(1, dis.i));
      $$4.g();
      return $$4;
   }

   public static jq<dgo> a(jr<dgo> $$0) {
      return $$0.b(dgv.b);
   }

   public static List<jq<elm>> b(jr<elm> $$0) {
      return List.of($$0.b(sm.g), $$0.b(sm.h));
   }
}
