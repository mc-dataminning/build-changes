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

public final class csz implements jv {
   private static final Codec<iw<csu>> j = axh.b(
      ld.h.r(),
      (Function<iw<csu>, DataResult<iw<csu>>>)($$0 -> $$0.a(ctc.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<csz> a = axh.a(
      (Supplier<Codec<csz>>)(() -> axh.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(csz::g),
                        axh.j.fieldOf("count").orElse(1).forGetter(csz::G),
                        axh.a(jx.b, "components", jx.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, csz::new)
            ),
            csz::b
         ))
   );
   public static final Codec<csz> b = axh.a(
      (Supplier<Codec<csz>>)(() -> axh.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(csz::g), axh.a(jx.b, "components", jx.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new csz($$0x, 1, $$1))
            ),
            csz::b
         ))
   );
   public static final Codec<csz> c = axh.e(a).xmap($$0 -> $$0.orElse(csz.i), $$0 -> $$0.d() ? Optional.empty() : Optional.of($$0));
   public static final Codec<csz> d = j.xmap(csz::new, csz::g);
   public static final ys<wf, csz> e = new ys<wf, csz>() {
      private static final ys<wf, iw<csu>> a = yq.b(le.G);

      public csz a(wf $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return csz.i;
         } else {
            iw<csu> $$2 = a.decode($$0);
            jx $$3 = jx.c.decode($$0);
            return new csz($$2, $$1, $$3);
         }
      }

      public void a(wf $$0, csz $$1) {
         if ($$1.d()) {
            $$0.c(0);
         } else {
            $$0.c($$1.G());
            a.encode($$0, $$1.g());
            jx.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final ys<wf, csz> f = new ys<wf, csz>() {
      public csz a(wf $$0) {
         csz $$1 = csz.e.decode($$0);
         if ($$1.d()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wf $$0, csz $$1) {
         if ($$1.d()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            csz.e.encode($$0, $$1);
         }
      }
   };
   public static final ys<wf, List<csz>> g = e.a(yq.a(jf::a));
   public static final ys<wf, List<csz>> h = f.a(yq.a(jf::a));
   private static final Logger k = LogUtils.getLogger();
   public static final csz i = new csz((Void)null);
   private static final wu l = wu.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final csu o;
   final kb p;
   @Nullable
   private brh q;

   private static DataResult<csz> b(csz $$0) {
      return $$0.G() > $$0.i()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.G() + " was larger than maximum: " + $$0.i()).setPartial(() -> $$0.c($$0.i()))
         : DataResult.success($$0);
   }

   public Optional<cqj> b() {
      return this.f().h(this);
   }

   @Override
   public jw a() {
      return (jw)(!this.d() ? this.p : jw.a);
   }

   public jx c() {
      return !this.d() ? this.p.f() : jx.a;
   }

   public csz(dac $$0) {
      this($$0, 1);
   }

   public csz(iw<csu> $$0) {
      this($$0.a(), 1);
   }

   public csz(iw<csu> $$0, int $$1, jx $$2) {
      this($$0.a(), $$1, kb.a($$0.a().o(), $$2));
   }

   public csz(iw<csu> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public csz(dac $$0, int $$1) {
      this($$0, $$1, new kb($$0.q().o()));
   }

   private csz(dac $$0, int $$1, kb $$2) {
      this.o = $$0.q();
      this.m = $$1;
      this.p = $$2;
      this.f().n(this);
   }

   private csz(@Nullable Void $$0) {
      this.o = null;
      this.p = new kb(jw.a);
   }

   public static Optional<csz> a(iy.a $$0, ux $$1) {
      return a.parse($$0.a(uo.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static csz a(iy.a $$0, ua $$1) {
      return $$1.g() ? i : a($$0, (ux)$$1).orElse(i);
   }

   public boolean d() {
      return this == i || this.o == ctc.a || this.m <= 0;
   }

   public boolean a(cnu $$0) {
      return this.d() || this.f().a($$0);
   }

   public csz a(int $$0) {
      int $$1 = Math.min($$0, this.G());
      csz $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public csz e() {
      if (this.d()) {
         return i;
      } else {
         csz $$0 = this.r();
         this.e(0);
         return $$0;
      }
   }

   public csu f() {
      return this.d() ? ctc.a : this.o;
   }

   public iw<csu> g() {
      return this.f().n();
   }

   public boolean a(awg<csu> $$0) {
      return this.f().n().a($$0);
   }

   public boolean a(csu $$0) {
      return this.f() == $$0;
   }

   public boolean a(Predicate<iw<csu>> $$0) {
      return $$0.test(this.f().n());
   }

   public boolean a(iw<csu> $$0) {
      return this.f().n() == $$0;
   }

   public boolean a(ja<csu> $$0) {
      return $$0.a(this.g());
   }

   public Stream<awg<csu>> h() {
      return this.f().n().c();
   }

   public bpm a(cwk $$0) {
      clh $$1 = $$0.o();
      in $$2 = $$0.a();
      if ($$1 != null && !$$1.gb().e && !this.a(new dql($$0.q(), $$2, false))) {
         return bpm.d;
      } else {
         csu $$3 = this.f();
         bpm $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avm.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dqh $$0) {
      return this.f().a(this, $$0);
   }

   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      return this.f().a($$0, $$1, $$2);
   }

   public csz a(dad $$0, bsa $$1) {
      return this.f().a(this, $$0, $$1);
   }

   public ux b(iy.a $$0, ux $$1) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encode(this, $$0.a(uo.a), $$1), IllegalStateException::new);
      }
   }

   public ux a(iy.a $$0) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encodeStart($$0.a(uo.a), this), IllegalStateException::new);
      }
   }

   public ux b(iy.a $$0) {
      return (ux)(this.d() ? new ua() : this.b($$0, new ua()));
   }

   public int i() {
      return this.a(ka.b, Integer.valueOf(1));
   }

   public boolean j() {
      return this.i() > 1 && (!this.k() || !this.l());
   }

   public boolean k() {
      return this.b(ka.c) && !this.b(ka.e) && this.b(ka.d);
   }

   public boolean l() {
      return this.k() && this.m() > 0;
   }

   public int m() {
      return axz.a(this.a(ka.d, Integer.valueOf(0)), 0, this.n());
   }

   public void b(int $$0) {
      this.b(ka.d, Integer.valueOf(axz.a($$0, 0, this.n())));
   }

   public int n() {
      return this.a(ka.c, Integer.valueOf(0));
   }

   public void a(int $$0, ayg $$1, @Nullable aqi $$2, Runnable $$3) {
      if (this.k()) {
         if ($$0 > 0) {
            int $$4 = cyh.a(cyj.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cyf.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.m() + $$0);
         }

         int $$7 = this.m() + $$0;
         this.b($$7);
         if ($$7 >= this.n()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, bsa $$1, bro $$2) {
      if (!$$1.dN().B) {
         if ($$1 instanceof clh $$3 && $$3.fN()) {
            return;
         }

         this.a($$0, $$1.ej(), $$1 instanceof aqi $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            csu $$2x = this.f();
            this.h(1);
            if ($$1 instanceof clh) {
               ((clh)$$1).b(avm.d.b($$2x));
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

   public boolean a(cpz $$0, col $$1, clh $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public boolean a(csz $$0, cpz $$1, col $$2, clh $$3, bsr $$4) {
      return this.f().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bsa $$0, clh $$1) {
      csu $$2 = this.f();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avm.c.b($$2));
      }
   }

   public void a(dad $$0, dqh $$1, in $$2, clh $$3) {
      csu $$4 = this.f();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avm.c.b($$4));
      }
   }

   public boolean b(dqh $$0) {
      return this.f().b(this, $$0);
   }

   public bpm a(clh $$0, bsa $$1, bpl $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public csz r() {
      if (this.d()) {
         return i;
      } else {
         csz $$0 = new csz(this.f(), this.m, this.p.g());
         $$0.d(this.F());
         return $$0;
      }
   }

   public csz c(int $$0) {
      if (this.d()) {
         return i;
      } else {
         csz $$1 = this.r();
         $$1.e($$0);
         return $$1;
      }
   }

   public csz a(dac $$0, int $$1) {
      return this.d() ? i : this.b($$0, $$1);
   }

   public csz b(dac $$0, int $$1) {
      return new csz($$0.q().n(), $$1, this.p.f());
   }

   public static boolean a(csz $$0, csz $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.G() != $$1.G() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<csz> $$0, List<csz> $$1) {
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

   public static boolean b(csz $$0, csz $$1) {
      return $$0.a($$1.f());
   }

   public static boolean c(csz $$0, csz $$1) {
      if (!$$0.a($$1.f())) {
         return false;
      } else {
         return $$0.d() && $$1.d() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<csz> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.d() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable csz $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.f().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<csz> $$0) {
      int $$1 = 0;

      for (csz $$2 : $$0) {
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

   public void a(dad $$0, brh $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.f() != null) {
         this.f().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dad $$0, clh $$1, int $$2) {
      $$1.a(avm.b.b(this.f()), $$2);
      this.f().b(this, $$0, $$1);
   }

   public void a(dad $$0) {
      this.f().a(this, $$0);
   }

   public int t() {
      return this.f().b(this);
   }

   public cus u() {
      return this.f().c(this);
   }

   public void a(dad $$0, bsa $$1, int $$2) {
      this.f().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.f().m(this);
   }

   @Nullable
   public <T> T b(jz<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(jz<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(jz<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(jz<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(jx $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public void a(jw $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public wu w() {
      wu $$0 = this.a(ka.f);
      return $$0 != null ? $$0 : this.f().o(this);
   }

   private <T extends cwd> void a(jz<T> $$0, Consumer<wu> $$1, cuq $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<wu> a(@Nullable clh $$0, cuq $$1) {
      if (!$$1.b() && this.b(ka.o)) {
         return List.of();
      } else {
         List<wu> $$2 = Lists.newArrayList();
         xi $$3 = wu.i().b(this.w()).a(this.y().a());
         if (this.b(ka.f)) {
            $$3.a(n.u);
         }

         $$2.add($$3);
         if (!$$1.a() && !this.b(ka.f) && this.a(ctc.rU)) {
            enn $$4 = this.a(ka.z);
            if ($$4 != null) {
               $$2.add(cth.a($$4));
            }
         }

         Consumer<wu> $$5 = $$2::add;
         if (!this.b(ka.n)) {
            this.f().a(this, $$0 == null ? null : $$0.dN(), $$2, $$1);
         }

         this.a(ka.I, $$5, $$1);
         this.a(ka.w, $$5, $$1);
         this.a(ka.i, $$5, $$1);
         this.a(ka.x, $$5, $$1);
         this.a(ka.g, $$5, $$1);
         this.a($$5, $$0);
         this.a(ka.e, $$5, $$1);
         cql $$6 = this.a(ka.k);
         if ($$6 != null && $$6.a()) {
            $$5.accept(wt.a);
            $$5.accept(cql.c);
            $$6.a($$5);
         }

         cql $$7 = this.a(ka.j);
         if ($$7 != null && $$7.a()) {
            $$5.accept(wt.a);
            $$5.accept(cql.d);
            $$7.a($$5);
         }

         if ($$1.a()) {
            if (this.l()) {
               $$2.add(wu.a("item.durability", this.n() - this.m(), this.n()));
            }

            $$2.add(wu.b(ld.h.b(this.f()).toString()).a(n.i));
            int $$8 = this.p.d();
            if ($$8 > 0) {
               $$2.add(wu.a("item.components", $$8).a(n.i));
            }
         }

         if ($$0 != null && !this.f().a($$0.dN().J())) {
            $$2.add(l);
         }

         return $$2;
      }
   }

   private void a(Consumer<wu> $$0, @Nullable clh $$1) {
      cvs $$2 = this.a(ka.l, cvs.a);
      if ($$2.c()) {
         for (bro $$3 : bro.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wt.a);
                  $$0.accept(wu.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wu> $$0, @Nullable clh $$1, iw<btc> $$2, btf $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == csu.e) {
            $$4 += $$1.h(bth.c);
            $$4 += (double)cyh.a(this, null);
            $$5 = true;
         } else if ($$3.b() == csu.f) {
            $$4 += $$1.h(bth.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == btf.a.b || $$3.e() == btf.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bth.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wt.a().b(wu.a("attribute.modifier.equals." + $$3.e().a(), cvs.d.format($$6), wu.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wu.a("attribute.modifier.plus." + $$3.e().a(), cvs.d.format($$6), wu.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wu.a("attribute.modifier.take." + $$3.e().a(), cvs.d.format(-$$6), wu.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(ka.r);
      return $$0 != null ? $$0 : this.f().d_(this);
   }

   public ctr y() {
      ctr $$0 = this.a(ka.h, ctr.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> ctr.c;
            case c -> ctr.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.f().a(this)) {
         return false;
      } else {
         cyl $$0 = this.a(ka.i);
         return $$0 != null && $$0.d();
      }
   }

   public void a(cyg $$0, int $$1) {
      cyh.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(ka.i, cyl.a).d();
   }

   public boolean B() {
      return this.q instanceof chk;
   }

   public void a(@Nullable brh $$0) {
      if (!this.d()) {
         this.q = $$0;
      }
   }

   @Nullable
   public chk C() {
      return this.q instanceof chk ? (chk)this.D() : null;
   }

   @Nullable
   public brh D() {
      return !this.d() ? this.q : null;
   }

   public void a(bro $$0, BiConsumer<iw<btc>, btf> $$1) {
      cvs $$2 = this.a(ka.l, cvs.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.f().a($$0).forEach($$1);
      }
   }

   public wu E() {
      xi $$0 = wu.i().b(this.w());
      if (this.b(ka.f)) {
         $$0.a(n.u);
      }

      xi $$1 = wx.a((wu)$$0);
      if (!this.d()) {
         $$1.a(this.y().a()).a($$0x -> $$0x.a(new xa(xa.a.b, new xa.c(this))));
      }

      return $$1;
   }

   public boolean a(dql $$0) {
      cql $$1 = this.a(ka.j);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dql $$0) {
      cql $$1 = this.a(ka.k);
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

   public void a(int $$0, @Nullable bsa $$1) {
      if ($$1 == null || !$$1.fN()) {
         this.h($$0);
      }
   }

   public void b(dad $$0, bsa $$1, int $$2) {
      this.f().a($$0, $$1, this, $$2);
   }

   public void a(chr $$0) {
      this.f().a($$0);
   }

   public avb H() {
      return this.f().ak_();
   }

   public avb I() {
      return this.f().al_();
   }

   public avb J() {
      return this.f().e();
   }

   public boolean a(bqf $$0) {
      return !this.b(ka.u) || !$$0.a(avt.j);
   }
}
