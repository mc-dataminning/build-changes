import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public record cth(Optional<il<ctf>> d, Optional<Integer> e, List<bph> f) {
   public static final cth a = new cth(Optional.empty(), Optional.empty(), List.of());
   private static final wg g = wg.c("effect.none").a(n.h);
   private static final int h = 16253176;
   private static final int i = 3694022;
   public static final Codec<cth> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.a(kr.i.r(), "potion").forGetter(cth::f),
               aws.a(Codec.INT, "custom_color").forGetter(cth::g),
               aws.a(bph.d.listOf(), "custom_effects", List.of()).forGetter(cth::e)
            )
            .apply($$0, cth::new)
   );
   public static final ye<vr, cth> c = ye.a(yc.b(ks.X).a(yc::a), cth::f, yc.e.a(yc::a), cth::g, bph.e.a(yc.a()), cth::e, cth::new);

   public cth(il<ctf> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static crj a(cre $$0, il<ctf> $$1) {
      crj $$2 = new crj($$0);
      $$2.b(jp.x, new cth($$1));
      return $$2;
   }

   public boolean a(il<ctf> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bph> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bph>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bph> $$0) {
      if (this.d.isPresent()) {
         for (bph $$1 : this.d.get().a().a()) {
            $$0.accept(new bph($$1));
         }
      }

      for (bph $$2 : this.f) {
         $$0.accept(new bph($$2));
      }
   }

   public cth b(il<ctf> $$0) {
      return new cth(Optional.of($$0), this.e, this.f);
   }

   public cth a(bph $$0) {
      return new cth(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      if (this.e.isPresent()) {
         return this.e.get();
      } else {
         return this.d.isEmpty() ? 16253176 : a(this.a());
      }
   }

   public int c() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(il<ctf> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bph> $$0) {
      float $$1 = 0.0F;
      float $$2 = 0.0F;
      float $$3 = 0.0F;
      int $$4 = 0;

      for (bph $$5 : $$0) {
         if ($$5.f()) {
            int $$6 = $$5.b().a().g();
            int $$7 = $$5.d() + 1;
            $$1 += (float)($$7 * awu.b.b($$6)) / 255.0F;
            $$2 += (float)($$7 * awu.b.c($$6)) / 255.0F;
            $$3 += (float)($$7 * awu.b.d($$6)) / 255.0F;
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? 3694022 : awu.b.a(0, (int)($$1 / (float)$$4 * 255.0F), (int)($$2 / (float)$$4 * 255.0F), (int)($$3 / (float)$$4 * 255.0F));
   }

   public boolean d() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bph> e() {
      return Lists.transform(this.f, bph::new);
   }

   public void a(Consumer<wg> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bph> $$0, Consumer<wg> $$1, float $$2, float $$3) {
      List<Pair<il<brq>, brt>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bph $$6 : $$0) {
         $$5 = false;
         wu $$7 = wg.c($$6.h());
         il<bpf> $$8 = $$6.b();
         $$8.a().a($$6.d(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.d() > 0) {
            $$7 = wg.a("potion.withAmplifier", $$7, wg.c("potion.potency." + $$6.d()));
         }

         if (!$$6.a(20)) {
            $$7 = wg.a("potion.withDuration", $$7, bpi.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wf.a);
         $$1.accept(wg.c("potion.whenDrank").a(n.f));

         for (Pair<il<brq>, brt> $$9 : $$4) {
            brt $$10 = (brt)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.b() != brt.a.b && $$10.b() != brt.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wg.a("attribute.modifier.plus." + $$10.b().a(), ctz.d.format($$13), wg.c(((brq)((il)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wg.a("attribute.modifier.take." + $$10.b().a(), ctz.d.format($$13), wg.c(((brq)((il)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<il<ctf>> f() {
      return this.d;
   }

   public Optional<Integer> g() {
      return this.e;
   }
}
