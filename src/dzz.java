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

public class dzz extends dye implements dxy, dyh {
   private static final xc a = xc.c("test_instance_block.invalid_test");
   private static final List<dxy.a> b = List.of();
   private static final List<dxy.a> c = List.of(new dxy.a(aya.a(128, 128, 128)));
   private static final List<dxy.a> d = List.of(new dxy.a(aya.a(0, 255, 0)));
   private static final List<dxy.a> e = List.of(new dxy.a(aya.a(255, 0, 0)));
   private static final List<dxy.a> f = List.of(new dxy.a(aya.a(255, 128, 0)));
   private static final kb g = new kb(0, 1, 1);
   private dzz.a h = new dzz.a(Optional.empty(), kb.i, dty.a, false, dzz.b.a, Optional.empty());

   public dzz(iw $$0, ebg $$1) {
      super(dyg.U, $$0, $$1);
   }

   public void a(dzz.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<kb> a(aru $$0, alj<ss> $$1) {
      return b($$0, $$1).map(ewf::a);
   }

   public erv d() {
      iw $$0 = this.z();
      iw $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return erv.a($$0, $$1);
   }

   public ffn f() {
      return ffn.a(this.d());
   }

   private static Optional<ewf> b(aru $$0, alj<ss> $$1) {
      return $$0.J_().c($$1).map($$0x -> ((ss)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<alj<ss>> j() {
      return this.h.a();
   }

   public xc k() {
      return this.j().map($$0 -> xc.b($$0.a().toString())).orElse(a);
   }

   private Optional<jg.c<ss>> E() {
      return this.j().flatMap(this.n.J_()::c);
   }

   public boolean s() {
      return this.h.d();
   }

   public kb t() {
      return this.h.b();
   }

   public dty u() {
      return this.E().map(jg::a).map(ss::m).orElse(dty.a).a(this.h.c());
   }

   public Optional<xc> v() {
      return this.h.f();
   }

   public void a(xc $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dzz.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dzz.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof aru) {
         this.n.a(this.aB_(), dng.a.m(), this.m(), 3);
      }
   }

   public ace y() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      ua $$1 = new ua();
      this.b($$1, $$0);
      return $$1;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      va $$2 = $$0.a("data");
      if ($$2 != null) {
         dzz.a.a.parse(uo.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      DataResult<va> $$2 = dzz.a.a.encode(this.h, uo.a, new ua());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dyh.a b() {
      return dyh.a.b;
   }

   public iw z() {
      return a(this.aB_());
   }

   public static iw a(iw $$0) {
      return $$0.a(g);
   }

   @Override
   public dyh.b c() {
      return new dyh.b(new iw(g), this.F());
   }

   @Override
   public List<dxy.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(jg::a).map(ss::h).orElse(true) ? e : f);
      };
   }

   private kb F() {
      kb $$0 = this.t();
      dty $$1 = this.u();
      boolean $$2 = $$1 == dty.b || $$1 == dty.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new kb($$3, $$0.v(), $$4);
   }

   public void a(Consumer<xc> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(xc.a("test_instance_block.reset_success", this.k()).a(o.k));
      }

      this.a(this.h.a(dzz.b.a));
   }

   public Optional<alk> b(Consumer<xc> $$0) {
      Optional<jg.c<ss>> $$1 = this.E();
      Optional<alk> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(alj::a);
      }

      if ($$2.isEmpty()) {
         iw $$4 = this.aB_();
         $$0.accept(xc.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         return $$2;
      } else {
         if (this.n instanceof aru $$5) {
            dzx.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
         }

         return $$2;
      }
   }

   public boolean c(Consumer<xc> $$0) {
      Optional<alk> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof aru $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(aru $$0, alk $$1, Consumer<xc> $$2) {
      Path $$3 = tj.c;
      Path $$4 = $$0.r().a($$1, ".nbt");
      Path $$5 = oz.a(mm.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(xc.b("Failed to export " + $$4).a(o.m));
         return true;
      } else {
         try {
            w.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(xc.b("Could not create folder " + $$5.getParent()).a(o.m));
            return true;
         }

         $$2.accept(xc.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<xc> $$0) {
      if (this.n instanceof aru $$1) {
         Optional var7 = this.E();
         iw $$4 = this.aB_();
         if (var7.isEmpty()) {
            $$0.accept(xc.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else if (!this.A()) {
            $$0.accept(xc.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else {
            sw.a($$1);
            sz.a.a();
            sg.b();
            $$0.accept(xc.a("test_instance_block.starting", ((jg.c)var7.get()).g()));
            sr $$5 = new sr((jg.c<ss>)var7.get(), this.h.c(), $$1, th.a());
            $$5.a($$4);
            sw $$6 = sw.a.b(List.of($$5), $$1).a();
            tk.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof aru $$0) {
         Optional<ewf> $$1 = this.h.a().flatMap($$1x -> b($$0, (alj<ss>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(aru $$0, ewf $$1) {
      ewb $$2 = new ewb().a(this.u()).a(this.h.d()).b(true);
      iw $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.G_(), 818);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof crz)).forEach(bwv::aq);
   }

   private void H() {
      if (this.n instanceof aru $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iw B() {
      kb $$0 = this.t();
      dty $$1 = this.u();
      iw $$2 = this.z();

      return switch ($$1) {
         case a -> $$2;
         case b -> $$2.b($$0.w() - 1, 0, 0);
         case c -> $$2.b($$0.u() - 1, 0, $$0.w() - 1);
         case d -> $$2.b(0, 0, $$0.u() - 1);
      };
   }

   public void C() {
      this.e($$0 -> {
         if (!this.n.a_($$0).a(dng.pJ)) {
            this.n.b($$0, dng.iy.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dng.iy)) {
            this.n.b($$0, dng.a.m());
         }
      });
   }

   public void e(Consumer<iw> $$0) {
      ffn $$1 = this.f();
      boolean $$2 = !this.E().map($$0x -> ((ss)$$0x.a()).l()).orElse(false);
      iw $$3 = iw.a($$1.a, $$1.b, $$1.c).b(-1, -1, -1);
      iw $$4 = iw.a($$1.d, $$1.e, $$1.f);
      iw.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w() || $$4x.v() == $$3.v();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$0.accept($$4x);
         }
      });
   }

   public static record a(Optional<alj<ss>> c, kb d, dty e, boolean f, dzz.b g, Optional<xc> h) {
      public static final Codec<dzz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a(mi.bh).optionalFieldOf("test").forGetter(dzz.a::a),
                  kb.g.fieldOf("size").forGetter(dzz.a::b),
                  dty.f.fieldOf("rotation").forGetter(dzz.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dzz.a::d),
                  dzz.b.d.fieldOf("status").forGetter(dzz.a::e),
                  xe.a.optionalFieldOf("error_message").forGetter(dzz.a::f)
               )
               .apply($$0, dzz.a::new)
      );
      public static final za<wn, dzz.a> b = za.a(
         yy.a(alj.b(mi.bh)), dzz.a::a, kb.h, dzz.a::b, dty.g, dzz.a::c, yy.b, dzz.a::d, dzz.b.e, dzz.a::e, yy.a(xe.b), dzz.a::f, dzz.a::new
      );

      public dzz.a a(kb $$0) {
         return new dzz.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dzz.a a(dzz.b $$0) {
         return new dzz.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dzz.a a(xc $$0) {
         return new dzz.a(this.c, this.d, this.e, this.f, dzz.b.c, Optional.of($$0));
      }

      public Optional<alj<ss>> a() {
         return this.c;
      }

      public kb b() {
         return this.d;
      }

      public dty c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dzz.b e() {
         return this.g;
      }

      public Optional<xc> f() {
         return this.h;
      }
   }

   public static enum b implements bao {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<dzz.b> f = ayg.a($$0 -> $$0.h, values(), ayg.a.a);
      public static final Codec<dzz.b> d = bao.a(dzz.b::values);
      public static final za<ByteBuf, dzz.b> e = yy.a(dzz.b::a, $$0 -> $$0.h);
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

      public static dzz.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
