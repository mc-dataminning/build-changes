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

public class dyi extends dwn implements dwh, dwq {
   private static final ww a = ww.c("test_instance_block.invalid_test");
   private static final List<dwh.a> b = List.of();
   private static final List<dwh.a> c = List.of(new dwh.a(axu.a(128, 128, 128)));
   private static final List<dwh.a> d = List.of(new dwh.a(axu.a(0, 255, 0)));
   private static final List<dwh.a> e = List.of(new dwh.a(axu.a(255, 0, 0)));
   private static final List<dwh.a> f = List.of(new dwh.a(axu.a(255, 128, 0)));
   private static final jz g = new jz(0, 1, 1);
   private dyi.a h = new dyi.a(Optional.empty(), jz.i, dsm.a, false, dyi.b.a, Optional.empty());

   public dyi(iu $$0, dzo $$1) {
      super(dwp.U, $$0, $$1);
   }

   public void a(dyi.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<jz> a(aro $$0, ald<sq> $$1) {
      return b($$0, $$1).map(euk::a);
   }

   public eqa d() {
      iu $$0 = this.z();
      iu $$1 = $$0.a(this.F()).b(-1, -1, -1);
      return eqa.a($$0, $$1);
   }

   public fdr f() {
      return fdr.a(this.d());
   }

   private static Optional<euk> b(aro $$0, ald<sq> $$1) {
      return $$0.F_().c($$1).map($$0x -> ((sq)$$0x.a()).e()).flatMap($$1x -> $$0.r().b($$1x));
   }

   public Optional<ald<sq>> j() {
      return this.h.a();
   }

   public ww k() {
      return this.j().map($$0 -> ww.b($$0.a().toString())).orElse(a);
   }

   private Optional<je.c<sq>> E() {
      return this.j().flatMap(this.n.F_()::c);
   }

   public boolean s() {
      return this.h.d();
   }

   public jz t() {
      return this.h.b();
   }

   public dsm u() {
      return this.E().map(je::a).map(sq::m).orElse(dsm.a).a(this.h.c());
   }

   public Optional<ww> v() {
      return this.h.f();
   }

   public void a(ww $$0) {
      this.a(this.h.a($$0));
   }

   public void w() {
      this.a(this.h.a(dyi.b.c));
      this.D();
   }

   public void x() {
      this.a(this.h.a(dyi.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof aro) {
         this.n.a(this.aw_(), dlw.a.m(), this.m(), 3);
      }
   }

   public aby y() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      tx $$1 = new tx();
      this.b($$1, $$0);
      return $$1;
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      uu $$2 = $$0.c("data");
      if ($$2 != null) {
         dyi.a.a.parse(ul.a, $$2).ifSuccess(this::a);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      DataResult<uu> $$2 = dyi.a.a.encode(this.h, ul.a, new tx());
      $$2.ifSuccess($$1x -> $$0.a("data", $$1x));
   }

   @Override
   public dwq.a b() {
      return dwq.a.b;
   }

   public iu z() {
      return a(this.aw_());
   }

   public static iu a(iu $$0) {
      return $$0.a(g);
   }

   @Override
   public dwq.b c() {
      return new dwq.b(new iu(g), this.F());
   }

   @Override
   public List<dwh.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.v().isEmpty() ? d : (this.E().map(je::a).map(sq::h).orElse(true) ? e : f);
      };
   }

   private jz F() {
      jz $$0 = this.t();
      dsm $$1 = this.u();
      boolean $$2 = $$1 == dsm.b || $$1 == dsm.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new jz($$3, $$0.v(), $$4);
   }

   public void a(Consumer<ww> $$0) {
      this.D();
      boolean $$1 = this.A();
      if ($$1) {
         $$0.accept(ww.a("test_instance_block.reset_success", this.k()).a(n.k));
      }

      this.a(this.h.a(dyi.b.a));
   }

   public Optional<ale> b(Consumer<ww> $$0) {
      Optional<je.c<sq>> $$1 = this.E();
      Optional<ale> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(ald::a);
      }

      if ($$2.isEmpty()) {
         iu $$4 = this.aw_();
         $$0.accept(ww.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         return $$2;
      } else {
         if (this.n instanceof aro $$5) {
            dyg.a($$5, $$2.get(), this.z(), this.t(), this.s(), "", true);
         }

         return $$2;
      }
   }

