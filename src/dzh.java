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

public class dzh extends dxm implements dxg, dxp {
   private static final wy a = wy.c("test_instance_block.invalid_test");
   private static final List<dxg.a> b = List.of();
   private static final List<dxg.a> c = List.of(new dxg.a(axw.a(128, 128, 128)));
   private static final List<dxg.a> d = List.of(new dxg.a(axw.a(0, 255, 0)));
   private static final List<dxg.a> e = List.of(new dxg.a(axw.a(255, 0, 0)));
   private static final List<dxg.a> f = List.of(new dxg.a(axw.a(255, 128, 0)));
   private static final ka g = new ka(0, 1, 1);
   private dzh.a h = new dzh.a(Optional.empty(), ka.i, dtg.a, false, dzh.b.a, Optional.empty());

   public dzh(iv $$0, eao $$1) {
      super(dxo.U, $$0, $$1);
   }

   public void a(dzh.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<ka> a(arq $$0, alf<sr> $$1) {
      return b($$0, $$1).map(evk::a);
   }

   public era d() {
      iv $$0 = this.z();
      iv $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return era.a($$0, $$1);
   }

   public fes f() {
      return fes.a(this.d());
   }

   private static Optional<evk> b(arq $$0, alf<sr> $$1) {
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

   public dtg u() {
      return this.E().map(jf::a).map(sr::m).orElse(dtg.a).a(this.h.c());
   }

   public Optional<wy> v() {
      return this.h.f();
   }

   public void a(wy $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dzh.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dzh.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof arq) {
         this.n.a(this.ax_(), dmo.a.m(), this.m(), 3);
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
         dzh.a.a.parse(un.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      DataResult<uw> $$2 = dzh.a.a.encode(this.h, un.a, new tz());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dxp.a b() {
      return dxp.a.b;
   }

   public iv z() {
      return a(this.ax_());
   }

   public static iv a(iv $$0) {
      return $$0.a(g);
   }

   @Override
   public dxp.b c() {
      return new dxp.b(new iv(g), this.F());
   }

   @Override
   public List<dxg.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(jf::a).map(sr::h).orElse(true) ? e : f);
      };
   }

   private ka F() {
      ka $$0 = this.t();
      dtg $$1 = this.u();
      boolean $$2 = $$1 == dtg.b || $$1 == dtg.d;
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

      this.a(this.h.a(dzh.b.a));
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
            dzf.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
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
         Optional<evk> $$1 = this.h.a().flatMap($$1x -> b($$0, (alf<sr>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(arq $$0, evk $$1) {
      evg $$2 = new evg().a(this.u()).a(this.h.d()).b(true);
      iv $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.C_(), 818);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof crj)).forEach(bwi::aq);
   }

   private void H() {
      if (this.n instanceof arq $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iv B() {
      ka $$0 = this.t();
      dtg $$1 = this.u();
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
         if (!this.n.a_($$0).a(dmo.pJ)) {
            this.n.b($$0, dmo.iy.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dmo.iy)) {
            this.n.b($$0, dmo.a.m());
         }
      });
   }

   public void e(Consumer<iv> $$0) {
      fes $$1 = this.f();
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

   public static record a(Optional<alf<sr>> c, ka d, dtg e, boolean f, dzh.b g, Optional<wy> h) {
      public static final Codec<dzh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alf.a(mh.bh).optionalFieldOf("test").forGetter(dzh.a::a),
                  ka.g.fieldOf("size").forGetter(dzh.a::b),
                  dtg.f.fieldOf("rotation").forGetter(dzh.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dzh.a::d),
                  dzh.b.d.fieldOf("status").forGetter(dzh.a::e),
                  xa.a.optionalFieldOf("error_message").forGetter(dzh.a::f)
               )
               .apply($$0, dzh.a::new)
      );
      public static final yw<wj, dzh.a> b = yw.a(
         yu.a(alf.b(mh.bh)), dzh.a::a, ka.h, dzh.a::b, dtg.g, dzh.a::c, yu.b, dzh.a::d, dzh.b.e, dzh.a::e, yu.a(xa.b), dzh.a::f, dzh.a::new
      );

      public dzh.a a(ka $$0) {
         return new dzh.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dzh.a a(dzh.b $$0) {
         return new dzh.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dzh.a a(wy $$0) {
         return new dzh.a(this.c, this.d, this.e, this.f, dzh.b.c, Optional.of($$0));
      }

      public Optional<alf<sr>> a() {
         return this.c;
      }

      public ka b() {
         return this.d;
      }

      public dtg c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dzh.b e() {
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

      private static final IntFunction<dzh.b> f = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final Codec<dzh.b> d = bak.a(dzh.b::values);
      public static final yw<ByteBuf, dzh.b> e = yu.a(dzh.b::a, $$0 -> $$0.h);
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

      public static dzh.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
