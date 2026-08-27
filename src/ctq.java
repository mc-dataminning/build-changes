import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public record ctq(Optional<in<cto>> e, Optional<Integer> f, List<bpm> g) {
   public static final ctq a = new ctq(Optional.empty(), Optional.empty(), List.of());
   private static final wi h = wi.c("effect.none").a(n.h);
   private static final int i = 16253176;
   private static final int j = 3694022;
   public static final int b = -1;
   private static final Codec<ctq> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(kt.i.r(), "potion").forGetter(ctq::f),
               awu.a(Codec.INT, "custom_color").forGetter(ctq::g),
               awu.a(bpm.d.listOf(), "custom_effects", List.of()).forGetter(ctq::e)
            )
            .apply($$0, ctq::new)
   );
   public static final Codec<ctq> c = awu.a(k, kt.i.r(), ctq::new);
   public static final yg<vt, ctq> d = yg.a(ye.b(ku.Y).a(ye::a), ctq::f, ye.e.a(ye::a), ctq::g, bpm.e.a(ye.a()), ctq::e, ctq::new);

   public ctq(in<cto> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static crs a(crn $$0, in<cto> $$1) {
      crs $$2 = new crs($$0);
      $$2.b(jr.x, new ctq($$1));
      return $$2;
   }

   public boolean a(in<cto> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bpm> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bpm>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bpm> $$0) {
      if (this.e.isPresent()) {
         for (bpm $$1 : this.e.get().a().a()) {
            $$0.accept(new bpm($$1));
         }
      }

      for (bpm $$2 : this.g) {
         $$0.accept(new bpm($$2));
      }
   }

   public ctq b(in<cto> $$0) {
      return new ctq(Optional.of($$0), this.f, this.g);
   }

   public ctq a(bpm $$0) {
      return new ctq(this.e, this.f, ac.a(this.g, $$0));
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

   public static int c(in<cto> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bpm> $$0) {
      int $$1 = b($$0);
      return $$1 == -1 ? 3694022 : $$1;
   }

   public static int b(Iterable<bpm> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bpm $$5 : $$0) {
         if ($$5.f()) {
            int $$6 = $$5.b().a().g();
            int $$7 = $$5.d() + 1;
            $$1 += $$7 * aww.b.b($$6);
            $$2 += $$7 * aww.b.c($$6);
            $$3 += $$7 * aww.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? -1 : aww.b.a(0, $$1 / $$4, $$2 / $$4, $$3 / $$4);
   }

   public boolean d() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bpm> e() {
      return Lists.transform(this.g, bpm::new);
   }

   public void a(Consumer<wi> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bpm> $$0, Consumer<wi> $$1, float $$2, float $$3) {
      List<Pair<in<brv>, bry>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bpm $$6 : $$0) {
         $$5 = false;
         ww $$7 = wi.c($$6.h());
         in<bpk> $$8 = $$6.b();
         $$8.a().a($$6.d(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.d() > 0) {
            $$7 = wi.a("potion.withAmplifier", $$7, wi.c("potion.potency." + $$6.d()));
         }

         if (!$$6.a(20)) {
            $$7 = wi.a("potion.withDuration", $$7, bpn.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wh.a);
         $$1.accept(wi.c("potion.whenDrank").a(n.f));

         for (Pair<in<brv>, bry> $$9 : $$4) {
            bry $$10 = (bry)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != bry.a.b && $$10.e() != bry.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wi.a("attribute.modifier.plus." + $$10.e().a(), cui.d.format($$13), wi.c(((brv)((in)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wi.a("attribute.modifier.take." + $$10.e().a(), cui.d.format($$13), wi.c(((brv)((in)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<in<cto>> f() {
      return this.e;
   }

   public Optional<Integer> g() {
      return this.f;
   }
}
