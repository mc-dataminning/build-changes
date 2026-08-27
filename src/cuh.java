import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public final class cuh implements jz {
   private static final Codec<ja<cuc>> j = axu.b(
      lh.h.r(),
      (Function<ja<cuc>, DataResult<ja<cuc>>>)($$0 -> $$0.a(cuk.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<cuh> a = axu.a(
      (Supplier<Codec<cuh>>)(() -> axu.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(cuh::g),
                        axu.j.fieldOf("count").orElse(1).forGetter(cuh::G),
                        axu.a(kb.b, "components", kb.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, cuh::new)
            ),
            cuh::b
         ))
   );
   public static final Codec<cuh> b = axu.a(
      (Supplier<Codec<cuh>>)(() -> axu.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(cuh::g), axu.a(kb.b, "components", kb.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new cuh($$0x, 1, $$1))
            ),
            cuh::b
         ))
   );
   public static final Codec<cuh> c = axu.e(a).xmap($$0 -> $$0.orElse(cuh.i), $$0 -> $$0.d() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuh> d = j.xmap(cuh::new, cuh::g);
   public static final zc<wp, cuh> e = new zc<wp, cuh>() {
      private static final zc<wp, ja<cuc>> a = za.b(li.G);

      public cuh a(wp $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuh.i;
         } else {
            ja<cuc> $$2 = a.decode($$0);
            kb $$3 = kb.c.decode($$0);
            return new cuh($$2, $$1, $$3);
         }
      }

      public void a(wp $$0, cuh $$1) {
         if ($$1.d()) {
            $$0.c(0);
         } else {
            $$0.c($$1.G());
            a.encode($$0, $$1.g());
            kb.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final zc<wp, cuh> f = new zc<wp, cuh>() {
      public cuh a(wp $$0) {
         cuh $$1 = cuh.e.decode($$0);
         if ($$1.d()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wp $$0, cuh $$1) {
         if ($$1.d()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuh.e.encode($$0, $$1);
         }
      }
   };
   public static final zc<wp, List<cuh>> g = e.a(za.a(jj::a));
   public static final zc<wp, List<cuh>> h = f.a(za.a(jj::a));
   private static final Logger k = LogUtils.getLogger();
   public static final cuh i = new cuh((Void)null);
   private static final xe l = xe.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cuc o;
   final kf p;
   @Nullable
   private brv q;

   private static DataResult<cuh> b(cuh $$0) {
      return $$0.G() > $$0.i()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.G() + " was larger than maximum: " + $$0.i()).setPartial(() -> $$0.c($$0.i()))
         : DataResult.success($$0);
   }

   public Optional<cro> b() {
      return this.f().h(this);
   }

   @Override
   public ka a() {
      return (ka)(!this.d() ? this.p : ka.a);
   }

   public kb c() {
      return !this.d() ? this.p.f() : kb.a;
   }

   public cuh(dbz $$0) {
      this($$0, 1);
   }

   public cuh(ja<cuc> $$0) {
      this($$0.a(), 1);
   }

   public cuh(ja<cuc> $$0, int $$1, kb $$2) {
      this($$0.a(), $$1, kf.a($$0.a().o(), $$2));
   }

   public cuh(ja<cuc> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuh(dbz $$0, int $$1) {
      this($$0, $$1, new kf($$0.q().o()));
   }

   private cuh(dbz $$0, int $$1, kf $$2) {
      this.o = $$0.q();
      this.m = $$1;
      this.p = $$2;
      this.f().n(this);
   }

   private cuh(@Nullable Void $$0) {
      this.o = null;
      this.p = new kf(ka.a);
   }

   public static Optional<cuh> a(jc.a $$0, vh $$1) {
      return a.parse($$0.a(uy.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuh a(jc.a $$0, uk $$1) {
      return $$1.g() ? i : a($$0, (vh)$$1).orElse(i);
   }

   public boolean d() {
      return this == i || this.o == cuk.a || this.m <= 0;
   }

   public boolean a(cop $$0) {
      return this.d() || this.f().a($$0);
   }

   public cuh a(int $$0) {
      int $$1 = Math.min($$0, this.G());
      cuh $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cuh e() {
      if (this.d()) {
         return i;
      } else {
         cuh $$0 = this.r();
         this.e(0);
         return $$0;
      }
   }

   public cuc f() {
      return this.d() ? cuk.a : this.o;
   }

   public ja<cuc> g() {
      return this.f().n();
   }

   public boolean a(awt<cuc> $$0) {
      return this.f().n().a($$0);
   }

   public boolean a(cuc $$0) {
      return this.f() == $$0;
   }

   public boolean a(Predicate<ja<cuc>> $$0) {
      return $$0.test(this.f().n());
   }

   public boolean a(ja<cuc> $$0) {
      return this.f().n() == $$0;
   }

   public boolean a(je<cuc> $$0) {
      return $$0.a(this.g());
   }

   public Stream<awt<cuc>> h() {
      return this.f().n().c();
   }

   public bqa a(cyf $$0) {
      cly $$1 = $$0.o();
      ir $$2 = $$0.a();
      if ($$1 != null && !$$1.gm().e && !this.a(new dtg($$0.q(), $$2, false))) {
         return bqa.d;
      } else {
         cuc $$3 = this.f();
         bqa $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avz.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dtc $$0) {
      return this.f().a(this, $$0);
   }

   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      return this.f().a($$0, $$1, $$2);
   }

   public cuh a(dca $$0, bso $$1) {
      return this.f().a(this, $$0, $$1);
   }

   public vh b(jc.a $$0, vh $$1) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ad.a(a.encode(this, $$0.a(uy.a), $$1), $$0x -> new IllegalStateException($$0x));
      }
   }

   public vh a(jc.a $$0) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ad.a(a.encodeStart($$0.a(uy.a), this), IllegalStateException::new);
      }
   }

   public vh b(jc.a $$0) {
      return (vh)(this.d() ? new uk() : this.b($$0, new uk()));
   }

   public int i() {
      return this.a(ke.b, Integer.valueOf(1));
   }

   public boolean j() {
      return this.i() > 1 && (!this.k() || !this.l());
   }

   public boolean k() {
      return this.b(ke.c) && !this.b(ke.e) && this.b(ke.d);
   }

   public boolean l() {
      return this.k() && this.m() > 0;
   }

   public int m() {
      return aym.a(this.a(ke.d, Integer.valueOf(0)), 0, this.n());
   }

   public void b(int $$0) {
      this.b(ke.d, Integer.valueOf(aym.a($$0, 0, this.n())));
   }

   public int n() {
      return this.a(ke.c, Integer.valueOf(0));
   }

   public void a(int $$0, ayt $$1, @Nullable aqu $$2, Runnable $$3) {
      if (this.k()) {
         if ($$0 > 0) {
            int $$4 = dae.a(dag.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (dac.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            an.u.a($$2, this, this.m() + $$0);
         }

         int $$7 = this.m() + $$0;
         this.b($$7);
         if ($$7 >= this.n()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, bso $$1, bsc $$2) {
      if (!$$1.dU().C) {
         if ($$1 instanceof cly $$3 && $$3.fY()) {
            return;
         }

         this.a($$0, $$1.et(), $$1 instanceof aqu $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cuc $$2x = this.f();
            this.h(1);
            if ($$1 instanceof cly) {
               ((cly)$$1).b(avz.d.b($$2x));
            }

            this.b(0);
         });
      }
   }

   public boolean o() {
      return this.f().e(this);
   }

   public int p() {
      return this.f().f(this);
   }

   public int q() {
      return this.f().g(this);
   }

   public boolean a(cre $$0, cpo $$1, cly $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuh $$0, cre $$1, cpo $$2, cly $$3, btf $$4) {
      return this.f().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bso $$0, cly $$1) {
      cuc $$2 = this.f();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avz.c.b($$2));
      }
   }

   public void a(dca $$0, dtc $$1, ir $$2, cly $$3) {
      cuc $$4 = this.f();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avz.c.b($$4));
      }
   }

   public boolean b(dtc $$0) {
      return this.f().b(this, $$0);
   }

   public bqa a(cly $$0, bso $$1, bpz $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public cuh r() {
      if (this.d()) {
         return i;
      } else {
         cuh $$0 = new cuh(this.f(), this.m, this.p.g());
         $$0.d(this.F());
         return $$0;
      }
   }

   public cuh c(int $$0) {
      if (this.d()) {
         return i;
      } else {
         cuh $$1 = this.r();
         $$1.e($$0);
         return $$1;
      }
   }

   public cuh a(dbz $$0, int $$1) {
      return this.d() ? i : this.b($$0, $$1);
   }

   public cuh b(dbz $$0, int $$1) {
      return new cuh($$0.q().n(), $$1, this.p.f());
   }

   public static boolean a(cuh $$0, cuh $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.G() != $$1.G() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cuh> $$0, List<cuh> $$1) {
      if ($$0.size() != $$1.size()) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            if (!a($$0.get($$2), $$1.get($$2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean b(cuh $$0, cuh $$1) {
      return $$0.a($$1.f());
   }

   public static boolean c(cuh $$0, cuh $$1) {
      if (!$$0.a($$1.f())) {
         return false;
      } else {
         return $$0.d() && $$1.d() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<cuh> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.d() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cuh $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.f().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cuh> $$0) {
      int $$1 = 0;

      for (cuh $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String s() {
      return this.f().i(this);
   }

   @Override
   public String toString() {
      return this.G() + " " + this.f();
   }

   public void a(dca $$0, brv $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.f() != null) {
         this.f().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dca $$0, cly $$1, int $$2) {
      $$1.a(avz.b.b(this.f()), $$2);
      this.f().b(this, $$0, $$1);
   }

   public void a(dca $$0) {
      this.f().a(this, $$0);
   }

   public int t() {
      return this.f().b(this);
   }

   public cwk u() {
      return this.f().c(this);
   }

   public void a(dca $$0, bso $$1, int $$2) {
      this.f().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.f().m(this);
   }

   @Nullable
   public <T> T b(kd<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kd<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kd<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kd<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(kb $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public void a(ka $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public xe w() {
      xe $$0 = this.a(ke.f);
      return $$0 != null ? $$0 : this.f().o(this);
   }

   private <T extends cxx> void a(kd<T> $$0, Consumer<xe> $$1, cwi $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<xe> a(@Nullable cly $$0, cwi $$1) {
      if (!$$1.b() && this.b(ke.o)) {
         return List.of();
      } else {
         List<xe> $$2 = Lists.newArrayList();
         xs $$3 = xe.i().a(this.w()).a(this.y().a());
         if (this.b(ke.f)) {
            $$3.a(n.u);
         }

         $$2.add($$3);
         if (!$$1.a() && !this.b(ke.f) && this.a(cuk.tr)) {
            eqr $$4 = this.a(ke.z);
            if ($$4 != null) {
               $$2.add(cuq.a($$4));
            }
         }

         Consumer<xe> $$5 = $$2::add;
         if (!this.b(ke.n)) {
            this.f().a(this, $$0 == null ? null : $$0.dU(), $$2, $$1);
         }

         this.a(ke.ap, $$5, $$1);
         this.a(ke.I, $$5, $$1);
         this.a(ke.M, $$5, $$1);
         this.a(ke.L, $$5, $$1);
         this.a(ke.w, $$5, $$1);
         this.a(ke.i, $$5, $$1);
         this.a(ke.x, $$5, $$1);
         this.a(ke.g, $$5, $$1);
         this.a(ke.ae, $$5, $$1);
         this.a($$5, $$0);
         this.a(ke.e, $$5, $$1);
         this.a(ke.am, $$5, $$1);
         this.a(ke.X, $$5, $$1);
         crq $$6 = this.a(ke.k);
         if ($$6 != null && $$6.a()) {
            $$5.accept(xd.a);
            $$5.accept(crq.c);
            $$6.a($$5);
         }

         crq $$7 = this.a(ke.j);
         if ($$7 != null && $$7.a()) {
            $$5.accept(xd.a);
            $$5.accept(crq.d);
            $$7.a($$5);
         }

         if ($$1.a()) {
            if (this.l()) {
               $$2.add(xe.a("item.durability", this.n() - this.m(), this.n()));
            }

            $$2.add(xe.b(lh.h.b(this.f()).toString()).a(n.i));
            int $$8 = this.p.d();
            if ($$8 > 0) {
               $$2.add(xe.a("item.components", $$8).a(n.i));
            }
         }

         if ($$0 != null && !this.f().a($$0.dU().K())) {
            $$2.add(l);
         }

         return $$2;
      }
   }

   private void a(Consumer<xe> $$0, @Nullable cly $$1) {
      cxl $$2 = this.a(ke.l, cxl.a);
      if ($$2.c()) {
         for (bsc $$3 : bsc.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$5.d() != 0.0) {
                  if ($$4.isTrue()) {
                     $$0.accept(xd.a);
                     $$0.accept(xe.c("item.modifiers." + $$3.e()).a(n.h));
                     $$4.setFalse();
                  }

                  this.a($$0, $$1, $$4x, $$5);
               }
            });
         }
      }
   }

   private void a(Consumer<xe> $$0, @Nullable cly $$1, ja<btq> $$2, btt $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cuc.e) {
            $$4 += $$1.h(btv.c);
            $$4 += (double)dae.a(this, null);
            $$5 = true;
         } else if ($$3.b() == cuc.f) {
            $$4 += $$1.h(btv.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == btt.a.b || $$3.e() == btt.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(btv.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(xd.a().a(xe.a("attribute.modifier.equals." + $$3.e().a(), cxl.d.format($$6), xe.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(xe.a("attribute.modifier.plus." + $$3.e().a(), cxl.d.format($$6), xe.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(xe.a("attribute.modifier.take." + $$3.e().a(), cxl.d.format(-$$6), xe.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(ke.r);
      return $$0 != null ? $$0 : this.f().d_(this);
   }

   public cvj y() {
      cvj $$0 = this.a(ke.h, cvj.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cvj.c;
            case c -> cvj.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.f().a(this)) {
         return false;
      } else {
         dai $$0 = this.a(ke.i);
         return $$0 != null && $$0.d();
      }
   }

   public void a(dad $$0, int $$1) {
      dae.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(ke.i, dai.a).d();
   }

   public boolean B() {
      return this.q instanceof chz;
   }

   public void a(@Nullable brv $$0) {
      if (!this.d()) {
         this.q = $$0;
      }
   }

   @Nullable
   public chz C() {
      return this.q instanceof chz ? (chz)this.D() : null;
   }

   @Nullable
   public brv D() {
      return !this.d() ? this.q : null;
   }

   public void a(bsc $$0, BiConsumer<ja<btq>, btt> $$1) {
      cxl $$2 = this.a(ke.l, cxl.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.f().a($$0).forEach($$1);
      }
   }

   public xe E() {
      xs $$0 = xe.i().a(this.w());
      if (this.b(ke.f)) {
         $$0.a(n.u);
      }

      xs $$1 = xh.a((xe)$$0);
      if (!this.d()) {
         $$1.a(this.y().a()).a($$0x -> $$0x.a(new xk(xk.a.b, new xk.c(this))));
      }

      return $$1;
   }

   public boolean a(dtg $$0) {
      crq $$1 = this.a(ke.j);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dtg $$0) {
      crq $$1 = this.a(ke.k);
      return $$1 != null && $$1.a($$0);
   }

   public int F() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int G() {
      return this.d() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
   }

   public void f(int $$0) {
      if (!this.d() && this.G() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.G() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable bso $$1) {
      if ($$1 == null || !$$1.fY()) {
         this.h($$0);
      }
   }

   public void b(dca $$0, bso $$1, int $$2) {
      this.f().a($$0, $$1, this, $$2);
   }

   public void a(cig $$0) {
      this.f().a($$0);
   }

   public avn H() {
      return this.f().al_();
   }

   public avn I() {
      cov $$0 = this.a(ke.t);
      return $$0 == null ? avo.kq.a() : $$0.f().a();
   }

   public avn J() {
      return this.f().e();
   }

   public boolean a(bqt $$0) {
      return !this.b(ke.u) || !$$0.a(awg.j);
   }

   public cuh K() {
      this.b(ke.an, true);
      return this;
   }
}
