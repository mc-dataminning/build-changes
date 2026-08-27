import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public record cuc(Optional<iv<cua>> e, Optional<Integer> f, List<bpx> g) {
   public static final cuc a = new cuc(Optional.empty(), Optional.empty(), List.of());
   private static final ws h = ws.c("effect.none").a(n.h);
   private static final int i = 16253176;
   private static final int j = 3694022;
   public static final int b = -1;
   private static final Codec<cuc> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(lc.i.r(), "potion").forGetter(cuc::f),
               axe.a(Codec.INT, "custom_color").forGetter(cuc::g),
               axe.a(bpx.d.listOf(), "custom_effects", List.of()).forGetter(cuc::e)
            )
            .apply($$0, cuc::new)
   );
   public static final Codec<cuc> c = axe.a(k, lc.i.r(), cuc::new);
   public static final yq<wd, cuc> d = yq.a(yo.b(ld.Y).a(yo::a), cuc::f, yo.e.a(yo::a), cuc::g, bpx.e.a(yo.a()), cuc::e, cuc::new);

   public cuc(iv<cua> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static csd a(cry $$0, iv<cua> $$1) {
      csd $$2 = new csd($$0);
      $$2.b(jz.x, new cuc($$1));
      return $$2;
   }

   public boolean a(iv<cua> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bpx> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bpx>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bpx> $$0) {
      if (this.e.isPresent()) {
         for (bpx $$1 : this.e.get().a().a()) {
            $$0.accept(new bpx($$1));
         }
      }

      for (bpx $$2 : this.g) {
         $$0.accept(new bpx($$2));
      }
   }

   public cuc b(iv<cua> $$0) {
      return new cuc(Optional.of($$0), this.f, this.g);
   }

   public cuc a(bpx $$0) {
      return new cuc(this.e, this.f, ac.a(this.g, $$0));
   }

   public int b() {
      if (this.f.isPresent()) {
         return this.f.get();
      } else {
         return this.e.isEmpty() ? 16253176 : a(this.a());
      }
   }

   public int c() {
      return this.f.isPresent() ? this.f.get() : a(this.a());
   }

   public static int c(iv<cua> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bpx> $$0) {
      int $$1 = b($$0);
      return $$1 == -1 ? 3694022 : $$1;
   }

   public static int b(Iterable<bpx> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bpx $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axg.b.b($$6);
            $$2 += $$7 * axg.b.c($$6);
            $$3 += $$7 * axg.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? -1 : axg.b.a(0, $$1 / $$4, $$2 / $$4, $$3 / $$4);
   }

   public boolean d() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bpx> e() {
      return Lists.transform(this.g, bpx::new);
   }

   public void a(Consumer<ws> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bpx> $$0, Consumer<ws> $$1, float $$2, float $$3) {
      List<Pair<iv<bsg>, bsj>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bpx $$6 : $$0) {
         $$5 = false;
         xg $$7 = ws.c($$6.i());
         iv<bpv> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = ws.a("potion.withAmplifier", $$7, ws.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = ws.a("potion.withDuration", $$7, bpy.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wr.a);
         $$1.accept(ws.c("potion.whenDrank").a(n.f));

         for (Pair<iv<bsg>, bsj> $$9 : $$4) {
            bsj $$10 = (bsj)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != bsj.a.b && $$10.e() != bsj.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(ws.a("attribute.modifier.plus." + $$10.e().a(), cuw.d.format($$13), ws.c(((bsg)((iv)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(ws.a("attribute.modifier.take." + $$10.e().a(), cuw.d.format($$13), ws.c(((bsg)((iv)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<iv<cua>> f() {
      return this.e;
   }

   public Optional<Integer> g() {
      return this.f;
   }
}
