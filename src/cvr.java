import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public record cvr(Optional<ix<cvp>> d, Optional<Integer> e, List<bre> f) {
   public static final cvr a = new cvr(Optional.empty(), Optional.empty(), List.of());
   private static final wx g = wx.c("effect.none").a(n.h);
   private static final int h = -524040;
   private static final int i = -13083194;
   private static final Codec<cvr> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.i.r().optionalFieldOf("potion").forGetter(cvr::f),
               Codec.INT.optionalFieldOf("custom_color").forGetter(cvr::g),
               bre.d.listOf().optionalFieldOf("custom_effects", List.of()).forGetter(cvr::e)
            )
            .apply($$0, cvr::new)
   );
   public static final Codec<cvr> b = Codec.withAlternative(j, le.i.r(), cvr::new);
   public static final yv<wi, cvr> c = yv.a(yt.b(lf.Y).a(yt::a), cvr::f, yt.e.a(yt::a), cvr::g, bre.e.a(yt.a()), cvr::e, cvr::new);

   public cvr(ix<cvp> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static ctq a(ctl $$0, ix<cvp> $$1) {
      ctq $$2 = new ctq($$0);
      $$2.b(kb.F, new cvr($$1));
      return $$2;
   }

   public boolean a(ix<cvp> $$0) {
      return this.d.isPresent() && this.d.get().a($$0) && this.f.isEmpty();
   }

   public Iterable<bre> a() {
      if (this.d.isEmpty()) {
         return this.f;
      } else {
         return (Iterable<bre>)(this.f.isEmpty() ? this.d.get().a().a() : Iterables.concat(this.d.get().a().a(), this.f));
      }
   }

   public void a(Consumer<bre> $$0) {
      if (this.d.isPresent()) {
         for (bre $$1 : this.d.get().a().a()) {
            $$0.accept(new bre($$1));
         }
      }

      for (bre $$2 : this.f) {
         $$0.accept(new bre($$2));
      }
   }

   public cvr b(ix<cvp> $$0) {
      return new cvr(Optional.of($$0), this.e, this.f);
   }

   public cvr a(bre $$0) {
      return new cvr(this.d, this.e, ac.a(this.f, $$0));
   }

   public int b() {
      if (this.e.isPresent()) {
         return this.e.get();
      } else {
         return this.d.isEmpty() ? -524040 : a(this.a());
      }
   }

   public int c() {
      return this.e.isPresent() ? this.e.get() : a(this.a());
   }

   public static int c(ix<cvp> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bre> $$0) {
      return b($$0).orElse(-13083194);
   }

   public static OptionalInt b(Iterable<bre> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bre $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axp.b.b($$6);
            $$2 += $$7 * axp.b.c($$6);
            $$3 += $$7 * axp.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? OptionalInt.empty() : OptionalInt.of(axp.b.a($$1 / $$4, $$2 / $$4, $$3 / $$4));
   }

   public boolean d() {
      return !this.f.isEmpty() ? true : this.d.isPresent() && !this.d.get().a().a().isEmpty();
   }

   public List<bre> e() {
      return Lists.transform(this.f, bre::new);
   }

   public void a(Consumer<wx> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bre> $$0, Consumer<wx> $$1, float $$2, float $$3) {
      List<Pair<ix<btt>, btw>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bre $$6 : $$0) {
         $$5 = false;
         xl $$7 = wx.c($$6.i());
         ix<brc> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wx.a("potion.withAmplifier", $$7, wx.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wx.a("potion.withDuration", $$7, brf.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(g);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(ww.a);
         $$1.accept(wx.c("potion.whenDrank").a(n.f));

         for (Pair<ix<btt>, btw> $$9 : $$4) {
            btw $$10 = (btw)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != btw.a.b && $$10.e() != btw.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wx.a("attribute.modifier.plus." + $$10.e().a(), cwl.d.format($$13), wx.c(((btt)((ix)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wx.a("attribute.modifier.take." + $$10.e().a(), cwl.d.format($$13), wx.c(((btt)((ix)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<ix<cvp>> f() {
      return this.d;
   }

   public Optional<Integer> g() {
      return this.e;
   }
}
