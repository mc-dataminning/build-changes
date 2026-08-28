import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dfn {
   Codec<dfn> a = mg.ay.q().dispatch(dfn::a, dfn.i::a);
   yw<wj, dfn> b = yu.a(mh.ao).b(dfn::a, dfn.i::b);

   <T> Stream<T> a(baz var1, dff<T> var2);

   dfn.i<? extends dfn> a();

   default boolean a(cut $$0) {
      return true;
   }

   default List<czk> a(baz $$0) {
      return this.a($$0, dfn.e.a).toList();
   }

   default czk b(baz $$0) {
      return this.a($$0, dfn.e.a).findFirst().orElse(czk.k);
   }

   public static class a implements dfn {
      public static final dfn.a c = new dfn.a();
      public static final MapCodec<dfn.a> d = MapCodec.unit(c);
      public static final yw<wj, dfn.a> e = yw.a(c);
      public static final dfn.i<dfn.a> f = new dfn.i<>(d, e);

      private a() {
      }

      @Override
      public dfn.i<dfn.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         if ($$1 instanceof dff.b<T> $$2) {
            dyl $$3 = $$0.c(dfo.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dfn> f) implements dfn {
      public static final MapCodec<dfn.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfn.a.listOf().fieldOf("contents").forGetter(dfn.b::b)).apply($$0, dfn.b::new)
      );
      public static final yw<wj, dfn.b> d = yw.a(dfn.b.a(yu.a()), dfn.b::b, dfn.b::new);
      public static final dfn.i<dfn.b> e = new dfn.i<>(c, d);

      @Override
      public dfn.i<dfn.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cut $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dfn> b() {
         return this.f;
      }
   }

   public static class c implements dfn {
      public static final dfn.c c = new dfn.c();
      public static final MapCodec<dfn.c> d = MapCodec.unit(c);
      public static final yw<wj, dfn.c> e = yw.a(c);
      public static final dfn.i<dfn.c> f = new dfn.i<>(d, e);

      private c() {
      }

      @Override
      public dfn.i<dfn.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jf<czg> f) implements dfn {
      public static final MapCodec<dfn.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czg.e.fieldOf("item").forGetter(dfn.d::b)).apply($$0, dfn.d::new));
      public static final yw<wj, dfn.d> d = yw.a(czg.f, dfn.d::b, dfn.d::new);
      public static final dfn.i<dfn.d> e = new dfn.i<>(c, d);

      public d(czg $$0) {
         this($$0.e());
      }

      @Override
      public dfn.i<dfn.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         return $$1 instanceof dff.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cut $$0) {
         return this.f.a().a($$0);
      }

      public jf<czg> b() {
         return this.f;
      }
   }

   public static class e implements dff.b<czk> {
      public static final dfn.e a = new dfn.e();

      public czk b(czk $$0) {
         return $$0;
      }
   }

   public static record f(czk f) implements dfn {
      public static final MapCodec<dfn.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czk.d.fieldOf("item").forGetter(dfn.f::b)).apply($$0, dfn.f::new));
      public static final yw<wj, dfn.f> d = yw.a(czk.i, dfn.f::b, dfn.f::new);
      public static final dfn.i<dfn.f> e = new dfn.i<>(c, d);

      @Override
      public dfn.i<dfn.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         return $$1 instanceof dff.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dfn.f $$1 && czk.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cut $$0) {
         return this.f.h().a($$0);
      }

      public czk b() {
         return this.f;
      }
   }

   public static record g(dfn f, dfn g, jf<dhz> h) implements dfn {
      public static final MapCodec<dfn.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dfn.a.fieldOf("base").forGetter(dfn.g::b), dfn.a.fieldOf("material").forGetter(dfn.g::c), dhz.c.fieldOf("pattern").forGetter(dfn.g::d)
               )
               .apply($$0, dfn.g::new)
      );
      public static final yw<wj, dfn.g> d = yw.a(dfn.b, dfn.g::b, dfn.b, dfn.g::c, dhz.d, dfn.g::d, dfn.g::new);
      public static final dfn.i<dfn.g> e = new dfn.i<>(c, d);

      @Override
      public dfn.i<dfn.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         if ($$1 instanceof dff.b<T> $$2) {
            jh.a $$3 = $$0.c(dfo.b);
            if ($$3 != null) {
               azv $$4 = azv.a((long)System.identityHashCode(this));
               List<czk> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<czk> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<czk>generate(() -> {
                  czk $$4x = ag.a($$5, $$4);
                  czk $$5x = ag.a($$6, $$4);
                  return dez.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dfn b() {
         return this.f;
      }

      public dfn c() {
         return this.g;
      }

      public jf<dhz> d() {
         return this.h;
      }
   }

   public static record h(axr<czg> f) implements dfn {
      public static final MapCodec<dfn.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axr.a(mh.K).fieldOf("tag").forGetter(dfn.h::b)).apply($$0, dfn.h::new)
      );
      public static final yw<wj, dfn.h> d = yw.a(axr.c(mh.K), dfn.h::b, dfn.h::new);
      public static final dfn.i<dfn.h> e = new dfn.i<>(c, d);

      @Override
      public dfn.i<dfn.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         if ($$1 instanceof dff.b<T> $$2) {
            jh.a $$3 = $$0.c(dfo.b);
            if ($$3 != null) {
               return $$3.e(mh.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axr<czg> b() {
         return this.f;
      }
   }

   public static record i<T extends dfn>(MapCodec<T> a, yw<wj, T> b) {
   }

   public static record j(dfn f, dfn g) implements dfn {
      public static final MapCodec<dfn.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfn.a.fieldOf("input").forGetter(dfn.j::b), dfn.a.fieldOf("remainder").forGetter(dfn.j::c)).apply($$0, dfn.j::new)
      );
      public static final yw<wj, dfn.j> d = yw.a(dfn.b, dfn.j::b, dfn.b, dfn.j::c, dfn.j::new);
      public static final dfn.i<dfn.j> e = new dfn.i<>(c, d);

      @Override
      public dfn.i<dfn.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dff<T> $$1) {
         if ($$1 instanceof dff.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cut $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dfn b() {
         return this.f;
      }

      public dfn c() {
         return this.g;
      }
   }
}
