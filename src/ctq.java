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

public final class ctq implements jw {
   private static final Codec<ix<ctl>> j = le.h
      .r()
      .validate($$0 -> $$0.a(ctt.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<ctq> a = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(ctq::h),
                        axn.j.fieldOf("count").orElse(1).forGetter(ctq::I),
                        jy.b.optionalFieldOf("components", jy.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, ctq::new)
            )
            .validate(ctq::b)
   );
   public static final Codec<ctq> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(ctq::h), jy.b.optionalFieldOf("components", jy.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new ctq($$0x, 1, $$1))
            )
            .validate(ctq::b)
   );
   public static final Codec<ctq> c = axn.e(a).xmap($$0 -> $$0.orElse(ctq.i), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<ctq> d = j.xmap(ctq::new, ctq::h);
   public static final yv<wi, ctq> e = new yv<wi, ctq>() {
      private static final yv<wi, ix<ctl>> a = yt.b(lf.G);

      public ctq a(wi $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return ctq.i;
         } else {
            ix<ctl> $$2 = a.decode($$0);
            jy $$3 = jy.c.decode($$0);
            return new ctq($$2, $$1, $$3);
         }
      }

      public void a(wi $$0, ctq $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.I());
            a.encode($$0, $$1.h());
            jy.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final yv<wi, ctq> f = new yv<wi, ctq>() {
      public ctq a(wi $$0) {
         ctq $$1 = ctq.e.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wi $$0, ctq $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            ctq.e.encode($$0, $$1);
         }
      }
   };
   public static final yv<wi, List<ctq>> g = e.a(yt.a(jg::a));
   public static final yv<wi, List<ctq>> h = f.a(yt.a(jg::a));
   private static final Logger k = LogUtils.getLogger();
   public static final ctq i = new ctq((Void)null);
   private static final wx l = wx.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final ctl o;
   final kc p;
   @Nullable
   private brw q;

   private static DataResult<ctq> b(ctq $$0) {
      return $$0.I() > $$0.j()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.I() + " was larger than maximum: " + $$0.j()).setPartial(() -> $$0.c($$0.j()))
         : DataResult.success($$0);
   }

   public Optional<cra> b() {
      return this.g().h(this);
   }

   @Override
   public jx a() {
      return (jx)(!this.e() ? this.p : jx.a);
   }

   public jx c() {
      return !this.e() ? this.g().p() : jx.a;
   }

   public jy d() {
      return !this.e() ? this.p.f() : jy.a;
   }

   public ctq(day $$0) {
      this($$0, 1);
   }

   public ctq(ix<ctl> $$0) {
      this($$0.a(), 1);
   }

   public ctq(ix<ctl> $$0, int $$1, jy $$2) {
      this($$0.a(), $$1, kc.a($$0.a().p(), $$2));
   }

   public ctq(ix<ctl> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public ctq(day $$0, int $$1) {
      this($$0, $$1, new kc($$0.r().p()));
   }

   private ctq(day $$0, int $$1, kc $$2) {
      this.o = $$0.r();
      this.m = $$1;
      this.p = $$2;
      this.g().n(this);
   }

   private ctq(@Nullable Void $$0) {
      this.o = null;
      this.p = new kc(jx.a);
   }

   public static Optional<ctq> a(iz.a $$0, va $$1) {
      return a.parse($$0.a(ur.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static ctq a(iz.a $$0, ud $$1) {
      return $$1.g() ? i : a($$0, (va)$$1).orElse(i);
   }

   public boolean e() {
      return this == i || this.o == ctt.a || this.m <= 0;
   }

   public boolean a(col $$0) {
      return this.e() || this.g().a($$0);
   }

   public ctq a(int $$0) {
      int $$1 = Math.min($$0, this.I());
      ctq $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public ctq f() {
      if (this.e()) {
         return i;
      } else {
         ctq $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public ctl g() {
      return this.e() ? ctt.a : this.o;
   }

   public ix<ctl> h() {
      return this.g().o();
   }

   public boolean a(awm<ctl> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(ctl $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<ix<ctl>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(ix<ctl> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jb<ctl> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awm<ctl>> i() {
      return this.g().o().c();
   }

   public bpw a(cxd $$0) {
      cly $$1 = $$0.o();
      io $$2 = $$0.a();
      if ($$1 != null && !$$1.gd().e && !this.a(new drh($$0.q(), $$2, false))) {
         return bpw.d;
      } else {
         ctl $$3 = this.g();
         bpw $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avs.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(drd $$0) {
      return this.g().a(this, $$0);
   }

   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public ctq a(daz $$0, bsq $$1) {
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
      return ayf.a(this.a(kb.d, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kb.d, Integer.valueOf(ayf.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kb.c, Integer.valueOf(0));
   }

   public void a(int $$0, aym $$1, @Nullable aqo $$2, Runnable $$3) {
      if (this.l()) {
         if ($$0 > 0) {
            int $$4 = czc.a(cze.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cza.a(this, $$4, $$1)) {
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

   public void a(int $$0, bsq $$1, bsd $$2) {
      if (!$$1.dP().B) {
         if ($$1 instanceof cly $$3 && $$3.fP()) {
            return;
         }

         this.a($$0, $$1.el(), $$1 instanceof aqo $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            ctl $$2x = this.g();
            this.h(1);
            if ($$1 instanceof cly) {
               ((cly)$$1).b(avs.d.b($$2x));
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

   public boolean a(cqq $$0, cpd $$1, cly $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(ctq $$0, cqq $$1, cpd $$2, cly $$3, bti $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bsq $$0, cly $$1) {
      ctl $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avs.c.b($$2));
      }
   }

   public void a(daz $$0, drd $$1, io $$2, cly $$3) {
      ctl $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avs.c.b($$4));
      }
   }

   public boolean b(drd $$0) {
      return this.g().b(this, $$0);
   }

   public bpw a(cly $$0, bsq $$1, bpv $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public ctq s() {
      if (this.e()) {
         return i;
      } else {
         ctq $$0 = new ctq(this.g(), this.m, this.p.g());
         $$0.d(this.H());
         return $$0;
      }
   }

   public ctq c(int $$0) {
      if (this.e()) {
         return i;
      } else {
         ctq $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public ctq a(day $$0, int $$1) {
      return this.e() ? i : this.b($$0, $$1);
   }

   public ctq b(day $$0, int $$1) {
      return new ctq($$0.r().o(), $$1, this.p.f());
   }

   public static boolean a(ctq $$0, ctq $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.I() != $$1.I() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<ctq> $$0, List<ctq> $$1) {
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

   public static boolean b(ctq $$0, ctq $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(ctq $$0, ctq $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<ctq> a(String $$0) {
      return a.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable ctq $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<ctq> $$0) {
      int $$1 = 0;

      for (ctq $$2 : $$0) {
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

   public void a(daz $$0, brw $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(daz $$0, cly $$1, int $$2) {
      $$1.a(avs.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(daz $$0) {
      this.g().a(this, $$0);
   }

   public int u() {
      return this.g().b(this);
   }

   public cvl v() {
      return this.g().c(this);
   }

   public void a(daz $$0, bsq $$1, int $$2) {
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

   private <T extends cww> void a(ka<T> $$0, Consumer<wx> $$1, cvj $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<wx> a(ctl.b $$0, @Nullable cly $$1, cvj $$2) {
      if (!$$2.b() && this.b(kb.p)) {
         return List.of();
      } else {
         List<wx> $$3 = Lists.newArrayList();
         xl $$4 = wx.i().b(this.x()).a(this.z().a());
         if (this.b(kb.f)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kb.f) && this.a(ctt.rU)) {
            eoj $$5 = this.a(kb.A);
            if ($$5 != null) {
               $$3.add(cty.a($$5));
            }
         }

         Consumer<wx> $$6 = $$3::add;
         if (!this.b(kb.o)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(kb.J, $$6, $$2);
         this.a(kb.x, $$6, $$2);
         this.a(kb.j, $$6, $$2);
         this.a(kb.y, $$6, $$2);
         this.a(kb.h, $$6, $$2);
         this.a($$6, $$1);
         this.a(kb.e, $$6, $$2);
         crc $$7 = this.a(kb.l);
         if ($$7 != null && $$7.a()) {
            $$6.accept(ww.a);
            $$6.accept(crc.c);
            $$7.a($$6);
         }

         crc $$8 = this.a(kb.k);
         if ($$8 != null && $$8.a()) {
            $$6.accept(ww.a);
            $$6.accept(crc.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(wx.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(wx.b(le.h.b(this.g()).toString()).a(n.i));
            int $$9 = this.p.d();
            if ($$9 > 0) {
               $$3.add(wx.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dP().J())) {
            $$3.add(l);
         }

         return $$3;
      }
   }

   private void a(Consumer<wx> $$0, @Nullable cly $$1) {
      cwl $$2 = this.a(kb.m, cwl.a);
      if ($$2.c()) {
         for (bsd $$3 : bsd.values()) {
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

   private void a(Consumer<wx> $$0, @Nullable cly $$1, ix<btt> $$2, btw $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == ctl.e) {
            $$4 += $$1.h(bty.c);
            $$4 += (double)czc.a(this, null);
            $$5 = true;
         } else if ($$3.b() == ctl.f) {
            $$4 += $$1.h(bty.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == btw.a.b || $$3.e() == btw.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bty.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(ww.a().b(wx.a("attribute.modifier.equals." + $$3.e().a(), cwl.d.format($$6), wx.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wx.a("attribute.modifier.plus." + $$3.e().a(), cwl.d.format($$6), wx.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(wx.a("attribute.modifier.take." + $$3.e().a(), cwl.d.format(-$$6), wx.c($$2.a().c())).a(n.m));
      }
   }

   public boolean y() {
      Boolean $$0 = this.a(kb.s);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cuk z() {
      cuk $$0 = this.a(kb.i, cuk.a);
      if (!this.B()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cuk.c;
            case c -> cuk.d;
            default -> $$0;
         };
      }
   }

   public boolean A() {
      if (!this.g().a(this)) {
         return false;
      } else {
         czg $$0 = this.a(kb.j);
         return $$0 != null && $$0.d();
      }
   }

   public void a(czb $$0, int $$1) {
      czc.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean B() {
      return !this.a(kb.j, czg.a).d();
   }

   public czg C() {
      return this.a(kb.j, czg.a);
   }

   public boolean D() {
      return this.q instanceof cib;
   }

   public void a(@Nullable brw $$0) {
      if (!this.e()) {
         this.q = $$0;
      }
   }

   @Nullable
   public cib E() {
      return this.q instanceof cib ? (cib)this.F() : null;
   }

   @Nullable
   public brw F() {
      return !this.e() ? this.q : null;
   }

   public void a(bsd $$0, BiConsumer<ix<btt>, btw> $$1) {
      cwl $$2 = this.a(kb.m, cwl.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
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

   public boolean a(drh $$0) {
      crc $$1 = this.a(kb.k);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(drh $$0) {
      crc $$1 = this.a(kb.l);
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

   public void a(int $$0, @Nullable bsq $$1) {
      if ($$1 == null || !$$1.fP()) {
         this.h($$0);
      }
   }

   public void b(daz $$0, bsq $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cii $$0) {
      this.g().a($$0);
   }

   public avh J() {
      return this.g().al_();
   }

   public avh K() {
      return this.g().am_();
   }

   public avh L() {
      return this.g().e();
   }

   public boolean a(bqp $$0) {
      return !this.b(kb.v) || !$$0.a(avz.j);
   }
}
