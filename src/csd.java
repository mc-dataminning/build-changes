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

public final class csd implements ju {
   private static final Codec<iv<cry>> j = axe.b(
      lc.h.r(),
      (Function<iv<cry>, DataResult<iv<cry>>>)($$0 -> $$0.a(csg.a.n()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0))
   );
   public static final Codec<csd> a = axe.a(
      (Supplier<Codec<csd>>)(() -> axe.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(
                        j.fieldOf("id").forGetter(csd::g),
                        axe.j.fieldOf("count").orElse(1).forGetter(csd::G),
                        axe.a(jw.b, "components", jw.a).forGetter($$0x -> $$0x.p.f())
                     )
                     .apply($$0, csd::new)
            ),
            csd::b
         ))
   );
   public static final Codec<csd> b = axe.a(
      (Supplier<Codec<csd>>)(() -> axe.b(
            RecordCodecBuilder.create(
               $$0 -> $$0.group(j.fieldOf("id").forGetter(csd::g), axe.a(jw.b, "components", jw.a).forGetter($$0x -> $$0x.p.f()))
                     .apply($$0, ($$0x, $$1) -> new csd($$0x, 1, $$1))
            ),
            csd::b
         ))
   );
   public static final Codec<csd> c = axe.e(a).xmap($$0 -> $$0.orElse(csd.i), $$0 -> $$0.d() ? Optional.empty() : Optional.of($$0));
   public static final Codec<csd> d = j.xmap(csd::new, csd::g);
   public static final yq<wd, csd> e = new yq<wd, csd>() {
      private static final yq<wd, iv<cry>> a = yo.b(ld.G);

      public csd a(wd $$0) {
         int $$1 = $$0.l();
         if ($$1 <= 0) {
            return csd.i;
         } else {
            iv<cry> $$2 = a.decode($$0);
            jw $$3 = jw.c.decode($$0);
            return new csd($$2, $$1, $$3);
         }
      }

      public void a(wd $$0, csd $$1) {
         if ($$1.d()) {
            $$0.c(0);
         } else {
            $$0.c($$1.G());
            a.encode($$0, $$1.g());
            jw.c.encode($$0, $$1.p.f());
         }
      }
   };
   public static final yq<wd, csd> f = new yq<wd, csd>() {
      public csd a(wd $$0) {
         csd $$1 = csd.e.decode($$0);
         if ($$1.d()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wd $$0, csd $$1) {
         if ($$1.d()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            csd.e.encode($$0, $$1);
         }
      }
   };
   public static final yq<wd, List<csd>> g = e.a(yo.a(je::a));
   public static final yq<wd, List<csd>> h = f.a(yo.a(je::a));
   private static final Logger k = LogUtils.getLogger();
   public static final csd i = new csd((Void)null);
   private static final ws l = ws.c("item.disabled").a(n.m);
   private int m;
   private int n;
   @Deprecated
   @Nullable
   private final cry o;
   final ka p;
   @Nullable
   private bql q;

   private static DataResult<csd> b(csd $$0) {
      return $$0.G() > $$0.i()
         ? DataResult.error(() -> "Item stack with stack size of " + $$0.G() + " was larger than maximum: " + $$0.i()).setPartial(() -> $$0.c($$0.i()))
         : DataResult.success($$0);
   }

   public Optional<cpn> b() {
      return this.f().h(this);
   }

   @Override
   public jv a() {
      return (jv)(!this.d() ? this.p : jv.a);
   }

   public jw c() {
      return !this.d() ? this.p.f() : jw.a;
   }

   public csd(czt $$0) {
      this($$0, 1);
   }

   public csd(iv<cry> $$0) {
      this($$0.a(), 1);
   }

   public csd(iv<cry> $$0, int $$1, jw $$2) {
      this($$0.a(), $$1, ka.a($$0.a().o(), $$2));
   }

   public csd(iv<cry> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public csd(czt $$0, int $$1) {
      this($$0, $$1, new ka($$0.p().o()));
   }

   private csd(czt $$0, int $$1, ka $$2) {
      this.o = $$0.p();
      this.m = $$1;
      this.p = $$2;
      this.f().n(this);
   }

   private csd(@Nullable Void $$0) {
      this.o = null;
      this.p = new ka(jv.a);
   }

   public static Optional<csd> a(ix.a $$0, uv $$1) {
      return a.parse($$0.a(um.a), $$1).resultOrPartial($$0x -> k.error("Tried to load invalid item: '{}'", $$0x));
   }

   public static csd a(ix.a $$0, ty $$1) {
      return $$1.g() ? i : a($$0, (uv)$$1).orElse(i);
   }

   public boolean d() {
      return this == i || this.o == csg.a || this.m <= 0;
   }

   public boolean a(cmy $$0) {
      return this.d() || this.f().a($$0);
   }

   public csd a(int $$0) {
      int $$1 = Math.min($$0, this.G());
      csd $$2 = this.c($$1);
      this.g($$1);
      return $$2;
   }

   public csd e() {
      if (this.d()) {
         return i;
      } else {
         csd $$0 = this.r();
         this.e(0);
         return $$0;
      }
   }

   public cry f() {
      return this.d() ? csg.a : this.o;
   }

   public iv<cry> g() {
      return this.f().n();
   }

   public boolean a(awd<cry> $$0) {
      return this.f().n().a($$0);
   }

   public boolean a(cry $$0) {
      return this.f() == $$0;
   }

   public boolean a(Predicate<iv<cry>> $$0) {
      return $$0.test(this.f().n());
   }

   public boolean a(iv<cry> $$0) {
      return this.f().n() == $$0;
   }

   public boolean a(iz<cry> $$0) {
      return $$0.a(this.g());
   }

   public Stream<awd<cry>> h() {
      return this.f().n().c();
   }

   public boq a(cvn $$0) {
      ckl $$1 = $$0.o();
      im $$2 = $$0.a();
      if ($$1 != null && !$$1.gb().e && !this.a(new dqc($$0.q(), $$2, false))) {
         return boq.d;
      } else {
         cry $$3 = this.f();
         boq $$4 = $$3.a($$0);
         if ($$1 != null && $$4.c()) {
            $$1.b(avj.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(dpy $$0) {
      return this.f().a(this, $$0);
   }

   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      return this.f().a($$0, $$1, $$2);
   }

   public csd a(czu $$0, bre $$1) {
      return this.f().a(this, $$0, $$1);
   }

   public uv b(ix.a $$0, uv $$1) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encode(this, $$0.a(um.a), $$1), IllegalStateException::new);
      }
   }

   public uv a(ix.a $$0) {
      if (this.d()) {
         throw new IllegalStateException("Cannot encode empty ItemStack");
      } else {
         return ac.a(a.encodeStart($$0.a(um.a), this), IllegalStateException::new);
      }
   }

   public uv b(ix.a $$0) {
      return (uv)(this.d() ? new ty() : this.b($$0, new ty()));
   }

   public int i() {
      return this.f().q();
   }

   public boolean j() {
      return this.i() > 1 && (!this.k() || !this.l());
   }

   public boolean k() {
      return !this.d() && this.f().s() ? !this.b(jz.c) && this.b(jz.b) : false;
   }

   public boolean l() {
      return this.k() && this.m() > 0;
   }

   public int m() {
      return axw.a(this.a(jz.b, Integer.valueOf(0)), 0, this.n());
   }

   public void b(int $$0) {
      this.b(jz.b, Integer.valueOf(axw.a($$0, 0, this.n())));
   }

   public int n() {
      return this.f().r();
   }

   public void a(int $$0, ayd $$1, @Nullable aqf $$2, Runnable $$3) {
      if (this.k()) {
         if ($$0 > 0) {
            int $$4 = cxo.a(cxq.w, this);
            int $$5 = 0;

            for (int $$6 = 0; $$4 > 0 && $$6 < $$0; $$6++) {
               if (cxl.a(this, $$4, $$1)) {
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

   public void a(int $$0, bre $$1, bqs $$2) {
      if (!$$1.dN().B) {
         if ($$1 instanceof ckl $$3 && $$3.fN()) {
            return;
         }

         this.a($$0, $$1.ej(), $$1 instanceof aqf $$4 ? $$4 : null, () -> {
            $$1.e($$2);
            cry $$2x = this.f();
            this.g(1);
            if ($$1 instanceof ckl) {
               ((ckl)$$1).b(avj.d.b($$2x));
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

   public boolean a(cpd $$0, cnp $$1, ckl $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public boolean a(csd $$0, cpd $$1, cnp $$2, ckl $$3, brv $$4) {
      return this.f().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bre $$0, ckl $$1) {
      cry $$2 = this.f();
      if ($$2.a(this, $$0, $$1)) {
         $$1.b(avj.c.b($$2));
      }
   }

   public void a(czu $$0, dpy $$1, im $$2, ckl $$3) {
      cry $$4 = this.f();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(avj.c.b($$4));
      }
   }

   public boolean b(dpy $$0) {
      return this.f().a_($$0);
   }

   public boq a(ckl $$0, bre $$1, bop $$2) {
      return this.f().a(this, $$0, $$1, $$2);
   }

   public csd r() {
      if (this.d()) {
         return i;
      } else {
         csd $$0 = new csd(this.f(), this.m, this.p.g());
         $$0.d(this.F());
         return $$0;
      }
   }

   public csd c(int $$0) {
      if (this.d()) {
         return i;
      } else {
         csd $$1 = this.r();
         $$1.e($$0);
         return $$1;
      }
   }

   public csd a(czt $$0, int $$1) {
      return this.d() ? i : this.b($$0, $$1);
   }

   public csd b(czt $$0, int $$1) {
      return new csd($$0.p().n(), $$1, this.p.f());
   }

   public static boolean a(csd $$0, csd $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.G() != $$1.G() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<csd> $$0, List<csd> $$1) {
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

   public static boolean b(csd $$0, csd $$1) {
      return $$0.a($$1.f());
   }

   public static boolean c(csd $$0, csd $$1) {
      if (!$$0.a($$1.f())) {
         return false;
      } else {
         return $$0.d() && $$1.d() ? true : Objects.equals($$0.p, $$1.p);
      }
   }

   public static MapCodec<csd> a(String $$0) {
      return a.optionalFieldOf($$0).xmap($$0x -> $$0x.orElse(i), $$0x -> $$0x.d() ? Optional.empty() : Optional.of($$0x));
   }

   public static int a(@Nullable csd $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.f().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<csd> $$0) {
      int $$1 = 0;

      for (csd $$2 : $$0) {
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

   public void a(czu $$0, bql $$1, int $$2, boolean $$3) {
      if (this.n > 0) {
         this.n--;
      }

      if (this.f() != null) {
         this.f().a(this, $$0, $$1, $$2, $$3);
      }
   }

   public void a(czu $$0, ckl $$1, int $$2) {
      $$1.a(avj.b.b(this.f()), $$2);
      this.f().b(this, $$0, $$1);
   }

   public void a(czu $$0) {
      this.f().a(this, $$0);
   }

   public int t() {
      return this.f().b(this);
   }

   public ctw u() {
      return this.f().c(this);
   }

   public void a(czu $$0, bre $$1, int $$2) {
      this.f().a(this, $$0, $$1, $$2);
   }

   public boolean v() {
      return this.f().m(this);
   }

   @Nullable
   public <T> T b(jy<? super T> $$0, @Nullable T $$1) {
      return this.p.b($$0, $$1);
   }

   @Nullable
   public <T, U> T a(jy<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(jy<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T c(jy<? extends T> $$0) {
      return this.p.d($$0);
   }

   public void a(jw $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public void a(jv $$0) {
      this.p.a($$0);
      this.f().n(this);
   }

   public ws w() {
      ws $$0 = this.a(jz.d);
      return $$0 != null ? $$0 : this.f().o(this);
   }

   private <T extends cvg> void a(jy<T> $$0, Consumer<ws> $$1, ctu $$2) {
      T $$3 = (T)this.a($$0);
      if ($$3 != null) {
         $$3.a($$1, $$2);
      }
   }

   public List<ws> a(@Nullable ckl $$0, ctu $$1) {
      List<ws> $$2 = Lists.newArrayList();
      xg $$3 = ws.i().b(this.w()).a(this.y().e);
      if (this.b(jz.d)) {
         $$3.a(n.u);
      }

      $$2.add($$3);
      if (!$$1.a() && !this.b(jz.d) && this.a(csg.rU)) {
         enc $$4 = this.a(jz.s);
         if ($$4 != null) {
            $$2.add(csl.a($$4));
         }
      }

      Consumer<ws> $$5 = $$2::add;
      if (!this.b(jz.k)) {
         this.f().a(this, $$0 == null ? null : $$0.dN(), $$2, $$1);
      }

      this.a(jz.B, $$5, $$1);
      this.a(jz.p, $$5, $$1);
      this.a(jz.f, $$5, $$1);
      this.a(jz.q, $$5, $$1);
      this.a(jz.e, $$5, $$1);
      this.a($$5, $$0);
      this.a(jz.c, $$5, $$1);
      cpp $$6 = this.a(jz.h);
      if ($$6 != null && $$6.a()) {
         $$5.accept(wr.a);
         $$5.accept(cpp.c);
         $$6.a($$5);
      }

      cpp $$7 = this.a(jz.g);
      if ($$7 != null && $$7.a()) {
         $$5.accept(wr.a);
         $$5.accept(cpp.d);
         $$7.a($$5);
      }

      if ($$1.a()) {
         if (this.l()) {
            $$2.add(ws.a("item.durability", this.n() - this.m(), this.n()));
         }

         $$2.add(ws.b(lc.h.b(this.f()).toString()).a(n.i));
         int $$8 = this.p.d();
         if ($$8 > 0) {
            $$2.add(ws.a("item.components", $$8).a(n.i));
         }
      }

      if ($$0 != null && !this.f().a($$0.dN().J())) {
         $$2.add(l);
      }

      return $$2;
   }

   private void a(Consumer<ws> $$0, @Nullable ckl $$1) {
      cuw $$2 = this.a(jz.i, cuw.a);
      if ($$2.c()) {
         for (bqs $$3 : bqs.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5) -> {
               if ($$4.isTrue()) {
                  $$0.accept(wr.a);
                  $$0.accept(ws.c("item.modifiers." + $$3.e()).a(n.h));
                  $$4.setFalse();
               }

               this.a($$0, $$1, $$4x, $$5);
            });
         }
      }
   }

   private void a(Consumer<ws> $$0, @Nullable ckl $$1, iv<bsg> $$2, bsj $$3) {
      double $$4 = $$3.d();
      boolean $$5 = false;
      if ($$1 != null) {
         if ($$3.b() == cry.e) {
            $$4 += $$1.h(bsl.c);
            $$4 += (double)cxo.a(this, null);
            $$5 = true;
         } else if ($$3.b() == cry.f) {
            $$4 += $$1.h(bsl.e);
            $$5 = true;
         }
      }

      double $$6;
      if ($$3.e() == bsj.a.b || $$3.e() == bsj.a.c) {
         $$6 = $$4 * 100.0;
      } else if ($$2.a(bsl.n)) {
         $$6 = $$4 * 10.0;
      } else {
         $$6 = $$4;
      }

      if ($$5) {
         $$0.accept(wr.a().b(ws.a("attribute.modifier.equals." + $$3.e().a(), cuw.d.format($$6), ws.c($$2.a().c()))).a(n.c));
      } else if ($$4 > 0.0) {
         $$0.accept(ws.a("attribute.modifier.plus." + $$3.e().a(), cuw.d.format($$6), ws.c($$2.a().c())).a(n.j));
      } else if ($$4 < 0.0) {
         $$0.accept(ws.a("attribute.modifier.take." + $$3.e().a(), cuw.d.format(-$$6), ws.c($$2.a().c())).a(n.m));
      }
   }

   public boolean x() {
      Boolean $$0 = this.a(jz.n);
      return $$0 != null ? $$0 : this.f().d_(this);
   }

   public csv y() {
      return this.f().p(this);
   }

   public boolean z() {
      if (!this.f().a(this)) {
         return false;
      } else {
         cxu $$0 = this.a(jz.f);
         return $$0 != null && $$0.d();
      }
   }

   public void a(cxn $$0, int $$1) {
      cxo.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean A() {
      return !this.a(jz.f, cxu.a).d();
   }

   public boolean B() {
      return this.q instanceof cgo;
   }

   public void a(@Nullable bql $$0) {
      if (!this.d()) {
         this.q = $$0;
      }
   }

   @Nullable
   public cgo C() {
      return this.q instanceof cgo ? (cgo)this.D() : null;
   }

   @Nullable
   public bql D() {
      return !this.d() ? this.q : null;
   }

   public void a(bqs $$0, BiConsumer<iv<bsg>, bsj> $$1) {
      cuw $$2 = this.a(jz.i, cuw.a);
      if (!$$2.b().isEmpty()) {
         $$2.a($$0, $$1);
      } else {
         this.f().a($$0).forEach($$1);
      }
   }

   public ws E() {
      xg $$0 = ws.i().b(this.w());
      if (this.b(jz.d)) {
         $$0.a(n.u);
      }

      xg $$1 = wv.a((ws)$$0);
      if (!this.d()) {
         $$1.a(this.y().e).a($$0x -> $$0x.a(new wy(wy.a.b, new wy.c(this))));
      }

      return $$1;
   }

   public boolean a(dqc $$0) {
      cpp $$1 = this.a(jz.g);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(dqc $$0) {
      cpp $$1 = this.a(jz.h);
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
      this.e(this.G() + $$0);
   }

   public void g(int $$0) {
      this.f(-$$0);
   }

   public void a(int $$0, @Nullable bre $$1) {
      if ($$1 == null || !$$1.fN()) {
         this.g($$0);
      }
   }

   public void b(czu $$0, bre $$1, int $$2) {
      this.f().a($$0, $$1, this, $$2);
   }

   public void a(cgv $$0) {
      this.f().a($$0);
   }

   public boolean H() {
      return this.f().y();
   }

   public auy I() {
      return this.f().ak_();
   }

   public auy J() {
      return this.f().al_();
   }

   public auy K() {
      return this.f().e();
   }
}
