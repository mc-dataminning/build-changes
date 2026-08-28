import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dfb {
   Codec<dfb> a = mf.ay.q().dispatch(dfb::a, dfb.i::a);
   yw<wj, dfb> b = yu.a(mg.ao).b(dfb::a, dfb.i::b);

   <T> Stream<T> a(baz var1, det<T> var2);

   dfb.i<? extends dfb> a();

   default boolean a(cuh $$0) {
      return true;
   }

   default List<cyy> a(baz $$0) {
      return this.a($$0, dfb.e.a).toList();
   }

   default cyy b(baz $$0) {
      return this.a($$0, dfb.e.a).findFirst().orElse(cyy.k);
   }

   public static class a implements dfb {
      public static final dfb.a c = new dfb.a();
      public static final MapCodec<dfb.a> d = MapCodec.unit(c);
      public static final yw<wj, dfb.a> e = yw.a(c);
      public static final dfb.i<dfb.a> f = new dfb.i<>(d, e);

      private a() {
      }

      @Override
      public dfb.i<dfb.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         if ($$1 instanceof det.b<T> $$2) {
            dxw $$3 = $$0.c(dfc.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dfb> f) implements dfb {
      public static final MapCodec<dfb.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfb.a.listOf().fieldOf("contents").forGetter(dfb.b::b)).apply($$0, dfb.b::new)
      );
      public static final yw<wj, dfb.b> d = yw.a(dfb.b.a(yu.a()), dfb.b::b, dfb.b::new);
      public static final dfb.i<dfb.b> e = new dfb.i<>(c, d);

      @Override
      public dfb.i<dfb.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cuh $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dfb> b() {
         return this.f;
      }
   }

   public static class c implements dfb {
      public static final dfb.c c = new dfb.c();
      public static final MapCodec<dfb.c> d = MapCodec.unit(c);
      public static final yw<wj, dfb.c> e = yw.a(c);
      public static final dfb.i<dfb.c> f = new dfb.i<>(d, e);

      private c() {
      }

      @Override
      public dfb.i<dfb.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(je<cyu> f) implements dfb {
      public static final MapCodec<dfb.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyu.e.fieldOf("item").forGetter(dfb.d::b)).apply($$0, dfb.d::new));
      public static final yw<wj, dfb.d> d = yw.a(cyu.f, dfb.d::b, dfb.d::new);
      public static final dfb.i<dfb.d> e = new dfb.i<>(c, d);

      public d(cyu $$0) {
         this($$0.e());
      }

      @Override
      public dfb.i<dfb.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         return $$1 instanceof det.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cuh $$0) {
         return this.f.a().a($$0);
      }

      public je<cyu> b() {
         return this.f;
      }
   }

   public static class e implements det.b<cyy> {
      public static final dfb.e a = new dfb.e();

      public cyy b(cyy $$0) {
         return $$0;
      }
   }

   public static record f(cyy f) implements dfb {
      public static final MapCodec<dfb.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.d.fieldOf("item").forGetter(dfb.f::b)).apply($$0, dfb.f::new));
      public static final yw<wj, dfb.f> d = yw.a(cyy.i, dfb.f::b, dfb.f::new);
      public static final dfb.i<dfb.f> e = new dfb.i<>(c, d);

      @Override
      public dfb.i<dfb.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         return $$1 instanceof det.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dfb.f $$1 && cyy.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cuh $$0) {
         return this.f.h().a($$0);
      }

      public cyy b() {
         return this.f;
      }
   }

   public static record g(dfb f, dfb g, je<dhn> h) implements dfb {
      public static final MapCodec<dfb.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dfb.a.fieldOf("base").forGetter(dfb.g::b), dfb.a.fieldOf("material").forGetter(dfb.g::c), dhn.c.fieldOf("pattern").forGetter(dfb.g::d)
               )
               .apply($$0, dfb.g::new)
      );
      public static final yw<wj, dfb.g> d = yw.a(dfb.b, dfb.g::b, dfb.b, dfb.g::c, dhn.d, dfb.g::d, dfb.g::new);
      public static final dfb.i<dfb.g> e = new dfb.i<>(c, d);

      @Override
      public dfb.i<dfb.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         if ($$1 instanceof det.b<T> $$2) {
            jg.a $$3 = $$0.c(dfc.b);
            if ($$3 != null) {
               azv $$4 = azv.a((long)System.identityHashCode(this));
               List<cyy> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cyy> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cyy>generate(() -> {
                  cyy $$4x = af.a($$5, $$4);
                  cyy $$5x = af.a($$6, $$4);
                  return den.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dfb b() {
         return this.f;
      }

      public dfb c() {
         return this.g;
      }

      public je<dhn> d() {
         return this.h;
      }
   }

   public static record h(axr<cyu> f) implements dfb {
      public static final MapCodec<dfb.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axr.a(mg.K).fieldOf("tag").forGetter(dfb.h::b)).apply($$0, dfb.h::new)
      );
      public static final yw<wj, dfb.h> d = yw.a(axr.c(mg.K), dfb.h::b, dfb.h::new);
      public static final dfb.i<dfb.h> e = new dfb.i<>(c, d);

      @Override
      public dfb.i<dfb.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         if ($$1 instanceof det.b<T> $$2) {
            jg.a $$3 = $$0.c(dfc.b);
            if ($$3 != null) {
               return $$3.e(mg.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axr<cyu> b() {
         return this.f;
      }
   }

   public static record i<T extends dfb>(MapCodec<T> a, yw<wj, T> b) {
   }

   public static record j(dfb f, dfb g) implements dfb {
      public static final MapCodec<dfb.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfb.a.fieldOf("input").forGetter(dfb.j::b), dfb.a.fieldOf("remainder").forGetter(dfb.j::c)).apply($$0, dfb.j::new)
      );
      public static final yw<wj, dfb.j> d = yw.a(dfb.b, dfb.j::b, dfb.b, dfb.j::c, dfb.j::new);
      public static final dfb.i<dfb.j> e = new dfb.i<>(c, d);

      @Override
      public dfb.i<dfb.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, det<T> $$1) {
         if ($$1 instanceof det.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cuh $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dfb b() {
         return this.f;
      }

      public dfb c() {
         return this.g;
      }
   }
}
