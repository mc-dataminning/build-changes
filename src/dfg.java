import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dfg {
   Codec<dfg> a = mf.ay.q().dispatch(dfg::a, dfg.i::a);
   yw<wj, dfg> b = yu.a(mg.ao).b(dfg::a, dfg.i::b);

   <T> Stream<T> a(baz var1, dey<T> var2);

   dfg.i<? extends dfg> a();

   default boolean a(cum $$0) {
      return true;
   }

   default List<czd> a(baz $$0) {
      return this.a($$0, dfg.e.a).toList();
   }

   default czd b(baz $$0) {
      return this.a($$0, dfg.e.a).findFirst().orElse(czd.k);
   }

   public static class a implements dfg {
      public static final dfg.a c = new dfg.a();
      public static final MapCodec<dfg.a> d = MapCodec.unit(c);
      public static final yw<wj, dfg.a> e = yw.a(c);
      public static final dfg.i<dfg.a> f = new dfg.i<>(d, e);

      private a() {
      }

      @Override
      public dfg.i<dfg.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         if ($$1 instanceof dey.b<T> $$2) {
            dye $$3 = $$0.c(dfh.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dfg> f) implements dfg {
      public static final MapCodec<dfg.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfg.a.listOf().fieldOf("contents").forGetter(dfg.b::b)).apply($$0, dfg.b::new)
      );
      public static final yw<wj, dfg.b> d = yw.a(dfg.b.a(yu.a()), dfg.b::b, dfg.b::new);
      public static final dfg.i<dfg.b> e = new dfg.i<>(c, d);

      @Override
      public dfg.i<dfg.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cum $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dfg> b() {
         return this.f;
      }
   }

   public static class c implements dfg {
      public static final dfg.c c = new dfg.c();
      public static final MapCodec<dfg.c> d = MapCodec.unit(c);
      public static final yw<wj, dfg.c> e = yw.a(c);
      public static final dfg.i<dfg.c> f = new dfg.i<>(d, e);

      private c() {
      }

      @Override
      public dfg.i<dfg.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(je<cyz> f) implements dfg {
      public static final MapCodec<dfg.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyz.e.fieldOf("item").forGetter(dfg.d::b)).apply($$0, dfg.d::new));
      public static final yw<wj, dfg.d> d = yw.a(cyz.f, dfg.d::b, dfg.d::new);
      public static final dfg.i<dfg.d> e = new dfg.i<>(c, d);

      public d(cyz $$0) {
         this($$0.e());
      }

      @Override
      public dfg.i<dfg.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         return $$1 instanceof dey.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cum $$0) {
         return this.f.a().a($$0);
      }

      public je<cyz> b() {
         return this.f;
      }
   }

   public static class e implements dey.b<czd> {
      public static final dfg.e a = new dfg.e();

      public czd b(czd $$0) {
         return $$0;
      }
   }

   public static record f(czd f) implements dfg {
      public static final MapCodec<dfg.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czd.d.fieldOf("item").forGetter(dfg.f::b)).apply($$0, dfg.f::new));
      public static final yw<wj, dfg.f> d = yw.a(czd.i, dfg.f::b, dfg.f::new);
      public static final dfg.i<dfg.f> e = new dfg.i<>(c, d);

      @Override
      public dfg.i<dfg.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         return $$1 instanceof dey.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dfg.f $$1 && czd.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cum $$0) {
         return this.f.h().a($$0);
      }

      public czd b() {
         return this.f;
      }
   }

   public static record g(dfg f, dfg g, je<dhs> h) implements dfg {
      public static final MapCodec<dfg.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dfg.a.fieldOf("base").forGetter(dfg.g::b), dfg.a.fieldOf("material").forGetter(dfg.g::c), dhs.c.fieldOf("pattern").forGetter(dfg.g::d)
               )
               .apply($$0, dfg.g::new)
      );
      public static final yw<wj, dfg.g> d = yw.a(dfg.b, dfg.g::b, dfg.b, dfg.g::c, dhs.d, dfg.g::d, dfg.g::new);
      public static final dfg.i<dfg.g> e = new dfg.i<>(c, d);

      @Override
      public dfg.i<dfg.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         if ($$1 instanceof dey.b<T> $$2) {
            jg.a $$3 = $$0.c(dfh.b);
            if ($$3 != null) {
               azv $$4 = azv.a((long)System.identityHashCode(this));
               List<czd> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<czd> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<czd>generate(() -> {
                  czd $$4x = af.a($$5, $$4);
                  czd $$5x = af.a($$6, $$4);
                  return des.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dfg b() {
         return this.f;
      }

      public dfg c() {
         return this.g;
      }

      public je<dhs> d() {
         return this.h;
      }
   }

   public static record h(axr<cyz> f) implements dfg {
      public static final MapCodec<dfg.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axr.a(mg.K).fieldOf("tag").forGetter(dfg.h::b)).apply($$0, dfg.h::new)
      );
      public static final yw<wj, dfg.h> d = yw.a(axr.c(mg.K), dfg.h::b, dfg.h::new);
      public static final dfg.i<dfg.h> e = new dfg.i<>(c, d);

      @Override
      public dfg.i<dfg.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         if ($$1 instanceof dey.b<T> $$2) {
            jg.a $$3 = $$0.c(dfh.b);
            if ($$3 != null) {
               return $$3.e(mg.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axr<cyz> b() {
         return this.f;
      }
   }

   public static record i<T extends dfg>(MapCodec<T> a, yw<wj, T> b) {
   }

   public static record j(dfg f, dfg g) implements dfg {
      public static final MapCodec<dfg.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfg.a.fieldOf("input").forGetter(dfg.j::b), dfg.a.fieldOf("remainder").forGetter(dfg.j::c)).apply($$0, dfg.j::new)
      );
      public static final yw<wj, dfg.j> d = yw.a(dfg.b, dfg.j::b, dfg.b, dfg.j::c, dfg.j::new);
      public static final dfg.i<dfg.j> e = new dfg.i<>(c, d);

      @Override
      public dfg.i<dfg.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dey<T> $$1) {
         if ($$1 instanceof dey.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cum $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dfg b() {
         return this.f;
      }

      public dfg c() {
         return this.g;
      }
   }
}
