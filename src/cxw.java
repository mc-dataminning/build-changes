import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cxw(Optional<jp<cxu>> d, Optional<Integer> e, List<bte> f) implements cye {
   public static final cxw a = new cxw(Optional.empty(), Optional.empty(), List.of());
   private static final xh g = xh.c("effect.none").a(n.h);
   private static final int h = -13083194;
   private static final Codec<cxw> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxu.a.optionalFieldOf("potion").forGetter(cxw::e),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cxw::f),
               bte.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cxw::d)
            )
            .apply($$0, cxw::new)
   );
   public static final Codec<cxw> b = Codec.withAlternative(i, cxu.a, cxw::new);
   public static final zf<ws, cxw> c = zf.a(cxu.b.a(zd::a), cxw::e, zd.g.a(zd::a), cxw::f, bte.e.a(zd.a()), cxw::d, cxw::new);

   public cxw(jp<cxu> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static cvx a(cvt $$0, jp<cxu> $$1) {
      cvx $$2 = new cvx($$0);
      $$2.b(kt.P, new cxw($$1));
      return $$2;
   }

   public boolean a(jp<cxu> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bte> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bte>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bte> $$0) {
      if (this.d.isPresent()) {
         for (bte $$1 : this.d.get().a().a()) {
            $$0.accept(new bte($$1));
         }
      }

      for (bte $$2 : this.f) {
         $$0.accept(new bte($$2));
      }
   }

   public cxw b(jp<cxu> $$0) {
      return new cxw(Optional.of($$0), this.e, this.f);
   }

   public cxw a(bte $$0) {
      return new cxw(this.d, this.e, ad.a(this.f, $$0));
   }

   public int b() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(jp<cxu> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bte> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bte> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bte $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axu.b($$6);
            $$2 += $$7 * axu.c($$6);
            $$3 += $$7 * axu.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axu.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean c() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bte> d() {
      return Lists.transform(this.f, bte::new);
   }

   public void a(Consumer<xh> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public void a(buv $$0) {
      if (!$$0.dX().C) {
         coh $$2 = $$0 instanceof coh $$1 ? $$1 : null;
         this.a((Consumer<bte>)($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$2, $$2, $$0, $$2x.e(), 1.0);
            } else {
               $$0.a($$2x);
            }
         }));
      }
   }

   public static void a(Iterable<bte> $$0, Consumer<xh> $$1, float $$2, float $$3) {
      List<Pair<jp<bvy>, bwb>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bte $$6 : $$0) {
         $$5 = false;
         xv $$7 = xh.c($$6.i());
         jp<btc> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = xh.a("potion.withAmplifier", $$7, xh.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = xh.a("potion.withDuration", $$7, btf.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(xg.a);
         $$1.accept(xh.c("potion.whenDrank").a(n.f));

         for (Pair<jp<bvy>, bwb> $$9 : $$4) {
            bwb $$10 = (bwb)$$9.getSecond();
            double $$11 = $$10.c();
            double $$13;
            if ($$10.d() != bwb.a.b && $$10.d() != bwb.a.c) {
               $$13 = $$10.c();
            } else {
               $$13 = $$10.c() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(xh.a("attribute.modifier.plus." + $$10.d().a(), cym.d.format($$13), xh.c(((bvy)((jp)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(xh.a("attribute.modifier.take." + $$10.d().a(), cym.d.format($$13), xh.c(((bvy)((jp)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, cyd $$3) {
      this.a($$1);
   }

   public Optional<jp<cxu>> e() {
      return this.d;
   }

   public Optional<Integer> f() {
      return this.e;
   }
}
