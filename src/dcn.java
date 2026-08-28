import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dcn {
   Codec<dcn> a = mb.aA.q().dispatch(dcn::a, dcn.i::a);
   ym<vz, dcn> b = yk.a(mc.aG).b(dcn::a, dcn.i::b);

   <T> Stream<T> a(baj var1, dcf<T> var2);

   dcn.i<? extends dcn> a();

   default boolean a(crr $$0) {
      return true;
   }

   default List<cwn> a(baj $$0) {
      return this.a($$0, dcn.e.a).toList();
   }

   default cwn b(baj $$0) {
      return this.a($$0, dcn.e.a).findFirst().orElse(cwn.j);
   }

   public static class a implements dcn {
      public static final dcn.a c = new dcn.a();
      public static final MapCodec<dcn.a> d = MapCodec.unit(c);
      public static final ym<vz, dcn.a> e = ym.a(c);
      public static final dcn.i<dcn.a> f = new dcn.i<>(d, e);

      private a() {
      }

      @Override
      public dcn.i<dcn.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         if ($$1 instanceof dcf.b<T> $$2) {
            duv $$3 = $$0.c(dco.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dcn> f) implements dcn {
      public static final MapCodec<dcn.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcn.a.listOf().fieldOf("contents").forGetter(dcn.b::b)).apply($$0, dcn.b::new)
      );
      public static final ym<vz, dcn.b> d = ym.a(dcn.b.a(yk.a()), dcn.b::b, dcn.b::new);
      public static final dcn.i<dcn.b> e = new dcn.i<>(c, d);

      @Override
      public dcn.i<dcn.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(crr $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dcn> b() {
         return this.f;
      }
   }

   public static class c implements dcn {
      public static final dcn.c c = new dcn.c();
      public static final MapCodec<dcn.c> d = MapCodec.unit(c);
      public static final ym<vz, dcn.c> e = ym.a(c);
      public static final dcn.i<dcn.c> f = new dcn.i<>(d, e);

      private c() {
      }

      @Override
      public dcn.i<dcn.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jr<cwj> f) implements dcn {
      public static final MapCodec<dcn.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwj.e.fieldOf("item").forGetter(dcn.d::b)).apply($$0, dcn.d::new));
      public static final ym<vz, dcn.d> d = ym.a(yk.b(mc.K), dcn.d::b, dcn.d::new);
      public static final dcn.i<dcn.d> e = new dcn.i<>(c, d);

      public d(cwj $$0) {
         this($$0.f());
      }

      @Override
      public dcn.i<dcn.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         return $$1 instanceof dcf.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(crr $$0) {
         return this.f.a().a($$0);
      }

      public jr<cwj> b() {
         return this.f;
      }
   }

   public static class e implements dcf.b<cwn> {
      public static final dcn.e a = new dcn.e();

      public cwn b(cwn $$0) {
         return $$0;
      }
   }

   public static record f(cwn f) implements dcn {
      public static final MapCodec<dcn.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwn.c.fieldOf("item").forGetter(dcn.f::b)).apply($$0, dcn.f::new));
      public static final ym<vz, dcn.f> d = ym.a(cwn.h, dcn.f::b, dcn.f::new);
      public static final dcn.i<dcn.f> e = new dcn.i<>(c, d);

      @Override
      public dcn.i<dcn.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         return $$1 instanceof dcf.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dcn.f $$1 && cwn.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(crr $$0) {
         return this.f.h().a($$0);
      }

      public cwn b() {
         return this.f;
      }
   }

   public static record g(dcn f, dcn g, dcn h) implements dcn {
      public static final MapCodec<dcn.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dcn.a.fieldOf("base").forGetter(dcn.g::b), dcn.a.fieldOf("material").forGetter(dcn.g::c), dcn.a.fieldOf("pattern").forGetter(dcn.g::d)
               )
               .apply($$0, dcn.g::new)
      );
      public static final ym<vz, dcn.g> d = ym.a(dcn.b, dcn.g::b, dcn.b, dcn.g::c, dcn.b, dcn.g::d, dcn.g::new);
      public static final dcn.i<dcn.g> e = new dcn.i<>(c, d);

      @Override
      public dcn.i<dcn.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         if ($$1 instanceof dcf.b<T> $$2) {
            jt.a $$3 = $$0.c(dco.b);
            if ($$3 != null) {
               azg $$4 = azg.a((long)System.identityHashCode(this));
               List<cwn> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cwn> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cwn> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cwn>generate(() -> {
                  cwn $$5x = af.a($$5, $$4);
                  cwn $$6x = af.a($$6, $$4);
                  cwn $$7x = af.a($$7, $$4);
                  return dca.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dcn b() {
         return this.f;
      }

      public dcn c() {
         return this.g;
      }

      public dcn d() {
         return this.h;
      }
   }

   public static record h(axe<cwj> f) implements dcn {
      public static final MapCodec<dcn.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axe.a(mc.K).fieldOf("tag").forGetter(dcn.h::b)).apply($$0, dcn.h::new)
      );
      public static final ym<vz, dcn.h> d = ym.a(axe.c(mc.K), dcn.h::b, dcn.h::new);
      public static final dcn.i<dcn.h> e = new dcn.i<>(c, d);

      @Override
      public dcn.i<dcn.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         if ($$1 instanceof dcf.b<T> $$2) {
            jt.a $$3 = $$0.c(dco.b);
            if ($$3 != null) {
               return $$3.d(mc.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axe<cwj> b() {
         return this.f;
      }
   }

   public static record i<T extends dcn>(MapCodec<T> a, ym<vz, T> b) {
   }

   public static record j(dcn f, dcn g) implements dcn {
      public static final MapCodec<dcn.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcn.a.fieldOf("input").forGetter(dcn.j::b), dcn.a.fieldOf("remainder").forGetter(dcn.j::c)).apply($$0, dcn.j::new)
      );
      public static final ym<vz, dcn.j> d = ym.a(dcn.b, dcn.j::b, dcn.b, dcn.j::c, dcn.j::new);
      public static final dcn.i<dcn.j> e = new dcn.i<>(c, d);

      @Override
      public dcn.i<dcn.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(baj $$0, dcf<T> $$1) {
         if ($$1 instanceof dcf.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(crr $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dcn b() {
         return this.f;
      }

      public dcn c() {
         return this.g;
      }
   }
}
