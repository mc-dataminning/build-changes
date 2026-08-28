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

public class eaj extends dyo implements dyi, dyr {
   private static final xg a = xg.c("test_instance_block.invalid_test");
   private static final List<dyi.a> b = List.of();
   private static final List<dyi.a> c = List.of(new dyi.a(ayh.a(128, 128, 128)));
   private static final List<dyi.a> d = List.of(new dyi.a(ayh.a(0, 255, 0)));
   private static final List<dyi.a> e = List.of(new dyi.a(ayh.a(255, 0, 0)));
   private static final List<dyi.a> f = List.of(new dyi.a(ayh.a(255, 128, 0)));
   private static final kb g = new kb(0, 1, 1);
   private eaj.a h = new eaj.a(Optional.empty(), kb.i, dui.a, false, eaj.b.a, Optional.empty());

   public eaj(iw $$0, ebq $$1) {
      super(dyq.U, $$0, $$1);
   }

   public void a(eaj.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<kb> a(asb $$0, alq<ss> $$1) {
      return b($$0, $$1).map(ewp::a);
   }

   public esf d() {
      iw $$0 = this.z();
      iw $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return esf.a($$0, $$1);
   }

   public ffx f() {
      return ffx.a(this.d());
   }

   private static Optional<ewp> b(asb $$0, alq<ss> $$1) {
      return $$0.J_().c($$1).map($$0x -> ((ss)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<alq<ss>> j() {
      return this.h.a();
   }

   public xg k() {
      return this.j().map($$0 -> xg.b($$0.a().toString())).orElse(a);
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

   public dui u() {
      return this.E().map(jg::a).map(ss::m).orElse(dui.a).a(this.h.c());
   }

   public Optional<xg> v() {
      return this.h.f();
   }

   public void a(xg $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(eaj.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(eaj.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof asb) {
         this.n.a(this.aC_(), dnq.a.m(), this.m(), 3);
      }
   }

   public acl y() {
      return acl.a(this);
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
         eaj.a.a.parse(uo.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      DataResult<va> $$2 = eaj.a.a.encode(this.h, uo.a, new ua());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dyr.a b() {
      return dyr.a.b;
   }

   public iw z() {
      return a(this.aC_());
   }

   public static iw a(iw $$0) {
      return $$0.a(g);
   }

   @Override
   public dyr.b c() {
      return new dyr.b(new iw(g), this.F());
   }

   @Override
   public List<dyi.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(jg::a).map(ss::h).orElse(true) ? e : f);
      };
   }

   private kb F() {
      kb $$0 = this.t();
      dui $$1 = this.u();
      boolean $$2 = $$1 == dui.b || $$1 == dui.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new kb($$3, $$0.v(), $$4);
   }

   public void a(Consumer<xg> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(xg.a("test_instance_block.reset_success", this.k()).a(o.k));
      }

      this.a(this.h.a(eaj.b.a));
   }

   public Optional<alr> b(Consumer<xg> $$0) {
      Optional<jg.c<ss>> $$1 = this.E();
      Optional<alr> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(alq::a);
      }

      if ($$2.isEmpty()) {
         iw $$4 = this.aC_();
         $$0.accept(xg.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         return $$2;
      } else {
         if (this.n instanceof asb $$5) {
            eah.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
         }

         return $$2;
      }
   }

   public boolean c(Consumer<xg> $$0) {
      Optional<alr> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof asb $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(asb $$0, alr $$1, Consumer<xg> $$2) {
      Path $$3 = tj.c;
      Path $$4 = $$0.r().a($$1, ".nbt");
      Path $$5 = oz.a(mm.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(xg.b("Failed to export " + $$4).a(o.m));
         return true;
      } else {
         try {
            w.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(xg.b("Could not create folder " + $$5.getParent()).a(o.m));
            return true;
         }

         $$2.accept(xg.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<xg> $$0) {
      if (this.n instanceof asb $$1) {
         Optional var7 = this.E();
         iw $$4 = this.aC_();
         if (var7.isEmpty()) {
            $$0.accept(xg.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else if (!this.A()) {
            $$0.accept(xg.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else {
            sw.a($$1);
            sz.a.a();
            sg.b();
            $$0.accept(xg.a("test_instance_block.starting", ((jg.c)var7.get()).g()));
            sr $$5 = new sr((jg.c<ss>)var7.get(), this.h.c(), $$1, th.a());
            $$5.a($$4);
            sw $$6 = sw.a.b(List.of($$5), $$1).a();
            tk.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof asb $$0) {
         Optional<ewp> $$1 = this.h.a().flatMap($$1x -> b($$0, (alq<ss>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(asb $$0, ewp $$1) {
      ewl $$2 = new ewl().a(this.u()).a(this.h.d()).b(true);
      iw $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.G_(), 818);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof csi)).forEach(bxe::aq);
   }

   private void H() {
      if (this.n instanceof asb $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iw B() {
      kb $$0 = this.t();
      dui $$1 = this.u();
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
         if (!this.n.a_($$0).a(dnq.pJ)) {
            this.n.b($$0, dnq.iy.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dnq.iy)) {
            this.n.b($$0, dnq.a.m());
         }
      });
   }

   public void e(Consumer<iw> $$0) {
      ffx $$1 = this.f();
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

   public static record a(Optional<alq<ss>> c, kb d, dui e, boolean f, eaj.b g, Optional<xg> h) {
      public static final Codec<eaj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alq.a(mi.bh).optionalFieldOf("test").forGetter(eaj.a::a),
                  kb.g.fieldOf("size").forGetter(eaj.a::b),
                  dui.f.fieldOf("rotation").forGetter(eaj.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(eaj.a::d),
                  eaj.b.d.fieldOf("status").forGetter(eaj.a::e),
                  xi.a.optionalFieldOf("error_message").forGetter(eaj.a::f)
               )
               .apply($$0, eaj.a::new)
      );
      public static final ze<wp, eaj.a> b = ze.a(
         zc.a(alq.b(mi.bh)), eaj.a::a, kb.h, eaj.a::b, dui.g, eaj.a::c, zc.b, eaj.a::d, eaj.b.e, eaj.a::e, zc.a(xi.b), eaj.a::f, eaj.a::new
      );

      public eaj.a a(kb $$0) {
         return new eaj.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public eaj.a a(eaj.b $$0) {
         return new eaj.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public eaj.a a(xg $$0) {
         return new eaj.a(this.c, this.d, this.e, this.f, eaj.b.c, Optional.of($$0));
      }

      public Optional<alq<ss>> a() {
         return this.c;
      }

      public kb b() {
         return this.d;
      }

      public dui c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public eaj.b e() {
         return this.g;
      }

      public Optional<xg> f() {
         return this.h;
      }
   }

   public static enum b implements bax {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<eaj.b> f = ayo.a($$0 -> $$0.h, values(), ayo.a.a);
      public static final Codec<eaj.b> d = bax.a(eaj.b::values);
      public static final ze<ByteBuf, eaj.b> e = zc.a(eaj.b::a, $$0 -> $$0.h);
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

      public static eaj.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
