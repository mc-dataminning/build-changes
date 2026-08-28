import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface ddg {
   Codec<ddg> a = ma.aA.q().dispatch(ddg::a, ddg.i::a);
   zi<wv, ddg> b = zg.a(mb.aG).b(ddg::a, ddg.i::b);

   <T> Stream<T> a(bbf var1, dcy<T> var2);

   ddg.i<? extends ddg> a();

   default boolean a(csk $$0) {
      return true;
   }

   default List<cxg> a(bbf $$0) {
      return this.a($$0, ddg.e.a).toList();
   }

   default cxg b(bbf $$0) {
      return this.a($$0, ddg.e.a).findFirst().orElse(cxg.j);
   }

   public static class a implements ddg {
      public static final ddg.a c = new ddg.a();
      public static final MapCodec<ddg.a> d = MapCodec.unit(c);
      public static final zi<wv, ddg.a> e = zi.a(c);
      public static final ddg.i<ddg.a> f = new ddg.i<>(d, e);

      private a() {
      }

      @Override
      public ddg.i<ddg.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         if ($$1 instanceof dcy.b<T> $$2) {
            dvo $$3 = $$0.c(ddh.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<ddg> f) implements ddg {
      public static final MapCodec<ddg.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddg.a.listOf().fieldOf("contents").forGetter(ddg.b::b)).apply($$0, ddg.b::new)
      );
      public static final zi<wv, ddg.b> d = zi.a(ddg.b.a(zg.a()), ddg.b::b, ddg.b::new);
      public static final ddg.i<ddg.b> e = new ddg.i<>(c, d);

      @Override
      public ddg.i<ddg.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(csk $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddg> b() {
         return this.f;
      }
   }

   public static class c implements ddg {
      public static final ddg.c c = new ddg.c();
      public static final MapCodec<ddg.c> d = MapCodec.unit(c);
      public static final zi<wv, ddg.c> e = zi.a(c);
      public static final ddg.i<ddg.c> f = new ddg.i<>(d, e);

      private c() {
      }

      @Override
      public ddg.i<ddg.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jq<cxc> f) implements ddg {
      public static final MapCodec<ddg.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxc.e.fieldOf("item").forGetter(ddg.d::b)).apply($$0, ddg.d::new));
      public static final zi<wv, ddg.d> d = zi.a(zg.b(mb.K), ddg.d::b, ddg.d::new);
      public static final ddg.i<ddg.d> e = new ddg.i<>(c, d);

      public d(cxc $$0) {
         this($$0.f());
      }

      @Override
      public ddg.i<ddg.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         return $$1 instanceof dcy.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(csk $$0) {
         return this.f.a().a($$0);
      }

      public jq<cxc> b() {
         return this.f;
      }
   }

   public static class e implements dcy.b<cxg> {
      public static final ddg.e a = new ddg.e();

      public cxg b(cxg $$0) {
         return $$0;
      }
   }

   public static record f(cxg f) implements ddg {
      public static final MapCodec<ddg.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxg.c.fieldOf("item").forGetter(ddg.f::b)).apply($$0, ddg.f::new));
      public static final zi<wv, ddg.f> d = zi.a(cxg.h, ddg.f::b, ddg.f::new);
      public static final ddg.i<ddg.f> e = new ddg.i<>(c, d);

      @Override
      public ddg.i<ddg.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         return $$1 instanceof dcy.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddg.f $$1 && cxg.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(csk $$0) {
         return this.f.h().a($$0);
      }

      public cxg b() {
         return this.f;
      }
   }

   public static record g(ddg f, ddg g, ddg h) implements ddg {
      public static final MapCodec<ddg.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddg.a.fieldOf("base").forGetter(ddg.g::b), ddg.a.fieldOf("material").forGetter(ddg.g::c), ddg.a.fieldOf("pattern").forGetter(ddg.g::d)
               )
               .apply($$0, ddg.g::new)
      );
      public static final zi<wv, ddg.g> d = zi.a(ddg.b, ddg.g::b, ddg.b, ddg.g::c, ddg.b, ddg.g::d, ddg.g::new);
      public static final ddg.i<ddg.g> e = new ddg.i<>(c, d);

      @Override
      public ddg.i<ddg.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         if ($$1 instanceof dcy.b<T> $$2) {
            js.a $$3 = $$0.c(ddh.b);
            if ($$3 != null) {
               bac $$4 = bac.a((long)System.identityHashCode(this));
               List<cxg> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cxg> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cxg> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cxg>generate(() -> {
                  cxg $$5x = ae.a($$5, $$4);
                  cxg $$6x = ae.a($$6, $$4);
                  cxg $$7x = ae.a($$7, $$4);
                  return dct.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public ddg b() {
         return this.f;
      }

      public ddg c() {
         return this.g;
      }

      public ddg d() {
         return this.h;
      }
   }

   public static record h(aya<cxc> f) implements ddg {
      public static final MapCodec<ddg.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aya.a(mb.K).fieldOf("tag").forGetter(ddg.h::b)).apply($$0, ddg.h::new)
      );
      public static final zi<wv, ddg.h> d = zi.a(aya.c(mb.K), ddg.h::b, ddg.h::new);
      public static final ddg.i<ddg.h> e = new ddg.i<>(c, d);

      @Override
      public ddg.i<ddg.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         if ($$1 instanceof dcy.b<T> $$2) {
            js.a $$3 = $$0.c(ddh.b);
            if ($$3 != null) {
               return $$3.d(mb.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public aya<cxc> b() {
         return this.f;
      }
   }

   public static record i<T extends ddg>(MapCodec<T> a, zi<wv, T> b) {
   }

   public static record j(ddg f, ddg g) implements ddg {
      public static final MapCodec<ddg.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddg.a.fieldOf("input").forGetter(ddg.j::b), ddg.a.fieldOf("remainder").forGetter(ddg.j::c)).apply($$0, ddg.j::new)
      );
      public static final zi<wv, ddg.j> d = zi.a(ddg.b, ddg.j::b, ddg.b, ddg.j::c, ddg.j::new);
      public static final ddg.i<ddg.j> e = new ddg.i<>(c, d);

      @Override
      public ddg.i<ddg.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbf $$0, dcy<T> $$1) {
         if ($$1 instanceof dcy.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(csk $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public ddg b() {
         return this.f;
      }

      public ddg c() {
         return this.g;
      }
   }
}
