import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class dzo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dzo> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ix.a(kg.aF).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.c),
                  dzl.a.listOf().fieldOf("layers").forGetter(dzo::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.i),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.h),
                  cwq.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.e)),
                  aiw.d(cwx.b),
                  aiw.d(qy.g),
                  aiw.d(qy.h)
               )
               .apply($$0, dzo::new)
      )
      .comapFlatMap(dzo::a, Function.identity())
      .stable();
   private final Optional<in<ebr>> c;
   private final List<dzl> d = Lists.newArrayList();
   private final ij<cwq> e;
   private final List<dlj> f;
   private boolean g;
   private boolean h;
   private boolean i;
   private final List<ij<eap>> j;

   private static DataResult<dzo> a(dzo $$0) {
      int $$1 = $$0.d.stream().mapToInt(dzl::a).sum();
      return $$1 > dov.c ? DataResult.error(() -> "Sum of layer heights is > " + dov.c, $$0) : DataResult.success($$0);
   }

   private dzo(Optional<in<ebr>> $$0, List<dzl> $$1, boolean $$2, boolean $$3, Optional<ij<cwq>> $$4, ij.c<cwq> $$5, ij<eap> $$6, ij<eap> $$7) {
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

   private static ij<cwq> a(Optional<? extends ij<cwq>> $$0, ij<cwq> $$1) {
      if ($$0.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         return $$1;
      } else {
         return (ij<cwq>)$$0.get();
      }
   }

   public dzo(Optional<in<ebr>> $$0, ij<cwq> $$1, List<ij<eap>> $$2) {
      this.c = $$0;
      this.e = $$1;
      this.f = Lists.newArrayList();
      this.j = $$2;
   }

   public dzo a(List<dzl> $$0, Optional<in<ebr>> $$1, ij<cwq> $$2) {
      dzo $$3 = new dzo($$1, $$2, this.j);

      for (dzl $$4 : $$0) {
         $$3.d.add(new dzl($$4.a(), $$4.b().b()));
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

   public cwr a(ij<cwq> $$0) {
      if (!$$0.equals(this.e)) {
         return $$0.a().d();
      } else {
         cwr $$1 = this.d().a().d();
         cwr.b $$2 = new cwr.b();
         if (this.i) {
            for (ij<eap> $$3 : this.j) {
               $$2.a(dqr.b.b, $$3);
            }
         }

         boolean $$4 = (!this.g || $$0.a(cwx.a)) && this.h;
         if ($$4) {
            List<in<eap>> $$5 = $$1.b();

            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               if ($$6 != dqr.b.d.ordinal() && $$6 != dqr.b.e.ordinal() && (!this.i || $$6 != dqr.b.b.ordinal())) {
                  for (ij<eap> $$8 : $$5.get($$6)) {
                     $$2.a($$6, $$8);
                  }
               }
            }
         }

         List<dlj> $$9 = this.f();

         for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
            dlj $$11 = $$9.get($$10);
            if (!dqv.a.e.e().test($$11)) {
               $$9.set($$10, null);
               $$2.a(dqr.b.k, rb.a(dtz.ab, new dwh($$10, $$11)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<in<ebr>> c() {
      return this.c;
   }

   public ij<cwq> d() {
      return this.e;
   }

   public List<dzl> e() {
      return this.d;
   }

   public List<dlj> f() {
      return this.f;
   }

   public void g() {
      this.f.clear();

      for (dzl $$0 : this.d) {
         for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
            this.f.add($$0.b());
         }
      }

      this.g = this.f.stream().allMatch($$0x -> $$0x.a(cyu.a));
   }

   public static dzo a(ik<cwq> $$0, ik<ebr> $$1, ik<eap> $$2) {
      in<ebr> $$3 = in.a($$1.b(ebe.r), $$1.b(ebe.a));
      dzo $$4 = new dzo(Optional.of($$3), a($$0), b($$2));
      $$4.e().add(new dzl(1, cyu.F));
      $$4.e().add(new dzl(2, cyu.j));
      $$4.e().add(new dzl(1, cyu.i));
      $$4.g();
      return $$4;
   }

   public static ij<cwq> a(ik<cwq> $$0) {
      return $$0.b(cwx.b);
   }

   public static List<ij<eap>> b(ik<eap> $$0) {
      return List.of($$0.b(qy.g), $$0.b(qy.h));
   }
}
