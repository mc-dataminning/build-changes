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
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public final class cto implements jw {
   private static final Codec<ix<ctj>> j = le.h
      .r()
      .validate($$0 -> $$0.a(ctr.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cto> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(cto::h),
                        axm.j.fieldOf("count").orElse(1).forGetter(cto::I),
                        jy.b.optionalFieldOf("components", jy.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, cto::new)
            )
            .validate(cto::b)
   );
   public static final Codec<cto> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(cto::h), jy.b.optionalFieldOf("components", jy.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new cto($$0x, 1, $$1))
            )
            .validate(cto::b)
   );
   public static final Codec<cto> c = axm.e(a).xmap($$0 -> $$0.orElse(cto.i), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cto> d = j.xmap(cto::new, cto::h);
   public static final yv<wi, cto> e = new yv<wi, cto>() {
      private static final yv<wi, ix<ctj>> a = yt.b(lf.G);

      public cto a(wi $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cto.i;
         } else {
            ix<ctj> $$2 = a.decode($$0);
            jy $$3 = jy.c.decode($$0);
            return new cto($$2, $$1, $$3);
         }
      }

      public void a(wi $$0, cto $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.I());
            a.encode($$0, $$1.h());
            jy.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final yv<wi, cto> f = new yv<wi, cto>() {
      public cto a(wi $$0) {
         cto $$1 = cto.e.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wi $$0, cto $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cto.e.encode($$0, $$1);
         }
      }
   };
   public static final yv<wi, List<cto>> g = e.a(yt.a(jg::a));
   public static final yv<wi, List<cto>> h = f.a(yt.a(jg::a));
   private static final Logger k = LogUtils.getLogger();
   public static final cto i = new cto((Void)null);
   private static final wx l = wx.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final ctj o;
   final kc p;
   @Nullable
   private bru q;

   private static DataResult<cto> b(cto $$0) {
      return $$0.I() > $$0.j()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.I() + " was larger than maximum: " + $$0.j()).setPartial(() -> $$0.c($$0.j()))
         : DataResult.success($$0);
   }

   public Optional<cqy> b() {
      return this.g().h(this);
   }

   @Override
   public jx a() {
      return (jx)(!this.e() ? this.p : jx.a);
   }

   public jx c() {
      return !this.e() ? this.g().o() : jx.a;
   }

   public jy d() {
      return !this.e() ? this.p.f() : jy.a;
   }

   public cto(daw $$0) {
      this($$0, 1);
   }

   public cto(ix<ctj> $$0) {
      this($$0.a(), 1);
   }

   public cto(ix<ctj> $$0, int $$1, jy $$2) {
      this($$0.a(), $$1, kc.a($$0.a().o(), $$2));
   }

   public cto(ix<ctj> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cto(daw $$0, int $$1) {
      this($$0, $$1, new kc($$0.q().o()));
   }

   private cto(daw $$0, int $$1, kc $$2) {
      this.o = $$0.q();
      this.m = $$1;
      this.p = $$2;
      this.g().n(this);
   }

   private cto(@Nullable Void $$0) {
      this.o = null;
      this.p = new kc(jx.a);
   }

   public static Optional<cto> a(iz.a $$0, va $$1) {
      return a.parse($$0.a(ur.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cto a(iz.a $$0, ud $$1) {
      return $$1.g() ? i : a($$0, (va)$$1).orElse(i);
   }

   public boolean e() {
      return this == i || this.o == ctr.a || this.m <= 0;
   }

   public boolean a(coj $$0) {
      return this.e() || this.g().a($$0);
   }

   public cto a(int $$0) {
      int $$1 = Math.min($$0, this.I());
      cto $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cto f() {
      if (this.e()) {
         return i;
      } else {
         cto $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public ctj g() {
      return this.e() ? ctr.a : this.o;
   }

   public ix<ctj> h() {
      return this.g().n();
   }

   public boolean a(awl<ctj> $$0) {
      return this.g().n().a($$0);
   }

   public boolean a(ctj $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<ix<ctj>> $$0) {
      return $$0.test(this.g().n());
   }

   public boolean a(ix<ctj> $$0) {
      return this.g().n() == $$0;
   }

   public boolean a(jb<ctj> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awl<ctj>> i() {
      return this.g().n().c();
   }

   public bpu a(cxb $$0) {
      clw $$1 = $$0.o();
      io $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new drf($$0.q(), $$2, false))) {
         return bpu.d;
      } else {
         ctj $$3 = this.g();
         bpu $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avr.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(drb $$0) {
      return this.g().a(this, $$0);
   }

   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cto a(dax $$0, bso $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public va b(iz.a $$0, va $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (va)a.encode(this, $$0.a(ur.a), $$1).getOrThrow();
      }
   }

   public va a(iz.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (va)a.encodeStart($$0.a(ur.a), this).getOrThrow();
      }
   }

   public va b(iz.a $$0) {
      return (va)(this.e() ? new ud() : this.b($$0, new ud()));
   }

   public int j() {
      return this.a(kb.b, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(kb.c) && !this.b(kb.e) && this.b(kb.d);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayd.a(this.a(kb.d, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kb.d, Integer.valueOf(ayd.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kb.c, Integer.valueOf(0));
   }

   public void a(int $$0, ayk $$1, @Nullable aqn $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            int $$4 = cza.a(czc.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cyy.a(this, $$4, $$1)) {
                  $$5++;
               }
            }

            $$0 -= $$5;
            if ($$0 <= 0) {
               return;
            }
         }

         if ($$2 != null && $$0 != 0) {
            am.u.a($$2, this, this.n() + $$0);
         }

         int $$7 = this.n() + $$0;
         this.b($$7);
         if ($$7 >= this.o()) {
            $$3.run();
         }
      }
   }

   public void a(int $$0, bso $$1, bsb $$2) {
      if (!$$1.dP().B) {
         if ($$1 instanceof clw $$3 && $$3.fP()) {
            return;
         }

         this.a($$0, $$1.el(), $$1 instanceof aqn $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            ctj $$2x = this.g();
            this.h(1);
            if ($$1 instanceof clw) {
               ((clw)$$1).b(avr.d.b($$2x));
            }

            this.b(0);
         });
      }
   }

   public boolean p() {
      return this.g().e(this);
   }

   public int q() {
      return this.g().f(this);
   }

   public int r() {
      return this.g().g(this);
   }

   public boolean a(cqo $$0, cpb $$1, clw $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cto $$0, cqo $$1, cpb $$2, clw $$3, btg $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bso $$0, clw $$1) {
      ctj $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avr.c.b($$2));
      }
   }

   public void a(dax $$0, drb $$1, io $$2, clw $$3) {
      ctj $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avr.c.b($$4));
      }
   }

   public boolean b(drb $$0) {
      return this.g().b(this, $$0);
   }

   public bpu a(clw $$0, bso $$1, bpt $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cto s() {
      if (this.e()) {
         return i;
      } else {
         cto $$0 = new cto(this.g(), this.m, this.p.g());
         $$0.d(this.H());
         return $$0;
      }
   }

   public cto c(int $$0) {
      if (this.e()) {
         return i;
      } else {
         cto $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cto a(daw $$0, int $$1) {
      return this.e() ? i : this.b($$0, $$1);
   }

   public cto b(daw $$0, int $$1) {
      return new cto($$0.q().n(), $$1, this.p.f());
   }

   public static boolean a(cto $$0, cto $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.I() != $$1.I() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cto> $$0, List<cto> $$1) {
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

   public static boolean b(cto $$0, cto $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cto $$0, cto $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<cto> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cto $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cto> $$0) {
      int $$1 = 0;

      for (cto $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String t() {
      return this.g().i(this);
   }

   @Override
   public String toString() {
      return this.I() + " " + this.g();
   }

   public void a(dax $$0, bru $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dax $$0, clw $$1, int $$2) {
      $$1.a(avr.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dax $$0) {
      this.g().a(this, $$0);
   }

   public int u() {
      return this.g().b(this);
   }

   public cvj v() {
      return this.g().c(this);
   }

   public void a(dax $$0, bso $$1, int $$2) {
      this.g().a(this, $$0, $$1, $$2);
   }

   public boolean w() {
      return this.g().m(this);
   }

   @Nullable
   public <T> T b(ka<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(ka<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(ka<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(ka<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(jy $$0) {
      this.p.a($$0);
      this.g().n(this);
   }

   public void a(jx $$0) {
      this.p.a($$0);
      this.g().n(this);
   }

   public wx x() {
      wx $$0 = this.a(kb.f);
      if ($$0 != null) {
         return $$0;
      } else {
         wx $$1 = this.a(kb.g);
         return $$1 != null ? $$1 : this.g().o(this);
      }
   }

   private <T extends cwu> void a(ka<T> $$0, Consumer<wx> $$1, cvh $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<wx> a(@Nullable clw $$0, cvh $$1) {
      if (!$$1.b() && this.b(kb.p)) {
         return List.of();
      } else {
         List<wx> $$2 = Lists.newArrayList();
         xl $$3 = wx.i().b(this.x()).a(this.z().a());
         if (this.b(kb.f)) {
            $$3.a(n.u);
         }

         $$2.add($$3);
         if (!$$1.a() && !this.b(kb.f) && this.a(ctr.rU)) {
            eoh $$4 = this.a(kb.A);
            if ($$4 != null) {
               $$2.add(ctw.a($$4));
            }
         }

         Consumer<wx> $$5 = $$2::add;
         if (!this.b(kb.o)) {
            this.g().a(this, $$0 == null ? null : $$0.dP(), $$2, $$1);
         }

         this.a(kb.J, $$5, $$1);
         this.a(kb.x, $$5, $$1);
         this.a(kb.j, $$5, $$1);
         this.a(kb.y, $$5, $$1);
         this.a(kb.h, $$5, $$1);
         this.a($$5, $$0);
         this.a(kb.e, $$5, $$1);
         cra $$6 = this.a(kb.l);
         if ($$6 != null && $$6.a()) {
            $$5.accept(ww.a);
            $$5.accept(cra.c);
            $$6.a($$5);
         }

         cra $$7 = this.a(kb.k);
         if ($$7 != null && $$7.a()) {
            $$5.accept(ww.a);
            $$5.accept(cra.d);
            $$7.a($$5);
         }

         if ($$1.a()) {
            if (this.m()) {
               $$2.add(wx.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$2.add(wx.b(le.h.b(this.g()).toString()).a(n.i));
            int $$8 = this.p.d();
            if ($$8 > 0) {
               $$2.add(wx.a("item.components", $$8).a(n.i));
            }
         }

         if ($$0 != null && !this.g().a($$0.dP().J())) {
            $$2.add(l);
         }

         return $$2;
      }
   }

   private void a(Consumer<wx> $$0, @Nullable clw $$1) {
      cwj $$2 = this.a(kb.m, cwj.a);
      if ($$2.c()) {
         for (bsb $$3 : bsb.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(ww.a);
                  $$0.accept(wx.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wx> $$0, @Nullable clw $$1, ix<btr> $$2, btu $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == ctj.e) {
            $$4 += $$1.h(btw.c);
            $$4 += (double)cza.a(this, null);
            $$5 = true;
         } else if ($$3.b() == ctj.f) {
            $$4 += $$1.h(btw.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == btu.a.b || $$3.e() == btu.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(btw.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(ww.a().b(wx.a("attribute.modifier.equals." + $$3.e().a(), cwj.d.format($$6), wx.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wx.a("attribute.modifier.plus." + $$3.e().a(), cwj.d.format($$6), wx.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wx.a("attribute.modifier.take." + $$3.e().a(), cwj.d.format(-$$6), wx.c($$2.a().c())).a(n.m));
      }
   }

   public boolean y() {
      Boolean $$0 = this.a(kb.s);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cui z() {
      cui $$0 = this.a(kb.i, cui.a);
      if (!this.B()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cui.c;
            case c -> cui.d;
            default -> $$0;
         };
      }
   }

   public boolean A() {
      if (!this.g().a(this)) {
         return false;
      } else {
         cze $$0 = this.a(kb.j);
         return $$0 != null && $$0.d();
      }
   }

   public void a(cyz $$0, int $$1) {
      cza.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean B() {
      return !this.a(kb.j, cze.a).d();
   }

   public cze C() {
      return this.a(kb.j, cze.a);
   }

   public boolean D() {
      return this.q instanceof chz;
   }

   public void a(@Nullable bru $$0) {
      if (!this.e()) {
         this.q = $$0;
      }
   }

   @Nullable
   public chz E() {
      return this.q instanceof chz ? (chz)this.F() : null;
   }

   @Nullable
   public bru F() {
      return !this.e() ? this.q : null;
   }

   public void a(bsb $$0, BiConsumer<ix<btr>, btu> $$1) {
      cwj $$2 = this.a(kb.m, cwj.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().a($$0).forEach($$1);
      }
   }

   public wx G() {
      xl $$0 = wx.i().b(this.x());
      if (this.b(kb.f)) {
         $$0.a(n.u);
      }

      xl $$1 = xa.a((wx)$$0);
      if (!this.e()) {
         $$1.a(this.z().a()).a($$0x -> $$0x.a(new xd(xd.a.b, new xd.c(this))));
      }

      return $$1;
   }

   public boolean a(drf $$0) {
      cra $$1 = this.a(kb.k);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(drf $$0) {
      cra $$1 = this.a(kb.l);
      return $$1 != null && $$1.a($$0);
   }

   public int H() {
      return this.n;
   }

   public void d(int $$0) {
      this.n = $$0;
   }

   public int I() {
      return this.e() ? 0 : this.m;
   }

   public void e(int $$0) {
      this.m = $$0;
   }

   public void f(int $$0) {
      if (!this.e() && this.I() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.I() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable bso $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public void b(dax $$0, bso $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cig $$0) {
      this.g().a($$0);
   }

   public avg J() {
      return this.g().ak_();
   }

   public avg K() {
      return this.g().al_();
   }

   public avg L() {
      return this.g().e();
   }

   public boolean a(bqn $$0) {
      return !this.b(kb.v) || !$$0.a(avy.j);
   }
}
