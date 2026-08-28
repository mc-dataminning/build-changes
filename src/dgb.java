import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dgb {
   Codec<dgb> a = mg.ay.q().dispatch(dgb::a, dgb.i::a);
   yy<wl, dgb> b = yw.a(mh.ao).b(dgb::a, dgb.i::b);

   <T> Stream<T> a(bbb var1, dft<T> var2);

   dgb.i<? extends dgb> a();

   default boolean a(cvh $$0) {
      return true;
   }

   default List<czy> a(bbb $$0) {
      return this.a($$0, dgb.e.a).toList();
   }

   default czy b(bbb $$0) {
      return this.a($$0, dgb.e.a).findFirst().orElse(czy.k);
   }

   public static class a implements dgb {
      public static final dgb.a c = new dgb.a();
      public static final MapCodec<dgb.a> d = MapCodec.unit(c);
      public static final yy<wl, dgb.a> e = yy.a(c);
      public static final dgb.i<dgb.a> f = new dgb.i<>(d, e);

      private a() {
      }

      @Override
      public dgb.i<dgb.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         if ($$1 instanceof dft.b<T> $$2) {
            dzb $$3 = $$0.c(dgc.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dgb> f) implements dgb {
      public static final MapCodec<dgb.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgb.a.listOf().fieldOf("contents").forGetter(dgb.b::b)).apply($$0, dgb.b::new)
      );
      public static final yy<wl, dgb.b> d = yy.a(dgb.b.a(yw.a()), dgb.b::b, dgb.b::new);
      public static final dgb.i<dgb.b> e = new dgb.i<>(c, d);

      @Override
      public dgb.i<dgb.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cvh $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dgb> b() {
         return this.f;
      }
   }

   public static class c implements dgb {
      public static final dgb.c c = new dgb.c();
      public static final MapCodec<dgb.c> d = MapCodec.unit(c);
      public static final yy<wl, dgb.c> e = yy.a(c);
      public static final dgb.i<dgb.c> f = new dgb.i<>(d, e);

      private c() {
      }

      @Override
      public dgb.i<dgb.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jf<czu> f) implements dgb {
      public static final MapCodec<dgb.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czu.e.fieldOf("item").forGetter(dgb.d::b)).apply($$0, dgb.d::new));
      public static final yy<wl, dgb.d> d = yy.a(czu.f, dgb.d::b, dgb.d::new);
      public static final dgb.i<dgb.d> e = new dgb.i<>(c, d);

      public d(czu $$0) {
         this($$0.e());
      }

      @Override
      public dgb.i<dgb.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         return $$1 instanceof dft.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cvh $$0) {
         return this.f.a().a($$0);
      }

      public jf<czu> b() {
         return this.f;
      }
   }

   public static class e implements dft.b<czy> {
      public static final dgb.e a = new dgb.e();

      public czy b(czy $$0) {
         return $$0;
      }
   }

   public static record f(czy f) implements dgb {
      public static final MapCodec<dgb.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czy.d.fieldOf("item").forGetter(dgb.f::b)).apply($$0, dgb.f::new));
      public static final yy<wl, dgb.f> d = yy.a(czy.i, dgb.f::b, dgb.f::new);
      public static final dgb.i<dgb.f> e = new dgb.i<>(c, d);

      @Override
      public dgb.i<dgb.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         return $$1 instanceof dft.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dgb.f $$1 && czy.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cvh $$0) {
         return this.f.h().a($$0);
      }

      public czy b() {
         return this.f;
      }
   }

   public static record g(dgb f, dgb g, jf<din> h) implements dgb {
      public static final MapCodec<dgb.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dgb.a.fieldOf("base").forGetter(dgb.g::b), dgb.a.fieldOf("material").forGetter(dgb.g::c), din.c.fieldOf("pattern").forGetter(dgb.g::d)
               )
               .apply($$0, dgb.g::new)
      );
      public static final yy<wl, dgb.g> d = yy.a(dgb.b, dgb.g::b, dgb.b, dgb.g::c, din.d, dgb.g::d, dgb.g::new);
      public static final dgb.i<dgb.g> e = new dgb.i<>(c, d);

      @Override
      public dgb.i<dgb.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         if ($$1 instanceof dft.b<T> $$2) {
            jh.a $$3 = $$0.c(dgc.b);
            if ($$3 != null) {
               azx $$4 = azx.a((long)System.identityHashCode(this));
               List<czy> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<czy> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<czy>generate(() -> {
                  czy $$4x = ag.a($$5, $$4);
                  czy $$5x = ag.a($$6, $$4);
                  return dfn.a($$3, $$4x, $$5x, this.h);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dgb b() {
         return this.f;
      }

      public dgb c() {
         return this.g;
      }

      public jf<din> d() {
         return this.h;
      }
   }

   public static record h(axt<czu> f) implements dgb {
      public static final MapCodec<dgb.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axt.a(mh.K).fieldOf("tag").forGetter(dgb.h::b)).apply($$0, dgb.h::new)
      );
      public static final yy<wl, dgb.h> d = yy.a(axt.c(mh.K), dgb.h::b, dgb.h::new);
      public static final dgb.i<dgb.h> e = new dgb.i<>(c, d);

      @Override
      public dgb.i<dgb.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         if ($$1 instanceof dft.b<T> $$2) {
            jh.a $$3 = $$0.c(dgc.b);
            if ($$3 != null) {
               return $$3.e(mh.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axt<czu> b() {
         return this.f;
      }
   }

   public static record i<T extends dgb>(MapCodec<T> a, yy<wl, T> b) {
   }

   public static record j(dgb f, dgb g) implements dgb {
      public static final MapCodec<dgb.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dgb.a.fieldOf("input").forGetter(dgb.j::b), dgb.a.fieldOf("remainder").forGetter(dgb.j::c)).apply($$0, dgb.j::new)
      );
      public static final yy<wl, dgb.j> d = yy.a(dgb.b, dgb.j::b, dgb.b, dgb.j::c, dgb.j::new);
      public static final dgb.i<dgb.j> e = new dgb.i<>(c, d);

      @Override
      public dgb.i<dgb.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbb $$0, dft<T> $$1) {
         if ($$1 instanceof dft.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cvh $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dgb b() {
         return this.f;
      }

      public dgb c() {
         return this.g;
      }
   }
}
