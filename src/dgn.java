import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dgn {
   Codec<dgn> a = mh.ay.q().dispatch(dgn::a, dgn.i::a);
   ze<wp, dgn> b = zc.a(mi.ao).b(dgn::a, dgn.i::b);

   <T> Stream<T> a(bbm var1, dgf<T> var2);

   dgn.i<? extends dgn> a();

   default boolean a(cvs $$0) {
      return true;
   }

   default List<dak> a(bbm $$0) {
      return this.a($$0, dgn.e.a).toList();
   }

   default dak b(bbm $$0) {
      return this.a($$0, dgn.e.a).findFirst().orElse(dak.l);
   }

   public static class a implements dgn {
      public static final dgn.a c = new dgn.a();
      public static final MapCodec<dgn.a> d = MapCodec.unit(c);
      public static final ze<wp, dgn.a> e = ze.a(c);
      public static final dgn.i<dgn.a> f = new dgn.i<>(d, e);

      private a() {
      }

      @Override
      public dgn.i<dgn.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         if ($$1 instanceof dgf.b<T> $$2) {
            dzn $$3 = $$0.c(dgo.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dgn> f) implements dgn {
      public static final MapCodec<dgn.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgn.a.listOf().fieldOf("contents").forGetter(dgn.b::b)).apply($$0, dgn.b::new)
      );
      public static final ze<wp, dgn.b> d = ze.a(dgn.b.a(zc.a()), dgn.b::b, dgn.b::new);
      public static final dgn.i<dgn.b> e = new dgn.i<>(c, d);

      @Override
      public dgn.i<dgn.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cvs $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dgn> b() {
         return this.f;
      }
   }

   public static class c implements dgn {
      public static final dgn.c c = new dgn.c();
      public static final MapCodec<dgn.c> d = MapCodec.unit(c);
      public static final ze<wp, dgn.c> e = ze.a(c);
      public static final dgn.i<dgn.c> f = new dgn.i<>(d, e);

      private c() {
      }

      @Override
      public dgn.i<dgn.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jg<dag> f) implements dgn {
      public static final MapCodec<dgn.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dag.e.fieldOf("item").forGetter(dgn.d::b)).apply($$0, dgn.d::new));
      public static final ze<wp, dgn.d> d = ze.a(dag.f, dgn.d::b, dgn.d::new);
      public static final dgn.i<dgn.d> e = new dgn.i<>(c, d);

      public d(dag $$0) {
         this($$0.e());
      }

      @Override
      public dgn.i<dgn.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         return $$1 instanceof dgf.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cvs $$0) {
         return this.f.a().a($$0);
      }

      public jg<dag> b() {
         return this.f;
      }
   }

   public static class e implements dgf.b<dak> {
      public static final dgn.e a = new dgn.e();

      public dak b(dak $$0) {
         return $$0;
      }
   }

   public static record f(dak f) implements dgn {
      public static final MapCodec<dgn.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dak.d.fieldOf("item").forGetter(dgn.f::b)).apply($$0, dgn.f::new));
      public static final ze<wp, dgn.f> d = ze.a(dak.j, dgn.f::b, dgn.f::new);
      public static final dgn.i<dgn.f> e = new dgn.i<>(c, d);

      @Override
      public dgn.i<dgn.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         return $$1 instanceof dgf.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dgn.f $$1 && dak.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cvs $$0) {
         return this.f.h().a($$0);
      }

      public dak b() {
         return this.f;
      }
   }

   public static record g(dgn f, dgn g, jg<diz> h) implements dgn {
      public static final MapCodec<dgn.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dgn.a.fieldOf("base").forGetter(dgn.g::b), dgn.a.fieldOf("material").forGetter(dgn.g::c), diz.c.fieldOf("pattern").forGetter(dgn.g::d)
               )
               .apply($$0, dgn.g::new)
      );
      public static final ze<wp, dgn.g> d = ze.a(dgn.b, dgn.g::b, dgn.b, dgn.g::c, diz.d, dgn.g::d, dgn.g::new);
      public static final dgn.i<dgn.g> e = new dgn.i<>(c, d);

      @Override
      public dgn.i<dgn.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         if ($$1 instanceof dgf.b<T> $$2) {
            ji.a $$3 = $$0.c(dgo.b);
            if ($$3 != null) {
               bai $$4 = bai.a((long)System.identityHashCode(this));
               List<dak> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<dak> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<dak>generate(() -> {
                  dak $$4x = ag.a($$5, $$4);
                  dak $$5x = ag.a($$6, $$4);
                  return dfz.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dgn b() {
         return this.f;
      }

      public dgn c() {
         return this.g;
      }

      public jg<diz> d() {
         return this.h;
      }
   }

   public static record h(ayc<dag> f) implements dgn {
      public static final MapCodec<dgn.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayc.a(mi.K).fieldOf("tag").forGetter(dgn.h::b)).apply($$0, dgn.h::new)
      );
      public static final ze<wp, dgn.h> d = ze.a(ayc.c(mi.K), dgn.h::b, dgn.h::new);
      public static final dgn.i<dgn.h> e = new dgn.i<>(c, d);

      @Override
      public dgn.i<dgn.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         if ($$1 instanceof dgf.b<T> $$2) {
            ji.a $$3 = $$0.c(dgo.b);
            if ($$3 != null) {
               return $$3.e(mi.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public ayc<dag> b() {
         return this.f;
      }
   }

   public static record i<T extends dgn>(MapCodec<T> a, ze<wp, T> b) {
   }

   public static record j(dgn f, dgn g) implements dgn {
      public static final MapCodec<dgn.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgn.a.fieldOf("input").forGetter(dgn.j::b), dgn.a.fieldOf("remainder").forGetter(dgn.j::c)).apply($$0, dgn.j::new)
      );
      public static final ze<wp, dgn.j> d = ze.a(dgn.b, dgn.j::b, dgn.b, dgn.j::c, dgn.j::new);
      public static final dgn.i<dgn.j> e = new dgn.i<>(c, d);

      @Override
      public dgn.i<dgn.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbm $$0, dgf<T> $$1) {
         if ($$1 instanceof dgf.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cvs $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dgn b() {
         return this.f;
      }

      public dgn c() {
         return this.g;
      }
   }
}
