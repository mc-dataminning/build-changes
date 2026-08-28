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

public class dzm extends dxr implements dxl, dxu {
   private static final wy a = wy.c("test_instance_block.invalid_test");
   private static final List<dxl.a> b = List.of();
   private static final List<dxl.a> c = List.of(new dxl.a(axw.a(128, 128, 128)));
   private static final List<dxl.a> d = List.of(new dxl.a(axw.a(0, 255, 0)));
   private static final List<dxl.a> e = List.of(new dxl.a(axw.a(255, 0, 0)));
   private static final List<dxl.a> f = List.of(new dxl.a(axw.a(255, 128, 0)));
   private static final ka g = new ka(0, 1, 1);
   private dzm.a h = new dzm.a(Optional.empty(), ka.i, dtl.a, false, dzm.b.a, Optional.empty());

   public dzm(iv $$0, eat $$1) {
      super(dxt.U, $$0, $$1);
   }

   public void a(dzm.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<ka> a(arq $$0, alf<sr> $$1) {
      return b($$0, $$1).map(evp::a);
   }

   public erf d() {
      iv $$0 = this.z();
      iv $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return erf.a($$0, $$1);
   }

   public fex f() {
      return fex.a(this.d());
   }

   private static Optional<evp> b(arq $$0, alf<sr> $$1) {
      return $$0.F_().c($$1).map($$0x -> ((sr)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<alf<sr>> j() {
      return this.h.a();
   }

   public wy k() {
      return this.j().map($$0 -> wy.b($$0.a().toString())).orElse(a);
   }

   private Optional<jf.c<sr>> E() {
      return this.j().flatMap(this.n.F_()::c);
   }

   public boolean s() {
      return this.h.d();
   }

   public ka t() {
      return this.h.b();
   }

   public dtl u() {
      return this.E().map(jf::a).map(sr::m).orElse(dtl.a).a(this.h.c());
   }

   public Optional<wy> v() {
      return this.h.f();
   }

   public void a(wy $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dzm.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dzm.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof arq) {
         this.n.a(this.ax_(), dmt.a.m(), this.m(), 3);
      }
   }

   public aca y() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      uw $$2 = $$0.a("data");
      if ($$2 != null) {
         dzm.a.a.parse(un.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      DataResult<uw> $$2 = dzm.a.a.encode(this.h, un.a, new tz());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dxu.a b() {
      return dxu.a.b;
   }

   public iv z() {
      return a(this.ax_());
   }

   public static iv a(iv $$0) {
      return $$0.a(g);
   }

   @Override
   public dxu.b c() {
      return new dxu.b(new iv(g), this.F());
   }

   @Override
   public List<dxl.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(jf::a).map(sr::h).orElse(true) ? e : f);
      };
   }

   private ka F() {
      ka $$0 = this.t();
      dtl $$1 = this.u();
      boolean $$2 = $$1 == dtl.b || $$1 == dtl.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new ka($$3, $$0.v(), $$4);
   }

   public void a(Consumer<wy> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(wy.a("test_instance_block.reset_success", this.k()).a(o.k));
      }

      this.a(this.h.a(dzm.b.a));
   }

   public Optional<alg> b(Consumer<wy> $$0) {
      Optional<jf.c<sr>> $$1 = this.E();
      Optional<alg> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(alf::a);
      }

      if ($$2.isEmpty()) {
         iv $$4 = this.ax_();
         $$0.accept(wy.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         return $$2;
      } else {
         if (this.n instanceof arq $$5) {
            dzk.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
         }

         return $$2;
      }
   }

   public boolean c(Consumer<wy> $$0) {
      Optional<alg> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof arq $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(arq $$0, alg $$1, Consumer<wy> $$2) {
      Path $$3 = ti.c;
      Path $$4 = $$0.r().a($$1, ".nbt");
      Path $$5 = oy.a(ml.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(wy.b("Failed to export " + $$4).a(o.m));
         return true;
      } else {
         try {
            w.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(wy.b("Could not create folder " + $$5.getParent()).a(o.m));
            return true;
         }

         $$2.accept(wy.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<wy> $$0) {
      if (this.n instanceof arq $$1) {
         Optional var7 = this.E();
         iv $$4 = this.ax_();
         if (var7.isEmpty()) {
            $$0.accept(wy.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else if (!this.A()) {
            $$0.accept(wy.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else {
            sv.a($$1);
            sy.a.a();
            sf.b();
            $$0.accept(wy.a("test_instance_block.starting", ((jf.c)var7.get()).g()));
            sq $$5 = new sq((jf.c<sr>)var7.get(), this.h.c(), $$1, tg.a());
            $$5.a($$4);
            sv $$6 = sv.a.b(List.of($$5), $$1).a();
            tj.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof arq $$0) {
         Optional<evp> $$1 = this.h.a().flatMap($$1x -> b($$0, (alf<sr>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(arq $$0, evp $$1) {
      evl $$2 = new evl().a(this.u()).a(this.h.d()).b(true);
      iv $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.C_(), 818);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof crm)).forEach(bwi::aq);
   }

   private void H() {
      if (this.n instanceof arq $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iv B() {
      ka $$0 = this.t();
      dtl $$1 = this.u();
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
         if (!this.n.a_($$0).a(dmt.pJ)) {
            this.n.b($$0, dmt.iy.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dmt.iy)) {
            this.n.b($$0, dmt.a.m());
         }
      });
   }

   public void e(Consumer<iv> $$0) {
      fex $$1 = this.f();
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

   public static record a(Optional<alf<sr>> c, ka d, dtl e, boolean f, dzm.b g, Optional<wy> h) {
      public static final Codec<dzm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alf.a(mh.bh).optionalFieldOf("test").forGetter(dzm.a::a),
                  ka.g.fieldOf("size").forGetter(dzm.a::b),
                  dtl.f.fieldOf("rotation").forGetter(dzm.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dzm.a::d),
                  dzm.b.d.fieldOf("status").forGetter(dzm.a::e),
                  xa.a.optionalFieldOf("error_message").forGetter(dzm.a::f)
               )
               .apply($$0, dzm.a::new)
      );
      public static final yw<wj, dzm.a> b = yw.a(
         yu.a(alf.b(mh.bh)), dzm.a::a, ka.h, dzm.a::b, dtl.g, dzm.a::c, yu.b, dzm.a::d, dzm.b.e, dzm.a::e, yu.a(xa.b), dzm.a::f, dzm.a::new
      );

      public dzm.a a(ka $$0) {
         return new dzm.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dzm.a a(dzm.b $$0) {
         return new dzm.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dzm.a a(wy $$0) {
         return new dzm.a(this.c, this.d, this.e, this.f, dzm.b.c, Optional.of($$0));
      }

      public Optional<alf<sr>> a() {
         return this.c;
      }

      public ka b() {
         return this.d;
      }

      public dtl c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dzm.b e() {
         return this.g;
      }

      public Optional<wy> f() {
         return this.h;
      }
   }

   public static enum b implements bak {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<dzm.b> f = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final Codec<dzm.b> d = bak.a(dzm.b::values);
      public static final yw<ByteBuf, dzm.b> e = yu.a(dzm.b::a, $$0 -> $$0.h);
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

      public static dzm.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
