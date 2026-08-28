import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dfq {
   Codec<dfq> a = mg.ay.q().dispatch(dfq::a, dfq.i::a);
   yw<wj, dfq> b = yu.a(mh.ao).b(dfq::a, dfq.i::b);

   <T> Stream<T> a(baz var1, dfi<T> var2);

   dfq.i<? extends dfq> a();

   default boolean a(cuw $$0) {
      return true;
   }

   default List<czn> a(baz $$0) {
      return this.a($$0, dfq.e.a).toList();
   }

   default czn b(baz $$0) {
      return this.a($$0, dfq.e.a).findFirst().orElse(czn.k);
   }

   public static class a implements dfq {
      public static final dfq.a c = new dfq.a();
      public static final MapCodec<dfq.a> d = MapCodec.unit(c);
      public static final yw<wj, dfq.a> e = yw.a(c);
      public static final dfq.i<dfq.a> f = new dfq.i<>(d, e);

      private a() {
      }

      @Override
      public dfq.i<dfq.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         if ($$1 instanceof dfi.b<T> $$2) {
            dyq $$3 = $$0.c(dfr.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dfq> f) implements dfq {
      public static final MapCodec<dfq.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfq.a.listOf().fieldOf("contents").forGetter(dfq.b::b)).apply($$0, dfq.b::new)
      );
      public static final yw<wj, dfq.b> d = yw.a(dfq.b.a(yu.a()), dfq.b::b, dfq.b::new);
      public static final dfq.i<dfq.b> e = new dfq.i<>(c, d);

      @Override
      public dfq.i<dfq.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cuw $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dfq> b() {
         return this.f;
      }
   }

   public static class c implements dfq {
      public static final dfq.c c = new dfq.c();
      public static final MapCodec<dfq.c> d = MapCodec.unit(c);
      public static final yw<wj, dfq.c> e = yw.a(c);
      public static final dfq.i<dfq.c> f = new dfq.i<>(d, e);

      private c() {
      }

      @Override
      public dfq.i<dfq.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jf<czj> f) implements dfq {
      public static final MapCodec<dfq.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czj.e.fieldOf("item").forGetter(dfq.d::b)).apply($$0, dfq.d::new));
      public static final yw<wj, dfq.d> d = yw.a(czj.f, dfq.d::b, dfq.d::new);
      public static final dfq.i<dfq.d> e = new dfq.i<>(c, d);

      public d(czj $$0) {
         this($$0.e());
      }

      @Override
      public dfq.i<dfq.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         return $$1 instanceof dfi.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cuw $$0) {
         return this.f.a().a($$0);
      }

      public jf<czj> b() {
         return this.f;
      }
   }

   public static class e implements dfi.b<czn> {
      public static final dfq.e a = new dfq.e();

      public czn b(czn $$0) {
         return $$0;
      }
   }

   public static record f(czn f) implements dfq {
      public static final MapCodec<dfq.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czn.d.fieldOf("item").forGetter(dfq.f::b)).apply($$0, dfq.f::new));
      public static final yw<wj, dfq.f> d = yw.a(czn.i, dfq.f::b, dfq.f::new);
      public static final dfq.i<dfq.f> e = new dfq.i<>(c, d);

      @Override
      public dfq.i<dfq.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         return $$1 instanceof dfi.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dfq.f $$1 && czn.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cuw $$0) {
         return this.f.h().a($$0);
      }

      public czn b() {
         return this.f;
      }
   }

   public static record g(dfq f, dfq g, jf<dic> h) implements dfq {
      public static final MapCodec<dfq.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dfq.a.fieldOf("base").forGetter(dfq.g::b), dfq.a.fieldOf("material").forGetter(dfq.g::c), dic.c.fieldOf("pattern").forGetter(dfq.g::d)
               )
               .apply($$0, dfq.g::new)
      );
      public static final yw<wj, dfq.g> d = yw.a(dfq.b, dfq.g::b, dfq.b, dfq.g::c, dic.d, dfq.g::d, dfq.g::new);
      public static final dfq.i<dfq.g> e = new dfq.i<>(c, d);

      @Override
      public dfq.i<dfq.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         if ($$1 instanceof dfi.b<T> $$2) {
            jh.a $$3 = $$0.c(dfr.b);
            if ($$3 != null) {
               azv $$4 = azv.a((long)System.identityHashCode(this));
               List<czn> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<czn> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<czn>generate(() -> {
                  czn $$4x = ag.a($$5, $$4);
                  czn $$5x = ag.a($$6, $$4);
                  return dfc.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dfq b() {
         return this.f;
      }

      public dfq c() {
         return this.g;
      }

      public jf<dic> d() {
         return this.h;
      }
   }

   public static record h(axr<czj> f) implements dfq {
      public static final MapCodec<dfq.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axr.a(mh.K).fieldOf("tag").forGetter(dfq.h::b)).apply($$0, dfq.h::new)
      );
      public static final yw<wj, dfq.h> d = yw.a(axr.c(mh.K), dfq.h::b, dfq.h::new);
      public static final dfq.i<dfq.h> e = new dfq.i<>(c, d);

      @Override
      public dfq.i<dfq.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         if ($$1 instanceof dfi.b<T> $$2) {
            jh.a $$3 = $$0.c(dfr.b);
            if ($$3 != null) {
               return $$3.e(mh.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axr<czj> b() {
         return this.f;
      }
   }

   public static record i<T extends dfq>(MapCodec<T> a, yw<wj, T> b) {
   }

   public static record j(dfq f, dfq g) implements dfq {
      public static final MapCodec<dfq.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dfq.a.fieldOf("input").forGetter(dfq.j::b), dfq.a.fieldOf("remainder").forGetter(dfq.j::c)).apply($$0, dfq.j::new)
      );
      public static final yw<wj, dfq.j> d = yw.a(dfq.b, dfq.j::b, dfq.b, dfq.j::c, dfq.j::new);
      public static final dfq.i<dfq.j> e = new dfq.i<>(c, d);

      @Override
      public dfq.i<dfq.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baz $$0, dfi<T> $$1) {
         if ($$1 instanceof dfi.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cuw $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dfq b() {
         return this.f;
      }

      public dfq c() {
         return this.g;
      }
   }
}
