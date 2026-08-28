import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dgd {
   Codec<dgd> a = mh.ay.q().dispatch(dgd::a, dgd.i::a);
   za<wn, dgd> b = yy.a(mi.ao).b(dgd::a, dgd.i::b);

   <T> Stream<T> a(bbd var1, dfv<T> var2);

   dgd.i<? extends dgd> a();

   default boolean a(cvj $$0) {
      return true;
   }

   default List<daa> a(bbd $$0) {
      return this.a($$0, dgd.e.a).toList();
   }

   default daa b(bbd $$0) {
      return this.a($$0, dgd.e.a).findFirst().orElse(daa.k);
   }

   public static class a implements dgd {
      public static final dgd.a c = new dgd.a();
      public static final MapCodec<dgd.a> d = MapCodec.unit(c);
      public static final za<wn, dgd.a> e = za.a(c);
      public static final dgd.i<dgd.a> f = new dgd.i<>(d, e);

      private a() {
      }

      @Override
      public dgd.i<dgd.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         if ($$1 instanceof dfv.b<T> $$2) {
            dzd $$3 = $$0.c(dge.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dgd> f) implements dgd {
      public static final MapCodec<dgd.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgd.a.listOf().fieldOf("contents").forGetter(dgd.b::b)).apply($$0, dgd.b::new)
      );
      public static final za<wn, dgd.b> d = za.a(dgd.b.a(yy.a()), dgd.b::b, dgd.b::new);
      public static final dgd.i<dgd.b> e = new dgd.i<>(c, d);

      @Override
      public dgd.i<dgd.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cvj $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dgd> b() {
         return this.f;
      }
   }

   public static class c implements dgd {
      public static final dgd.c c = new dgd.c();
      public static final MapCodec<dgd.c> d = MapCodec.unit(c);
      public static final za<wn, dgd.c> e = za.a(c);
      public static final dgd.i<dgd.c> f = new dgd.i<>(d, e);

      private c() {
      }

      @Override
      public dgd.i<dgd.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jg<czw> f) implements dgd {
      public static final MapCodec<dgd.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czw.e.fieldOf("item").forGetter(dgd.d::b)).apply($$0, dgd.d::new));
      public static final za<wn, dgd.d> d = za.a(czw.f, dgd.d::b, dgd.d::new);
      public static final dgd.i<dgd.d> e = new dgd.i<>(c, d);

      public d(czw $$0) {
         this($$0.e());
      }

      @Override
      public dgd.i<dgd.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         return $$1 instanceof dfv.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cvj $$0) {
         return this.f.a().a($$0);
      }

      public jg<czw> b() {
         return this.f;
      }
   }

   public static class e implements dfv.b<daa> {
      public static final dgd.e a = new dgd.e();

      public daa b(daa $$0) {
         return $$0;
      }
   }

   public static record f(daa f) implements dgd {
      public static final MapCodec<dgd.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daa.d.fieldOf("item").forGetter(dgd.f::b)).apply($$0, dgd.f::new));
      public static final za<wn, dgd.f> d = za.a(daa.i, dgd.f::b, dgd.f::new);
      public static final dgd.i<dgd.f> e = new dgd.i<>(c, d);

      @Override
      public dgd.i<dgd.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         return $$1 instanceof dfv.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dgd.f $$1 && daa.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cvj $$0) {
         return this.f.h().a($$0);
      }

      public daa b() {
         return this.f;
      }
   }

   public static record g(dgd f, dgd g, jg<dip> h) implements dgd {
      public static final MapCodec<dgd.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dgd.a.fieldOf("base").forGetter(dgd.g::b), dgd.a.fieldOf("material").forGetter(dgd.g::c), dip.c.fieldOf("pattern").forGetter(dgd.g::d)
               )
               .apply($$0, dgd.g::new)
      );
      public static final za<wn, dgd.g> d = za.a(dgd.b, dgd.g::b, dgd.b, dgd.g::c, dip.d, dgd.g::d, dgd.g::new);
      public static final dgd.i<dgd.g> e = new dgd.i<>(c, d);

      @Override
      public dgd.i<dgd.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         if ($$1 instanceof dfv.b<T> $$2) {
            ji.a $$3 = $$0.c(dge.b);
            if ($$3 != null) {
               azz $$4 = azz.a((long)System.identityHashCode(this));
               List<daa> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<daa> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<daa>generate(() -> {
                  daa $$4x = ag.a($$5, $$4);
                  daa $$5x = ag.a($$6, $$4);
                  return dfp.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dgd b() {
         return this.f;
      }

      public dgd c() {
         return this.g;
      }

      public jg<dip> d() {
         return this.h;
      }
   }

   public static record h(axv<czw> f) implements dgd {
      public static final MapCodec<dgd.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axv.a(mi.K).fieldOf("tag").forGetter(dgd.h::b)).apply($$0, dgd.h::new)
      );
      public static final za<wn, dgd.h> d = za.a(axv.c(mi.K), dgd.h::b, dgd.h::new);
      public static final dgd.i<dgd.h> e = new dgd.i<>(c, d);

      @Override
      public dgd.i<dgd.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         if ($$1 instanceof dfv.b<T> $$2) {
            ji.a $$3 = $$0.c(dge.b);
            if ($$3 != null) {
               return $$3.e(mi.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axv<czw> b() {
         return this.f;
      }
   }

   public static record i<T extends dgd>(MapCodec<T> a, za<wn, T> b) {
   }

   public static record j(dgd f, dgd g) implements dgd {
      public static final MapCodec<dgd.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgd.a.fieldOf("input").forGetter(dgd.j::b), dgd.a.fieldOf("remainder").forGetter(dgd.j::c)).apply($$0, dgd.j::new)
      );
      public static final za<wn, dgd.j> d = za.a(dgd.b, dgd.j::b, dgd.b, dgd.j::c, dgd.j::new);
      public static final dgd.i<dgd.j> e = new dgd.i<>(c, d);

      @Override
      public dgd.i<dgd.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbd $$0, dfv<T> $$1) {
         if ($$1 instanceof dfv.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cvj $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dgd b() {
         return this.f;
      }

      public dgd c() {
         return this.g;
      }
   }
}
