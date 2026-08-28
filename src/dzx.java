import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class dzx extends dyc implements dxw, dyf {
   private static final xa a = xa.c("test_instance_block.invalid_test");
   private static final List<dxw.a> b = List.of();
   private static final List<dxw.a> c = List.of(new dxw.a(axy.a(128, 128, 128)));
   private static final List<dxw.a> d = List.of(new dxw.a(axy.a(0, 255, 0)));
   private static final List<dxw.a> e = List.of(new dxw.a(axy.a(255, 0, 0)));
   private static final List<dxw.a> f = List.of(new dxw.a(axy.a(255, 128, 0)));
   private static final ka g = new ka(0, 1, 1);
   private dzx.a h = new dzx.a(Optional.empty(), ka.i, dtw.a, false, dzx.b.a, Optional.empty());

   public dzx(iv $$0, ebe $$1) {
      super(dye.U, $$0, $$1);
   }

   public void a(dzx.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<ka> a(ars $$0, alh<sr> $$1) {
      return b($$0, $$1).map(ewd::a);
   }

   public ert d() {
      iv $$0 = this.z();
      iv $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return ert.a($$0, $$1);
   }

   public ffl f() {
      return ffl.a(this.d());
   }

   private static Optional<ewd> b(ars $$0, alh<sr> $$1) {
      return $$0.J_().c($$1).map($$0x -> ((sr)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<alh<sr>> j() {
      return this.h.a();
   }

   public xa k() {
      return this.j().map($$0 -> xa.b($$0.a().toString())).orElse(a);
   }

   private Optional<jf.c<sr>> E() {
      return this.j().flatMap(this.n.J_()::c);
   }

   public boolean s() {
      return this.h.d();
   }

   public ka t() {
      return this.h.b();
   }

   public dtw u() {
      return this.E().map(jf::a).map(sr::m).orElse(dtw.a).a(this.h.c());
   }

   public Optional<xa> v() {
      return this.h.f();
   }

   public void a(xa $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dzx.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dzx.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof ars) {
         this.n.a(this.aB_(), dne.a.m(), this.m(), 3);
      }
   }

   public acc y() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      uy $$2 = $$0.a("data");
      if ($$2 != null) {
         dzx.a.a.parse(un.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      DataResult<uy> $$2 = dzx.a.a.encode(this.h, un.a, new tz());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dyf.a b() {
      return dyf.a.b;
   }

   public iv z() {
      return a(this.aB_());
   }

   public static iv a(iv $$0) {
      return $$0.a(g);
   }

   @Override
   public dyf.b c() {
      return new dyf.b(new iv(g), this.F());
   }

   @Override
   public List<dxw.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(jf::a).map(sr::h).orElse(true) ? e : f);
      };
   }

   private ka F() {
      ka $$0 = this.t();
      dtw $$1 = this.u();
      boolean $$2 = $$1 == dtw.b || $$1 == dtw.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new ka($$3, $$0.v(), $$4);
   }

   public void a(Consumer<xa> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(xa.a("test_instance_block.reset_success", this.k()).a(o.k));
      }

      this.a(this.h.a(dzx.b.a));
   }

   public Optional<ali> b(Consumer<xa> $$0) {
      Optional<jf.c<sr>> $$1 = this.E();
      Optional<ali> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(alh::a);
      }

      if ($$2.isEmpty()) {
         iv $$4 = this.aB_();
         $$0.accept(xa.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         return $$2;
      } else {
         if (this.n instanceof ars $$5) {
            dzv.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
         }

         return $$2;
      }
   }

   public boolean c(Consumer<xa> $$0) {
      Optional<ali> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof ars $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(ars $$0, ali $$1, Consumer<xa> $$2) {
      Path $$3 = ti.c;
      Path $$4 = $$0.r().a($$1, ".nbt");
      Path $$5 = oy.a(ml.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(xa.b("Failed to export " + $$4).a(o.m));
         return true;
      } else {
         try {
            w.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(xa.b("Could not create folder " + $$5.getParent()).a(o.m));
            return true;
         }

         $$2.accept(xa.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<xa> $$0) {
      if (this.n instanceof ars $$1) {
         Optional var7 = this.E();
         iv $$4 = this.aB_();
         if (var7.isEmpty()) {
            $$0.accept(xa.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else if (!this.A()) {
            $$0.accept(xa.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else {
            sv.a($$1);
            sy.a.a();
            sf.b();
            $$0.accept(xa.a("test_instance_block.starting", ((jf.c)var7.get()).g()));
            sq $$5 = new sq((jf.c<sr>)var7.get(), this.h.c(), $$1, tg.a());
            $$5.a($$4);
            sv $$6 = sv.a.b(List.of($$5), $$1).a();
            tj.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof ars $$0) {
         Optional<ewd> $$1 = this.h.a().flatMap($$1x -> b($$0, (alh<sr>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(ars $$0, ewd $$1) {
      evz $$2 = new evz().a(this.u()).a(this.h.d()).b(true);
      iv $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.G_(), 818);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof crx)).forEach(bwt::aq);
   }

   private void H() {
      if (this.n instanceof ars $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iv B() {
      ka $$0 = this.t();
      dtw $$1 = this.u();
      iv $$2 = this.z();

      return switch ($$1) {
         case a -> $$2;
         case b -> $$2.b($$0.w() - 1, 0, 0);
         case c -> $$2.b($$0.u() - 1, 0, $$0.w() - 1);
         case d -> $$2.b(0, 0, $$0.u() - 1);
      };
   }

   public void C() {
      this.e($$0 -> {
         if (!this.n.a_($$0).a(dne.pJ)) {
            this.n.b($$0, dne.iy.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dne.iy)) {
            this.n.b($$0, dne.a.m());
         }
      });
   }

   public void e(Consumer<iv> $$0) {
      ffl $$1 = this.f();
      boolean $$2 = !this.E().map($$0x -> ((sr)$$0x.a()).l()).orElse(false);
      iv $$3 = iv.a($$1.a, $$1.b, $$1.c).b(-1, -1, -1);
      iv $$4 = iv.a($$1.d, $$1.e, $$1.f);
      iv.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w() || $$4x.v() == $$3.v();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$0.accept($$4x);
         }
      });
   }

   public static record a(Optional<alh<sr>> c, ka d, dtw e, boolean f, dzx.b g, Optional<xa> h) {
      public static final Codec<dzx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a(mh.bh).optionalFieldOf("test").forGetter(dzx.a::a),
                  ka.g.fieldOf("size").forGetter(dzx.a::b),
                  dtw.f.fieldOf("rotation").forGetter(dzx.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dzx.a::d),
                  dzx.b.d.fieldOf("status").forGetter(dzx.a::e),
                  xc.a.optionalFieldOf("error_message").forGetter(dzx.a::f)
               )
               .apply($$0, dzx.a::new)
      );
      public static final yy<wl, dzx.a> b = yy.a(
         yw.a(alh.b(mh.bh)), dzx.a::a, ka.h, dzx.a::b, dtw.g, dzx.a::c, yw.b, dzx.a::d, dzx.b.e, dzx.a::e, yw.a(xc.b), dzx.a::f, dzx.a::new
      );

      public dzx.a a(ka $$0) {
         return new dzx.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dzx.a a(dzx.b $$0) {
         return new dzx.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dzx.a a(xa $$0) {
         return new dzx.a(this.c, this.d, this.e, this.f, dzx.b.c, Optional.of($$0));
      }

      public Optional<alh<sr>> a() {
         return this.c;
      }

      public ka b() {
         return this.d;
      }

      public dtw c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dzx.b e() {
         return this.g;
      }

      public Optional<xa> f() {
         return this.h;
      }
   }

   public static enum b implements bam {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<dzx.b> f = aye.a($$0 -> $$0.h, values(), aye.a.a);
      public static final Codec<dzx.b> d = bam.a(dzx.b::values);
      public static final yy<ByteBuf, dzx.b> e = yw.a(dzx.b::a, $$0 -> $$0.h);
      private final String g;
      private final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }

      public static dzx.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
