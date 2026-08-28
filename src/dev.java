import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dev {
   Codec<dev> a = mf.ay.q().dispatch(dev::a, dev.i::a);
   yu<wh, dev> b = ys.a(mg.ao).b(dev::a, dev.i::b);

   <T> Stream<T> a(bax var1, den<T> var2);

   dev.i<? extends dev> a();

   default boolean a(cub $$0) {
      return true;
   }

   default List<cys> a(bax $$0) {
      return this.a($$0, dev.e.a).toList();
   }

   default cys b(bax $$0) {
      return this.a($$0, dev.e.a).findFirst().orElse(cys.k);
   }

   public static class a implements dev {
      public static final dev.a c = new dev.a();
      public static final MapCodec<dev.a> d = MapCodec.unit(c);
      public static final yu<wh, dev.a> e = yu.a(c);
      public static final dev.i<dev.a> f = new dev.i<>(d, e);

      private a() {
      }

      @Override
      public dev.i<dev.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         if ($$1 instanceof den.b<T> $$2) {
            dxm $$3 = $$0.c(dew.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dev> f) implements dev {
      public static final MapCodec<dev.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dev.a.listOf().fieldOf("contents").forGetter(dev.b::b)).apply($$0, dev.b::new)
      );
      public static final yu<wh, dev.b> d = yu.a(dev.b.a(ys.a()), dev.b::b, dev.b::new);
      public static final dev.i<dev.b> e = new dev.i<>(c, d);

      @Override
      public dev.i<dev.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cub $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dev> b() {
         return this.f;
      }
   }

   public static class c implements dev {
      public static final dev.c c = new dev.c();
      public static final MapCodec<dev.c> d = MapCodec.unit(c);
      public static final yu<wh, dev.c> e = yu.a(c);
      public static final dev.i<dev.c> f = new dev.i<>(d, e);

      private c() {
      }

      @Override
      public dev.i<dev.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(je<cyo> f) implements dev {
      public static final MapCodec<dev.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyo.e.fieldOf("item").forGetter(dev.d::b)).apply($$0, dev.d::new));
      public static final yu<wh, dev.d> d = yu.a(cyo.f, dev.d::b, dev.d::new);
      public static final dev.i<dev.d> e = new dev.i<>(c, d);

      public d(cyo $$0) {
         this($$0.e());
      }

      @Override
      public dev.i<dev.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         return $$1 instanceof den.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cub $$0) {
         return this.f.a().a($$0);
      }

      public je<cyo> b() {
         return this.f;
      }
   }

   public static class e implements den.b<cys> {
      public static final dev.e a = new dev.e();

      public cys b(cys $$0) {
         return $$0;
      }
   }

   public static record f(cys f) implements dev {
      public static final MapCodec<dev.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cys.d.fieldOf("item").forGetter(dev.f::b)).apply($$0, dev.f::new));
      public static final yu<wh, dev.f> d = yu.a(cys.i, dev.f::b, dev.f::new);
      public static final dev.i<dev.f> e = new dev.i<>(c, d);

      @Override
      public dev.i<dev.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         return $$1 instanceof den.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dev.f $$1 && cys.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cub $$0) {
         return this.f.h().a($$0);
      }

      public cys b() {
         return this.f;
      }
   }

   public static record g(dev f, dev g, je<dhh> h) implements dev {
      public static final MapCodec<dev.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dev.a.fieldOf("base").forGetter(dev.g::b), dev.a.fieldOf("material").forGetter(dev.g::c), dhh.c.fieldOf("pattern").forGetter(dev.g::d)
               )
               .apply($$0, dev.g::new)
      );
      public static final yu<wh, dev.g> d = yu.a(dev.b, dev.g::b, dev.b, dev.g::c, dhh.d, dev.g::d, dev.g::new);
      public static final dev.i<dev.g> e = new dev.i<>(c, d);

      @Override
      public dev.i<dev.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         if ($$1 instanceof den.b<T> $$2) {
            jg.a $$3 = $$0.c(dew.b);
            if ($$3 != null) {
               azt $$4 = azt.a((long)System.identityHashCode(this));
               List<cys> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cys> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cys>generate(() -> {
                  cys $$4x = af.a($$5, $$4);
                  cys $$5x = af.a($$6, $$4);
                  return deh.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dev b() {
         return this.f;
      }

      public dev c() {
         return this.g;
      }

      public je<dhh> d() {
         return this.h;
      }
   }

   public static record h(axp<cyo> f) implements dev {
      public static final MapCodec<dev.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axp.a(mg.K).fieldOf("tag").forGetter(dev.h::b)).apply($$0, dev.h::new)
      );
      public static final yu<wh, dev.h> d = yu.a(axp.c(mg.K), dev.h::b, dev.h::new);
      public static final dev.i<dev.h> e = new dev.i<>(c, d);

      @Override
      public dev.i<dev.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         if ($$1 instanceof den.b<T> $$2) {
            jg.a $$3 = $$0.c(dew.b);
            if ($$3 != null) {
               return $$3.e(mg.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axp<cyo> b() {
         return this.f;
      }
   }

   public static record i<T extends dev>(MapCodec<T> a, yu<wh, T> b) {
   }

   public static record j(dev f, dev g) implements dev {
      public static final MapCodec<dev.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dev.a.fieldOf("input").forGetter(dev.j::b), dev.a.fieldOf("remainder").forGetter(dev.j::c)).apply($$0, dev.j::new)
      );
      public static final yu<wh, dev.j> d = yu.a(dev.b, dev.j::b, dev.b, dev.j::c, dev.j::new);
      public static final dev.i<dev.j> e = new dev.i<>(c, d);

      @Override
      public dev.i<dev.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bax $$0, den<T> $$1) {
         if ($$1 instanceof den.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cub $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dev b() {
         return this.f;
      }

      public dev c() {
         return this.g;
      }
   }
}
