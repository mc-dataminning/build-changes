import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface ddx {
   Codec<ddx> a = md.aA.q().dispatch(ddx::a, ddx.i::a);
   yt<wg, ddx> b = yr.a(me.aG).b(ddx::a, ddx.i::b);

   <T> Stream<T> a(bav var1, ddp<T> var2);

   ddx.i<? extends ddx> a();

   default boolean a(cte $$0) {
      return true;
   }

   default List<cxy> a(bav $$0) {
      return this.a($$0, ddx.e.a).toList();
   }

   default cxy b(bav $$0) {
      return this.a($$0, ddx.e.a).findFirst().orElse(cxy.k);
   }

   public static class a implements ddx {
      public static final ddx.a c = new ddx.a();
      public static final MapCodec<ddx.a> d = MapCodec.unit(c);
      public static final yt<wg, ddx.a> e = yt.a(c);
      public static final ddx.i<ddx.a> f = new ddx.i<>(d, e);

      private a() {
      }

      @Override
      public ddx.i<ddx.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         if ($$1 instanceof ddp.b<T> $$2) {
            dwk $$3 = $$0.c(ddy.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<ddx> f) implements ddx {
      public static final MapCodec<ddx.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddx.a.listOf().fieldOf("contents").forGetter(ddx.b::b)).apply($$0, ddx.b::new)
      );
      public static final yt<wg, ddx.b> d = yt.a(ddx.b.a(yr.a()), ddx.b::b, ddx.b::new);
      public static final ddx.i<ddx.b> e = new ddx.i<>(c, d);

      @Override
      public ddx.i<ddx.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cte $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddx> b() {
         return this.f;
      }
   }

   public static class c implements ddx {
      public static final ddx.c c = new ddx.c();
      public static final MapCodec<ddx.c> d = MapCodec.unit(c);
      public static final yt<wg, ddx.c> e = yt.a(c);
      public static final ddx.i<ddx.c> f = new ddx.i<>(d, e);

      private c() {
      }

      @Override
      public ddx.i<ddx.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(js<cxu> f) implements ddx {
      public static final MapCodec<ddx.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxu.e.fieldOf("item").forGetter(ddx.d::b)).apply($$0, ddx.d::new));
      public static final yt<wg, ddx.d> d = yt.a(cxu.f, ddx.d::b, ddx.d::new);
      public static final ddx.i<ddx.d> e = new ddx.i<>(c, d);

      public d(cxu $$0) {
         this($$0.f());
      }

      @Override
      public ddx.i<ddx.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         return $$1 instanceof ddp.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cte $$0) {
         return this.f.a().a($$0);
      }

      public js<cxu> b() {
         return this.f;
      }
   }

   public static class e implements ddp.b<cxy> {
      public static final ddx.e a = new ddx.e();

      public cxy b(cxy $$0) {
         return $$0;
      }
   }

   public static record f(cxy f) implements ddx {
      public static final MapCodec<ddx.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxy.d.fieldOf("item").forGetter(ddx.f::b)).apply($$0, ddx.f::new));
      public static final yt<wg, ddx.f> d = yt.a(cxy.i, ddx.f::b, ddx.f::new);
      public static final ddx.i<ddx.f> e = new ddx.i<>(c, d);

      @Override
      public ddx.i<ddx.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         return $$1 instanceof ddp.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddx.f $$1 && cxy.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cte $$0) {
         return this.f.h().a($$0);
      }

      public cxy b() {
         return this.f;
      }
   }

   public static record g(ddx f, ddx g, ddx h) implements ddx {
      public static final MapCodec<ddx.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddx.a.fieldOf("base").forGetter(ddx.g::b), ddx.a.fieldOf("material").forGetter(ddx.g::c), ddx.a.fieldOf("pattern").forGetter(ddx.g::d)
               )
               .apply($$0, ddx.g::new)
      );
      public static final yt<wg, ddx.g> d = yt.a(ddx.b, ddx.g::b, ddx.b, ddx.g::c, ddx.b, ddx.g::d, ddx.g::new);
      public static final ddx.i<ddx.g> e = new ddx.i<>(c, d);

      @Override
      public ddx.i<ddx.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         if ($$1 instanceof ddp.b<T> $$2) {
            ju.a $$3 = $$0.c(ddy.b);
            if ($$3 != null) {
               azs $$4 = azs.a((long)System.identityHashCode(this));
               List<cxy> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cxy> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cxy> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cxy>generate(() -> {
                  cxy $$5x = af.a($$5, $$4);
                  cxy $$6x = af.a($$6, $$4);
                  cxy $$7x = af.a($$7, $$4);
                  return ddj.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public ddx b() {
         return this.f;
      }

      public ddx c() {
         return this.g;
      }

      public ddx d() {
         return this.h;
      }
   }

   public static record h(axp<cxu> f) implements ddx {
      public static final MapCodec<ddx.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axp.a(me.K).fieldOf("tag").forGetter(ddx.h::b)).apply($$0, ddx.h::new)
      );
      public static final yt<wg, ddx.h> d = yt.a(axp.c(me.K), ddx.h::b, ddx.h::new);
      public static final ddx.i<ddx.h> e = new ddx.i<>(c, d);

      @Override
      public ddx.i<ddx.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         if ($$1 instanceof ddp.b<T> $$2) {
            ju.a $$3 = $$0.c(ddy.b);
            if ($$3 != null) {
               return $$3.e(me.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axp<cxu> b() {
         return this.f;
      }
   }

   public static record i<T extends ddx>(MapCodec<T> a, yt<wg, T> b) {
   }

   public static record j(ddx f, ddx g) implements ddx {
      public static final MapCodec<ddx.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddx.a.fieldOf("input").forGetter(ddx.j::b), ddx.a.fieldOf("remainder").forGetter(ddx.j::c)).apply($$0, ddx.j::new)
      );
      public static final yt<wg, ddx.j> d = yt.a(ddx.b, ddx.j::b, ddx.b, ddx.j::c, ddx.j::new);
      public static final ddx.i<ddx.j> e = new ddx.i<>(c, d);

      @Override
      public ddx.i<ddx.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bav $$0, ddp<T> $$1) {
         if ($$1 instanceof ddp.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cte $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public ddx b() {
         return this.f;
      }

      public ddx c() {
         return this.g;
      }
   }
}
