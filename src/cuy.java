import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public record cuy(Optional<iw<cuw>> e, Optional<Integer> f, List<bqt> g) {
   public static final cuy a = new cuy(Optional.empty(), Optional.empty(), List.of());
   private static final wu h = wu.c("effect.none").a(n.h);
   private static final int i = 16253176;
   private static final int j = 3694022;
   public static final int b = -1;
   private static final Codec<cuy> k = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(ld.i.r(), "potion").forGetter(cuy::f),
               axh.a(Codec.INT, "custom_color").forGetter(cuy::g),
               axh.a(bqt.d.listOf(), "custom_effects", List.of()).forGetter(cuy::e)
            )
            .apply($$0, cuy::new)
   );
   public static final Codec<cuy> c = axh.a(k, ld.i.r(), cuy::new);
   public static final ys<wf, cuy> d = ys.a(yq.b(le.Y).a(yq::a), cuy::f, yq.e.a(yq::a), cuy::g, bqt.e.a(yq.a()), cuy::e, cuy::new);

   public cuy(iw<cuw> $$0) {
      this(Optional.of($$0), Optional.empty(), List.of());
   }

   public static csz a(csu $$0, iw<cuw> $$1) {
      csz $$2 = new csz($$0);
      $$2.b(ka.E, new cuy($$1));
      return $$2;
   }

   public boolean a(iw<cuw> $$0) {
      return this.e.isPresent() && this.e.get().a($$0) && this.g.isEmpty();
   }

   public Iterable<bqt> a() {
      if (this.e.isEmpty()) {
         return this.g;
      } else {
         return (Iterable<bqt>)(this.g.isEmpty() ? this.e.get().a().a() : Iterables.concat(this.e.get().a().a(), this.g));
      }
   }

   public void a(Consumer<bqt> $$0) {
      if (this.e.isPresent()) {
         for (bqt $$1 : this.e.get().a().a()) {
            $$0.accept(new bqt($$1));
         }
      }

      for (bqt $$2 : this.g) {
         $$0.accept(new bqt($$2));
      }
   }

   public cuy b(iw<cuw> $$0) {
      return new cuy(Optional.of($$0), this.f, this.g);
   }

   public cuy a(bqt $$0) {
      return new cuy(this.e, this.f, ac.a(this.g, $$0));
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

   public static int c(iw<cuw> $$0) {
      return a($$0.a().a());
   }

   public static int a(Iterable<bqt> $$0) {
      int $$1 = b($$0);
      return $$1 == -1 ? 3694022 : $$1;
   }

   public static int b(Iterable<bqt> $$0) {
      int $$1 = 0;
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (bqt $$5 : $$0) {
         if ($$5.g()) {
            int $$6 = $$5.c().a().g();
            int $$7 = $$5.e() + 1;
            $$1 += $$7 * axj.b.b($$6);
            $$2 += $$7 * axj.b.c($$6);
            $$3 += $$7 * axj.b.d($$6);
            $$4 += $$7;
         }
      }

      return $$4 == 0 ? -1 : axj.b.a(0, $$1 / $$4, $$2 / $$4, $$3 / $$4);
   }

   public boolean d() {
      return !this.g.isEmpty() ? true : this.e.isPresent() && !this.e.get().a().a().isEmpty();
   }

   public List<bqt> e() {
      return Lists.transform(this.g, bqt::new);
   }

   public void a(Consumer<wu> $$0, float $$1, float $$2) {
      a(this.a(), $$0, $$1, $$2);
   }

   public static void a(Iterable<bqt> $$0, Consumer<wu> $$1, float $$2, float $$3) {
      List<Pair<iw<btc>, btf>> $$4 = Lists.newArrayList();
      boolean $$5 = true;

      for (bqt $$6 : $$0) {
         $$5 = false;
         xi $$7 = wu.c($$6.i());
         iw<bqr> $$8 = $$6.c();
         $$8.a().a($$6.e(), ($$1x, $$2x) -> $$4.add(new Pair($$1x, $$2x)));
         if ($$6.e() > 0) {
            $$7 = wu.a("potion.withAmplifier", $$7, wu.c("potion.potency." + $$6.e()));
         }

         if (!$$6.a(20)) {
            $$7 = wu.a("potion.withDuration", $$7, bqu.a($$6, $$2, $$3));
         }

         $$1.accept($$7.a($$8.a().f().a()));
      }

      if ($$5) {
         $$1.accept(h);
      }

      if (!$$4.isEmpty()) {
         $$1.accept(wt.a);
         $$1.accept(wu.c("potion.whenDrank").a(n.f));

         for (Pair<iw<btc>, btf> $$9 : $$4) {
            btf $$10 = (btf)$$9.getSecond();
            double $$11 = $$10.d();
            double $$13;
            if ($$10.e() != btf.a.b && $$10.e() != btf.a.c) {
               $$13 = $$10.d();
            } else {
               $$13 = $$10.d() * 100.0;
            }

            if ($$11 > 0.0) {
               $$1.accept(wu.a("attribute.modifier.plus." + $$10.e().a(), cvs.d.format($$13), wu.c(((btc)((iw)$$9.getFirst()).a()).c())).a(n.j));
            } else if ($$11 < 0.0) {
               $$13 *= -1.0;
               $$1.accept(wu.a("attribute.modifier.take." + $$10.e().a(), cvs.d.format($$13), wu.c(((btc)((iw)$$9.getFirst()).a()).c())).a(n.m));
            }
         }
      }
   }

   public Optional<iw<cuw>> f() {
      return this.e;
   }

   public Optional<Integer> g() {
      return this.f;
   }
}
