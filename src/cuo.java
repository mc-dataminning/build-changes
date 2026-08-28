import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
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

public final class cuo implements kl {
   public static final Codec<jm<cuj>> a = lt.g
      .s()
      .validate($$0 -> $$0.a(cur.a.o()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final Codec<cuo> b = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     a.fieldOf("id").forGetter(cuo::h),
                     axv.a(1, 99).fieldOf("count").orElse(1).forGetter(cuo::H),
                     kn.b.optionalFieldOf("components", kn.a).forGetter($$0x -> $$0x.r.f())
                  )
                  .apply($$0, cuo::new)
         )
   );
   public static final Codec<cuo> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(a.fieldOf("id").forGetter(cuo::h), kn.b.optionalFieldOf("components", kn.a).forGetter($$0x -> $$0x.r.f()))
                  .apply($$0, ($$0x, $$1) -> new cuo($$0x, 1, $$1))
         )
   );
   public static final Codec<cuo> d = b.validate(cuo::b);
   public static final Codec<cuo> e = c.validate(cuo::b);
   public static final Codec<cuo> f = axv.e(b).xmap($$0 -> $$0.orElse(cuo.l), $$0 -> $$0.e() ? Optional.empty() : Optional.of($$0));
   public static final Codec<cuo> g = a.xmap(cuo::new, cuo::h);
   public static final yw<wj, cuo> h = new yw<wj, cuo>() {
      private static final yw<wj, jm<cuj>> a = yu.b(lu.K);

      public cuo a(wj $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return cuo.l;
         } else {
            jm<cuj> $$2 = a.decode($$0);
            kn $$3 = kn.c.decode($$0);
            return new cuo($$2, $$1, $$3);
         }
      }

      public void a(wj $$0, cuo $$1) {
         if ($$1.e()) {
            $$0.c(0);
         } else {
            $$0.c($$1.H());
            a.encode($$0, $$1.h());
            kn.c.encode($$0, $$1.r.f());
         }
      }
   };
   public static final yw<wj, cuo> i = new yw<wj, cuo>() {
      public cuo a(wj $$0) {
         cuo $$1 = cuo.h.decode($$0);
         if ($$1.e()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wj $$0, cuo $$1) {
         if ($$1.e()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            cuo.h.encode($$0, $$1);
         }
      }
   };
   public static final yw<wj, List<cuo>> j = h.a(yu.a(jv::a));
   public static final yw<wj, List<cuo>> k = i.a(yu.a(jv::a));
   private static final Logger m = LogUtils.getLogger();
   public static final cuo l = new cuo((Void)null);
   private static final wy n = wy.c("item.disabled").a(n.m);
   private int o;
   private int p;
   @Deprecated
   @Nullable
   private final cuj q;
   final kr r;
   @Nullable
   private bsq s;

   private static DataResult<cuo> b(cuo $$0) {
      DataResult<azr> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.H() > $$0.j()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.H() + " was larger than maximum: " + $$0.j())
            : DataResult.success($$0);
      }
   }

   public static yw<wj, cuo> a(final yw<wj, cuo> $$0) {
      return new yw<wj, cuo>() {
         public cuo a(wj $$0x) {
            cuo $$1 = $$0.decode($$0);
            if (!$$1.e()) {
               ako<azr> $$2 = $$0.G().a(ayp.a);
               cuo.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wj $$0x, cuo $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<cry> b() {
      return this.g().g(this);
   }

   @Override
   public km a() {
      return (km)(!this.e() ? this.r : km.a);
   }

   public km c() {
      return !this.e() ? this.g().p() : km.a;
   }

   public kn d() {
      return !this.e() ? this.r.f() : kn.a;
   }

   public cuo(dct $$0) {
      this($$0, 1);
   }

   public cuo(jm<cuj> $$0) {
      this($$0.a(), 1);
   }

   public cuo(jm<cuj> $$0, int $$1, kn $$2) {
      this($$0.a(), $$1, kr.a($$0.a().p(), $$2));
   }

   public cuo(jm<cuj> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public cuo(dct $$0, int $$1) {
      this($$0, $$1, new kr($$0.r().p()));
   }

   private cuo(dct $$0, int $$1, kr $$2) {
      this.q = $$0.r();
      this.o = $$1;
      this.r = $$2;
      this.g().m(this);
   }

   private cuo(@Nullable Void $$0) {
      this.q = null;
      this.r = new kr(km.a);
   }

   public static DataResult<azr> a(km $$0) {
      if ($$0.b(kq.d) && $$0.a(kq.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         cxm $$1 = $$0.a(kq.ab, cxm.a);

         for (cuo $$2 : $$1.d()) {
            int $$3 = $$2.H();
            int $$4 = $$2.j();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(azr.a);
      }
   }

   public static Optional<cuo> a(jo.a $$0, ux $$1) {
      return b.parse($$0.a(uo.a), $$1).resultOrPartial($$0x -> m.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static cuo a(jo.a $$0, ua $$1) {
      return $$1.g() ? l : a($$0, (ux)$$1).orElse(l);
   }

   public boolean e() {
      return this == l || this.q == cur.a || this.o <= 0;
   }

   public boolean a(cpj $$0) {
      return this.e() || this.g().a($$0);
   }

   public cuo a(int $$0) {
      int $$1 = Math.min($$0, this.H());
      cuo $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public cuo f() {
      if (this.e()) {
         return l;
      } else {
         cuo $$0 = this.s();
         this.e(0);
         return $$0;
      }
   }

   public cuj g() {
      return this.e() ? cur.a : this.q;
   }

   public jm<cuj> h() {
      return this.g().o();
   }

   public boolean a(awt<cuj> $$0) {
      return this.g().o().a($$0);
   }

   public boolean a(cuj $$0) {
      return this.g() == $$0;
   }

   public boolean a(Predicate<jm<cuj>> $$0) {
      return $$0.test(this.g().o());
   }

   public boolean a(jm<cuj> $$0) {
      return this.g().o() == $$0;
   }

   public boolean a(jq<cuj> $$0) {
      return $$0.a(this.h());
   }

   public Stream<awt<cuj>> i() {
      return this.g().o().c();
   }

   public bqq a(cyd $$0) {
      cmv $$1 = $$0.o();
      jd $$2 = $$0.a();
      if ($$1 != null && !$$1.ga().e && !this.a(new dte($$0.q(), $$2, false))) {
         return bqq.e;
      } else {
         cuj $$3 = this.g();
         bqq $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avy.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dta $$0) {
      return this.g().a(this, $$0);
   }

   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      return this.g().a($$0, $$1, $$2);
   }

   public cuo a(dcu $$0, btl $$1) {
      return this.g().a(this, $$0, $$1);
   }

   public ux b(jo.a $$0, ux $$1) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (ux)b.encode(this, $$0.a(uo.a), $$1).getOrThrow();
      }
   }

   public ux a(jo.a $$0) {
      if (this.e()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return (ux)b.encodeStart($$0.a(uo.a), this).getOrThrow();
      }
   }

   public ux b(jo.a $$0) {
      return (ux)(this.e() ? new ua() : this.b($$0, new ua()));
   }

   public int j() {
      return this.a(kq.c, Integer.valueOf(1));
   }

   public boolean k() {
      return this.j() > 1 && (!this.l() || !this.m());
   }

   public boolean l() {
      return this.b(kq.d) && !this.b(kq.f) && this.b(kq.e);
   }

   public boolean m() {
      return this.l() && this.n() > 0;
   }

   public int n() {
      return ayn.a(this.a(kq.e, Integer.valueOf(0)), 0, this.o());
   }

   public void b(int $$0) {
      this.b(kq.e, Integer.valueOf(ayn.a($$0, 0, this.o())));
   }

   public int o() {
      return this.a(kq.d, Integer.valueOf(0));
   }

   public void a(int $$0, aqt $$1, @Nullable aqu $$2, Consumer<cuj> $$3) {
      if (this.l()) {
         if ($$2 == null || !$$2.fM()) {
            if ($$0 > 0) {
               $$0 = dac.a($$1, this, $$0);
               if ($$0 <= 0) {
                  return;
               }
            }

            if ($$2 != null && $$0 != 0) {
               an.u.a($$2, this, this.n() + $$0);
            }

            int $$4 = this.n() + $$0;
            this.b($$4);
            if ($$4 >= this.o()) {
               cuj $$5 = this.g();
               this.h(1);
               $$3.accept($$5);
            }
         }
      }
   }

   public void a(int $$0, btl $$1, bsx $$2) {
      if ($$1.dQ() instanceof aqt $$3) {
         this.a($$0, $$3, $$1 instanceof aqu $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public boolean p() {
      return this.g().d(this);
   }

   public int q() {
      return this.g().e(this);
   }

   public int r() {
      return this.g().f(this);
   }

   public boolean a(cro $$0, cqb $$1, cmv $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public boolean a(cuo $$0, cro $$1, cqb $$2, cmv $$3, bue $$4) {
      return this.g().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(btl $$0, cmv $$1) {
      cuj $$2 = this.g();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avy.c.b($$2));
         return true;
      } else {
         return false;
      }
   }

   public void b(btl $$0, cmv $$1) {
      this.g().b(this, $$0, $$1);
   }

   public void a(dcu $$0, dta $$1, jd $$2, cmv $$3) {
      cuj $$4 = this.g();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avy.c.b($$4));
      }
   }

   public boolean b(dta $$0) {
      return this.g().b(this, $$0);
   }

   public bqq a(cmv $$0, btl $$1, bqp $$2) {
      return this.g().a(this, $$0, $$1, $$2);
   }

   public cuo s() {
      if (this.e()) {
         return l;
      } else {
         cuo $$0 = new cuo(this.g(), this.o, this.r.g());
         $$0.d(this.G());
         return $$0;
      }
   }

   public cuo c(int $$0) {
      if (this.e()) {
         return l;
      } else {
         cuo $$1 = this.s();
         $$1.e($$0);
         return $$1;
      }
   }

   public cuo a(dct $$0) {
      return this.a($$0, this.H());
   }

   public cuo a(dct $$0, int $$1) {
      return this.e() ? l : this.b($$0, $$1);
   }

   public cuo b(dct $$0, int $$1) {
      return new cuo($$0.r().o(), $$1, this.r.f());
   }

   public static boolean a(cuo $$0, cuo $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.H() != $$1.H() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<cuo> $$0, List<cuo> $$1) {
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

   public static boolean b(cuo $$0, cuo $$1) {
      return $$0.a($$1.g());
   }

   public static boolean c(cuo $$0, cuo $$1) {
      if (!$$0.a($$1.g())) {
         return false;
      } else {
         return $$0.e() && $$1.e() ? true : Objects.equals($$0.r, $$1.r);
      }
   }

   public static MapCodec<cuo> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.e() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable cuo $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.g().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<cuo> $$0) {
      int $$1 = 0;

      for (cuo $$2 : $$0) {
         $$1 = $$1 * 31 + a($$2);
      }

      return $$1;
   }

   public String t() {
      return this.g().h(this);
   }

   @Override
   public String toString() {
      return this.H() + " " + this.g();
   }

   public void a(dcu $$0, bsq $$1, int $$2, boolean $$3) {
      if (this.p > 0) {
         this.p--;
      }

      if (this.g() != null) {
         this.g().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(dcu $$0, cmv $$1, int $$2) {
      $$1.a(avy.b.b(this.g()), $$2);
      this.g().b(this, $$0, $$1);
   }

   public void a(dcu $$0) {
      this.g().a(this, $$0);
   }

   public int a(btl $$0) {
      return this.g().a(this, $$0);
   }

   public cwm u() {
      return this.g().b(this);
   }

   public void a(dcu $$0, btl $$1, int $$2) {
      this.g().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.g().l(this);
   }

   @Nullable
   public <T> T b(kp<? super T> $$0, @Nullable T $$1) {
      return this.r.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(kp<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kp<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(kp<? extends T> $$0) {
      return this.r.d($$0);
   }

   public void a(kn $$0) {
      kn $$1 = this.r.f();
      this.r.a($$0);
      Optional<Error<cuo>> $$2 = b(this).error();
      if ($$2.isPresent()) {
         m.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.r.b($$1);
      } else {
         this.g().m(this);
      }
   }

   public void b(kn $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public void b(km $$0) {
      this.r.a($$0);
      this.g().m(this);
   }

   public wy w() {
      wy $$0 = this.a(kq.g);
      if ($$0 != null) {
         return $$0;
      } else {
         wy $$1 = this.a(kq.h);
         return $$1 != null ? $$1 : this.g().n(this);
      }
   }

   private <T extends cxw> void a(kp<T> $$0, cuj.b $$1, Consumer<wy> $$2, cwk $$3) {
      T $$4 = (T)this.a($$0);
      if ($$4 != null) {
         $$4.a($$1, $$2, $$3);
      }
   }

   public List<wy> a(cuj.b $$0, @Nullable cmv $$1, cwk $$2) {
      if (!$$2.b() && this.b(kq.q)) {
         return List.of();
      } else {
         List<wy> $$3 = Lists.newArrayList();
         xm $$4 = wy.i().b(this.w()).a(this.y().a());
         if (this.b(kq.g)) {
            $$4.a(n.u);
         }

         $$3.add($$4);
         if (!$$2.a() && !this.b(kq.g) && this.a(cur.rU)) {
            eql $$5 = this.a(kq.B);
            if ($$5 != null) {
               $$3.add(cva.a($$5));
            }
         }

         Consumer<wy> $$6 = $$3::add;
         if (!this.b(kq.p)) {
            this.g().a(this, $$0, $$3, $$2);
         }

         this.a(kq.R, $$0, $$6, $$2);
         this.a(kq.K, $$0, $$6, $$2);
         this.a(kq.y, $$0, $$6, $$2);
         this.a(kq.k, $$0, $$6, $$2);
         this.a(kq.z, $$0, $$6, $$2);
         this.a(kq.i, $$0, $$6, $$2);
         this.a($$6, $$1);
         this.a(kq.f, $$0, $$6, $$2);
         csa $$7 = this.a(kq.m);
         if ($$7 != null && $$7.a()) {
            $$6.accept(wx.a);
            $$6.accept(csa.c);
            $$7.a($$6);
         }

         csa $$8 = this.a(kq.l);
         if ($$8 != null && $$8.a()) {
            $$6.accept(wx.a);
            $$6.accept(csa.d);
            $$8.a($$6);
         }

         if ($$2.a()) {
            if (this.m()) {
               $$3.add(wy.a("item.durability", this.o() - this.n(), this.o()));
            }

            $$3.add(wy.b(lt.g.b(this.g()).toString()).a(n.i));
            int $$9 = this.r.d();
            if ($$9 > 0) {
               $$3.add(wy.a("item.components", $$9).a(n.i));
            }
         }

         if ($$1 != null && !this.g().a($$1.dQ().J())) {
            $$3.add(n);
         }

         return $$3;
      }
   }

   private void a(Consumer<wy> $$0, @Nullable cmv $$1) {
      cxl $$2 = this.a(kq.n, cxl.a);
      if ($$2.c()) {
         for (bsy $$3 : bsy.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wx.a);
                  $$0.accept(wy.c("item.modifiers." + $$3.c()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<wy> $$0, @Nullable cmv $$1, jm<bup> $$2, bus $$3) {
      double $$4 = $$3.c();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.a(cuj.e)) {
            $$4 += $$1.h(buu.c);
            $$5 = true;
         } else if ($$3.a(cuj.f)) {
            $$4 += $$1.h(buu.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.d() == bus.a.b || $$3.d() == bus.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(buu.p)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wx.a().b(wy.a("attribute.modifier.equals." + $$3.d().a(), cxl.d.format($$6), wy.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(wy.a("attribute.modifier.plus." + $$3.d().a(), cxl.d.format($$6), wy.c($$2.a().c())).a($$2.a().b(true)));
      } else if ($$4 < 0.0) {
         $$0.accept(wy.a("attribute.modifier.take." + $$3.d().a(), cxl.d.format(-$$6), wy.c($$2.a().c())).a($$2.a().b(false)));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(kq.t);
      return $$0 != null ? $$0 : this.g().d_(this);
   }

   public cvm y() {
      cvm $$0 = this.a(kq.j, cvm.a);
      if (!this.A()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> cvm.c;
            case c -> cvm.d;
            default -> $$0;
         };
      }
   }

   public boolean z() {
      if (!this.g().a(this)) {
         return false;
      } else {
         dag $$0 = this.a(kq.k);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jm<daa> $$0, int $$1) {
      dac.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(kq.k, dag.a).d();
   }

   public dag B() {
      return this.a(kq.k, dag.a);
   }

   public boolean C() {
      return this.s instanceof ciy;
   }

   public void a(@Nullable bsq $$0) {
      if (!this.e()) {
         this.s = $$0;
      }
   }

   @Nullable
   public ciy D() {
      return this.s instanceof ciy ? (ciy)this.E() : null;
   }

   @Nullable
   public bsq E() {
      return !this.e() ? this.s : null;
   }

   public void a(bsy $$0, BiConsumer<jm<bup>, bus> $$1) {
      cxl $$2 = this.a(kq.n, cxl.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      dac.a(this, $$0, $$1);
   }

   public void a(bsx $$0, BiConsumer<jm<bup>, bus> $$1) {
      cxl $$2 = this.a(kq.n, cxl.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.g().j().a($$0, $$1);
      }

      dac.a(this, $$0, $$1);
   }

   public wy F() {
      xm $$0 = wy.i().b(this.w());
      if (this.b(kq.g)) {
         $$0.a(n.u);
      }

      xm $$1 = xb.a((wy)$$0);
      if (!this.e()) {
         $$1.a(this.y().a()).a($$0x -> $$0x.a(new xe(xe.a.b, new xe.c(this))));
      }

      return $$1;
   }

   public boolean a(dte $$0) {
      csa $$1 = this.a(kq.l);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dte $$0) {
      csa $$1 = this.a(kq.m);
      return $$1 != null && $$1.a($$0);
   }

   public int G() {
      return this.p;
   }

   public void d(int $$0) {
      this.p = $$0;
   }

   public int H() {
      return this.e() ? 0 : this.o;
   }

   public void e(int $$0) {
      this.o = $$0;
   }

   public void f(int $$0) {
      if (!this.e() && this.H() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.H() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable btl $$1) {
      if ($$1 == null || !$$1.fM()) {
         this.h($$0);
      }
   }

   public cuo b(int $$0, @Nullable btl $$1) {
      cuo $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dcu $$0, btl $$1, int $$2) {
      this.g().a($$0, $$1, this, $$2);
   }

   public void a(cjf $$0) {
      this.g().a($$0);
   }

   public avn I() {
      return this.g().al_();
   }

   public avn J() {
      return this.g().am_();
   }

   public avn K() {
      return this.g().e();
   }

   public boolean a(brj $$0) {
      return !this.b(kq.w) || !$$0.a(awf.i);
   }
}