   public boolean c(Consumer<ww> $$0) {
      Optional<ale> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof aro $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(aro $$0, ale $$1, Consumer<ww> $$2) {
      Path $$3 = th.c;
      Path $$4 = $$0.r().a($$1, ".nbt");
      Path $$5 = ox.a(mk.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(ww.b("Failed to export " + $$4).a(n.m));
         return true;
      } else {
         try {
            v.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(ww.b("Could not create folder " + $$5.getParent()).a(n.m));
            return true;
         }

         $$2.accept(ww.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<ww> $$0) {
      if (this.n instanceof aro $$1) {
         Optional var7 = this.E();
         iu $$4 = this.aw_();
         if (var7.isEmpty()) {
            $$0.accept(ww.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         } else if (!this.A()) {
            $$0.accept(ww.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(n.m));
         } else {
            su.a($$1);
            sx.a.a();
            sf.b();
            $$0.accept(ww.a("test_instance_block.starting", ((je.c)var7.get()).g()));
            sp $$5 = new sp((je.c<sq>)var7.get(), this.h.c(), $$1, tf.a());
            $$5.a($$4);
            su $$6 = su.a.b(List.of($$5), $$1).a();
            ti.a($$1.p().aH(), $$6);
         }
      }
   }

   public boolean A() {
      if (this.n instanceof aro $$0) {
         Optional<euk> $$1 = this.h.a().flatMap($$1x -> b($$0, (ald<sq>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(aro $$0, euk $$1) {
      eug $$2 = new eug().a(this.u()).a(this.h.d()).b(true);
      iu $$3 = this.B();
      this.H();
      this.G();
      $$1.a($$0, $$3, $$3, $$2, $$0.C_(), 306);
   }

   private void G() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof cqs)).forEach(bwa::at);
   }

   private void H() {
      if (this.n instanceof aro $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public iu B() {
      jz $$0 = this.t();
      dsm $$1 = this.u();
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
         if (!this.n.a_($$0).a(dlw.pF)) {
            this.n.b($$0, dlw.iu.m());
         }
      });
   }

   public void D() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dlw.iu)) {
            this.n.b($$0, dlw.a.m());
         }
      });
   }

   public void e(Consumer<iu> $$0) {
      fdr $$1 = this.f();
      boolean $$2 = !this.E().map($$0x -> ((sq)$$0x.a()).l()).orElse(false);
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

   public static record a(Optional<ald<sq>> c, jz d, dsm e, boolean f, dyi.b g, Optional<ww> h) {
      public static final Codec<dyi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a(mg.bf).optionalFieldOf("test").forGetter(dyi.a::a),
                  jz.g.fieldOf("size").forGetter(dyi.a::b),
                  dsm.f.fieldOf("rotation").forGetter(dyi.a::c),
                  Codec.BOOL.fieldOf("ignore_entities").forGetter(dyi.a::d),
                  dyi.b.d.fieldOf("status").forGetter(dyi.a::e),
                  wy.a.optionalFieldOf("error_message").forGetter(dyi.a::f)
               )
               .apply($$0, dyi.a::new)
      );
      public static final yu<wh, dyi.a> b = yu.a(
         ys.a(ald.b(mg.bf)), dyi.a::a, jz.h, dyi.a::b, dsm.g, dyi.a::c, ys.b, dyi.a::d, dyi.b.e, dyi.a::e, ys.a(wy.b), dyi.a::f, dyi.a::new
      );

      public dyi.a a(jz $$0) {
         return new dyi.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public dyi.a a(dyi.b $$0) {
         return new dyi.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public dyi.a a(ww $$0) {
         return new dyi.a(this.c, this.d, this.e, this.f, dyi.b.c, Optional.of($$0));
      }

      public Optional<ald<sq>> a() {
         return this.c;
      }

      public jz b() {
         return this.d;
      }

      public dsm c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public dyi.b e() {
         return this.g;
      }

      public Optional<ww> f() {
         return this.h;
      }
   }

   public static enum b implements bai {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<dyi.b> f = aya.a($$0 -> $$0.h, values(), aya.a.a);
      public static final Codec<dyi.b> d = bai.a(dyi.b::values);
      public static final yu<ByteBuf, dyi.b> e = ys.a(dyi.b::a, $$0 -> $$0.h);
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

      public static dyi.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
