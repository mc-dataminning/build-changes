import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface ddp {
   Codec<ddp> a = ma.aA.q().dispatch(ddp::a, ddp.i::a);
   zt<xg, ddp> b = zr.a(mb.aG).b(ddp::a, ddp.i::b);

   <T> Stream<T> a(bbp var1, ddh<T> var2);

   ddp.i<? extends ddp> a();

   default boolean a(cst $$0) {
      return true;
   }

   default List<cxp> a(bbp $$0) {
      return this.a($$0, ddp.e.a).toList();
   }

   default cxp b(bbp $$0) {
      return this.a($$0, ddp.e.a).findFirst().orElse(cxp.j);
   }

   public static class a implements ddp {
      public static final ddp.a c = new ddp.a();
      public static final MapCodec<ddp.a> d = MapCodec.unit(c);
      public static final zt<xg, ddp.a> e = zt.a(c);
      public static final ddp.i<ddp.a> f = new ddp.i<>(d, e);

      private a() {
      }

      @Override
      public ddp.i<ddp.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         if ($$1 instanceof ddh.b<T> $$2) {
            dvv $$3 = $$0.c(ddq.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<ddp> f) implements ddp {
      public static final MapCodec<ddp.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddp.a.listOf().fieldOf("contents").forGetter(ddp.b::b)).apply($$0, ddp.b::new)
      );
      public static final zt<xg, ddp.b> d = zt.a(ddp.b.a(zr.a()), ddp.b::b, ddp.b::new);
      public static final ddp.i<ddp.b> e = new ddp.i<>(c, d);

      @Override
      public ddp.i<ddp.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cst $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddp> b() {
         return this.f;
      }
   }

   public static class c implements ddp {
      public static final ddp.c c = new ddp.c();
      public static final MapCodec<ddp.c> d = MapCodec.unit(c);
      public static final zt<xg, ddp.c> e = zt.a(c);
      public static final ddp.i<ddp.c> f = new ddp.i<>(d, e);

      private c() {
      }

      @Override
      public ddp.i<ddp.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jq<cxl> f) implements ddp {
      public static final MapCodec<ddp.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxl.e.fieldOf("item").forGetter(ddp.d::b)).apply($$0, ddp.d::new));
      public static final zt<xg, ddp.d> d = zt.a(zr.b(mb.K), ddp.d::b, ddp.d::new);
      public static final ddp.i<ddp.d> e = new ddp.i<>(c, d);

      public d(cxl $$0) {
         this($$0.f());
      }

      @Override
      public ddp.i<ddp.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         return $$1 instanceof ddh.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cst $$0) {
         return this.f.a().a($$0);
      }

      public jq<cxl> b() {
         return this.f;
      }
   }

   public static class e implements ddh.b<cxp> {
      public static final ddp.e a = new ddp.e();

      public cxp b(cxp $$0) {
         return $$0;
      }
   }

   public static record f(cxp f) implements ddp {
      public static final MapCodec<ddp.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxp.c.fieldOf("item").forGetter(ddp.f::b)).apply($$0, ddp.f::new));
      public static final zt<xg, ddp.f> d = zt.a(cxp.h, ddp.f::b, ddp.f::new);
      public static final ddp.i<ddp.f> e = new ddp.i<>(c, d);

      @Override
      public ddp.i<ddp.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         return $$1 instanceof ddh.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddp.f $$1 && cxp.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cst $$0) {
         return this.f.h().a($$0);
      }

      public cxp b() {
         return this.f;
      }
   }

   public static record g(ddp f, ddp g, ddp h) implements ddp {
      public static final MapCodec<ddp.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddp.a.fieldOf("base").forGetter(ddp.g::b), ddp.a.fieldOf("material").forGetter(ddp.g::c), ddp.a.fieldOf("pattern").forGetter(ddp.g::d)
               )
               .apply($$0, ddp.g::new)
      );
      public static final zt<xg, ddp.g> d = zt.a(ddp.b, ddp.g::b, ddp.b, ddp.g::c, ddp.b, ddp.g::d, ddp.g::new);
      public static final ddp.i<ddp.g> e = new ddp.i<>(c, d);

      @Override
      public ddp.i<ddp.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         if ($$1 instanceof ddh.b<T> $$2) {
            js.a $$3 = $$0.c(ddq.b);
            if ($$3 != null) {
               bam $$4 = bam.a((long)System.identityHashCode(this));
               List<cxp> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cxp> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cxp> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cxp>generate(() -> {
                  cxp $$5x = ae.a($$5, $$4);
                  cxp $$6x = ae.a($$6, $$4);
                  cxp $$7x = ae.a($$7, $$4);
                  return ddc.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public ddp b() {
         return this.f;
      }

      public ddp c() {
         return this.g;
      }

      public ddp d() {
         return this.h;
      }
   }

   public static record h(ayk<cxl> f) implements ddp {
      public static final MapCodec<ddp.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayk.a(mb.K).fieldOf("tag").forGetter(ddp.h::b)).apply($$0, ddp.h::new)
      );
      public static final zt<xg, ddp.h> d = zt.a(ayk.c(mb.K), ddp.h::b, ddp.h::new);
      public static final ddp.i<ddp.h> e = new ddp.i<>(c, d);

      @Override
      public ddp.i<ddp.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         if ($$1 instanceof ddh.b<T> $$2) {
            js.a $$3 = $$0.c(ddq.b);
            if ($$3 != null) {
               return $$3.d(mb.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public ayk<cxl> b() {
         return this.f;
      }
   }

   public static record i<T extends ddp>(MapCodec<T> a, zt<xg, T> b) {
   }

   public static record j(ddp f, ddp g) implements ddp {
      public static final MapCodec<ddp.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddp.a.fieldOf("input").forGetter(ddp.j::b), ddp.a.fieldOf("remainder").forGetter(ddp.j::c)).apply($$0, ddp.j::new)
      );
      public static final zt<xg, ddp.j> d = zt.a(ddp.b, ddp.j::b, ddp.b, ddp.j::c, ddp.j::new);
      public static final ddp.i<ddp.j> e = new ddp.i<>(c, d);

      @Override
      public ddp.i<ddp.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddh<T> $$1) {
         if ($$1 instanceof ddh.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cst $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public ddp b() {
         return this.f;
      }

      public ddp c() {
         return this.g;
      }
   }
}
