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

public class dys extends dwx implements dwr, dxa {
   private static final wy a = wy.c("test_instance_block.invalid_test");
   private static final List<dwr.a> b = List.of();
   private static final List<dwr.a> c = List.of(new dwr.a(axw.a(128, 128, 128)));
   private static final List<dwr.a> d = List.of(new dwr.a(axw.a(0, 255, 0)));
   private static final List<dwr.a> e = List.of(new dwr.a(axw.a(255, 0, 0)));
   private static final List<dwr.a> f = List.of(new dwr.a(axw.a(255, 128, 0)));
   private static final jz g = new jz(0, 1, 1);
   private dys.a h = new dys.a(Optional.empty(), jz.i, dst.a, false, dys.b.a, Optional.empty());

   public dys(iu $$0, dzz $$1) {
      super(dwz.U, $$0, $$1);
   }

   public void a(dys.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<jz> a(arq $$0, alf<sr> $$1) {
      return b($$0, $$1).map(euv::a);
   }

   public eql d() {
      iu $$0 = this.z();
      iu $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return eql.a($$0, $$1);
   }

   public fed f() {
      return fed.a(this.d());
   }

   private static Optional<euv> b(arq $$0, alf<sr> $$1) {
      return $$0.F_().c($$1).map($$0x -> ((sr)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<alf<sr>> j() {
      return this.h.a();
   }

   public wy k() {
      return this.j().map($$0 -> wy.b($$0.a().toString())).orElse(a);
   }

   private Optional<je.c<sr>> E() {
      return this.j().flatMap(this.n.F_()::c);
   }

   public boolean s() {
      return this.h.d();
   }

   public jz t() {
      return this.h.b();
   }

   public dst u() {
      return this.E().map(je::a).map(sr::m).orElse(dst.a).a(this.h.c());
   }

   public Optional<wy> v() {
      return this.h.f();
   }

   public void a(wy $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dys.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dys.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof arq) {
         this.n.a(this.aw_(), dmc.a.m(), this.m(), 3);
      }
   }

   public aca y() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      uw $$2 = $$0.c("data");
      if ($$2 != null) {
         dys.a.a.parse(un.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      DataResult<uw> $$2 = dys.a.a.encode(this.h, un.a, new tz());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dxa.a b() {
      return dxa.a.b;
   }

   public iu z() {
      return a(this.aw_());
   }

   public static iu a(iu $$0) {
      return $$0.a(g);
   }

   @Override
   public dxa.b c() {
      return new dxa.b(new iu(g), this.F());
   }

   @Override
   public List<dwr.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(je::a).map(sr::h).orElse(true) ? e : f);
      };
   }

   private jz F() {
      jz $$0 = this.t();
      dst $$1 = this.u();
      boolean $$2 = $$1 == dst.b || $$1 == dst.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new jz($$3, $$0.v(), $$4);
   }

   public void a(Consumer<wy> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(wy.a("test_instance_block.reset_success", this.k()).a(n.k));
      }

      this.a(this.h.a(dys.b.a));
   }

   public Optional<alg> b(Consumer<wy> $$0) {
      Optional<je.c<sr>> $$1 = this.E();
      Optional<alg> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(alf::a);
      }

      if ($$2.isEmpty()) {
         iu $$4 = this.aw_();
         $$0.accept(wy.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         return $$2;
      } else {
         if (this.n instanceof arq $$5) {
            dyq.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
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
      Path $$5 = ox.a(mk.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(wy.b("Failed to export " + $$4).a(n.m));
         return true;
      } else {
         try {
            v.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(wy.b("Could not create folder " + $$5.getParent()).a(n.m));
            return true;
         }

         $$2.accept(wy.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<wy> $$0) {
      if (this.n instanceof arq $$1) {
         Optional var7 = this.E();
         iu $$4 = this.aw_();
         if (var7.isEmpty()) {
            $$0.accept(wy.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         } else if (!this.A()) {
            $$0.accept(wy.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         } else {
            sv.a($$1);
            sy.a.a();
            sf.b();
            $$0.accept(wy.a("test_instance_block.starting", ((je.c)var7.get()).g()));
            sq $$5 = new sq((je.c<sr>)var7.get(), this.h.c(), $$1, tg.a());
            $$5.a($$4);
            sv $$6 = sv.a.b(List.of($$5), $$1).a();
            tj.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof arq $$0) {
         Optional<euv> $$1 = this.h.a().flatMap($$1x -> b($$0, (alf<sr>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(arq $$0, euv $$1) {
      eur $$2 = new eur().a(this.u()).a(this.h.d()).b(true);
      iu $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.C_(), 306);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof cqy)).forEach(bwd::at);
   }

   private void H() {
      if (this.n instanceof arq $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iu B() {
      jz $$0 = this.t();
      dst $$1 = this.u();
      iu $$2 = this.z();

      return switch ($$1) {
         case a -> $$2;
         case b -> $$2.b($$0.w() - 1, 0, 0);
         case c -> $$2.b($$0.u() - 1, 0, $$0.w() - 1);
         case d -> $$2.b(0, 0, $$0.u() - 1);
      };
   }

   public void C() {
      this.e($$0 -> {
         if (!this.n.a_($$0).a(dmc.pG)) {
            this.n.b($$0, dmc.iv.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dmc.iv)) {
            this.n.b($$0, dmc.a.m());
         }
      });
   }

   public void e(Consumer<iu> $$0) {
      fed $$1 = this.f();
      boolean $$2 = !this.E().map($$0x -> ((sr)$$0x.a()).l()).orElse(false);
      iu $$3 = iu.a($$1.a, $$1.b, $$1.c).b(-1, -1, -1);
      iu $$4 = iu.a($$1.d, $$1.e, $$1.f);
      iu.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w() || $$4x.v() == $$3.v();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$0.accept($$4x);
         }
      });
   }

   public static record a(Optional<alf<sr>> c, jz d, dst e, boolean f, dys.b g, Optional<wy> h) {
      public static final Codec<dys.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alf.a(mg.bg).optionalFieldOf("test").forGetter(dys.a::a),
                  jz.g.fieldOf("size").forGetter(dys.a::b),
                  dst.f.fieldOf("rotation").forGetter(dys.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dys.a::d),
                  dys.b.d.fieldOf("status").forGetter(dys.a::e),
                  xa.a.optionalFieldOf("error_message").forGetter(dys.a::f)
               )
               .apply($$0, dys.a::new)
      );
      public static final yw<wj, dys.a> b = yw.a(
         yu.a(alf.b(mg.bg)), dys.a::a, jz.h, dys.a::b, dst.g, dys.a::c, yu.b, dys.a::d, dys.b.e, dys.a::e, yu.a(xa.b), dys.a::f, dys.a::new
      );

      public dys.a a(jz $$0) {
         return new dys.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dys.a a(dys.b $$0) {
         return new dys.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dys.a a(wy $$0) {
         return new dys.a(this.c, this.d, this.e, this.f, dys.b.c, Optional.of($$0));
      }

      public Optional<alf<sr>> a() {
         return this.c;
      }

      public jz b() {
         return this.d;
      }

      public dst c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dys.b e() {
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

      private static final IntFunction<dys.b> f = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final Codec<dys.b> d = bak.a(dys.b::values);
      public static final yw<ByteBuf, dys.b> e = yu.a(dys.b::a, $$0 -> $$0.h);
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

      public static dys.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
